package org.example.repository;

import org.example.model.Contact;
import org.example.model.Email;
import org.example.model.Phone;

import java.util.ArrayList;
import java.util.List;

public class ContactRepository {

    public static Contact[] getAllContacts() {
        Contact[] contacts = new Contact[] {
                new Contact(1, "David", "Sanger", "Argos LLC", "Sales Manager"),
                new Contact(2, "Carlos", "Jimenez", "", ""),
                new Contact(3, "Ali", "Gafar", "BMI Services", "HR Manager")
        };

        // Phone for Contract 0
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone(1, "Home", "240-133-0011", contacts[0]));
        phones.add(new Phone(2, "Mobile", "240-112-0123", contacts[0]));
        contacts[0].setPhones(phones);

        // Phone for Contract 1
        phones = new ArrayList<>();
        phones.add(new Phone(3, "Mobile", "412-116-9988", contacts[1]));
        contacts[1].setPhones(phones);

        // Email for Contract 0
        List<Email> emails = new ArrayList<>();
        emails.add(new Email(1, "Home", "dave.sang@gmail.com", contacts[0]));
        emails.add(new Email(2, "Work", "dsanger@argos.com", contacts[0]));
        contacts[0].setEmails(emails);

        // Email for Contract 2
        emails = new ArrayList<>();
        emails.add(new Email(3, "Work", "ali@bmi.com", contacts[2]));
        contacts[2].setEmails(emails);

        return contacts;
    }

}
