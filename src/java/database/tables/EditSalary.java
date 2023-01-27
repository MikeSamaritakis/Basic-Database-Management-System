package database.tables;

import database.DB_Connection;
import mainClasses.Salary;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EditSalary extends Salary {
    public void createSalarytable() throws SQLException, ClassNotFoundException {

        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String query = "CREATE TABLE salary"
                + "( ETYPE char(255) not null, "
                + " AMOUNT int default null, "
                + "PRIMARY KEY (ETYPE))";

        stmt.execute(query);
        stmt.close();
        insertdefaultvalues();
    }

    public void insertdefaultvalues(){
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery1 = "INSERT INTO "
                    + " salary (ETYPE, AMOUNT)"
                    + " VALUES ('BasicManaging','1400')";
            //stmt.execute(table);
            System.out.println(insertQuery1);
            stmt.executeUpdate(insertQuery1);
            System.out.println("# The salary was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery2 = "INSERT INTO "
                    + " salary (ETYPE, AMOUNT)"
                    + " VALUES ('BasicEducational','1200')";
            //stmt.execute(table);
            System.out.println(insertQuery2);
            stmt.executeUpdate(insertQuery2);
            System.out.println("# The salary was successfully added in the database.");
            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery3 = "INSERT INTO "
                    + " salary (ETYPE, AMOUNT)"
                    + " VALUES ('benefitLibrary','150')";
            //stmt.execute(table);
            System.out.println(insertQuery3);
            stmt.executeUpdate(insertQuery3);
            System.out.println("# The salary was successfully added in the database.");
            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery4 = "INSERT INTO "
                    + " salary (ETYPE, AMOUNT)"
                    + " VALUES ('benefitResearch','300')";
            //stmt.execute(table);
            System.out.println(insertQuery4);
            stmt.executeUpdate(insertQuery4);
            System.out.println("# The salary was successfully added in the database.");
            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateSalaryAmount(String etype, int amount) throws SQLException, ClassNotFoundException {
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String update = "UPDATE salary SET AMOUNT='" +  amount + "' WHERE ETYPE = '" + etype + "'";
        stmt.executeUpdate(update);
    }
}
