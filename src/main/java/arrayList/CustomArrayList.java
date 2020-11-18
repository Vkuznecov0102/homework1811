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

    public void add(Object o) {
        if (realSize == array.length) {

            Object[] resArray = new Object[array.length * 3 / 2 + 1];
            System.arraycopy(array, 0, resArray, 0, array.length);
            array = resArray;

        }
        array[realSize++] = o;
    }


    public boolean isEmpty() {
        return realSize < 1;
    }

    public boolean contains(Object o) {

        try {
            for (Object value : array) {
                if (value.equals(o)) return true;
            }
        } catch (NullPointerException npe) {

        }
        return false;
    }

    public void clear() {
        Arrays.fill(array, null);
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
