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

        System.out.println("list.size() = " + list.size());
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.contains(\"Это первый объект\") = " + list.contains("Это первый объект"));

        list.clear();
        System.out.println(list);


    }
}
