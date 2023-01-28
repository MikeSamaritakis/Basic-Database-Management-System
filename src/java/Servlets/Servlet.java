package Servlets;

import database.tables.EditPermanentEmployee;
import database.tables.EditTemporaryEmployee;
import database.tables.EditPaymentHistory;
import database.tables.Utilities;
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

    public Servlet(){
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Insert employees into the database.
        PrintWriter writer = response.getWriter();

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
            pe.setstartingDate(StartingDate);

            String EmployeeType = request.getParameter("pemployeetype");
            pe.setEmployeeType(EmployeeType);

            int Married = Integer.parseInt(request.getParameter("pmarried"));
            pe.setMarried(Married);

            int Kids = Integer.parseInt(request.getParameter("pkids"));
            pe.setKids(Kids);

            double PaymentAmount = 0;
            if (Objects.equals(EmployeeType, "Managing")) {
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
            te.setstartingDate(StartingDate);

            String EmployeeType = request.getParameter("temployeetype");
            te.setEmployeeType(EmployeeType);

            int Married = Integer.parseInt(request.getParameter("tmarried"));
            te.setMarried(Married);

            int Kids = Integer.parseInt(request.getParameter("tkids"));
            te.setKids(Kids);

            double PaymentAmount = 0;
            if (Objects.equals(EmployeeType, "Managing")) {
                PaymentAmount = Utilities.calculatePayment(false, Integer.parseInt(request.getParameter("tpaymentamount")), 0, Married+Kids, StartingDate);
            }else{
                PaymentAmount = Utilities.calculatePayment(false, Integer.parseInt(request.getParameter("tpaymentamount")), Utilities.getBenefitLibrary(), Married+Kids, StartingDate);
            }
            te.setPayment((int)PaymentAmount);

            String StartOfContract = request.getParameter("tstartofcontract");
            te.setstartingContractDate(StartOfContract);

            String EndOfContract = request.getParameter("tendofcontract");
            te.setendingContractDate(EndOfContract);

            try {
                ete.addnewTemporaryEmployee(te);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Delete employees.
        PrintWriter writer = response.getWriter();

        String Iban = request.getParameter("diban");
        if (request.getParameter("tstartofcontract") == null) {
            //perm
            EditPermanentEmployee epe = new EditPermanentEmployee();
            try {
                epe.deletePermanentEmployee(Iban);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        else{
            //temp
            EditTemporaryEmployee ete = new EditTemporaryEmployee();
            try {
                ete.deleteTemporaryEmployee(Iban);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
