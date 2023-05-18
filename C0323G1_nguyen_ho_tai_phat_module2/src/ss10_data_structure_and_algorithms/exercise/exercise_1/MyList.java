package ss10_data_structure_and_algorithms.exercise.exercise_1;


import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapa();
            for (int i = elements.length - 1; i > index; i--) {
                elements[i] = elements[i - 1];
            }
        } else {

            for (int i = elements.length - 1; i > index; i--) {
                elements[i] = elements[i - 1];
            }
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        } else {
            E removedElement = (E) elements[index];
            for (int i = index; i < elements.length - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[elements.length - 1] = null;
            size--;
            return removedElement;
        }
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }


    public int size() {
        return size;
    }

    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (element == elements[i]) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return (E) elements[index];
    }

    public String display() {
        StringBuilder arrayElement = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i + 1 == size) {
                arrayElement.append(elements[i]);
            } else {
                arrayElement.append(elements[i]).append(", ");

            }
        }
        return "MyList {" +
                "elements = [" + arrayElement +
                "] }";
    }

}
