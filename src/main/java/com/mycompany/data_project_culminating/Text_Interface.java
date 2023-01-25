
package com.mycompany.data_project_culminating;
import java.util.Scanner;/**
 *
 * @author irolu
 */
public class Text_Interface extends Console {
    
    
   public static int testScores; 
   String[] Define1 ={"Simple Microscope", "Light microscope", "Dissecting microscope", "Phase contrast microscope", "Electron Microscope","Scanning Electron Microscope", "Transitional Electron Microscope", "Working distance", "Magnification", " Resolution", "Scanning", "Diffusion", "Osmosis", "Cytoplasm", "ECF(Extra Cellular fluid)", "Homeostasis", "Cell", "Tissue", " organ", "Organ System"}; 
   String[] Definitions1 ={"Single lens and limited magnification", "More than 1 lens, Bright light is condensed and focused to pass through a thin selectiion of material", "2 oculars that create a 3d image", "Alters the brightness of come  cell areas to make some brighter than others", " Use electrons to increase resolve power", "A form of electron microscope where electrons pass through dead and dehydrated specimen on a flourescent screen with a cross section view", "A form of electron microscope where specimen are coated with a thin metal layer resulting in electrons bouncing off the specimen and a 3D image being reflected on to the screen", "Distance from objective lens to cover slip", "Enlarge an object","Seperating or discerning details", "Searching a slide for a a specimen", "Movement of mollecules from an area of high concentration to an area of low concentration across a semi permeable memebrain", " Movment of water from an area of high concentration to an area of low conentration to reach equillibrium", " The fluid inside the cell where most chemical reactions take place", "The liquid environment surrounding living cells composed of water, ions and enzymes", "Maintaining constant conditions within the body with little to no change", "Basic functional unit of life", " Group of cells together that form a specialized function", "Group of tissues  that work together to perform a specialized function", "Group of organs working together for a specific function"};
   public void OpenTextInt(){
   Scanner Index = new Scanner(System.in); 
   
   System.out.println("Welcom to the Biology study database");
   System.out.println("Input 1 to learn, 2 to test yourself and -1 to exit the program");
   int response =Index.nextInt();  
   
   
  if(response > 0){ 
      Index.close();
  if(response == 1){ 
  for(int index = 0; index < Define1.length; index++){ 
      if(index != Define1.length){
      String print = Define1[index] + ": " + Definitions1[index]; 
  System.out.println(print + "\n");
      
      } 
      
  }
  }
  if(response == 2){ 
      Scanner Index2 = new Scanner(System.in);  
      testScores =0; 
      System.out.println("define the following");
   for(int index = 0; index < Define1.length; index++){  
       
       String Print = Define1[index] + ": "; 
       System.out.println(Print); 
       String response2 = Index2.nextLine();   
       
       if(response2.equals(Definitions1[index]) ){
       System.out.println("Correct"); 
       testScores +=1;
       } else{
       System.out.println("Incorrect");
       }
       
   }
      
  }
  
  
  
  }
  
  
  
   }
}
