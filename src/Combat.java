import java.util.Random;

public class Combat {
    Character character1 = new Character("Player1");
    Character character2 = new Character("Player2");
    DamageLogic damageLogic = new DamageLogic();

    Random random = new Random();
    public void run(){

        int i = 1;
        do {
            System.out.println("Round" + i + "\n");
            int turn = random.nextInt(2) + 1;
            if (turn == 1) {
                character1.currentHp(damageLogic.endDmg(character1.atk(), character1.crt(), character1.crt()));
                System.out.println(character1.getName()+ " " + character1.getHp());

                character2.currentHp(damageLogic.endDmg(character2.atk(), character2.crt(), character2.crt()));
                System.out.println(character2.getName() + " " + character2.getHp());
            } else {
                character2.currentHp(damageLogic.endDmg(character2.atk(), character2.crt(), character2.crt()));
                System.out.println(character2.getName() + " " + character2.getHp());

                character1.currentHp(damageLogic.endDmg(character1.atk(), character1.crt(), character1.crt()));
                System.out.println(character1.getName()+ " " + character1.getHp());
            }
            i++;

        } while (character1.getHp() > 0 && character2.getHp() > 0);
    }
}
