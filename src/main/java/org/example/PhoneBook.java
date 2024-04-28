package org.example;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    public static final Map<String, String> phonenumbers = new TreeMap<>();

    public PhoneBook() {
    }

    public int add(String name, String phoneNumber) {
        if (phonenumbers.containsKey(name)) {
            System.out.println("Запись с этим именем уже содержится в телефонной книге!");
        } else {
            phonenumbers.put(name, phoneNumber);
        }
        return phonenumbers.size();
    }

    public String findByNumber(String phoneNumber) {
        String str = "К сожалению, записи с таким номером нет";
        for (Map.Entry pair : phonenumbers.entrySet()) {
            if (pair.getValue().equals(phoneNumber)) {
                str = (String) pair.getKey();
            }
        }
        return str;
    }
    public String findByName(String name) {
        String str = "К сожалению, записи с таким именем нет";
            if (phonenumbers.containsKey(name)) {
                str = phonenumbers.get(name);
            }
        return str;
    }
    public String printAllNames() {
        return null;
    }
}