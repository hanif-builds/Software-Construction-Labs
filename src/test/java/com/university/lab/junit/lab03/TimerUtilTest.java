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
public class TimerUtilTest {

    public TimerUtilTest() {
    }

    @Test
    public void testSecondsBetween() {

        TimerUtil timer = new TimerUtil();
        assertEquals(15, timer.secondsBetween(10, 25));
    }

    @Test
    public void testSecondsBetween0() {

        TimerUtil timer = new TimerUtil();
        assertEquals(0, timer.secondsBetween(0, 0));
    }

    @Test
    public void testSecondsBetween1() {

        TimerUtil timer = new TimerUtil();
        assertThrows(IllegalArgumentException.class,() -> timer.secondsBetween(25, 10));
    }


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
