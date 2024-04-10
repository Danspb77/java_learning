package animals;

public class zoo {
    public static void main(String[] args){
        tiger amur=new tiger("roar", 4);
        String roar= amur.getVolume();
        System.out.println(roar);
        amur.roar();

        System.out.println(amur.getVolume());
    }
}
