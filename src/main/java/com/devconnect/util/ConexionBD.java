package main.java.com.devconnect.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    // Datos de conexión a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/devconnect";
    private static final String USER = "root"; // Cambia por tu usuario de MySQL
    private static final String PASSWORD = "M@r14iC4rl05"; // Cambia por tu contraseña de MySQL

    // Método para obtener la conexión
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
