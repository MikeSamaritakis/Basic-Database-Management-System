package Servlets;

import database.tables.*;
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
        /* Update all salaries in permanent employee table*/
        EditPermanentEmployee epe = new EditPermanentEmployee();
        try {
            for (String iban : Utilities.getAllPermanentEmployeeIbans()) {
                if(iban != null) {
                    System.out.println(iban);
                    if (Utilities.getPermanentEmployeeType(iban).equals("Educational")) {
                        epe.updatePermanentEmployeePayment(iban, (int) Utilities.calculatePayment(true, Utilities.getBasicPaymentEducational(), Utilities.getBenefitResearch(), Utilities.getPermanentEmployeeExtraFamilyMembers(iban), Utilities.getPermanentEmployeeDateOfEmployeement(iban)));
                    } else {
                        epe.updatePermanentEmployeePayment(iban, (int) Utilities.calculatePayment(true, Utilities.getBasicPaymentManaging(), 0, Utilities.getPermanentEmployeeExtraFamilyMembers(iban), Utilities.getPermanentEmployeeDateOfEmployeement(iban)));
                    }
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }

        /*Update all salaries in temporary employee table*/
        EditTemporaryEmployee ete = new EditTemporaryEmployee();
        try{
            for (String iban : Utilities.getAllTemporaryEmployeeIbans()) {
                if(iban != null) {
                    int contract = Utilities.getTemporaryEmployeeOnlyContractPayment(iban);
                    if (Utilities.getTemporaryEmployeeType(iban).equals("Educational")) {
                        ete.updateTemporaryEmployeePayment(iban, (int) Utilities.calculatePayment(false, contract, Utilities.getBenefitLibrary(), Utilities.getPermanentEmployeeExtraFamilyMembers(iban), Utilities.getPermanentEmployeeDateOfEmployeement(iban)));
                    } else {
                        ete.updateTemporaryEmployeePayment(iban, (int) Utilities.calculatePayment(false, contract, 0, Utilities.getPermanentEmployeeExtraFamilyMembers(iban), Utilities.getPermanentEmployeeDateOfEmployeement(iban)));
                    }
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }




        EditPaymentHistory eph = new EditPaymentHistory();

        //Katavolh misthodosiwn twn permanent ston pinaka PaymentHistory
        try {
            for (String iban : Utilities.getAllPermanentEmployeeIbans()) {
                if(iban != null) {
                    PaymentHistory ph = new PaymentHistory();
                    ph.setSalary(Utilities.getPermanentEmployeeSalary(iban));
                    ph.setPaymentName(Utilities.getPermanentEmployeeName(iban));
                    ph.setPaymentDate((java.time.LocalDate.now().toString()));
                    eph.addnewPaymentHistory(ph);
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        //Katavolh misthodosiwn twn temporary ston pinaka PaymentHistory
        try {
            for (String iban : Utilities.getAllTemporaryEmployeeIbans()) {
                if(iban != null) {
                    PaymentHistory ph = new PaymentHistory();
                    ph.setSalary(Utilities.getTemporaryEmployeeSalary(iban));
                    ph.setPaymentName(Utilities.getTemporaryEmployeeName(iban));
                    ph.setPaymentDate((java.time.LocalDate.now().toString()));
                    eph.addnewPaymentHistory(ph);
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
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
