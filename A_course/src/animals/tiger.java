package animals;

public class tiger extends animal {
    public tiger(String roar, int legs) {
        setVolume(roar);
        setLegs(legs);
        
    }
    private int age;
    

    void roar(){
        System.out.println("roaraaaaa "+ " on " + getLegs() + "legs");
    }

    public String getVolume(){
        String sound = super.getVolume();
        return sound+ " tiger";
 
    
  }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    } 
}
