package Servlets;

import database.DB_Connection;
import database.tables.*;
import mainClasses.PaymentHistory;
import mainClasses.PermanentEmployee;
import mainClasses.TemporaryEmployee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.*;
import java.sql.*;

import static java.lang.Float.NaN;

@WebServlet(name = "Servlets.Insert", value = "/Servlets.Insert")
public class Insert extends HttpServlet {
    private static final long serialVersionUID = 1L; //https://www.codejava.net/coding/java-servlet-and-jsp-hello-world-tutorial-with-eclipse-maven-and-apache-tomcat

//    public Insert() {
//        super();
//    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            try {
                Connection con = null;
                try {
                    con = DB_Connection.getConnection();
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }

                Statement stmt = con.createStatement();

                String insertQuery1 = "INSERT INTO "
                        + " permanentemployee (IBAN, FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids)"
                        + " VALUES ('','','','','','','','','','','')";
                //stmt.execute(table);
                System.out.println(insertQuery1);
                stmt.executeUpdate(insertQuery1);
                System.out.println("# The permanent employee was successfully added in the database.");
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
            }








//            -------------------------------------------------------------------------------------------------

        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery11 = "INSERT INTO "
                    + " temporaryemployee (IBAN, FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids,startingcontractdate, endingcontractdate)"
                    + " VALUES ('','','','','','','','','','','','','')";
            //stmt.execute(table);
            System.out.println(insertQuery11);
            stmt.executeUpdate(insertQuery11);
            System.out.println("# The temporary employee was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }


//            -------------------------------------------------------------------------------------------------

        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery11 = "INSERT INTO "
                    + " temporaryfiredemployee (IBAN, FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids,startingcontractdate, endingcontractdate)"
                    + " VALUES ('','','','','','','','','','','','','')";
            //stmt.execute(table);
            System.out.println(insertQuery11);
            stmt.executeUpdate(insertQuery11);
            System.out.println("# The temporary fired employee was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }



//            -------------------------------------------------------------------------------------------------

        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery11 = "INSERT INTO "
                    + " permanentfiredemployee (IBAN, FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids,startingcontractdate, endingcontractdate)"
                    + " VALUES ('','','','','','','','','','','','','')";
            //stmt.execute(table);
            System.out.println(insertQuery11);
            stmt.executeUpdate(insertQuery11);
            System.out.println("# The temporary employee was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }


//            -------------------------------------------------------------------------------------------------

        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery11 = "INSERT INTO "
                    + " paymenthistory (FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids,startingcontractdate, endingcontractdate)"
                    + " VALUES ('','','','','','','','','','','','','')";
            //stmt.execute(table);
            System.out.println(insertQuery11);
            stmt.executeUpdate(insertQuery11);
            System.out.println("# The temporary employee was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

        response.sendRedirect("http://localhost:8080/HY360_Project_war_exploded/");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}