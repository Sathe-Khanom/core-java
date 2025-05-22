package crudstudent;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

public class CrudStudent {

    static DbUtil du = new DbUtil();
    static PreparedStatement ps;
    static String sql = "";

    public static void main(String[] args) {

        saveStudent("Lamia", "jigatola", "2165479624", "lamia@gmail.com");
        System.out.println("After Save");

        showAllStudent();
        System.out.println("---------------------");

        deleteStudent(2);
        System.out.println("After delete");

        showAllStudent();
        System.out.println("---------------------");

        updateStudent("Sathe", "24354654", "sathe@gmail.com", "badda", 3);
        System.out.println("After Update");

        showAllStudent();
        System.out.println("---------------------");

    }

    public static void saveStudent(String name, String contact, String email, String address) {

        sql = "insert into student(name, contact, email, address) values (?,?,?,?)";

        try {
            ps = du.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, contact);
            ps.setString(3, email);
            ps.setString(4, address);

            ps.executeUpdate();

            ps.close();
            du.getCon().close();

            System.out.println("Data Save");
            System.out.println("---------------------------");

        } catch (SQLException ex) {
            Logger.getLogger(CrudStudent.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showAllStudent() {

        sql = "select * from student";

        try {
            ps = du.getCon().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                String name = rs.getString("name");
                String address = rs.getString("address");
                String contact = rs.getString("contact");
                String email = rs.getString("email");
                int id = rs.getInt("id");

                System.out.println("ID: " + id + " " + "Name: " + name + " " + "Address: " + address + " " + "Contact: " + contact + " " + "Email: " + email);

            }
            rs.close();
            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(CrudStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void deleteStudent(int id) {

        sql = "delete from student where id = ?";

        try {
            ps = du.getCon().prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(CrudStudent.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void updateStudent(String name, String contact, String email, String address, int id) {
        
          sql = "update student set name=?, contact=?, email=?, address=?"
                + "where id=?";

        try {
            ps = du.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, contact);
            ps.setString(3, email);
            ps.setString(4, address);
            ps.setInt(5, id);

            ps.executeUpdate();

            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(CrudStudent.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
