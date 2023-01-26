package database.tables;

import mainClasses.TemporaryEmployee;
import database.DB_Connection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EditTemporaryEmployee extends TemporaryEmployee {

    public void createTemporaryEmployeetable() throws SQLException, ClassNotFoundException {

        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String query = "CREATE TABLE temporaryemployee"
                + "( IBAN char(12) not null, "
                + " Fullname char(100) default null, "
                + " Address char(100) default null, "
                + " Telephone int(10) default null, "
                + " BankName char(100) default null, "
                + " Department char(100) default null, "
                + " startingDate date default null, "
                + " EmployeeType char(15) default null, "
                + " Married int(1) default null, "
                + " Kids int(2) default null, "
                + " Payment int(60) default null, "
                + " startingContractDate date default null, "
                + " endingContractDate date default null, "
                + "PRIMARY KEY (IBAN))";

        stmt.execute(query);
        stmt.close();
    }

    public void addnewTemporaryEmployee(TemporaryEmployee tempemployee) throws ClassNotFoundException{
        try {
            Connection con = DB_Connection.getConnection();

            Statement stmt = con.createStatement();

            String insertQuery = "INSERT INTO "
                    + " temporaryemployee (IBAN,FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Kids,"
                    + "Payment,startingContractDate,endingContractDate)"
                    + " VALUES ("
                    + "'" + tempemployee.getIBAN() + "',"
                    + "'" + tempemployee.getFullName() + "',"
                    + "'" + tempemployee.getAddress() + "',"
                    + "'" + tempemployee.getTelephone() + "',"
                    + "'" + tempemployee.getBankName() + "',"
                    + "'" + tempemployee.getDepartment() + "',"
                    + "'" + tempemployee.getstartingDate() + "',"
                    + "'" + tempemployee.getEmployeeType() + "',"
                    + "'" + tempemployee.getMarried() + "',"
                    + "'" + tempemployee.getKids() + "',"
                    + "'" + tempemployee.getPayment() + "',"
                    + "'" + tempemployee.getstartingContractDate() + "',"
                    + "'" + tempemployee.getendingContractDate() + "'"
                    + ")";
            //stmt.execute(table);
            System.out.println(insertQuery);
            stmt.executeUpdate(insertQuery);
            System.out.println("# The temporary employee was successfully added in the database.");

            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(EditTemporaryEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteTemporaryEmployee(String ibantemp) throws ClassNotFoundException{
        try {
            Connection con = DB_Connection.getConnection();

            Statement stmt = con.createStatement();

            String insertQuery = "DROP FROM temporaryemployee WHERE iban=ibantemp";
            //stmt.execute(table);
            System.out.println(insertQuery);
            stmt.executeUpdate(insertQuery);
            System.out.println("# The temporary employee was successfully deleted from the database.");

            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(EditTemporaryEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    public void updateTemporaryEmployeeIBAN(String iban, String ibannew) throws SQLException, ClassNotFoundException {
//        Connection con = DB_Connection.getConnection();
//        Statement stmt = con.createStatement();
//        String update = "UPDATE temporaryemployee SET IBAN='" +  ibannew + "' WHERE IBAN = '" + iban + "'";
//        stmt.executeUpdate(update);
//    }

    public void updateTemporaryEmployeeFullName(String iban, String fullname) throws SQLException, ClassNotFoundException {
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String update = "UPDATE temporaryemployee SET FullName='" +  fullname + "' WHERE IBAN = '" + iban + "'";
        stmt.executeUpdate(update);
    }

    public void updateTemporaryEmployeeAddress(String iban, String address) throws SQLException, ClassNotFoundException {
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String update = "UPDATE temporaryemployee SET Address='" +  address + "' WHERE IBAN = '" + iban + "'";
        stmt.executeUpdate(update);
    }

    public void updateTemporaryEmployeeTelephone(String iban, String telephone) throws SQLException, ClassNotFoundException {
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String update = "UPDATE temporaryemployee SET Telephone='" +  telephone + "' WHERE IBAN = '" + iban + "'";
        stmt.executeUpdate(update);
    }

    public void updateTemporaryEmployeeBankName(String iban, String bankname) throws SQLException, ClassNotFoundException {
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String update = "UPDATE temporaryemployee SET BankName='" +  bankname + "' WHERE IBAN = '" + iban + "'";
        stmt.executeUpdate(update);
    }

    public void updateTemporaryEmployeeDepartment(String iban, String department) throws SQLException, ClassNotFoundException {
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String update = "UPDATE temporaryemployee SET Department='" +  department + "' WHERE IBAN = '" + iban + "'";
        stmt.executeUpdate(update);
    }

    public void updateTemporaryEmployeestartingDate(String iban, String startingdate) throws SQLException, ClassNotFoundException {
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String update = "UPDATE temporaryemployee SET startingDate='" +  startingdate + "' WHERE IBAN = '" + iban + "'";
        stmt.executeUpdate(update);
    }

    public void updateTemporaryEmployeeEmployeeType(String iban, String employeetype) throws SQLException, ClassNotFoundException {
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String update = "UPDATE temporaryemployee SET EmployeeType='" +  employeetype + "' WHERE IBAN = '" + iban + "'";
        stmt.executeUpdate(update);
    }

    public void updateTemporaryEmployeeMarried(String iban, int married) throws SQLException, ClassNotFoundException {
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String update = "UPDATE temporaryemployee SET Married='" +  married + "' WHERE IBAN = '" + iban + "'";
        stmt.executeUpdate(update);
    }

    public void updateTemporaryEmployeeKids(String iban, int kids) throws SQLException, ClassNotFoundException {
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String update = "UPDATE temporaryemployee SET Kids='" +  kids + "' WHERE IBAN = '" + iban + "'";
        stmt.executeUpdate(update);
    }

    public void updateTemporaryEmployeePayment(String iban, int payment) throws SQLException, ClassNotFoundException {
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String update = "UPDATE temporaryemployee SET Payment='" +  payment + "' WHERE IBAN = '" + iban + "'";
        stmt.executeUpdate(update);
    }

    public void updateTemporaryEmployeestartingContractDate(String iban, String startingcontractdate) throws SQLException, ClassNotFoundException {
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String update = "UPDATE temporaryemployee SET startingContractDate='" +  startingcontractdate + "' WHERE IBAN = '" + iban + "'";
        stmt.executeUpdate(update);
    }

    public void updateTemporaryEmployeeendingContractDate(String iban, String endingcontractdate) throws SQLException, ClassNotFoundException {
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String update = "UPDATE temporaryemployee SET endingContractDate='" +  endingcontractdate + "' WHERE IBAN = '" + iban + "'";
        stmt.executeUpdate(update);
    }

}
