package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Meat;

/**
 *
 * @author Johanna Zuluaga, Javier Andrés Garzón Patarroyo
 */
public class Dao {

    public Connection connect() {
        Connection conn = null;
        String database = "db_meat";
        String user = "root";
        String password = "admin";
        String host = "localhost";
        String port = "3306";
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://" + host + ":" + port + "/" + database + "?useSSL=false";

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            System.out.println("Error type SQLException: " + ex.getMessage());
            System.out.println("Error type SQLState: " + ex.getSQLState());
            System.out.println("Error type VendorError: " + ex.getErrorCode());
        } catch (ClassNotFoundException ex) {
            System.out.println("Error type ClassNotFoundException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error type Exception: " + ex.getMessage());
        }
        return conn;
    }

    public void testConnection() {
        Connection conn = connect();
        if (conn != null) {
            System.out.println("¡Conectado a la base de datos!");
        } else {
            System.out.println("¡No hay conexión a la base de datos!");
        }
    }

    public ArrayList<Meat> readAll() {
        ArrayList<Meat> list = new ArrayList<Meat>();

        try {
            Connection conn = connect();

            String sql = "select * from carnes;";

            Statement statement = conn.createStatement();
            ResultSet res = statement.executeQuery(sql);

            while (res.next()) {
                Meat meat = new Meat();
                meat.setId(res.getString("id"));
                meat.setName(res.getString("nombre"));
                meat.setAmount(res.getString("cantidad"));
                meat.setAnimal(res.getString("animal"));
                meat.setHair(res.getString("peludo"));

                list.add(meat);
            }

        } catch (Exception ex) {
            System.out.println("Error type Exception: " + ex.getMessage());
        }
        return list;
    }

    public void deleteOne(String id) {
        try {
            Connection conn = connect();

            String sql = "DELETE FROM carnes WHERE id = " + id;

            Statement statement = conn.createStatement();
            statement.execute(sql);

        } catch (Exception ex) {
            System.out.println("Error type Exception: " + ex.getMessage());
        }
    }

    public void createOne(Meat meat) {
        try {
            Connection conn = connect();

            String name = meat.getName();
            String amount = meat.getAmount();
            String animal = meat.getAnimal();
            String hair = meat.getHair();
            String sql = "INSERT INTO carnes (nombre, cantidad, animal, peludo) VALUES ('" + name + "', '" + amount + "', '" + animal + "', '" + hair + "');";

            Statement statement = conn.createStatement();
            statement.execute(sql);

        } catch (Exception ex) {
            System.out.println("Error type Exception: " + ex.getMessage());
        }
    }

    public void updateOne(Meat meat) {
        try {
            Connection conn = connect();

            String id = meat.getId();
            String name = meat.getName();
            String amount = meat.getAmount();
            String animal = meat.getAnimal();
            String hair = meat.getHair();
            String sql = "UPDATE carnes SET nombre = '" + name + "', cantidad = '" + amount + "', animal = '" + animal + "', peludo = '" + hair + "' WHERE id = '" + id + "';";

            Statement statement = conn.createStatement();
            statement.execute(sql);

        } catch (Exception ex) {
            System.out.println("Error type Exception: " + ex.getMessage());
        }
    }

    public void saveOne(Meat meat) {
        String id = meat.getId();
        if (id == null) {
            createOne(meat);
        } else {
            updateOne(meat);
        }
    }
}
