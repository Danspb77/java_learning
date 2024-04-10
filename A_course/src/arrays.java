public class arrays {
    public static void main(String[] args) {
        int[] arr={1,11,1,1};

        for(int i =0; i<arr.length;i++){
            arr[i]=arr[i]+i;
        }
        for (int i=0 ;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        for (int e:arr){
            System.out.println(e);
        }

        int table[][]= new int[2][];
        table[1]=new int[2];
        table[0]=new int[3];


    }
}
