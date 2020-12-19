/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spann_midtermapp;

/**
 * @author Shanell A. Spann
 * ITDEV-110 Intro to OOP
 * Fall 2019 MidTerm Exam
 * Due: 10/24/2019
 */
import java.util.Scanner;

public class View 
{
    int bowl1 = 0;
    int bowl2 = 0;

    int accumulator;
    int currentEntry;
    char continueIndicator;
    char continueIndicatorAgain;
    int numBowls = 0;
    Controller c = new Controller();
    Admin admin = new Admin();
    Scanner keyboard = new Scanner(System.in);
    
    public void getPromptContinue()
    {    
       
        System.out.println("\nWould you like to Calculate Your Bowling Scores Y or N?: \t");
        continueIndicator = keyboard.next().toUpperCase().charAt(0);
        
        if(continueIndicator == 'Y')
        {             
            getBowls();  
        }
       
    }
    
    public void getBowls()
    {     
        System.out.println("Enter Bowling Score 1: \t");
        bowl1 = keyboard.nextInt();
        currentEntry = bowl1;
        sendBowl1();
        numBowls++;
        displayEntry();
 
        System.out.println("\n");
        System.out.println("Enter Bowling Score 2: \t");
        bowl2 = keyboard.nextInt();
        currentEntry = bowl2;
        sendBowl2();
        numBowls++;
        displayEntry(); 
//        System.out.println("\nWould you like to Calculate More Scores Y or N?: \t");
//        continueIndicatorAgain = keyboard.next().toUpperCase().charAt(0);
//        
//        if(continueIndicatorAgain == 'Y')
//        {             
//            getBowls();  
//        }
//        if(continueIndicatorAgain == 'N')
//        {
//            admin.Goodbye();
//        }
       
    }
    
    
    public void sendBowl1()
    {
        c.requestWriteBowl1(bowl1);
    }
    public void sendBowl2()
    {
        c.requestWriteBowl2(bowl2);
    }
   
    public void displayEntry()
    {
        int accum;
        int avg;
        System.out.println("You Entered: " + "\t\t" + currentEntry);
        accum = c.requestAccum();
        avg = accum / numBowls;
        System.out.println("Today's Average Bowling Score: " + "\t" + avg);
    }
    
//    public void getPromptContinueAgain()
//    {    
//       
//        System.out.println("\nWould you like to Calculate More Scores Y or N?: \t");
//        continueIndicatorAgain = keyboard.next().toUpperCase().charAt(0);
//        
//        if(continueIndicatorAgain == 'Y')
//        {             
//            getBowls();  
//        }
//       
//    }
    
}
