/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalc;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author JunDeng
 */
public class Model {
    
    double addition(double num1, double num2){
        return (num1 + num2);
    }
    
    double subtraction(double num1, double num2){
        return (num1 - num2);
    }
    
    double multiplication(double num1, double num2){
        return (num1 * num2);
    }
    
    double division(double num1, double num2){
        return (num1 / num2);
    }
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
