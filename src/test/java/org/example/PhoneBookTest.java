package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();

    @Test
    void testAdd1() {
        int firstTest = phoneBook.add("Petya", "+79161234567");
        Assertions.assertEquals(1, firstTest);
    }

    @Test
    void testAdd2() {
        int secondTest = phoneBook.add("Fedya", "+79161234568");
        Assertions.assertEquals(2, secondTest);
    }

    @Test
    void testAdd3() {
        int thirdTest = phoneBook.add("Petya", "+79161234569");
        Assertions.assertEquals(2, thirdTest);
    }


}