package persistence;

import models.Patient;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PatientDatabaseHandler {
    private static final String URL = "jdbc:postgresql://localhost:5432/your_db";
    private static final String USER = "your_user";
    private static final String PASS = "your_pass";

    public static void insertPatient(Patient p) {
        String sql = "INSERT INTO patients(patientid, firstname, lastname, dob) VALUES (?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, p.getPatientId());
            stmt.setString(2, p.getFirstName());
            stmt.setString(3, p.getLastName());
            stmt.setString(4, p.getDob());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error inserting patient: " + e.getMessage());
        }
    }

    public static List<Patient> getAllPatients() {
        List<Patient> patients = new ArrayList<>();
        String sql = "SELECT * FROM patients";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                patients.add(new Patient(
                    rs.getInt("patientid"),
                    rs.getString("firstname"),
                    rs.getString("lastname"),
                    rs.getString("dob")
                ));
            }

        } catch (SQLException e) {
            System.out.println("Error reading patients: " + e.getMessage());
        }
        return patients;
    }
}
