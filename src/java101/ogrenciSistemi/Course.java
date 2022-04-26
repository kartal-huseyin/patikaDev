package java101.ogrenciSistemi;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;


    public Course(String name, String code, String prefix) {
        this.code = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
    }

    void addTeacher(Teacher t) {
        if(prefix.equals(t.branch)){
            this.teacher=t;
            this.teacher.printTeacher();
     }else{
            System.out.println("Ogretmen ve brans uyusmuyor.");
        }

    }



}
