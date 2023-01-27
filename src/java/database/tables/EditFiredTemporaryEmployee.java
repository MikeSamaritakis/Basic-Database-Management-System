package database.tables;

import database.DB_Connection;
import mainClasses.FiredTempEmployee;
import mainClasses.TemporaryEmployee;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EditFiredTemporaryEmployee extends FiredTempEmployee {
    public void createFiredTemporaryEmployeetable() throws SQLException, ClassNotFoundException {

        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String query = "CREATE TABLE firedtemporaryemployee"
                + "( IBAN char(255) not null, "
                + " Fullname char(255) default null, "
                + " Address char(255) default null, "
                + " Telephone int default null, "
                + " BankName char(255) default null, "
                + " Department char(255) default null, "
                + " startingDate char(255) default null, "
                + " EmployeeType char(255) default null, "
                + " Married int(1) default null, "
                + " Kids int default null, "
                + " Payment int default null, "
                + " startingContractDate char(255) default null, "
                + " endingContractDate char(255) default null, "
                + "PRIMARY KEY (IBAN))";

        stmt.execute(query);
        stmt.close();
    }

    public void addnewFiredTemporaryEmployee(FiredTempEmployee tempemployee) throws ClassNotFoundException{
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
                    + "'" + tempemployee.getstartingContractDatefired() + "',"
                    + "'" + tempemployee.getendingContractDatefired() + "'"
                    + ")";
            //stmt.execute(table);
            System.out.println(insertQuery);
            stmt.executeUpdate(insertQuery);
            System.out.println("# The temporary employee was successfully added in the history database.");

            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(EditFiredTemporaryEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
