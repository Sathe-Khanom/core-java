package advancejavaevd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

public class AdvanceJavaEvd {

    static DbUtil du = new DbUtil();
    static PreparedStatement ps;
    static String sql = "";

    public static void main(String[] args) {

        saveEmp("Sathe", "sathe@gmail.com", 500000f);
        System.out.println("After Save");

        showAllEmp();
        System.out.println("-----");

        updateEmp("cfghthe", "sathe@gmail.com", 500000f,7);
        System.out.println("After Update");

        showAllEmp();
        System.out.println("-----");

        deleteEmp(5);
        System.out.println("After delete");

        showAllEmp();
        System.out.println("-----");
    }

    public static void saveEmp(String name, String email, float salary) {

        sql = "insert into employee(Name, Email, Salary) values(?,?,?)";

        try {
            ps = du.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setFloat(3, salary);

            ps.executeUpdate();

            ps.close();
            du.getCon().close();
            System.out.println("Data Save");
            System.out.println("---------------------");

        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaEvd.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showAllEmp() {

        sql = "select * from employee";

        try {
            ps = du.getCon().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("ID");
                String name = rs.getString("Name");
                String email = rs.getString("Email");
                float salary = rs.getFloat("Salary");

                System.out.println("ID: " + id + " " + "Name: " + name + " " + "Email: "
                        + email + " " + " Salary: " + salary);

            }

            rs.close();
            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaEvd.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteEmp(int id) {

        sql = "delete from employee where id=?";

        try {
            ps = du.getCon().prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaEvd.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void updateEmp(String name, String email, float salary, int id) {

        sql = "update employee set Name=?, Email=?, Salary=?"
                + " where ID=?";

        try {
            ps = du.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setFloat(3, salary);
            ps.setInt(4, id);

            ps.executeUpdate();

            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaEvd.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
