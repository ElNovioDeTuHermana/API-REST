package com.aprendec.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConexion {

    static {
        try {
            // CARGAR EL CONTROLADOR DE BD (Puede omitirse en versiones recientes de Java/JDBC)
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("[MySqlConexion] Error al cargar el driver de conexión");
            e.printStackTrace();
        }
    }

    public static Connection obtenerConexion() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ReealoDB2019?useTimezone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false",
                    "root", "");
        } catch (SQLException e) {
            System.out.println("[MySqlConexion] Error al obtener la conexión: " + e.getMessage());
            e.printStackTrace();
        }
        return con;
    }
}
