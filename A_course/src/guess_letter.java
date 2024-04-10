import java.io.IOException;

public class guess_letter {
    public static void main(String[] args) throws IOException {

        char ch ,answer = 'g';

        System.out.println(" what letter i guess?");
        System.out.print("try to guess: ");

        ch = (char)System.in.read();


        if (ch ==answer){
            System.out.println("**Right**");
        }else if(ch > answer){
            System.out.println("**too high**");
        }else{
            System.out.println("**too low**");
        }

        int monthNumber=1;

        String monthString;

        switch (monthNumber){
            case 1 : monthString= "jan";
                break;
            case 2 : monthString= "feb";
                break;
            case 3: monthString = "march";
                break;
            default: monthString = "unknown";
                break;
        }
        System.out.println(monthString);
    }
}
