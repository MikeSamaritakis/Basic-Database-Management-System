package database.init;

import database.tables.*;

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
import static database.DB_Connection.getConnection;
import static database.DB_Connection.getInitialConnection;

import database.tables.EditTemporaryEmployee;
import database.tables.EditPermanentEmployee;

public class initDatabase {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        initDatabase init = new initDatabase();
        init.initDatabase();
        init.initTables();
    }

    public void initDatabase() throws SQLException, ClassNotFoundException {
        Connection conn = getInitialConnection();
        Statement stmt = conn.createStatement();
        stmt.execute("CREATE DATABASE HY360_2022");
        stmt.close();
        conn.close();
    }

    public void initTables() throws SQLException, ClassNotFoundException {
        EditPermanentEmployee epe = new EditPermanentEmployee();
        EditTemporaryEmployee ete = new EditTemporaryEmployee();
        EditPaymentHistory eph = new EditPaymentHistory();
        ete.createTemporaryEmployeetable();
        epe.createPermanentEmployeetable();
        eph.createPaymentHistory();

    }
}
