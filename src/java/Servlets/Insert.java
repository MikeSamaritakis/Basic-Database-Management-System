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

        //            -------------------------------------------------------------------------------------------------

        //1
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
                    + " VALUES ('GR1234567890','Michalis','Zarou 15','6906','Piraiws','CSD','2022-01-01','Management','0','7000','1')";
            //stmt.execute(table);
            System.out.println(insertQuery1);
            stmt.executeUpdate(insertQuery1);
            System.out.println("# The permanent employee was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }


        //2
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
                    + " VALUES ('GR1234567891','Manolis','Attalou 6','69892','Alfabank','MEM','2012-12-01','Educational','0','2500','0')";
            //stmt.execute(table);
            System.out.println(insertQuery1);
            stmt.executeUpdate(insertQuery1);
            System.out.println("# The permanent employee was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

        //3
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery1 = "INSERT INTO "
                    + " permanentemployee (IBAN, FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Kids,Payment)"
                    + " VALUES ('GR1234567892','Antonis','Makedonias 12','69843','Pagkrhtia','XHM','2022-12-11','Educational','1','1','1800')";
            //stmt.execute(table);
            System.out.println(insertQuery1);
            stmt.executeUpdate(insertQuery1);
            System.out.println("# The permanent employee was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

        //4
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery1 = "INSERT INTO "
                    + " permanentemployee (IBAN, FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Kids,Payment)"
                    + " VALUES ('GR1234567893','Lefteris','Apokoronou 1','6945','Eurobank','PHY','2022-12-10','Management','1','0','1600')";
            //stmt.execute(table);
            System.out.println(insertQuery1);
            stmt.executeUpdate(insertQuery1);
            System.out.println("# The permanent employee was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

        //5
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery1 = "INSERT INTO "
                    + " permanentemployee (IBAN, FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Kids,Payment)"
                    + " VALUES ('GR1234567894','Marilena','Almpert 14','6989','Agrotikh','CSD','2022-12-01','Educational','1','3','1800')";
            //stmt.execute(table);
            System.out.println(insertQuery1);
            stmt.executeUpdate(insertQuery1);
            System.out.println("# The permanent employee was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }








//            -------------------------------------------------------------------------------------------------

        //1
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery11 = "INSERT INTO "
                    + " temporaryemployee (IBAN, FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids,startingContractDate, endingContractDate)"
                    + " VALUES ('GR890244731','Nick Tarzanidis','Ionias 8','698536','eurobank','CSD','2018-01-01','Educational','1','1900','2','2021-10-01','2024-12-31')";
            //stmt.execute(table);
            System.out.println(insertQuery11);
            stmt.executeUpdate(insertQuery11);
            System.out.println("# The temporary employee was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

        //2
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery11 = "INSERT INTO "
                    + " temporaryemployee (IBAN, FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids,startingContractDate, endingContractDate)"
                    + " VALUES ('GR89024431','Nick Tarzanidis','Ionias 8','698536','eurobank','CSD','2018-01-01','Educational','1','1900','2','2021-10-01','2024-12-31')";
            //stmt.execute(table);
            System.out.println(insertQuery11);
            stmt.executeUpdate(insertQuery11);
            System.out.println("# The temporary employee was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }


        //3
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery11 = "INSERT INTO "
                    + " temporaryemployee (IBAN, FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids,startingContractDate, endingContractDate)"
                    + " VALUES ('GR8909241','Mpampis Karampamparos','Zervou 4','698321','eurobank','CSD','2018-01-01','Management','1','1800','3','2021-10-01','2024-12-31')";
            //stmt.execute(table);
            System.out.println(insertQuery11);
            stmt.executeUpdate(insertQuery11);
            System.out.println("# The temporary employee was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

        //4
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery11 = "INSERT INTO "
                    + " temporaryemployee (IBAN, FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids,startingContractDate, endingContractDate)"
                    + " VALUES ('GR82341','Giannis Papadakis','Ionias 13','698236','alfabank','CSD','2018-01-01','Educational','1','1650','4','2021-10-01','2024-12-31')";
            //stmt.execute(table);
            System.out.println(insertQuery11);
            stmt.executeUpdate(insertQuery11);
            System.out.println("# The temporary employee was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

        //5
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery11 = "INSERT INTO "
                    + " temporaryemployee (IBAN, FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids,startingContractDate, endingContractDate)"
                    + " VALUES ('GR231213','Giannis Antetokounmpo','Milwaukee 23','6985026','eurobank','BIO','2018-01-01','Management','1','1650','2','2021-10-01','2024-12-31')";
            //stmt.execute(table);
            System.out.println(insertQuery11);
            stmt.executeUpdate(insertQuery11);
            System.out.println("# The temporary employee was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }


//            -------------------------------------------------------------------------------------------------

        //1
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery21 = "INSERT INTO "
                    + " temporaryfiredemployee (IBAN, FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids,startingContractDate, endingContractDate)"
                    + " VALUES ('GR0909231','Iwanna Tzagaraki','Apokoronou 1','69856','alfabank','CSD','2001-12-01','Management','0','1340','2','2021-09-01','2024-03-31')";
            //stmt.execute(table);
            System.out.println(insertQuery21);
            stmt.executeUpdate(insertQuery21);
            System.out.println("# The temporary fired employee was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

        //2
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery21 = "INSERT INTO "
                    + " temporaryfiredemployee (IBAN, FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids,startingContractDate, endingContractDate)"
                    + " VALUES ('GR09090231','Nikos Sfyrakis','Sxoinokapsalwn 3','69826','alfabank','CSD','2008-09-01','Management','0','1650','1','2021-09-01','2024-03-31')";            //stmt.execute(table);
            System.out.println(insertQuery21);
            stmt.executeUpdate(insertQuery21);
            System.out.println("# The temporary fired employee was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

        //3
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery21 = "INSERT INTO "
                    + " temporaryfiredemployee (IBAN, FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids,startingContractDate, endingContractDate)"
                    + " VALUES ('GR8909231','Makis Kramakaros','Delta 3','698506','eurobank','CSD','2018-01-01','Educational','1','1650','2','2021-10-01','2024-12-31')";
            System.out.println(insertQuery21);
            stmt.executeUpdate(insertQuery21);
            System.out.println("# The temporary fired employee was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }


        //4
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery21 = "INSERT INTO "
                    + " temporaryfiredemployee (IBAN, FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids,startingContractDate, endingContractDate)"
                    + " VALUES ('GR023431','Manos Tzormpatzakis','Attalou 6','69820','alfabank','PHY','2020-12-01','Educational','0','1900','1','2019-01-01','2024-03-31')";
            System.out.println(insertQuery21);
            stmt.executeUpdate(insertQuery21);
            System.out.println("# The temporary fired employee was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

        //5
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery21 = "INSERT INTO "
                    + " temporaryfiredemployee (IBAN, FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids,startingContractDate, endingContractDate)"
                    + " VALUES ('GR89123231','Mpampis Tentas','Iwanninwn 63','698523','pagritia','CSD','2018-01-01','Educational','1','1650','2','2021-10-01','2024-12-31')";
            //stmt.execute(table);
            System.out.println(insertQuery21);
            stmt.executeUpdate(insertQuery21);
            System.out.println("# The temporary fired employee was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

//            -------------------------------------------------------------------------------------------------

        //1
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery31 = "INSERT INTO "
                    + " permanentfiredemployee (IBAN, FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids,startingContractDate, endingContractDate)"
                    + " VALUES ('GR09231','Markissa','Makedonias 15','69733','euronbank','MEM','2020-01-01','Management','1','1750','2','2020-01-01','2024-12-31')";
            //stmt.execute(table);
            System.out.println(insertQuery31);
            stmt.executeUpdate(insertQuery31);
            System.out.println("# The temporary employee was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

        //2
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery31 = "INSERT INTO "
                    + " permanentfiredemployee (IBAN, FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids,startingContractDate, endingContractDate)"
                    + " VALUES ('GR092312','Paparizou','Makedonias 17','69713','euronbank','MEM','2020-01-01','Management','1','1900','1','2020-01-01','2024-12-31')";
            //stmt.execute(table);
            System.out.println(insertQuery31);
            stmt.executeUpdate(insertQuery31);
            System.out.println("# The temporary employee was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

        //3
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery31 = "INSERT INTO "
                    + " permanentfiredemployee (IBAN, FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids,startingContractDate, endingcontractdate)"
                    + " VALUES ('GR09231','Markissa','Makedonias 15','69733','euronbank','MEM','2020-01-01','Management','1','1750','2','2020-01-01','2024-12-31')";
            //stmt.execute(table);
            System.out.println(insertQuery31);
            stmt.executeUpdate(insertQuery31);
            System.out.println("# The temporary employee was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

        //4
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery31 = "INSERT INTO "
                    + " permanentfiredemployee (IBAN, FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids,startingContractDate, endingcontractdate)"
                    + " VALUES ('GR09232','Marilou','Makedonias 15','69731','euronbank','CSD','2020-01-01','Educational','1','2000','5','2020-01-01','2024-12-31')";
            //stmt.execute(table);
            System.out.println(insertQuery31);
            stmt.executeUpdate(insertQuery31);
            System.out.println("# The temporary employee was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

        //5
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery31 = "INSERT INTO "
                    + " permanentfiredemployee (IBAN, FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids,startingContractDate, endingcontractdate)"
                    + " VALUES ('GR0923132','Vrasidas','Makedonias 14','697312','euronbank','CSD','2020-01-01','Management','1','1750','2','2020-01-01','2024-12-31')";
            //stmt.execute(table);
            System.out.println(insertQuery31);
            stmt.executeUpdate(insertQuery31);
            System.out.println("# The temporary employee was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }
//            -------------------------------------------------------------------------------------------------

        //1
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery41 = "INSERT INTO "
                    + " paymenthistory (PaymentName,PaymentDate,Salary)"
                    + " VALUES ('Aglaia Paulou','2012-11-1','3000')";
            //stmt.execute(table);
            System.out.println(insertQuery41);
            stmt.executeUpdate(insertQuery41);
            System.out.println("# The temporary employee was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

        //2
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery41 = "INSERT INTO "
                    + " paymenthistory (PaymentName,PaymentDate,Salary)"
                    + " VALUES ('Toula Pantazh','2018-4-1','1800')";
            //stmt.execute(table);
            System.out.println(insertQuery41);
            stmt.executeUpdate(insertQuery41);
            System.out.println("# The temporary employee was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

        //3
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery41 = "INSERT INTO "
                    + " paymenthistory (PaymentName,PaymentDate,Salary)"
                    + " VALUES ('Afroula Terzh','2013-8-1','2750')";
            //stmt.execute(table);
            System.out.println(insertQuery41);
            stmt.executeUpdate(insertQuery41);
            System.out.println("# The temporary employee was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

        //4
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery41 = "INSERT INTO "
                    + " paymenthistory (PaymentName,PaymentDate,Salary)"
                    + " VALUES ('ALekshs Dieythynths','2004-1-1','4500')";
            //stmt.execute(table);
            System.out.println(insertQuery41);
            stmt.executeUpdate(insertQuery41);
            System.out.println("# The temporary employee was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

        //5
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery41 = "INSERT INTO "
                    + " paymenthistory (PaymentName,PaymentDate,Salary)"
                    + " VALUES ('Rallou Konsta','2022-3-1','1240')";
            //stmt.execute(table);
            System.out.println(insertQuery41);
            stmt.executeUpdate(insertQuery41);
            System.out.println("# The temporary employee was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

        //            -------------------------------------------------------------------------------------------------

        //1
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery51 = "INSERT INTO "
                    + " paymenthistory (PaymentName,PaymentDate,Salary)"
                    + " VALUES ('Fifh Palaiologou','2016-9-1','2000')";
            //stmt.execute(table);
            System.out.println(insertQuery51);
            stmt.executeUpdate(insertQuery51);
            System.out.println("# The payment history was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

        //2
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery51 = "INSERT INTO "
                    + " paymenthistory (PaymentName,PaymentDate,Salary)"
                    + " VALUES ('Dionysis Mavrotsoujalos','2015-3-1','2650')";
            //stmt.execute(table);
            System.out.println(insertQuery51);
            stmt.executeUpdate(insertQuery51);
            System.out.println("# The payment history was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

        //3
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery51 = "INSERT INTO "
                    + " paymenthistory (PaymentName,PaymentDate,Salary)"
                    + " VALUES ('Thanasis Mavrotsoukalos','2015-1-1','2450')";
            //stmt.execute(table);
            System.out.println(insertQuery51);
            stmt.executeUpdate(insertQuery51);
            System.out.println("# The payment history was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

        //4
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery51 = "INSERT INTO "
                    + " paymenthistory (PaymentName,PaymentDate,Salary)"
                    + " VALUES ('Tina Papadopoulou','2022-1-1','1450')";
            //stmt.execute(table);
            System.out.println(insertQuery51);
            stmt.executeUpdate(insertQuery51);
            System.out.println("# The payment history was successfully added in the database.");
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

        //5
        try {
            Connection con = null;
            try {
                con = DB_Connection.getConnection();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            Statement stmt = con.createStatement();

            String insertQuery51 = "INSERT INTO "
                    + " paymenthistory (PaymentName,PaymentDate,Salary)"
                    + " VALUES ('Petros Paulou','2020-1-1','1700')";
            //stmt.execute(table);
            System.out.println(insertQuery51);
            stmt.executeUpdate(insertQuery51);
            System.out.println("# The payment history was successfully added in the database.");
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