package arrayList;


import java.util.Arrays;

public class CustomArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int realSize;

    public CustomArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    public int size() {
        return realSize;
    }

    public boolean add(Object o) {
        if (realSize == array.length) {

            Object[] resArray = new Object[array.length * 3 / 2 + 1];
            System.arraycopy(array, 0, resArray, 0, array.length);
            array = resArray;

        }
        array[realSize++] = o;
        return true;
    }

    public boolean remove(Object o) {
        int delIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(o)) {
                delIndex = i;
                break;
            }
        }
        if (array.length - 1 - delIndex >= 0)
            System.arraycopy(array, delIndex + 1, array, delIndex, array.length - 1 - delIndex);
        if (delIndex == -1) {
            return false;
        } else {
            realSize--;
            return true;
        }
    }


    public boolean isEmpty() {
        return realSize < 1;
    }

    public boolean contains(Object o) {

        for (int i = 0; i < realSize; i++) {
            if (array[i] != null && array[i].equals(o)) return true;
        }

        return false;
    }

    public void clear() {
        Arrays.fill(array, " ");
    }

    public Object remove(int index) {
        checkIndex(index);
        Object resElement = array[index];

        if (array.length - 1 - index >= 0) {
            System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
        }
        realSize--;
        return resElement;
    }

    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректен индекс");
        }
    }

    private boolean isCorrectIndex(int index) {
        return (index > -1) || (index < realSize);
    }

    public Object get(int index) {
        return array[index];
    }

    public int indexOf(Object o) {
        for (int i = 0; i < realSize; i++) {
            if (array[i] == o) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        for (int i = realSize - 1; i >= 0; i--)
            if (array[i] == o)
                return i;
        return -1;
    }

    public Object set(int index, Object element) {
        for (int i = 0; i < realSize; i++) {
            if (i == index) {
                array[i] = element;
            }
        }
        return array;
    }

    public void add(int index, Object element) {

        Object[] resArray = new Object[array.length + 1];
        System.arraycopy(array, 0, resArray, 0, array.length);
        System.arraycopy(array, index, resArray, index + 1, array.length - index - 1);
        array[index] = element;

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("MyArrayList{");
        for (int i = 0; i < realSize; i++) {
            stringBuilder.append(array[i]).append(' ');
        }
        stringBuilder.append("}");
        return stringBuilder.toString();

    }

}
