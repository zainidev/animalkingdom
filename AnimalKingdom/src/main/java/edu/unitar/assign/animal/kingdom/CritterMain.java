package edu.unitar.assign.animal.kingdom;

// *********************************************************
// @title        : Final Project - Animal Kingdom
// @description  : This assignment will give you practice with defining classes. You are to write a set of classes that define the 
//                 behavior of certain animals. You will be given a program that runs a simulation of a world with many animals wandering 
//                 around in it. Different kinds of animals will behave in different ways and you are defining those differences.
// @author       : Roszaini Mustapa
// @Date         : 31-07-2021
//*********************************************************

import edu.unitar.assign.animal.kingdom.action.Giant;
import edu.unitar.assign.animal.kingdom.action.NinjaCat;
import edu.unitar.assign.animal.kingdom.action.Tiger;
import edu.unitar.assign.animal.kingdom.action.WhiteTiger;
import edu.unitar.assign.animal.kingdom.model.FlyTrap;
import edu.unitar.assign.animal.kingdom.model.Food;
import edu.unitar.assign.animal.kingdom.ui.CritterFrame;

//CritterMain provides the main method for a simple simulation program.  Alter
//the number of each critter added to the simulation if you want to experiment
//with different scenarios.  You can also alter the width and height passed to
//the CritterFrame constructor.

public class CritterMain {
	
    public static void main(String[] args) {
        CritterFrame frame = new CritterFrame(60, 40);

        // uncomment each of these lines as you complete these classes
//         frame.add(30, Bear.class);
         frame.add(30, Tiger.class);
         frame.add(30, WhiteTiger.class);
         frame.add(30, Giant.class);
         frame.add(30, NinjaCat.class);

        frame.add(30, FlyTrap.class);
        frame.add(30, Food.class);

        frame.start();
    }
    

}
