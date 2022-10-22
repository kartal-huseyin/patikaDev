package java101.ogrenciSistemi;



public class PriorityMethods {

    PriorityMethods(){

        System.out.println("  2. if there is a super() constructor ");
        System.out.println("  3. constructor");
    }

    {
        System.out.println("  1. just block");
    }
    static {
        System.out.println("1. static block");
    }

    public static void main(String[] args) {
        System.out.println("2. main static");

        System.out.println("  IF THERE AN OBJECT CREATED. THEN : ");
        PriorityMethods obj1=new PriorityMethods();

    }


}
