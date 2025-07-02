class Course {
    String courseName;
    int duration;

    Course(String name, int d) {
        courseName = name;
        duration = d;
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String name, int d, String p, boolean r) {
        super(name, d);
        platform = p;
        isRecorded = r;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee, discount;

    PaidOnlineCourse(String name, int d, String p, boolean r, double f, double dis) {
        super(name, d, p, r);
        fee = f;
        discount = dis;
    }

    void showDetails() {
        System.out.println("Course: " + courseName + " | Platform: " + platform);
        System.out.println("Fee: ₹" + fee + " | Discount: " + discount + "%");
    }
}

