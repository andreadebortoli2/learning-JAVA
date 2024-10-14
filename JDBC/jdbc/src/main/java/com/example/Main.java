package com.example;

import java.sql.*;

import io.github.cdimascio.dotenv.Dotenv;

public class Main {
    public static void main(String[] args) {

        // import package

        // load and register
        // optional
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("cannot import db package");
            e.printStackTrace();
        }

        // create connection

        // get sensible data from .env file
        Dotenv dotenv = Dotenv.configure().directory("./JDBC/jdbc").load();

        String dbURL = dotenv.get("DATABASE_URL");
        // [what connect]:[what db to connect]://localhost:[port]/[db name]
        // example= jdbc:postgresql://localhost:5432/db_example
        String dbUser = dotenv.get("DATABASE_USER");
        String dbPassword = dotenv.get("DATABASE_PASSWORD");

        try {
            Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
            System.out.println("connected to " + conn.getClientInfo("ApplicationName"));

            // create statement
            Statement st = conn.createStatement();
            String query = "Select first_name FROM users WHERE id = 1";

            // execute stratement
            ResultSet result = st.executeQuery(query);

            if (result.next()) {
                System.out.println(result.getString("first_name"));
                System.out.println("---");
            } else
                System.out.println("data not found");

            // CRUD
            System.out.println("# CRUD");
            System.out.println("---");

            // read (multiple rows)
            System.out.println("* read");
            System.out.println("---");

            query = "SELECT * FROM users";
            result = st.executeQuery(query);

            while (result.next()) {
                System.out.println("email: " + result.getString(2));
                System.out.println("user: " + result.getString(3) + " " + result.getString(4));
                System.out.println("---");
            }

            // create
            System.out.println("* create");
            System.out.println("---");

            query = "INSERT INTO users VALUES (4, 'jerrytom@gmail.com', 'Jery', 'Tom')";
            st.execute(query);

            query = "SELECT * FROM users";
            result = st.executeQuery(query);

            while (result.next()) {
                System.out.println("email: " + result.getString(2));
                System.out.println("user: " + result.getString(3) + " " +
                        result.getString(4));
                System.out.println("---");
            }

            // update
            System.out.println("* update");
            System.out.println("---");

            query = "UPDATE users SET first_name = 'Jerry' WHERE id = 4";
            st.execute(query);

            query = "SELECT * FROM users";
            result = st.executeQuery(query);

            while (result.next()) {
                System.out.println("email: " + result.getString(2));
                System.out.println("user: " + result.getString(3) + " " +
                        result.getString(4));
                System.out.println("---");
            }

            // delete
            System.out.println("* delete");
            System.out.println("---");

            query = "DELETE FROM users WHERE id = 4";
            st.execute(query);

            query = "SELECT * FROM users";
            result = st.executeQuery(query);

            while (result.next()) {
                System.out.println("email: " + result.getString(2));
                System.out.println("user: " + result.getString(3) + " " +
                        result.getString(4));
                System.out.println("---");
            }

            // prepared statement
            System.out.println("# prepared statement");
            System.out.println("---");

            int idFromUser = 8;
            String emailFromUser = "ralphwolf@gmail.com";
            String firstNameFromUser = "Ralph";
            String lastNameFromUser = "Wolf";

            query = "INSERT INTO users VALUES (?, ?, ?, ?)";

            PreparedStatement pst = conn.prepareStatement(query);
            pst.setInt(1, idFromUser);
            pst.setString(2, emailFromUser);
            pst.setString(3, firstNameFromUser);
            pst.setString(4, lastNameFromUser);

            pst.execute();

            query = "SELECT * FROM users";
            result = st.executeQuery(query);

            while (result.next()) {
                System.out.println("email: " + result.getString(2));
                System.out.println("user: " + result.getString(3) + " " +
                        result.getString(4));
                System.out.println("---");
            }

            // close connection
            conn.close();
            System.out.println("connection closed");

        } catch (SQLException e) {
            System.out.println("cannot connect to database");
            e.printStackTrace();
        }

    }
}