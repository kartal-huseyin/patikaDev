package java101.ogrenciSistemi;

public class Main {
    public static void main(String[] args) {


        Teacher t1=new Teacher("Mahmut Hoca", "TRH", "555" );
        Teacher t2=new Teacher("Kulyutmaz", "BIO", "456" );
        Teacher t3=new Teacher("Ekrem Hoca", "BDN", "758" );


        Course tarih=new Course("Tarih","101", "TRH");
        Course biyoloji=new Course("Biyoloji","102", "BIO");
        Course beden=new Course("Beden Egitimi", "BDN","103");

        tarih.addTeacher(t1);


        Student s1=new Student("İnek Şaban",40,60,70);
        Student s2=new Student("Güdük Necmi",40,50,59);




    }
}
