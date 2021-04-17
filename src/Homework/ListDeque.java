package Homework;

import java.util.LinkedList;
import java.util.List;

public class ListDeque<T> implements DequeInterface<T> {
    private List<T> list;

    public ListDeque() {
        list = new LinkedList<T>();
        // using LinkedList, enqueues will be O(1) and dequeues will be O(1) since it is doubly linked
        // but this would only work if Deque is inherited as well; otherwise, it is O(n) for enqueues
        // as private member is List rather than LinkedList
    }

    @Override
    public void addToFront(T newEntry) {
        list.add(0, newEntry);
    }

    @Override
    public void addToBack(T newEntry) {
        list.add(newEntry);
    }

    @Override
    public T removeFront() {
        if (list.isEmpty()) {
            throw new EmptyQueueException();
        } else {
            return list.remove(0);
        }
    }

    @Override
    public T removeBack() {
        if (list.isEmpty()) {
            throw new EmptyQueueException();
        } else {
            return list.remove(list.size() - 1);
        }
    }

    @Override
    public T getFront() {
        if (list.isEmpty()) {
            throw new EmptyQueueException();
        } else {
            return list.get(0);
        }
    }

    @Override
    public T getBack() {
        if (list.isEmpty()) {
            throw new EmptyQueueException();
        } else {
            return list.get(list.size() - 1);
        }
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void clear() {
        list.clear();
    }
}
