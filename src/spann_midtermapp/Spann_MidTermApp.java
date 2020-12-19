/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spann_midtermapp;

import java.awt.Toolkit;
import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author Shanell A. Spann
 * ITDEV-110 Intro to OOP
 * Fall 2019 MidTerm Exam
 * Due: 10/24/2019
 */
public class Spann_MidTermApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, LineUnavailableException 
    {
        Toolkit.getDefaultToolkit().beep();
        SoundUtils su = new SoundUtils();
        su.tone(261,300);
        su.tone(659,170);
        su.tone(400,500);

       Controller ctl = new Controller();
       ctl.missionControl();
       Admin admin = new Admin();
       admin.Goodbye();
       
       Toolkit.getDefaultToolkit().beep();
        su.tone(261,300);
        su.tone(659,170);
        su.tone(400,500);
        Thread.sleep(1000);
    }
    
}
