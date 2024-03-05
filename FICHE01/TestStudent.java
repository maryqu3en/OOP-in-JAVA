

// SECOND EXERCIE : making a class TestStudent to test and explain obtained results

public class TestStudent {
    public static void main(String[] args) {
        // Student stu1 = new Student("Meriem");   // 01

        // Student stu1 = new Student();           // 02

        Student stu1 = new Student(299, "Meriem"); // 03         CORRECTED

        stu1.speciality = "Computer Science";

        Student stu2 = new Student(288, "Houda", "Maths"); // 04    CORRECTED

        stu2.speciality = stu1.speciality;

        System.out.println(stu1.name + " " + stu1.speciality); // 05

        System.out.println(stu2.name + " " + stu2.speciality); // 06

        stu1 = stu2;
        stu2.name = "Sara";

        System.out.println(stu1.name + " " + stu1.speciality); // 07

    }
}

/*

FIRST TRY ERROR: 
----> because of the zeros at the beginning of the passed matricules || instruction 03 and 04

SECOND TRY ERROR:
----> because the used contructors are not defined in the Student class || instruction 01 
----> because there are multipme objects with the same name || instruction 01, 02 and 03

OUTPUT:
Meriem Computer Science
Houda Computer Science
Sara Computer Science

OBSERVATION: 
when assigning stu2 to stu1, the name of stu2 was Houda, but after changing the name of stu2 to Sara, the name of stu1 changed to Sara too.

*/