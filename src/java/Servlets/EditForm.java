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
import java.util.logging.Level;
import java.util.logging.*;
import java.sql.*;

import static java.lang.Float.NaN;

@WebServlet(name = "Servlets.EditForm", value = "/Servlets.EditForm")
public class EditForm extends HttpServlet {
    private static final long serialVersionUID = 1L; //https://www.codejava.net/coding/java-servlet-and-jsp-hello-world-tutorial-with-eclipse-maven-and-apache-tomcat

    public EditForm() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//  edit temp info
        PrintWriter writer = response.getWriter();

        TemporaryEmployee te = new TemporaryEmployee();
        EditTemporaryEmployee ete = new EditTemporaryEmployee();

        String iban = request.getParameter("edittiban");

        String Name = request.getParameter("edittname");
        if (Name != null) {
            ete.updateTemporaryEmployeeFullName(iban, Name);
        }

        String Address = request.getParameter("edittaddress");
        if (Address != null) {
            ete.updateTemporaryEmployeeAddress(iban, Address);
        }

        String PhoneNumber = request.getParameter("edittphonenumber");
        if (PhoneNumber != null) {
            ete.updateTemporaryEmployeeTelephone(iban, PhoneNumber);
        }

        String BankName = request.getParameter("edittbankname");
        if (BankName != null) {
            ete.updateTemporaryEmployeeBankName(iban, BankName);
        }

        String Department = request.getParameter("edittdepartment");
        if (Department != null) {
            ete.updateTemporaryEmployeeDepartment(iban, Department);
        }

        String StartingDate = request.getParameter("edittstartingdate");
        if (StartingDate != null) {
            ete.updateTemporaryEmployeestartingDate(iban ,StartingDate);
        }

        String EmployeeType = request.getParameter("edittemployeetype");
        if (EmployeeType != null) {
            ete.updateTemporaryEmployeeEmployeeType(iban, EmployeeType);
        }

        String Marriedstring = request.getParameter("edittmarried");
        if (Marriedstring != null) {
            int Married = Integer.parseInt(Marriedstring);
            ete.updateTemporaryEmployeeMarried(iban, Married);
        }

        String PaymentAmountstring = request.getParameter("edittpaymentamount");
        if (PaymentAmountstring != null) {
            int PaymentAmount = Integer.parseInt(PaymentAmountstring);
            ete.updateTemporaryEmployeePayment(iban, PaymentAmount);
        }

        String StartOfContract = request.getParameter("edittstartofcontract");
        if (StartOfContract != null) {
            ete.updateTemporaryEmployeestartingContractDate(iban, StartOfContract);
        }

        String EndOfContract = request.getParameter("edittendofcontract");
        if (EndOfContract != null) {
            ete.updateTemporaryEmployeeendingContractDate(iban, EndOfContract);
        }

        String Kidsstring = request.getParameter("edittkids");
        if (Kidsstring != null) {
            int Kids = Integer.parseInt(Kidsstring);
            ete.updateTemporaryEmployeeKids(iban, Kids);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//  edit perm info
        PermanentEmployee pe = new PermanentEmployee();
        EditPermanentEmployee epe = new EditPermanentEmployee();

        String iban = request.getParameter("editpiban");

        String Name = request.getParameter("editpname");
        if (Name != null) {
            epe.updatePermanentEmployeeFullName(iban, Name);
        }

        String Address = request.getParameter("editpaddress");
        if (Address != null) {
            epe.updatePermanentEmployeeAddress(iban, Address);
        }

        String PhoneNumber = request.getParameter("editpphonenumber");
        if (PhoneNumber != null) {
            epe.updatePermanentEmployeeTelephone(iban, PhoneNumber);
        }

        String BankName = request.getParameter("editpbankname");
        if (BankName != null) {
            epe.updatePermanentEmployeeBankName(iban, BankName);
        }

        String Department = request.getParameter("editpdepartment");
        if (Department != null) {
            epe.updatePermanentEmployeeDepartment(iban, Department);
        }

        String StartingDate = request.getParameter("editpstartingdate");
        if (StartingDate != null) {
            epe.updatePermanentEmployeestartingDate(iban, StartingDate);
        }

        String EmployeeType = request.getParameter("editpemployeetype");
        if (EmployeeType != null) {
            epe.updatePermanentEmployeeEmployeeType(iban, EmployeeType);
        }

        int Married = Integer.parseInt(request.getParameter("editpmarried"));
        if (Married != NaN) {
            epe.updatePermanentEmployeeMarried(iban, String.valueOf(Married));
        }

        int PaymentAmount = Integer.parseInt(request.getParameter("editppaymentamount"));
        if (PaymentAmount != NaN) {
            pe.setPayment(PaymentAmount);
        }

        int Kids = Integer.parseInt(request.getParameter("ediptkids"));
        if (Kids != NaN) {
            pe.setKids(Kids);
        }
    }
}