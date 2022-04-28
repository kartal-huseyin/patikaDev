package java101.dovusOyunu;

public class Fighter {

    String name;
    int healt;
    int damage;
    static boolean bl = true;
    int blockPercentage;
    int ultiHitPercent;

    public static boolean isBl() {
        return bl;
    }

    public static void setBl(boolean bl) {
        Fighter.bl = bl;
    }

    public int getBlockPercentage() {
        return blockPercentage;
    }

    public void setBlockPercentage(int blockPercentage) {
        this.blockPercentage = blockPercentage;
    }

    public int getUltiHitPercent() {
        return ultiHitPercent;
    }

    public void setUltiHitPercent(int ultiHitPercent) {
        this.ultiHitPercent = ultiHitPercent;
    }

    public Fighter(String name, int healt, int damage, int blockPercentage, int ultiHitPercent) {
        this.name = name;
        this.healt = healt;
        this.damage = damage;
        this.blockPercentage=blockPercentage;
        this.ultiHitPercent=ultiHitPercent;
    }

    public Fighter() {

    }

    public void hit(Fighter first, Fighter second) {
        int block = (int) Math.round(Math.random() * 100);
        int hit = (int) Math.round(Math.random() * 100);
        if (second.blockPercentage > block) {
            if(first.ultiHitPercent>hit){
                System.out.printf("*ULTI* saldırı BLOKLANDI\n");
            }else{
                System.out.printf("BLOKLANDI\n");
            }

        } else {
            if(first.ultiHitPercent>hit){
                System.out.printf("*ULTI* %d puan !\n",2*first.damage);
                setHealt(second.healt -= 2*first.damage);
            }else{
                setHealt(second.healt -= first.damage);
            }

        }

    }

    @Override
    public String toString() {
        return String.format("%s : %d ", this.name, this.healt);
    }

    public static void run(Fighter f1, Fighter f2) {
        int turn = (int) Math.round(Math.random());
        if (turn == 0) bl = false;
        int round = 0;
        do {
            System.out.println("*** Round " + (++round) + " : ***");
            if (bl) {
                System.out.println(f1.getName()+" vurdu ! ");
                f2.hit(f1, f2); //f1 -> f2 ye vuruyor ; f1 vurduğundan , f2 objesinin sağlığı üzerinde manipülasyon yapıldığı için, f2 objesi üzerinden nesneleri gönderiyorum.
            } else {
                System.out.println(f2.getName()+" vurdu ! ");
                f1.hit(f2, f1);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
