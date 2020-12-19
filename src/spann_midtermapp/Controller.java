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
public class Controller 
{
    int accumulator;
    
    Model m1 = new Model();
    public void missionControl()
    {
        View v1 = new View();
        
        do 
        {
            v1.getPromptContinue();        
        } while(v1.continueIndicator == 'Y');
            
    }
    
    public void requestWriteBowl1(int b1)
    {
        m1.setBowl1(b1);
    }
    
    public void requestWriteBowl2(int b2)
    {
        m1.setBowl2(b2);
    }
    
    public int requestAccum()
    {
        accumulator = m1.getBowlAccum();
        return accumulator;   
    }
    
}
