package crudlearn;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

public class CrudLearn {

    static DbUtil du = new DbUtil();
    static PreparedStatement ps;
    static String sql = "";

    public static void main(String[] args) {
        
        saveChild("rahim",20, "badda","434545", "rahima");
        System.out.println("After Save");

        showAllChild();
        System.out.println("---------------------");

        deleteChild(2);
       System.out.println("After Delete");
        showAllChild();
        System.out.println("---------------------");

        updateCustomer("sathe", 10, "dhanmondi", "325436", "khadija", 5);
        System.out.println("After Update");

        showAllChild();
        System.out.println("---------------------");
    
        
        
        
        
        

    }

    public static void saveChild(String name, int age, String address, String contact, String guardianName) {

        sql = "insert into childrecord(name, age, address, contact, guardianName) values (?,?,?,?,?)";

        try {
            ps = du.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setInt(2, age);

            ps.setString(3, address);
            ps.setString(4, contact);
            ps.setString(5, guardianName);

            ps.executeUpdate();

            ps.close();
            du.getCon().close();

            System.out.println("Data Save");
            System.out.println("---------------------------");

        } catch (SQLException ex) {
            Logger.getLogger(CrudLearn.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showAllChild() {

        sql = "select * from childrecord";

        try {
            ps = du.getCon().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                String name = rs.getString("name");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                String contact = rs.getString("contact");
                String guardianName = rs.getString("guardianName");
                int id = rs.getInt("id");

                System.out.println("ID: " + id + " " + "Name: " + name + " " + "Age: " + age + " " + "Address: " + address + " " + "Contact: " + contact + " " + "GuardianName: " + guardianName);

            }
            rs.close();
            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(CrudLearn.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteChild(int id) {

        sql = "delete from childrecord where id = ?";

        try {
            ps = du.getCon().prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(CrudLearn.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void updateCustomer(String name, int age, String address, String contact, String guardianName, int id) {

        sql = "update childrecord set name=?, age=?, address=?, contact=?, guardianName=?" + " where id=?";

        try {
            ps = du.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setInt(2, age);

            ps.setString(3, address);
            ps.setString(4, contact);
            ps.setString(5, guardianName);
            ps.setInt(6, id);

            ps.executeUpdate();

            ps.close();
            du.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(CrudLearn.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
