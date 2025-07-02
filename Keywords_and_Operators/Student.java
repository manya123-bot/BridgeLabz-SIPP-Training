public class Student {
    private static String universityName = "National University";
    private static int totalStudents = 0;

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    private String name;
    private String grade;
    private final String rollNumber;

    public Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("University: " + universityName);
    }

    public void updateGrade(String newGrade) {
        this.grade = newGrade;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice", "RN001", "A");
        if (student1 instanceof Student) {
            student1.displayInfo();
        }
        Student.displayTotalStudents();
        Student student2 = new Student("Bob", "RN002", "B");
        if (student2 instanceof Student) {
            student2.displayInfo();
        }
        Student.displayTotalStudents();
        student2.updateGrade("A+");
        if (student2 instanceof Student) {
            student2.displayInfo();
        }
    }
}