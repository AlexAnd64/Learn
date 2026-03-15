package lesson_6;

import java.util.ArrayList;
import java.util.List;

public class ListContacts {
    public static void main(String[] args) {
        List<TelephoneDirectory> contacts = new ArrayList<>();
        contacts.add(new TelephoneDirectory("89053214587", "Бурлаков"));
        contacts.add((new TelephoneDirectory("89271624563", "Синичкин")));

        ContactsEditor editor = new ContactsEditor();
        editor.add(contacts, "89651247321", "Васильков");
        editor.add(contacts, "89271453279", "Граблин");
        editor.add(contacts, "89271234567", "Пупкин");
        editor.add(contacts, "89271254893", "Васильков");
        contacts.forEach(System.out::println);
        System.out.println(" ");

        String lastName = "Васильков";
        System.out.println("Результат поиска по фамилии " + "'" + lastName + "'" + " :");
        editor.get(contacts, "Васильков").forEach(System.out::println);
    }
}