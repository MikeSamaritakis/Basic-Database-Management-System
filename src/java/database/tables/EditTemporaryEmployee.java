package database.tables;

import mainClasses.TemporaryEmployee;
import database.DB_Connection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EditTemporaryEmployee extends TemporaryEmployee {

    public void addnewTemporaryEmployee(TemporaryEmployee tempemployee) throws ClassNotFoundException{
        try {
            Connection con = DB_Connection.getConnection();

            Statement stmt = con.createStatement();

            String insertQuery = "INSERT INTO "
                    + " students (username,email,password,firstname,lastname,birthdate,gender,country,city,address,student_type,"
                    + "student_id,student_id_from_date,student_id_to_date,university,department,lat,lon,telephone,personalpage)"
                    + " VALUES ("
                    + "'" + tempemployee.getFullName() + "',"
                    + "'" + tempemployee.getIBAN() + "',"
                    + "'" + tempemployee.getAddress() + "',"
                    + "'" + tempemployee.getBankName() + "',"
                    + "'" + tempemployee.getDepartment() + "',"
                    + "'" + tempemployee.getstartingDate() + "',"
                    + "'" + tempemployee.getEmployeeType() + "',"
                    + "'" + tempemployee.getPaymentDate() + "',"
                    + "'" + tempemployee.getTelephone() + "',"
                    + "'" + tempemployee.getPayment() + "',"
                    + "'" + tempemployee.getMarried()+ "'"
                    + "'" + tempemployee.getStartingContractDate()+ "'"
                    + "'" + tempemployee.getendingContractDate()+ "'"
                    + ")";
            //stmt.execute(table);
            System.out.println(insertQuery);
            stmt.executeUpdate(insertQuery);
            System.out.println("# The temporary employee was successfully added in the database.");

            /* Get the member id from the database and set it to the member */
            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(EditTemporaryEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
