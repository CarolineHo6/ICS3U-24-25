package day2;

// doesn't need to import a package because it is in the same package

public class Driver {
    public static void main(String[] args) {
        Student student1;   // if this wasn't declared as anything it wouldn't be an instance of the Student class
        Student student2 = new Student("Steve", 21, "1126954", 3.4, "Computer Science", 2027, true);
        Student student3 = new Student("Luna", 8, "1234567", 4.0, "Computer Science", 2028, true);

        student1 = student3;

        //System.out.println(student1.name); only have access outside of the classs to public stuff

        student2.study(5);  // to activate (use) methods we use dot operator.
        // does not return anything

        student1.attendClass("History");
        student3.attendClass("Math");

        boolean isSmart = student1.isHonors();
        System.out.println("Is the student smart? " + isSmart);

        System.out.println("Is the student smart? " + student2.isHonors());

        String name = "hi";
        int age = 4;
        String studentID = "1293";
        double gpa = 3.6;
        String major = "hi";
        int year = 2023;
        boolean hi = true;
        Student student4 = new Student(name, age, studentID, gpa, major, year, hi);
        student4.attendClass("ComSci");
    }
}
