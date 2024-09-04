/*Quando viene lanciato un attacco, il personaggio che lo riceve lancia un dado da 100 facce, se esce un numero:
da 0 a 25 il colpo viene schivato e l'attacco non va a segno
da 26 a 90, il colpo va a segno ma con una percentuale di danno che varia da 26% a 90%
da 91 a 100 il colpo fa il 100% del danno.
Sempre quando viene lanciato un attacco, il player che lo lancia deve lanciare due dadi da 6,
        -  se il risultato è un doppio 1,2,3 il colpo è un FALLIMENTO (a prescindere dalla condizione realizzata con il lancio del dado del giocatore che riceve il colpo),
- se invece esce un doppio 4,5,6 il colpo è CRITICO
-- in questo caso (COLPO CRITICO)  se IL RICEVENTE ha un numero compreso tra 26 e 90 avrà un danno che va dal 26 %al 90 %
        , se il RICEVENTE, ha ottenuto un valore superiore a 90 il danno sarà del 100%
I colpi dovranno essere lanciati in modo alternato.*/

import java.util.Random;

public class DamageLogic {
    Random random = new Random();


    private double damage(double hit){
        double dmg;
        if (hit <26) {
            System.out.println("Miss");
            dmg = 0;
            return dmg;
        }
        else{
            if (hit > 89){
                dmg = 10;
                return dmg;
            }
            else{
                dmg = (double)hit / 10;
                return dmg;
            }
        }
    }
    private int critical(double crt1, double crt2){
        if (crt1 == crt2){
            if (crt1 < 4){
                System.out.println("Critical Failure");
                return  0;

            }
            else{
                System.out.println("Critical Success");
                return  2;

            }
        }
        else{
            return 1;
        }
    }

    public int endDmg(double hit, double crt1,double crt2  ){
        double dmg;
        dmg = damage(hit)*critical(crt1, crt2);
        return (int) dmg;
    }
}

