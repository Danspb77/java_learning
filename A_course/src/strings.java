public class strings {
    public static void main(String[] args) {
        String str1="Hi, there";
        String str2= str1.substring(0,3).toUpperCase();

        System.out.println(str2);
        System.out.println(str1.equals(str2));

        String[] str_arr = {"one", "two", "three"};
        System.out.println(str1 + " " + str_arr[1]);
        System.out.println(args[0]+" "+ args[1]);
    }
}
