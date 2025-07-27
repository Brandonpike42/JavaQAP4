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
