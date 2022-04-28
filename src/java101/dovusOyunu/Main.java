package java101.dovusOyunu;


public class Main  {
    public static void main(String[] args) {

        Fighter f1=new Fighter("Ryu",150,14,16,20);
        Fighter f2=new Fighter("Ken",140,15,21,14);

        Fighter.run(f1,f2);


    }
}
