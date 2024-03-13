public class Hiers {
    // implementing incapsulation
    private String name;
    private int age;

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    // implementing polymorphism
    public Hiers(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Hiers(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("My name is " + name + ", and I am " + age + " years old. ");
    }

    // implementing inheritance
    public static class Sub1 extends Hiers {
        private String speciality;

        public Sub1(String name, int age, String speciality) {
            super(name, age);
            this.speciality = speciality;
        }

        @Override
        public void introduce() {
            System.out.println("My name is " + getName() + ", and I am " + getAge() + " years old. I am a " + speciality + " student. ");
        }
    }

    public static void main(String[] args) {
        Hiers hiers = new Hiers("Houda", 20);
        hiers.introduce();

        Sub1 sub1 = new Sub1("Meriem", 19, "Computer Science");
        sub1.introduce();
    }
}