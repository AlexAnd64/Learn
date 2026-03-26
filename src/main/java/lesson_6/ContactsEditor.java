package lesson_6;

import java.util.ArrayList;
import java.util.List;

public class ContactsEditor {
    public void add(List<TelephoneDirectory> contacts, String telephone, String lastName) {
        contacts.add(new TelephoneDirectory(telephone, lastName));
    }

    public List<String> get(List<TelephoneDirectory> contacts, String lastName) {
        List<String> telephone = new ArrayList<>();
        for (TelephoneDirectory contact : contacts) {
            if (lastName.equals(contact.getLastName())) {
                telephone.add(contact.getTelephone());
            }
        }
        return telephone;
    }
}