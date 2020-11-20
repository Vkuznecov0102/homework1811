package arrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Класс CustomArrayList должен: ")
public class CustomArrayListTest {

    public static final String STR_FIRST = "Test object 1";
    public static final String STR_SECOND = "Test object 2";
    public static final String STR_THIRD = "Test object 3";
    public static final String STR_FOURTH = "Test object 4";
    public static final String STR_FIFTH = "Test object 5";
    public static final String SET_STRING = "Test object 666";
    public static final int EMPTY_SIZE = 0;
    public static final String TO_STRING = "MyArrayList{Test object 1 Test object 2 }";


    @Test
    @DisplayName("корректно показывать размер массива: ")
    public void sizeTest() {
        CustomArrayList myArrayList = new CustomArrayList();
        myArrayList.add(STR_FIRST);
        myArrayList.add(STR_SECOND);
        Assertions.assertEquals(2, myArrayList.size());
    }

    @Test
    @DisplayName("корректно добавлять объект ")
    public void objectAddTest() {
        CustomArrayList expected = new CustomArrayList();
        Assertions.assertEquals(expected.size(), EMPTY_SIZE);
        expected.add(STR_SECOND);
        expected.add(STR_FIRST);

        Assertions.assertTrue(expected.contains(STR_SECOND));
        Assertions.assertTrue(expected.contains(STR_FIRST));
    }

    @Test
    @DisplayName("корректно удалять объект ")
    public void objectRemoveTest() {
        CustomArrayList expected = new CustomArrayList();
        expected.add(STR_SECOND);
        expected.add(STR_FIRST);
        expected.add(STR_THIRD);
        expected.remove(STR_FIRST);

        Assertions.assertEquals(2, expected.size());
        Assertions.assertFalse(expected.contains(STR_FIRST));
    }

    @Test
    @DisplayName("проверять пуст ли массив ")
    public void isEmptyTest() {
        CustomArrayList expected = new CustomArrayList();
        Assertions.assertTrue(expected.isEmpty());
        expected.add(STR_THIRD);
        Assertions.assertFalse(expected.isEmpty());
    }

    @Test
    @DisplayName("проверять содержит ли массив элемент ")
    public void containsTest() {
        CustomArrayList expected = new CustomArrayList();
        expected.add(STR_FIRST);
        expected.add(STR_THIRD);

        Assertions.assertTrue(expected.contains("Test object 1"));
        Assertions.assertTrue(expected.contains(STR_THIRD));
        Assertions.assertFalse(expected.contains(STR_SECOND));
    }

    @Test
    @DisplayName("корректно очищать массив ")
    public void clearingTest() {
        CustomArrayList expected = new CustomArrayList();
        expected.add(STR_SECOND);
        expected.add(STR_FIRST);
        expected.add(STR_THIRD);
        expected.clear();
        Assertions.assertEquals("MyArrayList{      }", expected.toString());
    }

    @Test
    @DisplayName("корректно удалять элемент по индексу ")
    public void indexRemoveTest() {
        CustomArrayList expected = new CustomArrayList();
        expected.add(STR_SECOND);
        expected.add(STR_FIRST);
        expected.add(STR_THIRD);
        expected.add(STR_FOURTH);
        expected.add(STR_FIFTH);
        expected.remove(1);

        Assertions.assertFalse(expected.contains(STR_FIRST));
        Assertions.assertNotEquals(expected.get(1), STR_FIRST);
    }

    @Test
    @DisplayName("получать элемент по индексу ")
    public void getIndexTest() {
        CustomArrayList expected = new CustomArrayList();
        expected.add(STR_SECOND);
        expected.add(STR_FIRST);
        expected.add(STR_THIRD);

        Assertions.assertEquals(expected.get(0), STR_SECOND);
        Assertions.assertEquals(expected.get(1), STR_FIRST);
        Assertions.assertEquals(expected.get(2), STR_THIRD);
    }

    @Test
    @DisplayName("считать первое вхождение элемента в массив ")
    public void indexOfTest() {
        CustomArrayList expected = new CustomArrayList();
        expected.add(STR_SECOND);
        expected.add(STR_FIRST);
        expected.add(STR_FIRST);
        expected.add(STR_THIRD);

        Assertions.assertEquals(expected.indexOf(STR_FIRST), 1);
        Assertions.assertEquals(expected.indexOf(STR_THIRD), 3);
        Assertions.assertEquals(expected.indexOf(new Object()), -1);
    }

    @Test
    @DisplayName("считать последнее вхождение элемента в массив ")
    public void lastIndexOfTest() {
        CustomArrayList expected = new CustomArrayList();
        expected.add(STR_SECOND);
        expected.add(STR_FIRST);
        expected.add(STR_FIRST);
        expected.add(STR_THIRD);

        Assertions.assertEquals(expected.lastIndexOf(STR_FIRST), 2);
        Assertions.assertEquals(expected.lastIndexOf(STR_SECOND), 0);
        Assertions.assertEquals(expected.lastIndexOf(TO_STRING), -1);

    }

    @Test
    @DisplayName("корректно модифицировать элементы массива ")
    public void setTest() {
        CustomArrayList expected = new CustomArrayList();
        expected.add(STR_FIRST);
        expected.add(STR_SECOND);
        expected.add(STR_THIRD);
        expected.set(1, SET_STRING);

        Assertions.assertNotEquals(STR_SECOND, expected.get(1));
        Assertions.assertEquals(expected.get(1), SET_STRING);
    }

    @Test
    @DisplayName("добавлять элемент по индексу ")
    public void addWithIndexTest() {
        CustomArrayList expected = new CustomArrayList();
        Assertions.assertEquals(expected.size(), EMPTY_SIZE);
        expected.add(STR_FIRST);
        expected.add(STR_SECOND);
        expected.add(STR_FIRST);
        expected.add(3, STR_FOURTH);
        expected.add(4, STR_FIFTH);

        Assertions.assertEquals(expected.get(0), STR_FIRST);
        Assertions.assertEquals(expected.get(4), STR_FIFTH);

        expected.add(0, TO_STRING);

        Assertions.assertNotEquals(expected.get(0), STR_FIRST);
        Assertions.assertEquals(expected.size(), 6);
    }

    @Test
    @DisplayName("корректно выводить массив в виде строки ")
    public void toStringTest() {
        CustomArrayList expected = new CustomArrayList();
        expected.add(STR_FIRST);
        expected.add(STR_SECOND);
        Assertions.assertEquals(expected.toString(), TO_STRING);
    }

}
