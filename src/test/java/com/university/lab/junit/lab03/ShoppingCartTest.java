/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.university.lab.junit.lab03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author hanif
 */
public class ShoppingCartTest {

    @Test
    public void testAddThreeItems() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple");
        cart.addItem("Bread");
        cart.addItem("Milk");
        assertEquals(3, cart.getItemCount());
    }

    @Test
    public void testRemoveOneItem() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple");
        cart.addItem("Bread");
        cart.addItem("Milk");
        cart.removeItem("Bread");
        assertEquals(2, cart.getItemCount());
    }

    @Test
    public void testClearCart() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple");
        cart.addItem("Bread");
        cart.clear();
        assertEquals(0, cart.getItemCount());
    }

    @Test
    public void testRemoveNonExistentItemDoesNotThrow() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple");
        assertDoesNotThrow(() -> cart.removeItem("Banana"));
        assertEquals(1, cart.getItemCount());
    }
}