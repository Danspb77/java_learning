package inner_classes;

public class Bicycle {
    private String model;
    private int year;

    public Bicycle(String model ,int year){
        this.model=model;
        this.year=year;
    }

    public void go(){
        System.out.println("Bike is moving");
    }

    public class HandleBar{
        public void right (){
            System.out.println("Right go");
        }
    }

}
