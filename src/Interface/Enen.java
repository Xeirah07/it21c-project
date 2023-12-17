package Interface;


class Enen implements MaPa{
    String name;
    
    Enen(String name){
        this.name = name;
    }
    public void money(){
        System.out.println(name + " daghan money");
    }
    public void sanaol(){
        System.out.println(name +" maka sanaol");
    }

    
}

