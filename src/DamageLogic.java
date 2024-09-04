public class DamageLogic {


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
                dmg = hit / 10;
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

