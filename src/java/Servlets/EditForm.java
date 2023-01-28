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

        TemporaryEmployee te = new TemporaryEmployee();
        EditTemporaryEmployee ete = new EditTemporaryEmployee();

        String iban = request.getParameter("edittiban");

        String Name = request.getParameter("edittname");
        if (!Objects.equals(Name, "")) {
            try {
                ete.updateTemporaryEmployeeFullName(iban, Name);
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String Address = request.getParameter("edittaddress");
        if (!Objects.equals(Address, "")) {
            try {
                ete.updateTemporaryEmployeeAddress(iban, Address);
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String PhoneNumber = request.getParameter("edittphonenumber");
        if (!Objects.equals(PhoneNumber, "")) {
            try {
                ete.updateTemporaryEmployeeTelephone(iban, Integer.parseInt(PhoneNumber));
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String BankName = request.getParameter("edittbankname");
        if (!Objects.equals(BankName, "")) {
            try {
                ete.updateTemporaryEmployeeBankName(iban, BankName);
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String Department = request.getParameter("edittdepartment");
        if (!Objects.equals(Department, "")) {
            try {
                ete.updateTemporaryEmployeeDepartment(iban, Department);
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String StartingDate = request.getParameter("edittstartingdate");
        if (!Objects.equals(StartingDate, "")) {
            try {
                ete.updateTemporaryEmployeestartingDate(iban ,StartingDate);
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String EmployeeType = request.getParameter("edittemployeetype");
        if (!Objects.equals(EmployeeType, null)) {
            try {
                ete.updateTemporaryEmployeeEmployeeType(iban, EmployeeType);
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String Marriedstring = request.getParameter("edittmarried");
        if (!Objects.equals(Marriedstring, null)) {
            int Married = Integer.parseInt(Marriedstring);
            try {
                ete.updateTemporaryEmployeeMarried(iban, Married);
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String PaymentAmountstring = request.getParameter("edittpaymentamount");
        if (PaymentAmountstring != "") {
            int PaymentAmount = Integer.parseInt(PaymentAmountstring);
            try {
                ete.updateTemporaryEmployeePayment(iban, PaymentAmount);
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String StartOfContract = request.getParameter("edittstartofcontract");
        if (!Objects.equals(StartOfContract, "")) {
            try {
                ete.updateTemporaryEmployeestartingContractDate(iban, StartOfContract);
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String EndOfContract = request.getParameter("edittendofcontract");
        if (!Objects.equals(EndOfContract, "")) {
            try {
                ete.updateTemporaryEmployeeendingContractDate(iban, EndOfContract);
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String Kidsstring = request.getParameter("edittkids");
        if (!Objects.equals(Kidsstring, "")) {
            int Kids = Integer.parseInt(Kidsstring);
            try {
                ete.updateTemporaryEmployeeKids(iban, Kids);
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//  edit perm info
        PermanentEmployee pe = new PermanentEmployee();
        EditPermanentEmployee epe = new EditPermanentEmployee();

        String iban = request.getParameter("editpiban");

        String Name = request.getParameter("editpname");
        if (!Objects.equals(Name, "")) {
            try {
                epe.updatePermanentEmployeeFullName(iban, Name);
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String Address = request.getParameter("editpaddress");
        if (!Objects.equals(Address, "")) {
            try {
                epe.updatePermanentEmployeeAddress(iban, Address);
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String PhoneNumberstring = request.getParameter("editpphonenumber");
        if (!Objects.equals(PhoneNumberstring, "")) {
            int PhoneNumber = Integer.parseInt(PhoneNumberstring);
            try {
                epe.updatePermanentEmployeeTelephone(iban, PhoneNumber);
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        }

        String BankName = request.getParameter("editpbankname");
        if (!Objects.equals(BankName, "")) {
            try {
                epe.updatePermanentEmployeeBankName(iban, BankName);
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String Department = request.getParameter("editpdepartment");
        if (!Objects.equals(Department, "")) {
            try {
                epe.updatePermanentEmployeeDepartment(iban, Department);
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String StartingDate = request.getParameter("editpstartingdate");
        if (!Objects.equals(StartingDate, "")) {
            try {
                epe.updatePermanentEmployeestartingDate(iban, StartingDate);
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String EmployeeType = request.getParameter("editpemployeetype");
        if (!Objects.equals(EmployeeType, null)) {
            try {
                epe.updatePermanentEmployeeEmployeeType(iban, EmployeeType);
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String Marriedstring = request.getParameter("editpmarried");
        if (!Objects.equals(Marriedstring, null)) {
            int Married = Integer.parseInt(Marriedstring);
            try {
                epe.updatePermanentEmployeeMarried(iban, Married);
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String PaymentAmountstring = request.getParameter("editppaymentamount");
        if (!Objects.equals(PaymentAmountstring, "")) {
            int PaymentAmount = Integer.parseInt(PaymentAmountstring);
            try {
                epe.updatePermanentEmployeePayment(iban, PaymentAmount);
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String Kidsstring = request.getParameter("editpkids");
        if (!Objects.equals(Kidsstring, "")) {
            int Kids = Integer.parseInt(Kidsstring);
            try {
                epe.updatePermanentEmployeeKids(iban, Kids);
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

    }

}