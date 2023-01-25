package database.tables;

import database.DB_Connection;
import mainClasses.PermanentEmployee;
import mainClasses.TemporaryEmployee;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EditPermanentEmployee extends PermanentEmployee {

    public void addnewPermanentEmployee(PermanentEmployee permemployee) throws ClassNotFoundException{
        try {
            Connection con = DB_Connection.getConnection();

            Statement stmt = con.createStatement();

            String insertQuery = "INSERT INTO "
                    + " permanentemployee (IBAN,FullName, Address, Telephone, BankName, Department, startingDate, EmployeeType, Married"
                    + "Payment, PaymentDate)"
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
                    + "'" + permemployee.getPaymentDate()+ "'"
                    + ")";
            //stmt.execute(table);
            System.out.println(insertQuery);
            stmt.executeUpdate(insertQuery);
            System.out.println("# The permanent employee was successfully added in the database.");

            /* Get the member id from the database and set it to the member */
            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(EditTemporaryEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deletePermanentEmployee(PermanentEmployee permemployee) throws ClassNotFoundException{
        try {
            Connection con = DB_Connection.getConnection();

            Statement stmt = con.createStatement();

            int ibanperm = getIBAN();

            String insertQuery = "DROP FROM permanentemployee WHERE iban=ibanperm";
            //stmt.execute(table);
            System.out.println(insertQuery);
            stmt.executeUpdate(insertQuery);
            System.out.println("# The permanent employee was successfully deleted in the database.");

            /* Get the member id from the database and set it to the member */
            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(EditPermanentEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
