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
    public static double nlog(double base, double num){
        if (base <= 0 || num < 1) return -1;
        return Math.log(num) / Math.log(base);
    }
}
