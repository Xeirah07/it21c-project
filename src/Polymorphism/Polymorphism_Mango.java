package Polymorphism;

public class Polymorphism_Mango extends Polymorphism_Fruits {
    Polymorphism_Mango(String name){
        super(name);
    }

    void sour(){
        System.out.println(name+ " is sour");
    }
    public void fruitTaste(){
        System.out.println("Sour ang " + name);
    }
}

