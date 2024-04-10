import java.io.IOException;

public class cycles {
    public static void main(String[] args) throws IOException {
        for (int i =0; i< 7; i++){
            System.out.println("result"+i);
        }

        for (int i=0;System.in.read()!='s';i++){
            System.out.println("result"+i);
        }

        int count=0 ;
        while (count< 7){
            System.out.println("while"+count);
            count++;
        }

        count=10;
        do{
            System.out.println("do while"+count);
            count++;

        }while(count<10); // it will run at least once absolutely

        int condition=0;
        while (condition< 5) {
            if (condition == 3 ){
                break;
            }
            System.out.println("condition"+condition);
            condition++;
            
        }

        int condition2=0;

        while(condition2<10){
            condition2++;
            if (condition2%2!=0){
                
                continue;
                
            }
            System.out.println("odd "+condition2);
        
        }
 
    }
}
