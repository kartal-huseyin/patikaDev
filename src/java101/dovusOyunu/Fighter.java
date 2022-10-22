package java101.dovusOyunu;



public class Fighter extends Thread {

    String name;
    int healt;
    int damage;
    static boolean bl = true;
    int blockPercentage;
    int ultiHitPercent;
    boolean isSecondBlock=false;


    public String getNames() {
        return name;
    }

    public void setNames(String name) {
        this.name = name;
    }



    public Fighter(String name, int healt, int damage, int blockPercentage, int ultiHitPercent) {
        this.name = name;
        this.healt = healt;
        this.damage = damage;
        this.blockPercentage=blockPercentage;
        this.ultiHitPercent=ultiHitPercent;
    }


   public void hit(Fighter f2) {
        int block = (int) Math.round(Math.random() * 100);
        int hit = (int) Math.round(Math.random() * 100);
        if (f2.blockPercentage > block) {
            if(!f2.isSecondBlock){
                if(this.ultiHitPercent>hit){
                    System.out.print("*ULTI* saldırı BLOKLANDI\n");
                }else{
                    System.out.print("BLOKLANDI\n");
                }
                f2.isSecondBlock^=true;
            }else{
                System.out.println("Ustüste Blok ENGELLENDİ");
                System.out.printf("*Vurdu* %d puan !\n",this.damage);
                f2.setHealt(f2.healt -= this.damage);
                f2.isSecondBlock^=true;
            }


        } else {
            if(this.ultiHitPercent>hit){
                System.out.printf("*ULTI* %d puan !\n",2*this.damage);
                f2.setHealt(f2.healt -= 2*this.damage);
            }else{
                System.out.printf("*Vurdu* %d puan !\n",this.damage);
                f2.setHealt(f2.healt -= this.damage);
            }

        }

    }

    @Override
    public String toString() {
        return String.format("%s : %d ", this.name, this.healt);
    }


    @Override
    public void run() {

    }


    public static void fight(Fighter f1, Fighter f2) {
        int turn = (int) Math.round(Math.random());
        if (turn == 0) bl = false;
        int round = 0;
        f1.start();
        f2.start();

        do {
            System.out.println("*** Round " + (++round) + " ***");
            if (bl) {
                System.out.println(f1.getNames()+" saldırdı ! ");
                f1.hit(f2);
            } else {
                System.out.println(f2.getNames()+" saldırdı ! ");
                f2.hit(f1);
            }
            System.out.println(f1);
            System.out.println(f2);

            bl ^= true;

        } while (f1.healt != 0 && f2.healt != 0);

        if (f1.healt == 0) {
            System.out.println(f2.name + " KAZANDI ! ");
        }
        else {
            System.out.println(f1.name + " KAZANDI ! ");
        }
    }

    public int getHealt() {
        return healt;
    }

    public void setHealt(int healt) {
        this.healt = healt < 0 ? 0 : healt;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


}
