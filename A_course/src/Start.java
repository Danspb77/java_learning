public class Start{
    public static int num=10;
    public final double pi =3.14; // constant
    public static void main(String[] args) {
        System.out.println("sdfv");
        int num2= 3;
        int result = num% num2;
        result=result++; //сначала значение, потом плюс 1
        result = -10;

        if ((result > 0 && result < 10) || (num > 0)){
            System.out.println("Result is positive "+ result);
        }else{
            System.out.println("Result is negative" + result);
        }

        System.out.println("Result is: "+result);
        System.out.println("Another Result"+num+num2); // it will concatenate strings and integers

    }
}