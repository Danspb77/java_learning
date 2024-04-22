package simple_interfaces;

public class Start {
    public static void main(String[] args) {
        Girl Lena = new Girl();
        Boy Dima = new Boy();
        Lena.goal();
        Dima.goal();

        Player unit = Dima;
        unit.goal();
    }
}
