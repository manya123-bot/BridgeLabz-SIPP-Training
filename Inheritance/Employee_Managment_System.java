class Employee {
    String name;
    int id;
    double salary;

    Employee(String n, int i, double s) {
        name = n;
        id = i;
        salary = s;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: ₹" + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String n, int i, double s, int t) {
        super(n, i, s);
        teamSize = t;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String n, int i, double s, String lang) {
        super(n, i, s);
        programmingLanguage = lang;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    String university;

    Intern(String n, int i, double s, String u) {
        super(n, i, s);
        university = u;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("University: " + university);
    }
}

