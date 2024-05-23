// package com.crux.jdbc;

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Statement;

// public class jdbc {
//     static final String url = "jdbc:postgresql://localhost:5432/book_db";
//     static final String username = "postgres";
//     static final String password = "postgres";
//     static final String query = "SELECT * FROM book";

//     public static void main(String[] args) throws ClassNotFoundException {
//         Class.forName("org.postgresql.Driver");
//         try {
            
//             Connection connection = DriverManager.getConnection(url, username, password);
//             Statement statement = connection.createStatement();
//             ResultSet resultset = statement.executeQuery(query);
//             while (resultset.next()) {
//                 System.out.println(resultset.getString("title"));
//             }
//             statement.close();
//             connection.close();

//         } catch (SQLException sqlException) {
//             System.out.println(sqlException);
//         }

//     }

// }