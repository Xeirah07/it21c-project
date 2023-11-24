package Polymorphism;

public class Main {
    public static void main(String [] args){
        Polymorphism_Fruits myFruit = new Polymorphism_Fruits("Sarah");
        Polymorphism_Grape myGrape = new Polymorphism_Grape("Grape");
        Polymorphism_Mango myMango = new Polymorphism_Mango("Mango");
        
        myFruit.eat();
        myGrape.sweet();
        myMango.sour();
        
        System.out.println();
        
        myFruit.fruitTaste();
        myGrape.fruitTaste();
        myMango.fruitTaste();
        
        
    }
}
