

// FIRST EXERCIE : making a class Student with 3 attributes (matricule, name, speciality) and 2 constructors

public class Student {
    int matricule;
    String name;
    String speciality;

    public Student (int m, String n) {
        matricule = m;
        name = n;
    }
    
    public Student (int m, String n, String s) {
        matricule = m;
        name = n;
        speciality = s;
    }
}