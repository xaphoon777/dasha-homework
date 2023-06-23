package org.example.basics.stage1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task1Test {

    @Test
    void sumTwoNumbers() {
        int actual = Task1.sumTwoNumbers(2, 3);
        int expected = 5;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void sayHello() {
        String actual = Task1.sayHello("Даша");
        String expected = "Привет, Даша !";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void concatTwoStringsAndCapitalize() {
        String actual = Task1.concatTwoStringsAndCapitalize("Даша","Саша");
        String expected = "ДАША САША";
        Assertions.assertEquals(expected,actual);
    }
}