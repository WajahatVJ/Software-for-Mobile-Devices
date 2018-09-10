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
public class SMD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle mycar=new Car("BMW","15","XYZ 123",true,true);
        
        Car car= (Car) mycar;
        
        mycar.start();
        mycar.Engine();
        mycar.isMovable();
        mycar.isAutomated();
        mycar.isBulletproof();
        mycar.stop();
        
        //non static inner class
        Car.Luxury luxury=car.new Luxury();
        luxury.MakeLuxury();
        
        
        //static nested class
        Car.Racing racing=new Car.Racing();
        racing.MakeRacing();
        // TODO code application logic here
    }
    
}
