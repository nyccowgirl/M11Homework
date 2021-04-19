package Homework;

/**
 * A class that implements the ADT deque with front and back entry or removal.
 */

import java.util.LinkedList;
import java.util.List;

public class ListDeque<T> implements DequeInterface<T> {
    private List<T> list;

    /**
     * Creates and initializes an empty deque.
     */
    public ListDeque() {
        list = new LinkedList<T>();
        // using LinkedList, enqueues will be O(1) and dequeues will be O(1) since it is doubly linked
    }


    /**
     * Adds a new entry to the front/back of this deque.
     *
     * @param newEntry  An object to be added.
     */
    @Override
    public void addToFront(T newEntry) {
        // Utilizing list method:
        list.add(0, newEntry);

        // Casting to LinkedList method:
//        ((LinkedList<T>) list).addFirst(newEntry);
    }

    @Override
    public void addToBack(T newEntry) {
        // Utilizing list method:
        list.add(newEntry);

        // Casting to LinkedList method:
//        ((LinkedList<T>) list).addLast(newEntry);
    }


    /**
     * Removes and returns the front/back entry of this deque.
     *
     * @return The object at the front/back of this deque.
     * @throws IndexOutOfBoundsException if the deque is empty before the operation.
     */
    @Override
    public T removeFront() {
        // throws IndexOutOfBoundsException for empty list or NoSuchElementException for empty linked list

        // Utilizing list method:
        return list.remove(0);

        // Casting to LinkedList method:
//        return ((LinkedList<T>) list).removeFirst();
    }

    @Override
    public T removeBack() {
        // throws IndexOutOfBoundsException for empty list or NoSuchElementException for empty linked list

        // Utilizing list method:
        return list.remove(list.size() - 1);

        // Casting to LinkedList method:
//        return ((LinkedList<T>) list).removeLast();
    }


    /**
     * Retrieves the front/back entry of this deque.
     *
     * @return The object at the front/back of this deque.
     * @throws IndexOutOfBoundsException if the deque is empty before the operation.
     */
    @Override
    public T getFront() {
        // throws IndexOutOfBoundsException for empty list or NoSuchElementException for empty linked list

        // Utilizing list method:
        return list.get(0);

        // Casting to LinkedList method:
//        return ((LinkedList<T>) list).getFirst();
    }

    @Override
    public T getBack() {
        // throws IndexOutOfBoundsException for empty list or NoSuchElementException for empty linked list

        // Utilizing list method:
        return list.get(list.size() - 1);

        // Casting to LinkedList method:
//        return ((LinkedList<T>) list).getLast();
    }


    /**
     * Detects whether this deque is empty.
     *
     * @return True if this deque is empty, or false otherwise.
     */
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }


    /**
     * Removes all entries from this deque.
     */
    @Override
    public void clear() {
        list.clear();
    }
} // end Homework.ListDeque
