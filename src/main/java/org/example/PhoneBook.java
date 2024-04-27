package org.example;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
public static final Map<String, String> phonenumbers = new TreeMap<>();
    public int add(String name, String phoneNumber) {
        if(phonenumbers.containsKey(name)){
            System.out.println("Запись с этим именем уже содержится в телефонной книге!");
        } else {
            phonenumbers.put(name, phoneNumber);
        }
        return phonenumbers.size();
    }
    public String findByNumber(String phoneNumber){
        return null;
    }

}


/*
Создать пустой метод-заглушку findByNumber в классе PhoneBook, который только возвращает null.
Создать тест или тесты на метод findByNumber в классе тестов PhoneBookTest.
Убедиться, что всё компилируется и тесты не проходят. Сделать коммит с сообщением Stub and tests for findByNumber.
Реализовать метод findByNumber так, чтобы все тесты проходили.
Сделать коммит с сообщением findByNumber implemented.
...
 */