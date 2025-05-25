package crudemployee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

public class CrudEmployee {

    static DbUtil du = new DbUtil();
    static PreparedStatement ps;
    static String sql = "";

    public static void main(String[] args) {

        saveEmployee("Shihab", " Assistant", 8000);
        System.out.println("----- After Save ------");
        showAllEmployee();

        updateEmployee("Amol", "Assistant", 8000, 5);
        System.out.println("------ After Update --------");
        showAllEmployee();

        deleteEmployee(4);
        System.out.println("-------- After Delete -------");
        showAllEmployee();

    }

    public static void saveEmployee(String name, String designation, float salary) {

        sql = "insert into employee(name, designation, salary) values (?,?,?)";

        try {
            ps = du.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, designation);

            ps.setFloat(3, salary);

            ps.executeUpdate();

            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(CrudEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showAllEmployee() {

        sql = "select * from employee";

        try {
            ps = du.getCon().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                String name = rs.getString("name");

                String designation = rs.getString("designation");
                float salary = rs.getFloat("salary");
                int id = rs.getInt("id");

                System.out.println("ID: " + id + " " + "Name: " + name + ", " + "Designation: " + designation + ", " + "Salary: " + salary);

            }
            rs.close();
            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(CrudEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        ;

    }

    public static void deleteEmployee(int id) {

        sql = "delete from employee where id = ?";

        try {
            ps = du.getCon().prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(CrudEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void updateEmployee(String name, String designation, float salary, int id) {

        sql = "update employee set name=?, designation=?, salary=? " + " where id=?";

        try {
            ps = du.getCon().prepareStatement(sql);

            ps.setString(1, name);

            ps.setString(2, designation);
            ps.setFloat(3, salary);

            ps.setInt(4, id);

            ps.executeUpdate();

            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(CrudEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
