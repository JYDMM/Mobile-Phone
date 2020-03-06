package com.jydm;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MobilePhone {
    private ArrayList contacts = new ArrayList();
    public MobilePhone (ArrayList contacts) {
        this.contacts = contacts;
    }
    public MobilePhone () {
    }

    public void addContact(Contact toBeAdded) {
        contacts.add(toBeAdded);
    }
    public void removeContact(Contact toBeRemoved) {
        contacts.remove(toBeRemoved);
    }
    public void removeContact(int index) {
        contacts.remove(index);
    }
    public ArrayList getContacts() {
        return contacts;
    }
    public void modifyContact(int oldContactIndex, Contact newContact) {
        contacts.add(oldContactIndex, newContact);
    }
}
