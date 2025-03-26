package Week_3;


public class MyList<T> {

    private T[] array;

    private int size = 10;

    public MyList() {

        this.array = (T[]) new Object[size]; //Because Generic Arrays can not be directly initilized,
        // we first make an Object array and later cast it to T

    }

    private MyList(int capacity) {

        this.array = (T[]) new Object[capacity];

    }

    public int size() {
        int currentSize = 0;
        for (T element : array) {
            if (element != null) {
                currentSize = currentSize + 1;
            }
        }
        return currentSize;
    }

    public int getCapacity() {
        return array.length;
    }

    public void add(T data) {
        boolean isAdded = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = data;
                isAdded = true;
                break;
            }
        }
        if (!isAdded) {
            size = size * 2;
            T[] nextArray = (T[]) new Object[size];

            for (int i = 0; i < array.length; i++) {
                nextArray[i] = array[i];
            }
            nextArray[array.length] = data;
            array = nextArray;
        }
    }

    public T get(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            return null;
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < array.length) {
            T[] newRemovedArray = (T[]) new Object[array.length];
            for (int i = 0; i < index; i++) {
                newRemovedArray[i] = array[i];
            }
            for (int i = index + 1; i < array.length; i++) {
                newRemovedArray[i - 1] = array[i];
            }
            array = newRemovedArray;
        } else {
            System.out.println("Invalid index!");
            ;
        }
    }

    public void set(int index, T data) {
        if (index >= 0 && index < array.length) {
            array[index] = data;
        } else {
            System.out.println("Invalid index!");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                sb.append(array[i]);
                if (i < array.length - 1 && array[i + 1] != null) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public int indexOf(T data) {
        for (int i = 0; i < array.length; i++) {
            if (data.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (data.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        for (T element : array) {
            if (element != null) {
                return false;
            }
        }
        return true;
    }

    public T[] toArray() {
        int arraySize = 0;
        for (T element : array) {
            if (element != null) {
                arraySize++;
            }
        }
        T[] newArray = (T[]) new Object[arraySize];
        for (int i = 0; i < arraySize; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public void clear() {
        T[] clearedArray = (T[]) new Object[0];
        array = clearedArray;
    }

    public MyList<T> sublist(int start, int finish) {
        MyList<T> sublist = new MyList<>(finish - start + 1);
        T[] subArray = sublist.array;
        for (int i = start; i <= finish; i++) {
            subArray[i] = array[i];
        }
        return sublist;
    }

    public boolean contains(T data) {
        for (T element : array) {
            if (element == data) {
                return true;
            }
        }
        return false;
    }
}
