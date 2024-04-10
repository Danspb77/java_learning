package classes_java;

public class client {

    
    private int id;
    private String name;
    private double balance;

    // it's constructor - it will be executed in creation moment
    client(int defid, String defname, double defbalance){
        id=defid;
        name=defname;
        balance=defbalance;
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
