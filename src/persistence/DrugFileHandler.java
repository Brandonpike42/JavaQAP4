package persistence;

import models.Drug;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DrugFileHandler {
    private static final String FILE_PATH = "drugs.txt";

    public static void saveDrug(Drug drug) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(drug.toFileString());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error writing drug to file.");
        }
    }

    public static List<Drug> readDrugs() {
        List<Drug> drugs = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                drugs.add(Drug.fromFileString(line));
            }
        } catch (IOException e) {
            System.out.println("Error reading drugs from file.");
        }
        return drugs;
    }
}
