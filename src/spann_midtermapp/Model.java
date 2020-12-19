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
public class Model 
{
    private int Bowl1;
    private int Bowl2;
    private int Average;
    private int BowlAccum;
    
    public int getBowl1() 
    {
        return Bowl1;
    }

    public void setBowl1(int Bowl1) 
    {
        BowlAccum = BowlAccum + Bowl1;
        this.Bowl1 = Bowl1;
        
    }

    public int getBowl2() 
    {
        return Bowl2;
    }

    public void setBowl2(int Bowl2) {
        BowlAccum = BowlAccum + Bowl2;
        this.Bowl2 = Bowl2;  
    }

    public int getAverage() 
    {
        return Average;
    }

    public void setAverage(int Average) 
    {
        Average = BowlAccum / 3;
        this.Average = Average;
    }

    public int getBowlAccum() 
    {
        return BowlAccum;
    }

    public void setBowlAccum(int BowlAccum) 
    {
        this.BowlAccum = BowlAccum;
    }
    
}
