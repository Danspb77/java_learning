package over_loading;

public class Human {
    public Human() {
        
    }
    public Human(int age) {
        System.out.println(age);

    }
    public Human (String name){
        System.out.println("Name of the human is   "+ name);
    }
}