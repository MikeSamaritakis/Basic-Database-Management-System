package Servlets;

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
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.*;
import java.sql.*;

@WebServlet(name = "Servlets.Servlet", value = "/Servlets.Servlet")
public class Servlet extends HttpServlet{
    private static final long serialVersionUID = 1L; //https://www.codejava.net/coding/java-servlet-and-jsp-hello-world-tutorial-with-eclipse-maven-and-apache-tomcat

//    public Servlet(){
//        super();
//    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Insert employees into the database.
        if (request.getParameter("tstartofcontract") == null) {
            EditPermanentEmployee epe = new EditPermanentEmployee();
            PermanentEmployee pe = new PermanentEmployee();

            String Iban = request.getParameter("piban");
            pe.setIBAN(Iban);

            String Name = request.getParameter("pname");
            pe.setFullname(Name);

            String Address = request.getParameter("paddress");
            pe.setAddress(Address);

            String PhoneNumber = request.getParameter("pphonenumber");
            pe.setTelephone(Long.parseLong((PhoneNumber)));

            String BankName = request.getParameter("pbankname");
            pe.setBankName(BankName);

            String Department = request.getParameter("pdepartment");
            pe.setDepartment(Department);

            String StartingDate = request.getParameter("pstartingdate");
            StartingDate = StartingDate.substring(0,8) + '0' + '1';
            pe.setstartingDate(StartingDate);

            String EmployeeType = request.getParameter("pemployeetype");
            pe.setEmployeeType(EmployeeType);

            int Married = Integer.parseInt(request.getParameter("pmarried"));
            pe.setMarried(Married);

            int Kids = Integer.parseInt(request.getParameter("pkids"));
            pe.setKids(Kids);

            double PaymentAmount = 0;
            if (Objects.equals(EmployeeType, "Management")) {
                PaymentAmount = Utilities.calculatePayment(true, Utilities.getBasicPaymentManaging(), 0, Married+Kids, StartingDate);
            }else{
                PaymentAmount = Utilities.calculatePayment(true, Utilities.getBasicPaymentEducational(), Utilities.getBenefitResearch(), Married+Kids, StartingDate);
            }
            pe.setPayment((int)PaymentAmount);


            try {
                epe.addnewPermanentEmployee(pe);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        }else{
            EditTemporaryEmployee ete = new EditTemporaryEmployee();
            TemporaryEmployee te = new TemporaryEmployee();

            String Iban = request.getParameter("tiban");
            te.setIBAN(Iban);

            String Name = request.getParameter("tname");
            te.setFullname(Name);

            String Address = request.getParameter("taddress");
            te.setAddress(Address);

            String PhoneNumber = request.getParameter("tphonenumber");
            te.setTelephone(Integer.parseInt(PhoneNumber));

            String BankName = request.getParameter("tbankname");
            te.setBankName(BankName);

            String Department = request.getParameter("tdepartment");
            te.setDepartment(Department);

            String StartingDate = request.getParameter("tstartingdate");
            StartingDate = StartingDate.substring(0,8) + '0' + '1';
            te.setstartingDate(StartingDate);

            String EmployeeType = request.getParameter("temployeetype");
            te.setEmployeeType(EmployeeType);

            int Married = Integer.parseInt(request.getParameter("tmarried"));
            te.setMarried(Married);

            int Kids = Integer.parseInt(request.getParameter("tkids"));
            te.setKids(Kids);

            double PaymentAmount = 0;
            if (EmployeeType.equals("Management")) {
                PaymentAmount = Utilities.calculatePayment(false, Integer.parseInt(request.getParameter("tpaymentamount")), 0, Married+Kids, StartingDate);
            }else{
                PaymentAmount = Utilities.calculatePayment(false, Integer.parseInt(request.getParameter("tpaymentamount")), Utilities.getBenefitLibrary(), Married+Kids, StartingDate);
            }
            te.setPayment((int)PaymentAmount);

            String StartOfContract = request.getParameter("tstartofcontract");
            StartOfContract = StartOfContract.substring(0,8) + '0' + '1';
            te.setstartingContractDate(StartOfContract);

            String EndOfContract = request.getParameter("tendofcontract");
            te.setendingContractDate(EndOfContract);

            try {
                ete.addnewTemporaryEmployee(te);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        response.sendRedirect("index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Delete employees and add them to the Fired employees database.
        PrintWriter writer = response.getWriter();

        String Iban = request.getParameter("diban");
            //perm
            EditTemporaryEmployee epe = new EditTemporaryEmployee();
            TemporaryEmployee pe = new TemporaryEmployee();
            EditFiredTemporaryEmployees efpe = new EditFiredTemporaryEmployees();
            try {
                pe = Utilities.getTemporaryEmployee(Iban);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            try {
                efpe.addnewFiredTemporaryEmployee(pe);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            try {
                epe.deleteTemporaryEmployee(Iban);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        response.sendRedirect("http://localhost:8080/HY360_Project_war_exploded/");
    }

}
