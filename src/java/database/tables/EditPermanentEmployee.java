package database.tables;

import database.DB_Connection;
import mainClasses.PermanentEmployee;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EditPermanentEmployee extends PermanentEmployee {

    public void createPermanentEmployeetable() throws SQLException, ClassNotFoundException {

        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String query = "CREATE TABLE permanentemployee"
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
                + "PRIMARY KEY (IBAN))";

        stmt.execute(query);
        stmt.close();
    }

    public void addnewPermanentEmployee(PermanentEmployee permemployee) throws ClassNotFoundException{
        try {
            Connection con = DB_Connection.getConnection();

            Statement stmt = con.createStatement();

            String insertQuery = "INSERT INTO "
                    + " permanentemployee (IBAN,FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,"
                    + "Payment,Kids)"
                    + " VALUES ("
                    + "'" + permemployee.getIBAN() + "',"
                    + "'" + permemployee.getFullName() + "',"
                    + "'" + permemployee.getAddress() + "',"
                    + "'" + permemployee.getTelephone() + "',"
                    + "'" + permemployee.getBankName() + "',"
                    + "'" + permemployee.getDepartment() + "',"
                    + "'" + permemployee.getstartingDate() + "',"
                    + "'" + permemployee.getEmployeeType() + "',"
                    + "'" + permemployee.getMarried() + "',"
                    + "'" + permemployee.getPayment() + "',"
                    + "'" + permemployee.getKids() + "'"
                    + ")";
            //stmt.execute(table);
            System.out.println(insertQuery);
            stmt.executeUpdate(insertQuery);
            System.out.println("# The permanent employee was successfully added in the database.");

            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(EditTemporaryEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deletePermanentEmployee(String ibanperm) throws ClassNotFoundException{
        try {
            Connection con = DB_Connection.getConnection();

            Statement stmt = con.createStatement();

            String insertQuery = "DROP FROM permanentemployee WHERE iban=ibanperm";
            //stmt.execute(table);
            System.out.println(insertQuery);
            stmt.executeUpdate(insertQuery);
            System.out.println("# The permanent employee was successfully deleted from the database.");

            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(EditPermanentEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    public void updatePermanentEmployeeIBAN(String iban, String ibannew) throws SQLException, ClassNotFoundException {
//        Connection con = DB_Connection.getConnection();
//        Statement stmt = con.createStatement();
//        String update = "UPDATE temporaryemployee SET IBAN='" +  ibannew + "' WHERE IBAN = '" + iban + "'";
//        stmt.executeUpdate(update);
//    }

    public void updatePermanentEmployeeFullName(String iban, String fullname) throws SQLException, ClassNotFoundException {
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String update = "UPDATE temporaryemployee SET FullName='" +  fullname + "' WHERE IBAN = '" + iban + "'";
        stmt.executeUpdate(update);
    }

    public void updatePermanentEmployeeAddress(String iban, String address) throws SQLException, ClassNotFoundException {
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String update = "UPDATE temporaryemployee SET Address='" +  address + "' WHERE IBAN = '" + iban + "'";
        stmt.executeUpdate(update);
    }

    public void updatePermanentEmployeeTelephone(String iban, String telephone) throws SQLException, ClassNotFoundException {
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String update = "UPDATE temporaryemployee SET Telephone='" +  telephone + "' WHERE IBAN = '" + iban + "'";
        stmt.executeUpdate(update);
    }

    public void updatePermanentEmployeeBankName(String iban, String bankname) throws SQLException, ClassNotFoundException {
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String update = "UPDATE temporaryemployee SET BankName='" +  bankname + "' WHERE IBAN = '" + iban + "'";
        stmt.executeUpdate(update);
    }

    public void updatePermanentEmployeeDepartment(String iban, String department) throws SQLException, ClassNotFoundException {
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String update = "UPDATE temporaryemployee SET Department='" +  department + "' WHERE IBAN = '" + iban + "'";
        stmt.executeUpdate(update);
    }

    public void updatePermanentEmployeestartingDate(String iban, String startingdate) throws SQLException, ClassNotFoundException {
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String update = "UPDATE temporaryemployee SET startingDate='" +  startingdate + "' WHERE IBAN = '" + iban + "'";
        stmt.executeUpdate(update);
    }

    public void updatePermanentEmployeeEmployeeType(String iban, String employeetype) throws SQLException, ClassNotFoundException {
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String update = "UPDATE temporaryemployee SET EmployeeType='" +  employeetype + "' WHERE IBAN = '" + iban + "'";
        stmt.executeUpdate(update);
    }

    public void updatePermanentEmployeeMarried(String iban, int married) throws SQLException, ClassNotFoundException {
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String update = "UPDATE temporaryemployee SET Married='" +  married + "' WHERE IBAN = '" + iban + "'";
        stmt.executeUpdate(update);
    }

    public void updatePermanentEmployeeKids(String iban, int kids) throws SQLException, ClassNotFoundException {
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String update = "UPDATE temporaryemployee SET Kids='" +  kids + "' WHERE IBAN = '" + iban + "'";
        stmt.executeUpdate(update);
    }

    public void updatePermanentEmployeePayment(String iban, int payment) throws SQLException, ClassNotFoundException {
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String update = "UPDATE temporaryemployee SET Payment='" +  payment + "' WHERE IBAN = '" + iban + "'";
        stmt.executeUpdate(update);
    }

}
