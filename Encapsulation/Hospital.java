abstract class Patient {
    private String id, name;
    protected int age;

    public Patient(String i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public String getDetails() {
        return "ID: " + id + ", " + name;
    }

    public abstract double calculateBill();
    // Encapsulation for sensitive data omitted for brevity
}

interface MedicalRecord {
    void addRecord(String r);

    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private String[] rec = new String[10];
    int c = 0;

    public InPatient(String i, String n, int a) {
        super(i, n, a);
    }

    public double calculateBill() {
        return 2000;
    }

    public void addRecord(String r) {
        rec[c++] = r;
    }

    public void viewRecords() {
        for (int i = 0; i < c; i++)
            System.out.println(rec[i]);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private String[] rec = new String[10];
    int c = 0;

    public OutPatient(String i, String n, int a) {
        super(i, n, a);
    }

    public double calculateBill() {
        return 500;
    }

    public void addRecord(String r) {
        rec[c++] = r;
    }

    public void viewRecords() {
        for (int i = 0; i < c; i++)
            System.out.println(rec[i]);
    }
}

public class Hospital {
    public static void main(String[] args) {
        Patient[] pts = { new InPatient("1", "A", 30), new OutPatient("2", "B", 40) };
        for (Patient p : pts) {
            System.out.println(p.getDetails() + " Bill: " + p.calculateBill());
            if (p instanceof MedicalRecord) {
                ((MedicalRecord) p).addRecord("Visit");
                ((MedicalRecord) p).viewRecords();
            }
        }
    }
}