import models.Drug;
import models.Patient;
import persistence.DrugFileHandler;
import persistence.PatientDatabaseHandler;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Save drug to file");
            System.out.println("2. Read drugs from file");
            System.out.println("3. Save patient to database");
            System.out.println("4. Read patients from database");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter drug ID: ");
                    int did = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter drug name: ");
                    String dname = sc.nextLine();
                    System.out.print("Enter cost: ");
                    double cost = sc.nextDouble(); sc.nextLine();
                    System.out.print("Enter dosage: ");
                    String dosage = sc.nextLine();
                    DrugFileHandler.saveDrug(new Drug(did, dname, cost, dosage));
                    break;
                case 2:
                    System.out.println("\n--- Drugs from File ---");
                    for (Drug d : DrugFileHandler.readDrugs()) {
                        System.out.println(d);
                    }
                    break;
                case 3:
                    System.out.print("Enter patient ID: ");
                    int pid = sc.nextInt(); sc.nextLine();
                    System.out.print("First name: ");
                    String fname = sc.nextLine();
                    System.out.print("Last name: ");
                    String lname = sc.nextLine();
                    System.out.print("DOB (YYYY-MM-DD): ");
                    String dob = sc.nextLine();
                    PatientDatabaseHandler.insertPatient(new Patient(pid, fname, lname, dob));
                    break;
                case 4:
                    System.out.println("\n--- Patients from Database ---");
                    for (Patient p : PatientDatabaseHandler.getAllPatients()) {
                        System.out.println(p);
                    }
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}
