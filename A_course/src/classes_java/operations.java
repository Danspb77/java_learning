package classes_java;

public class operations {
    public static void main(String[] args) {
        client Danya = new client(1,"Danya",100000);

        Danya.setId(1);
        Danya.setName("Danya");
        Danya.setBalance(100000);


        Danya.getAllData();


        client mobClient= new client(2,"Mob",200);  // only with NEW you can create a new object of class

        

        mobClient.getAllData();
    }
}
