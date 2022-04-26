package java101.ogrenciSistemi;

public class Student {

    Course c1;
    Course c2;
    Course c3;

    String name;
    int note1;
    int note2;
    int note3;
    double averageNote;
    boolean isPass;



    Student(String name, int note1, int note2, int note3){
        this.note1 = note1;
        this.note2 = note2;
        this.note3 = note3;
        this.name =name;
        this.averageNote=(note1+note2+note3)/3.0;

        if(averageNote>55){
            System.out.println(name+" Sınıfı geçtiniz. ");
        }else{
            System.out.println(name+" Sınıfta kaldınız. ");
        }



    }

}
