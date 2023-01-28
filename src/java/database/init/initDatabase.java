package database.init;

import database.tables.*;

import java.sql.*;

import static database.DB_Connection.getInitialConnection;

import database.tables.EditTemporaryEmployee;
import database.tables.EditPermanentEmployee;
import database.tables.EditFiredPermanentEmployees;
import database.tables.EditFiredTemporaryEmployees;

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
        EditFiredPermanentEmployees efpe = new EditFiredPermanentEmployees();
        EditFiredTemporaryEmployees efte = new EditFiredTemporaryEmployees();
        EditSalary es = new EditSalary();
        ete.createTemporaryEmployeetable();
        epe.createPermanentEmployeetable();
        eph.createPaymentHistory();
        efte.createFiredTemporaryEmployeetable();
        efpe.createFiredPermanentEmployeetable();
        es.createSalarytable();
    }
}
