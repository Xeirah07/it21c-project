package OOP.basics;

class Myself {
    String name;
    String felt;
    String motto;
    
    Myself(String name, String felt, String motto){
        this.name= name;
        this.felt= felt;
        this.motto= motto;
        
    }
    String getName() {
        return name;
    }
    String getFelt() {
        return felt;
    }
    String getMotto() {
        return motto;
    }
}
