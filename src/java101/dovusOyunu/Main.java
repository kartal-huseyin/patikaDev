package java101.dovusOyunu;



public class Main  {
    public static void main(String[] args) {

        Fighter f1=new Fighter("Ryu",100,5,100,20);
        Fighter f2=new Fighter("Ken",100,10,100,14);

        Fighter.fight(f1,f2);


    }
}
