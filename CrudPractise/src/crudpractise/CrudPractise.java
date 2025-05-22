package crudpractise;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Database;

public class CrudPractise {

    static Database db = new Database();
    static PreparedStatement ps;
    static String sql = "";

    public static void main(String[] args) {

        saveCustomer("Lamia", "jigatola", "2165479624", "lamia@gmail.com");
        System.out.println("After Save");

        showAllCustomer();
        System.out.println("---------------------");

        deleteCustomer(2);
        System.out.println("----");
        showAllCustomer();
        System.out.println("---------------------");

        updateCustomer("rahim", "rtgmu", "5454414", "fdgrfh", 1);
        System.out.println("ghgfh");

        showAllCustomer();
        System.out.println("---------------------");

    }

    public static void saveCustomer(String name, String address, String contact, String email) {

        sql = "insert into customer(Name, Address, ContactNo, Email) values (?,?,?,?)";

        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, address);
            ps.setString(3, contact);
            ps.setString(4, email);

            ps.executeUpdate();

            ps.close();
            db.getCon().close();

            System.out.println("Data Save");
            System.out.println("---------------------------");

        } catch (SQLException ex) {
            Logger.getLogger(CrudPractise.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showAllCustomer() {

        sql = "select * from customer";

        try {
            ps = db.getCon().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                String name = rs.getString("Name");
                String address = rs.getString("Address");
                String contact = rs.getString("ContactNo");
                String email = rs.getString("Email");
                int id = rs.getInt("ID");

                System.out.println("ID: " + id + " " + "Name: " + name + " " + "Address" + address + " " + "Contact: " + contact + " " + "Email" + email);

            }
            rs.close();
            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(CrudPractise.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void deleteCustomer(int id) {

        sql = "delete from customer where id = ?";

        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(CrudPractise.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void updateCustomer(String name, String address, String contact, String email, int id) {
        
         sql = "update customer set Name=?, Email=?, Salary=?"
                + " where ID=?";

        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, address);
            ps.setString(3, contact);
            ps.setString(4, email);
            ps.setInt(5, id);

            ps.executeUpdate();

            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(CrudPractise.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
