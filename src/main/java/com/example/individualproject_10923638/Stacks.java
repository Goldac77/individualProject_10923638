package com.example.individualproject_10923638;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stacks<T> {
    private ArrayList<T> stackList;

    public Stacks() {
        stackList = new ArrayList<>();
    }

    public void push(T item) {
        stackList.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackList.remove(stackList.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackList.get(stackList.size() - 1);
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public int size() {
        return stackList.size();
    }

}

