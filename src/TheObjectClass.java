public class TheObjectClass extends Object {
    public static void main(String[] args) {
        Student max = new Student("Max", 21);
        System.out.println(max.toString());

        Student max2 = new PrimaryStudent("Max", 23, "Micheal");
        System.out.println(max2.toString());
    }

    public String toString() {
        return "Hello World";
    }
}

class Student {
    protected String name;
    protected int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}

class PrimaryStudent extends Student {
    private final String parentName;

    PrimaryStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    public String toString() {
        return name + " is of age " + age + " and has " + parentName + " as parent";
    }
}