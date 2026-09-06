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
 public class TemperatureConverterTest { 
    
         public TemperatureConverterTest() {
   }
    
  @Test
public void testCelsiusToFahrenheit() {
    TemperatureConverter converter = new TemperatureConverter();
    assertEquals(32, converter.celsiusToFahrenheit(0), 0.01);
}


@Test
public void testFahrenheitToCelsius(){
  TemperatureConverter converter = new TemperatureConverter();
  assertEquals(0, converter.fahrenheitToCelsius(32), 0.01);

}

@Test
public void testCelsiusToKelvin(){
 TemperatureConverter converter = new TemperatureConverter();
 assertEquals(273.15, converter.celsiusToKelvin(0), 0.01);
}

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
