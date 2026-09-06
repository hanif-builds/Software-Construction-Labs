/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.university.lab.junit.lab03;

/**
 *
 * @author hanif
 */
public class TimerUtil {
    public int secondsBetween(int start, int end) {
    if (end < start) throw new IllegalArgumentException("End < start");
    return end - start;
}
}
