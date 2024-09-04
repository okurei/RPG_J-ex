import java.util.Random;

public class Character {
    private final String name;
    private double hp = 100;
    Random random = new Random();

    public Character(String name) {
        this.name = name;
    }

    public double currentHp(double dmg){
       this.hp = hp - dmg;
       return hp;
    }
    public double atk (){
        return random.nextInt(100) + 1;
    }
    public double crt (){
        return random.nextInt(6) +1;
    }

    public double getHp() {
        return hp;
    }
    public String getName(){
        return name;
    }
}
