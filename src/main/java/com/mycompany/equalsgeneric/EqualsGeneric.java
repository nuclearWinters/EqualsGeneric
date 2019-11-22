/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.equalsgeneric;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
/**
 *
 * @author Armando
 */
public class EqualsGeneric {
    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter("filename.txt");
            esIgualA(writer, writer);
        } catch (FileNotFoundException e) {
            
        }
  }
    public static < F, S> void esIgualA(F primero, S segundo) {
        System.out.println(primero.equals(segundo));
    }
}
