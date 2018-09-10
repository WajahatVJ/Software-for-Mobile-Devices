/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smd;

/**
 *
 * @author wajahat
 */
public abstract class Vehicle implements Movable,Bulletproof,Automated {
    //non-abstract methods
    public void start()
    {
        System.out.println("Vehicle Starts.");
    }
    public void stop()
    {
        System.out.println("Vehicle Stops.");
    }
    public void breaks()
    {
        System.out.println("Breaks applied.");
    }
    //abstract methods
    public abstract void Engine();
}
