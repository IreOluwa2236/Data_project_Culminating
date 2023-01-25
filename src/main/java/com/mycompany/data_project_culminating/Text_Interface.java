/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.data_project_culminating;
import java.util.Scanner;/**
 *
 * @author irolu
 */
public class Text_Interface extends Console {
    
    
   public static double testScores; 
   
   public void OpenTextInt(){
   Scanner Index = new Scanner(System.in); 
   
   System.out.println("Welcom to the Biology study database");
   System.out.println("Input 1 to learn, 2 to test yourself and 3 to exit the program");
   int response =Index.nextInt();
   
   }
}
