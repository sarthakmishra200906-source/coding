package oops;

public class shaldee {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sarthak";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }

}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    /*
     * shallo copy constructer any change in constructer one will effect it .
     * Student(Student s1) {
     * marks = new int[3];
     * this.name = s1.name;
     * this.roll = s1.roll;
     * this.marks = s1.marks;
     * }
     */
    // deep copy constructer its a full copy of constructer 1 and any change in 1
    // will not effect here like arr [mark ].
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student() {
        marks = new int[3];
        System.out.println("constructer is called ");
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
        System.out.println("constructer is called ");

    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}
