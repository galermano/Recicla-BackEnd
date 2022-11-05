package com.recicla.util.model.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
	public Connection getConnection() throws SQLException, ClassNotFoundException {
        try {
            // "com.mysql.jdbc.Driver"
            String driverName = "org.mariadb.jdbc.Driver";
            Class.forName(driverName);
            String url ="jdbc:mariadb://localhost:3306/RECICLA";
            String usuario = "root";
            String senha = "";
            Connection c = DriverManager.getConnection(url,usuario,senha); 
            System.out.println("ConexÃo OK");
            return c;
        } catch (SQLException e) {
            System.out.println("ConexÃo NOK");
            throw new RuntimeException(e);
        }
    };
}
