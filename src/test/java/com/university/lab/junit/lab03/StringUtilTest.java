/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.university.lab.junit.lab03;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author hanif
 */
public class StringUtilTest {
    
    public StringUtilTest() {
    }
  

    StringUtil util = new StringUtil();

    @Test
    public void testMadam() {
        assertTrue(util.isPalindrome("madam"));
    }

    @Test
    public void testRaceCar() {
        assertTrue(util.isPalindrome("RaceCar"));
    }

    @Test
    public void testHello() {
        assertFalse(util.isPalindrome("hello"));
    }

    
    //an empty charcter is a palindrome beacuse when ever we reverse it,
    //it turn out to be the exact same thing
    @Test
    public void testEmpty() {
        assertTrue(util.isPalindrome(""));
    }
    
    @Test
    public void testNull() {
        assertFalse(util.isPalindrome(null)); 
    }



    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
