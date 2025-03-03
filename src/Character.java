import java.util.Random;

public class Character {
    private final String name;
    private double hp = 100;
    private final double baseAtk = 10;

    Random random = new Random();

    public Character(String name) {
        this.name = name;
    }

    public void currentHp(double dmg){
       this.hp = hp - dmg;
    }
    public double atk (){
        return random.nextInt(100) + 1;
    }
    public double crt (){
        return random.nextInt(6) +1;
    }

    public double getHp() {
        if (hp > 0) {
            return hp;
        }else{
            return 0;
        }
    }
    public String getName(){
        return name;
    }
}
