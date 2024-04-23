package exceptions;
public class Start {
    public static void main(String[] args){
        try {
            System.err.println("try smth");
            Object[] arr = new Integer[4];
            arr[2] = true; // This line will throw ArrayStoreException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("we have a problem with storing");

        } catch (ArrayStoreException e) {
            System.err.println("we have a problem type");
        }
    }
}
