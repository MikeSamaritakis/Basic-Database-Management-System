package database.tables;

import database.DB_Connection;
import mainClasses.FiredPermEmployee;
import mainClasses.PermanentEmployee;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EditFiredPermanentEmployees extends FiredPermEmployee {

    public void createFiredPermanentEmployeetable() throws SQLException, ClassNotFoundException {

        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String query = "CREATE TABLE firedpermanentemployee"
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
                + "PRIMARY KEY (IBAN))";

        stmt.execute(query);
        stmt.close();
    }

    public static void addnewFiredPermanentEmployee(PermanentEmployee permemployee) throws ClassNotFoundException{
        try {
            Connection con = DB_Connection.getConnection();

            Statement stmt = con.createStatement();

            String insertQuery = "INSERT INTO "
                    + " firedpermanentemployee (IBAN,FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,"
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
            System.out.println("# The permanent employee was successfully added in the history database.");

            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(EditFiredPermanentEmployees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
