package inner_classes;
import classes_java.client;

public class Stsrt {
    public static void main(String[] args) {
        Bicycle bmx=new Bicycle("bamx", 2024);
        bmx.go();
        Bicycle.HandleBar control = bmx.new HandleBar();
        control.right();
    }
    
}
