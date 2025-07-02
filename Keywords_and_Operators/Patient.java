public class Patient {
    static String hospitalName;
    static int totalPatients = 0;

    final String patientID;
    String name;
    int age;
    String ailment;

    public Patient(String name, int age, String ailment, String patientID) {
        this.name = this.name; // Correct assignment
        this.age = this.age;
        this.ailment = this.ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayDetails(Object obj) {
        if (obj instanceof Patient) {
            Patient p = (Patient) obj;
            System.out.println("Patient ID: " + p.patientID);
            System.out.println("Name: " + p.name);
            System.out.println("Age: " + p.age);
            System.out.println("Ailment: " + p.ailment);
        }
    }
}