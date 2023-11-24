package Polymorphism;

public class Polymorphism_Grape extends Polymorphism_Fruits {
    Polymorphism_Grape(String name){
        super(name);
    }

    void sweet(){
        System.out.println(name+ " is sweet");
    }
    public void fruitTaste(){
        System.out.println("Sweet ang " + name);
    }
}
