package Servlets;

import database.tables.EditTemporaryEmployee;
import mainClasses.TemporaryEmployee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
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
        PrintWriter write = response.getWriter();
        write.println("KALHSPERA sto servlet mas!");

        if (request.getParameter("tstartofcontract") != ""){
            //perm
        }
        else{
            EditTemporaryEmployee ete = new EditTemporaryEmployee();
            TemporaryEmployee te = new TemporaryEmployee();

            String Iban = request.getParameter("tiban");
            te.setIBAN(Iban);

            String Name = request.getParameter("tname");
            te.setFullname(Name);

            String Address = request.getParameter("taddress");
            te.setAddress(Address);

            int PhoneNumber = Integer.parseInt(request.getParameter("tphonenumber"));
            te.setTelephone(PhoneNumber);

            String BankName = request.getParameter("tbankname");
            te.setBankName(BankName);

            String Department = request.getParameter("tdepartment");
            te.setDepartment(Department);

            String StartingDate = request.getParameter("tstartingdate");
            te.setstartingDate(StartingDate);

            String EmployeeType = request.getParameter("temployeetype");
            te.setEmployeeType(EmployeeType);

            boolean Married = Boolean.parseBoolean(request.getParameter("tmarried")); //den eimai sigouros oti kanei swsto parse se boolean
            te.setMarried(Married);

            int PaymentAmount = Integer.parseInt(request.getParameter("tpaymentamount"));
            te.setPayment(PaymentAmount);

            String PaymentDate = request.getParameter("tpaymentdate");
            te.setPaymentDate(PaymentDate);

            try {
                ete.addnewTemporaryEmployee(te);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }




    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
