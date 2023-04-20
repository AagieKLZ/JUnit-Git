/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.junitgitm5;

/**
 *
 * @author alumne
 */
public class Calculator {
    /**
     * @param number a number
     * @return the square root of the number or -1 if the number is negative
     */
    public static double squareRoot(double number) {
        return number < 0 ? -1 : Math.sqrt(number);
    }
}
