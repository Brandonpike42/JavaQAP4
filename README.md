# Java Persistence Project

This project demonstrates file I/O and JDBC with PostgreSQL in Java.

## Features
- Save and read `Drug` data from a text file (`drugs.txt`)
- Save and read `Patient` data from a PostgreSQL database
- Console menu using `Scanner`

## How to Run

1. Compile:
   ```sh
   javac -cp ".;lib/postgresql-42.7.1.jar" src/models/*.java src/persistence/*.java src/Main.java
   ```

2. Run:
   ```sh
   java -cp ".;lib/postgresql-42.7.1.jar;src" Main
   ```

   > On Mac/Linux use `:` instead of `;` in `-cp`.

3. Make sure you:
   - Create the PostgreSQL table using `db/create_tables.sql`
   - Update DB credentials in `PatientDatabaseHandler.java`

I'm having the same Bizarre issue again where when i take a screenshot of stuff working and what not i can never send them, i get no error message, no nothing it just simply doesnt show up its very strange. So im sorry i won't have any screenshots/videos with it, i assume it must be a PC issue on my end, so i'm going to write out what they look like roughly from the terminal.

=== Java Persistence Project ===
1. Save data to a file
2. Read data from the file
3. Save data to the database
4. Read data from the database
5. Exit
Enter your choice: 1

Enter Drug ID: 101
Enter Drug Name: Ibuprofen
Enter Drug Cost: 12.99
Enter Drug Dosage: 200mg

Drug saved to file successfully.


=== Java Persistence Project ===
1. Save data to a file
2. Read data from the file
3. Save data to the database
4. Read data from the database
5. Exit
Enter your choice: 2

Drugs in file:
---------------------
Drug ID: 101
Name: Ibuprofen
Cost: 12.99
Dosage: 200mg
---------------------


=== Java Persistence Project ===
1. Save data to a file
2. Read data from the file
3. Save data to the database
4. Read data from the database
5. Exit
Enter your choice: 3

Enter Patient ID: P001
Enter First Name: Alice
Enter Last Name: Johnson
Enter DOB (yyyy-mm-dd): 1990-04-12

Patient saved to database successfully.


=== Java Persistence Project ===
1. Save data to a file
2. Read data from the file
3. Save data to the database
4. Read data from the database
5. Exit
Enter your choice: 4

Patients in database:
---------------------
ID: P001
Name: Alice Johnson
DOB: 1990-04-12
---------------------

