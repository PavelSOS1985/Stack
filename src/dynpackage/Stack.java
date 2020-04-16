package dynpackage;

import java.util.*;

public class Stack <T> {
    private LinkedList<T> stack;

    public Stack() {
        // инициализация внутреннего хранилища стека
        stack = new LinkedList<>();
    }

    public int size() {
        // размер текущего стека
        return stack.size();
    }

    public T pop() {
        // ваш код
        if (stack.size() == 0) {
            return null;  // если стек пустой
        }
        T tempEl = stack.getLast();
        stack.removeLast();
        return tempEl;
    }

    public void push(T val) {
        // ваш код
        stack.add(val);
    }

    public T peek() {
        // ваш код
        if (stack.size() == 0) {
            return null;  // если стек пустой
        }
        return stack.getLast();
    }
}