package classes_java;

public class client {

    
    private int id;
    private String name;
    private double balance;

    client(){}
    // it's constructor - it will be executed in creation moment
    client(int id, String name, double balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
    void getAllData(){
        System.out.println(id + " " + name + " " + balance);
    }

    void setId(int i){
        id =i;
    }
    void setName(String n){
        name=n;
    }
    void setBalance(double b){
        balance=b;
    }
}
