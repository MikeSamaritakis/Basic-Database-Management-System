//package Servlets;
//
//public class RequestButtons {
//}
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
public class RequestButtons extends HttpServlet{
    private static final long serialVersionUID = 1L; //https://www.codejava.net/coding/java-servlet-and-jsp-hello-world-tutorial-with-eclipse-maven-and-apache-tomcat

    public RequestButtons(){
        super();
    }

    /**
     * Prwta enhmerwnei ton mistho kathe ypalilou kai meta kanei katavolh misthodosiwn ston pinaka
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /* Update all salaries in permanent employee table*/

    }

    /**
     * Update sto basic payment kai sta epidomata
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}

