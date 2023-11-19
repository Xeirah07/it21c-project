package LampAndStudent;

class Student {
    String name;
    int roll_no;
}

class Ans{
    public static void main(String [] args){
        Student s = new Student();
        s.name = "Sarah";
        s.roll_no = 20211254;
        System.out.println("My name is " + s.name + " and my ID number is " + s.roll_no);
    }
}