package arrayList;

public class Main {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();

        System.out.println("list.size() = " + list.size());
        System.out.println("list.isEmpty() = " + list.isEmpty());

        list.add("Это первый объект");
        list.add("Это второй объект");
        list.add("Это третий объект");
        list.add("Это четвертый объект");
        list.add("Это пятый объект");
        list.add("Это шестой объект");
        list.add("Это седьмой объект");
        list.add("Это восьмой объект");
        list.add("Это восьмой объект");

        System.out.println("list.size() = " + list.size());
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.contains(\"Это первый объект\") = " + list.contains("Это первый объект"));

        System.out.println(list);

        System.out.println("list.get(2) = " + list.get(2));

        System.out.println("list.indexOf(\"Это третий объект\") = " + list.indexOf("Это третий объект"));

        System.out.println("list.lastIndexOf(\"Это восьмой объект\") = " + list.lastIndexOf("Это восьмой объект"));

        list.remove("Это пятый объект");
        list.remove(1);
        System.out.println("После удаления объектов " + list);

        list.set(1, "Это неизвестно откуда объект");
        System.out.println(list);

        list.add(4, "Объект из метода add");
        System.out.println(list);

        list.clear();
        System.out.println(list);
    }
}
