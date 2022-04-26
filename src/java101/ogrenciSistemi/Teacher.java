package java101.ogrenciSistemi;

public class Teacher {
    
    String name;
    String branch; 
    String mpNum;


    public Teacher(String name, String branch, String mpNum) {
        this.name = name;
        this.branch = branch;
        this.mpNum = mpNum;

    }


    void printTeacher() {
        System.out.println("Ogretmenin adı: "+name+"\nBransi: "+branch+"\nTel No: "+mpNum);

    }


}
