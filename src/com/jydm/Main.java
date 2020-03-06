package com.jydm;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner uI = new Scanner(System.in);
        MobilePhone test = new MobilePhone();
        test.addContact(new Contact("John", "9177945001"));
        boolean quit = false;
        while(!quit) {
            System.out.println("Options:");
            System.out.println("1. Create a Contact");
            System.out.println("2. Remove a Contact");
            System.out.println("3. Find a Contact");
            System.out.println("4. Update Contact info");
            System.out.println("5. Print Contacts");
            System.out.println("6. Quit \n\n");
            int switchIn = uI.nextInt();
            switch (switchIn) {
                case 1:
                    addContact(test);
                    break;
                case 2:
                    removeContact(test);
                    break;
                case 3:
                    findContact(test);
                    break;
                case 4:
                    updateContact(test);
                    break;
                case 5:
                    printContacts(test);
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    private static void findContact(MobilePhone mp) {
        Scanner uI = new Scanner(System.in);
        System.out.println("\nWhat is the name or phone number of the contact that you wish to find?");
        String toFind = uI.nextLine();
        int foundIndex = findContactIndex(mp, toFind);
        if(foundIndex == -1) {
            System.out.println("The contact that you searched for does not exist!");
        } else {
            System.out.println("Contact: " + ((Contact) mp.getContacts().get(foundIndex)).getName() + ", " +
                    ((Contact) mp.getContacts().get(foundIndex)).getPhoneNum() + " is at index " + foundIndex + "\n\n");
        }
    }

    public static void addContact(MobilePhone mp) {
        Scanner uI = new Scanner(System.in);
        System.out.print("\nName: ");
        String name = uI.next();
        System.out.print("Phone Number: ");
        String phoneNum = uI.next();
        mp.addContact(new Contact(name, phoneNum));
    }

    public static void removeContact(MobilePhone mp) {
        Scanner uI = new Scanner(System.in);
        System.out.println("\nWhat is the name or phone number of the contact that you wish to remove?");
        String toFind = uI.nextLine();
        mp.removeContact((Contact) mp.getContacts().get(findContactIndex(mp, toFind)));
    }

    public static int findContactIndex(MobilePhone mp, String test) {
        Scanner uI = new Scanner(System.in);
        for (int i = 0; i < mp.getContacts().size(); i++) {
            if (((Contact) mp.getContacts().get(i)).getName().equals(test) || ((Contact) mp.getContacts().get(i)).getPhoneNum().equals(test)) {
                return i;
            }
        }
        return -1;
    }

    public static void updateContact(MobilePhone mp) {
        Scanner uI = new Scanner(System.in);
        System.out.println("\nWhat is the name or phone number of the contact that you wish to update?");
        String toFind = uI.nextLine();
        int foundIndex = findContactIndex(mp, toFind);
        if(foundIndex == -1) {
            System.out.println("The contact that you searched for does not exist!");
        } else {
            System.out.println("Update the fields below:");
            System.out.print("Name: ");
            String newName = uI.nextLine();
            System.out.print("Phone Number:");
            String newNumber = uI.nextLine();
            mp.modifyContact(foundIndex, new Contact(newName, newNumber));
            System.out.println("Contact updated!");
        }
    }

    public static void printContacts(MobilePhone mp) {
        System.out.println();
        for(int i = 0; i < mp.getContacts().size(); i++) {
            Contact temp = (Contact) mp.getContacts().get(i);
            System.out.println(temp.getName() + ": " + temp.getPhoneNum());

        }
    }
}
