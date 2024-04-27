package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    static PhoneBook phoneBook;
    @BeforeAll
    public static void init(){
        phoneBook = new PhoneBook();
    }
    @Test
    public void testAdd1() {
        int firstTest = phoneBook.add("Petya", "+79161234567");
        Assertions.assertEquals(1, firstTest);
    }

    @Test
    public void testAdd2() {
        int secondTest = phoneBook.add("Fedya", "+79161234568");
        Assertions.assertEquals(2, secondTest);
    }

    @Test
    public void testAdd3() {
        int thirdTest = phoneBook.add("Petya", "+79161234569");
        Assertions.assertEquals(2, thirdTest);
    }

    @Test
    public void testFindByNumber() {
        phoneBook.add("F", "7916");
        String testFindByNumber = phoneBook.findByNumber("7916");
        Assertions.assertEquals("F", testFindByNumber);
    }
    @Test
    public void testFindByNumber2() {
        String testFindByNumber2 = phoneBook.findByNumber("+79161234523");
        Assertions.assertEquals("К сожалению, записи с таким номером нет", testFindByNumber2);
    }






}