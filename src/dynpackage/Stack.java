package dynpackage;

import java.util.*;

public class Stack <T> {
    private LinkedList<T> stack;

    public Stack() {
        // инициализация внутреннего хранилища стека
        stack = new LinkedList<>();
    }

    public int size() {
        return stack.size();
    }

    public T pop() {
        if (stack.size() == 0) {
            return null;  // если стек пустой
        }
        T tempEl = stack.getLast();
        stack.removeLast();
        return tempEl;
    }

    public void push(T val) {
        stack.add(val);
    }

    public T peek() {
        if (stack.size() == 0) {
            return null;  // если стек пустой
        }
        return stack.getLast();
    }
}