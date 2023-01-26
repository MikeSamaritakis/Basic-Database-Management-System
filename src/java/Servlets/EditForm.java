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
            try {
                ete.updateTemporaryEmployeeFullName(iban, Name);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String Address = request.getParameter("edittaddress");
        if (Address != null) {
            try {
                ete.updateTemporaryEmployeeAddress(iban, Address);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String PhoneNumber = request.getParameter("edittphonenumber");
        if (PhoneNumber != null) {
            try {
                ete.updateTemporaryEmployeeTelephone(iban, PhoneNumber);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String BankName = request.getParameter("edittbankname");
        if (BankName != null) {
            try {
                ete.updateTemporaryEmployeeBankName(iban, BankName);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String Department = request.getParameter("edittdepartment");
        if (Department != null) {
            try {
                ete.updateTemporaryEmployeeDepartment(iban, Department);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String StartingDate = request.getParameter("edittstartingdate");
        if (StartingDate != null) {
            try {
                ete.updateTemporaryEmployeestartingDate(iban ,StartingDate);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String EmployeeType = request.getParameter("edittemployeetype");
        if (EmployeeType != null) {
            try {
                ete.updateTemporaryEmployeeEmployeeType(iban, EmployeeType);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String Marriedstring = request.getParameter("edittmarried");
        if (Marriedstring != null) {
            int Married = Integer.parseInt(Marriedstring);
            try {
                ete.updateTemporaryEmployeeMarried(iban, Married);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String PaymentAmountstring = request.getParameter("edittpaymentamount");
        if (PaymentAmountstring != null) {
            int PaymentAmount = Integer.parseInt(PaymentAmountstring);
            try {
                ete.updateTemporaryEmployeePayment(iban, PaymentAmount);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String StartOfContract = request.getParameter("edittstartofcontract");
        if (StartOfContract != null) {
            try {
                ete.updateTemporaryEmployeestartingContractDate(iban, StartOfContract);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String EndOfContract = request.getParameter("edittendofcontract");
        if (EndOfContract != null) {
            try {
                ete.updateTemporaryEmployeeendingContractDate(iban, EndOfContract);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String Kidsstring = request.getParameter("edittkids");
        if (Kidsstring != null) {
            int Kids = Integer.parseInt(Kidsstring);
            try {
                ete.updateTemporaryEmployeeKids(iban, Kids);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
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
        if (Name != null) {
            try {
                epe.updatePermanentEmployeeFullName(iban, Name);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String Address = request.getParameter("editpaddress");
        if (Address != null) {
            try {
                epe.updatePermanentEmployeeAddress(iban, Address);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String PhoneNumber = request.getParameter("editpphonenumber");
        if (PhoneNumber != null) {
            try {
                epe.updatePermanentEmployeeTelephone(iban, PhoneNumber);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String BankName = request.getParameter("editpbankname");
        if (BankName != null) {
            try {
                epe.updatePermanentEmployeeBankName(iban, BankName);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String Department = request.getParameter("editpdepartment");
        if (Department != null) {
            try {
                epe.updatePermanentEmployeeDepartment(iban, Department);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String StartingDate = request.getParameter("editpstartingdate");
        if (StartingDate != null) {
            try {
                epe.updatePermanentEmployeestartingDate(iban, StartingDate);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String EmployeeType = request.getParameter("editpemployeetype");
        if (EmployeeType != null) {
            try {
                epe.updatePermanentEmployeeEmployeeType(iban, EmployeeType);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String Marriedstring = request.getParameter("editpmarried");
        if (Marriedstring != null) {
            int Married = Integer.parseInt(Marriedstring);
            try {
                epe.updatePermanentEmployeeMarried(iban, Married);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String PaymentAmountstring = request.getParameter("editppaymentamount");
        if (PaymentAmountstring != null) {
            int PaymentAmount = Integer.parseInt(PaymentAmountstring);
            try {
                epe.updatePermanentEmployeePayment(iban, PaymentAmount);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String Kidsstring = request.getParameter("ediptkids");
        if (Kidsstring != null) {
            int Kids = Integer.parseInt(Kidsstring);
            try {
                epe.updatePermanentEmployeeKids(iban, Kids);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

}