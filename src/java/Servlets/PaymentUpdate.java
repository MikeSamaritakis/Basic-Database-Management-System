package Servlets;

import database.tables.EditPermanentEmployee;
import database.tables.EditTemporaryEmployee;
import database.tables.EditPaymentHistory;
import database.tables.Utilities;
import mainClasses.PaymentHistory;
import mainClasses.PermanentEmployee;
import mainClasses.TemporaryEmployee;
import database.tables.Utilities;
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

@WebServlet(name = "Servlets.PaymentUpdate", value = "/Servlets.PaymentUpdate")
public class PaymentUpdate extends HttpServlet{
    private static final long serialVersionUID = 1L; //https://www.codejava.net/coding/java-servlet-and-jsp-hello-world-tutorial-with-eclipse-maven-and-apache-tomcat

    public PaymentUpdate(){
        super();
    }

    /**
     * Prwta enhmerwnei ton mistho kathe ypalilou kai meta kanei katavolh misthodosiwn ston pinaka
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /* kwdikas pou enhmerwnei tous misthous stous pinakes permanentemployee kai temporary employee"*/
        /* Update all salaries in permanent employee table*/
        

//        EditPaymentHistory eph = new EditPaymentHistory();
//        for(GIA KATHE EMPLOYEE STON PINAKA TEMP){
//            PaymentHistory ph = new EditPaymentHistory();
//
//            ph.setPaymentDate(String.valueOf(java.time.LocalDate.now()));
//
//            ph.setPaymentName();
//
//            ph.setSalary();
//
//            try {
//                eph.addnewPaymentHistory(ph);
//            } catch (ClassNotFoundException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//        for(GIA KATHE EMPLOYEE STON PINAKA PERM){
//            PaymentHistory ph = new EditPaymentHistory();
//
//            ph.setPaymentDate(String.valueOf(java.time.LocalDate.now()));
//
//            ph.setPaymentName();
//
//            ph.setSalary();
//
//            try {
//                eph.addnewPaymentHistory(ph);
//            } catch (ClassNotFoundException e) {
//                throw new RuntimeException(e);
//            }
//        }


    }

    /**
     * Update sto basic payment kai sta epidomata
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String basicEducationalString = request.getParameter("paymenteditbasicpaymenteducational");
        if(!Objects.equals(basicEducationalString, "")){
            try {
                Utilities.setBasicPaymentEducational(Integer.parseInt(basicEducationalString));
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String basicManagingString = request.getParameter("paymenteditbasicpaymentmanaging");
        if(!Objects.equals(basicManagingString, "")){
            try {
                Utilities.setBasicPaymentManaging(Integer.parseInt(basicManagingString));
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        String benefitLibrary = request.getParameter("paymenteditlibrarybenefit");
        if(!Objects.equals(benefitLibrary, "")){
            try {
                Utilities.setBenefitLibrary(Integer.parseInt(benefitLibrary));
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }


        String benefitResearch = request.getParameter("paymenteditresearchbenefit");
        if(!Objects.equals(benefitResearch, "")){
            try {
                Utilities.setBenefitResearch(Integer.parseInt(benefitResearch));
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
