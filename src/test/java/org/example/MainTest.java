package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testFibOn6(){
    int n = Main.findFibonachi(6);
        Assertions.assertEquals(8, n);
    }

    @Test
    public void testFibOn10(){
        int n = Main.findFibonachi(10);
        Assertions.assertEquals(55, n);
    }

    @org.junit.jupiter.api.Test
    void findFibonachi() {

    }
}