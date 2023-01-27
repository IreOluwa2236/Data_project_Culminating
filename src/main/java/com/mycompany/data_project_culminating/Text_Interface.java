
package com.mycompany.data_project_culminating;
import java.util.Scanner;/**
 *
 * @author irolu
 */ 

public class Text_Interface extends Console {
    
  // Scoring system for testing   
   public static int testScores;  
   
   
   //list of scientific terms to be Defined 
   String[] Define1 ={"Simple Microscope", "Light microscope", "Dissecting microscope", "Phase contrast microscope", "Electron Microscope","Scanning Electron Microscope", "Transitional Electron Microscope", "Working distance", "Magnification", " Resolution", "Scanning", "Diffusion", "Osmosis", "Cytoplasm", "ECF(Extra Cellular fluid)", "Homeostasis", "Cell", "Tissue", " organ", "Organ System"}; 
   // list of Definitions for those scientific terms 
   String[] Definitions1 ={"Single lens and limited magnification", "More than 1 lens, Bright light is condensed and focused to pass through a thin selectiion of material", "2 oculars that create a 3d image", "Alters the brightness of scome  cell areas to make some brighter than others", " Use electrons to increase resolve power", "A form of electron microscope where electrons pass through dead and dehydrated specimen on a flourescent screen with a cross section view", "A form of electron microscope where specimen are coated with a thin metal layer resulting in electrons bouncing off the specimen and a 3D image being reflected on to the screen", "Distance from objective lens to cover slip", "Enlarge an object","Seperating or discerning details", "Searching a slide for a a specimen", "Movement of mollecules from an area of high concentration to an area of low concentration across a semi permeable memebrain", " Movment of water from an area of high concentration to an area of low conentration to reach equillibrium", " The fluid inside the cell where most chemical reactions take place", "The liquid environment surrounding living cells composed of water, ions and enzymes", "Maintaining constant conditions within the body with little to no change", "Basic functional unit of life", " Group of cells together that form a specialized function", "Group of tissues  that work together to perform a specialized function", "Group of organs working together for a specific function"};
   
   //Opening text based GUI
   public void OpenTextInt(){ 
   // Primairy scanner object 
   Scanner Index = new Scanner(System.in); 
   
   System.out.println("Welcom to the Biology study database");
   System.out.println("Input 1 to learn, 2 to test yourself and -1 to exit the program");
   int response =Index.nextInt();  
  
   //case 1
  if(response > 0){//Start of conditional response > 0 
      //case 2
  if(response == 1){ 
  for(int index = 0; index < Define1.length; index++){ 
      if(index != Define1.length){
      String print = Define1[index] + ": " + Definitions1[index]; 
  System.out.println(print + "\n");
      
      } 
      
  }
  } 
  //Case 3
  if(response == 2){//Testing System  
      //Start of Secondairy Scanner object 
     Scanner Index2 = new Scanner(System.in);  
testScores =0; 
for(int index =0; index < Define1.length; index++){
    System.out.println("\n" + "Define" + Define1[index]);  
    String Return ="";
    while(Return.isEmpty()){
        Return = Index2.nextLine();
                
        if(Return.isEmpty()){
            System.out.println("You did not enter any input, please enter your answer:");
        }
    }
    if(Return.equals(Definitions1[index])){ 
        System.out.println("\n" + "That was Correct");  
        testScores += 1;
    }else{ 
        //Corrections 
        System.out.println("\n" +"that was incorrect. The correct answer is " + Definitions1[index]); 
    }
}


 System.out.println(" you scored " + testScores + " out of " + Define1.length); 
        //End of secondairy Scanner object 
       Index2.close(); 
  }
  
  
  
  }//End of conditional response > 0
  
  //End of primary Scanner object 
  Index.close(); 
 
   }
}
