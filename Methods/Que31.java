import java.util.Scanner;

public class Que31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalEmployees = 10;
        double[][] employees = new double[totalEmployees][2];
        for (int i = 0; i < totalEmployees; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Old Salary: ");
            employees[i][0] = scanner.nextDouble();
            System.out.print("Years of Service: ");
            employees[i][1] = scanner.nextDouble();
        }

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-10s %-12s %-15s %-12s %-15s\n", "Employee", "Old Salary", "Years of Service", "Bonus",
                "New Salary");
        System.out.println("-------------------------------------------------------------------------------");

        for (int i = 0; i < totalEmployees; i++) {
            double oldSalary = employees[i][0];
            double years = employees[i][1];
            double bonusPercent = (years > 5) ? 0.05 : 0.02;
            double bonus = oldSalary * bonusPercent;
            double newSalary = oldSalary + bonus;

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10s $%-11.2f %-15.2f $%-11.2f $%-14.2f\n", "Emp" + (i + 1), oldSalary, years, bonus,
                    newSalary);
        }

        System.out.println("-------------------------------------------------------------------------------");
        System.out.printf("Total Old Salary: $%.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Paid: $%.2f\n", totalBonus);
        System.out.printf("Total New Salary: $%.2f\n", totalNewSalary);

        scanner.close();
    }
}