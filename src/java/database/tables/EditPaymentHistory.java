package database.tables;

import database.DB_Connection;
import mainClasses.PaymentHistory;
import mainClasses.PermanentEmployee;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EditPaymentHistory extends PaymentHistory {
    public void createPaymentHistory() throws SQLException, ClassNotFoundException {

        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String query = "CREATE TABLE paymenthistory"
                + "( payment_id INTEGER not null AUTO_INCREMENT, "
                + " PaymentName char(100) default null, "
                + " PaymentDate date default null, "
                + " Salary int(11) default null, "
                + "PRIMARY KEY (payment_id))";

        stmt.execute(query);
        stmt.close();
    }

    public void addnewPaymentHistory(PaymentHistory paymenthist) throws ClassNotFoundException{
        try {
            Connection con = DB_Connection.getConnection();

            Statement stmt = con.createStatement();

            String insertQuery = "INSERT INTO "
                    + " permanentemployee (PaymentName,"
                    + " PaymentDate, Salary)"
                    + " VALUES ("
                    + "'" + paymenthist.getPaymentName() + "',"
                    + "'" + paymenthist.getPaymentDate() + "',"
                    + "'" + paymenthist.getSalary() + "'"
                    + ")";
            //stmt.execute(table);
            System.out.println(insertQuery);
            stmt.executeUpdate(insertQuery);
            System.out.println("# The payment history was successfully inserted into the database.");

            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(EditPaymentHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    public void printPayment(String iban){
//        try {
//            Connection con = DB_Connection.getConnection();
//
//            Statement stmt = con.createStatement();
//
//            String retrieveQuery =
//
//        } catch (SQLException ex) {
//            Logger.getLogger(EditPaymentHistory.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }

}

