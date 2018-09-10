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
public class Car extends Vehicle {

    private String company;
    private String model;
    private String number;
    final boolean moveable=true;
    private boolean bulletproof;
    private boolean automated;
    private boolean luxury=false;
    private boolean racing=false;

    
    //non-static class
    public class Luxury{
        Luxury()
        {
            System.out.println("Luxury Constructor called");
        }
        public void MakeLuxury()
        {
            luxury=true;
            System.out.println("car made luxurious");
        }
    }
    
    //static-class
    public static class Racing{
        private boolean racing;
        Racing()
        {
            System.out.println("Racing Constructor called");
        }
        public void MakeRacing()
        {
            racing=true;
            System.out.println("car made luxurious");
        }
    }
    
    public Car(String com,String mod,String num,boolean bp,boolean am){
        company=com;
        model=mod;
        number=num;
        bulletproof=bp;
        automated=am;
    }
    
    //abstract methods
    @Override
    public void isMovable() {
        if(moveable){
            System.out.println("Yes!...car is movable.");
        }
    }

    @Override
    public void isBulletproof() {
        if(bulletproof){
            System.out.println("Awesome!...it is bulletproof.");
        }
        else{
            System.out.println("No!...it is not.");
        }
    }

    @Override
    public void isAutomated() {
        if(automated){
            System.out.println("Excellent!...it is automated.");
        }
        else{
            System.out.println("No!...it is not.");
        }
    }

    @Override
    public void Engine() {
        System.out.println("Engine forces on front wheels only to make the car movable.");
    }
    
}
