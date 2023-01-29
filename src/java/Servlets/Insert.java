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
                    + " VALUES ('GR1234567891','Manolis','Attalou 6','6989','Alfabank','MEM','2012-12-01','Educational','0','2500','0')";
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
                    + " VALUES ('GR1234567892','Antonis','Makedonias 12','6984','Pagkrhtia','XHM','2022-12-11','Educational','1','1','1000')";
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
                    + " VALUES ('GR1234567893','Lefteris','Apokoronou 1','6945','Eurobank','PHY','2022-12-10','Management','1','0','1610')";
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
                    + " VALUES ('GR1234567894','Marilena','Almpert 14','6989','Agrotikh','CSD','2022-12-01','Educational','1','3','1830')";
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
                    + " VALUES ('','','','','','','','','','','','','')";
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
                    + " VALUES ('','','','','','','','','','','','','')";
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
                    + " VALUES ('','','','','','','','','','','','','')";
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
                    + " VALUES ('','','','','','','','','','','','','')";
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
                    + " VALUES ('','','','','','','','','','','','','')";
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
                    + " VALUES ('','','','','','','','','','','','','')";
            //stmt.execute(table);
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
                    + " VALUES ('','','','','','','','','','','','','')";
            //stmt.execute(table);
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
                    + " VALUES ('','','','','','','','','','','','','')";
            //stmt.execute(table);
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
                    + " VALUES ('','','','','','','','','','','','','')";
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
                    + " VALUES ('','','','','','','','','','','','','')";
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
                    + " VALUES ('','','','','','','','','','','','','')";
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
                    + " VALUES ('','','','','','','','','','','','','')";
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
                    + " VALUES ('','','','','','','','','','','','','')";
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
                    + " VALUES ('','','','','','','','','','','','','')";
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
                    + " paymenthistory (FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids,startingContractDate, endingcontractdate)"
                    + " VALUES ('','','','','','','','','','','','','')";
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
                    + " paymenthistory (FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids,startingContractDate, endingcontractdate)"
                    + " VALUES ('','','','','','','','','','','','','')";
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
                    + " paymenthistory (FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids,startingContractDate, endingcontractdate)"
                    + " VALUES ('','','','','','','','','','','','','')";
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
                    + " paymenthistory (FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids,startingContractDate, endingcontractdate)"
                    + " VALUES ('','','','','','','','','','','','','')";
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
                    + " paymenthistory (FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids,startingContractDate, endingcontractdate)"
                    + " VALUES ('Rallou Konsta','Attalou 2','69543','ALfa','Mem','2010-1-1','Educational','1','1450','2','2020-9-1','2022-9-1')";
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
                    + " paymenthistory (FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids,startingContractDate, endingcontractdate)"
                    + " VALUES ('FIfh Palaiologou','Dios 10','69897','Synaiteristikh','Xhmiko','2022-12-1','Educational','0','1300','0','2022-12-1','2023-12-1')";
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
                    + " paymenthistory (FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids,startingContractDate, endingcontractdate)"
                    + " VALUES ('Dionyshs Mavrotsoukalos','Thenwn 4','69783','Pagkrhtia','CSD','2010-1-1','Educational','0','3000','0','2019-2-1','2025-10-1')";
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
                    + " paymenthistory (FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids,startingContractDate, endingcontractdate)"
                    + " VALUES ('Thanasis Mavrotsoukalos','Attalou 51','281045','Eurobank','Fusiko','2010-12-1','Managing','1','2300','1','2022-11-1','2024-11-1')";
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
                    + " paymenthistory (FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids,startingContractDate, endingcontractdate)"
                    + " VALUES ('Tina Papadopoulou','Drakontopoulou 15','69637','Eurobank','CSD','2015-5-1','Managing','1','2150','2','','','')";
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
                    + " paymenthistory (FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Payment,Kids,startingContractDate, endingcontractdate)"
                    + " VALUES ('Giwrgos Petrakhs','Apokwronou 3','69754','Alfa','Mem','2019-1-1','Educational','0','1450','2','2020-3-1','2023-3-1')";
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