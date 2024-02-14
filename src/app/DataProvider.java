package app;

import java.util.ArrayList;


public class DataProvider {

    public ArrayList<Contact> getData() {

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Alexey", "alexey@gmail.com"));
        contacts.add(new Contact("Donna", "donna@gmail.com"));
        contacts.add(new Contact("Alice", "alice@gmail.com"));
        contacts.add(new Contact("Elena", "elena@gmail.com"));
        contacts.add(new Contact("Eugen", "eugen@gmail.com"));
        return contacts;

    }
}