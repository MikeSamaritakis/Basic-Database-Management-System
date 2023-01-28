package database.tables;

import database.DB_Connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Objects;
import database.tables.EditSalary;
import mainClasses.Salary;


public class Utilities {
//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        setBasicPaymentEducational(199);
//        System.out.println(getPermanentEmployeeType("13"));
//    }

    public static int getBasicPaymentEducational(){
        int basicPaymentEducational = 0;
                                                                                                        try {
            DB_Connection.getConnection();
                                                                                                        } catch (SQLException | ClassNotFoundException e) {throw new RuntimeException(e);}
        String query = "select * from salary";
        Statement stmt = null;
                                                                                                        try {
            stmt = DB_Connection.getConnection().createStatement();
                                                                                                        } catch (SQLException | ClassNotFoundException e) {throw new RuntimeException(e);}
        ResultSet rs;
                                                                                                        try {
            rs = stmt.executeQuery(query);
                                                                                                         } catch (SQLException e) {throw new RuntimeException(e);}
                                                                                                        try {
            while (rs.next()) {
                if(Objects.equals(rs.getString(1), "BasicEducational")){
                    basicPaymentEducational = rs.getInt(2);
                }
            }
                                                                                                        } catch (Exception e) {throw new RuntimeException(e);}
        return basicPaymentEducational;
    }

    public static void setBasicPaymentEducational(int basicPaymentEducational) throws SQLException, ClassNotFoundException {
        EditSalary es = new EditSalary();
        es.updateSalaryAmount("BasicEducational", basicPaymentEducational);
    }

    public static int getBasicPaymentManaging() {
        int basicPaymentManaging = 0;
        try {
            DB_Connection.getConnection();
        } catch (SQLException | ClassNotFoundException e) {throw new RuntimeException(e);}
        String query = "select * from salary";
        Statement stmt = null;
        try {
            stmt = DB_Connection.getConnection().createStatement();
        } catch (SQLException | ClassNotFoundException e) {throw new RuntimeException(e);}
        ResultSet rs;
        try {
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {throw new RuntimeException(e);}
        try {
            while (rs.next()) {
                if(Objects.equals(rs.getString(1), "BasicManaging")){
                    basicPaymentManaging = rs.getInt(2);
                }
            }
        } catch (Exception e) {throw new RuntimeException(e);}
        return basicPaymentManaging;
    }

    public static void setBasicPaymentManaging(int basicPaymentManaging) throws SQLException, ClassNotFoundException {
        EditSalary es = new EditSalary();
        es.updateSalaryAmount("BasicManaging", basicPaymentManaging);
    }

    public static int getBenefitLibrary() {
        int benefitLibrary = 0;
        try {
            DB_Connection.getConnection();
        } catch (SQLException | ClassNotFoundException e) {throw new RuntimeException(e);}
        String query = "select * from salary";
        Statement stmt = null;
        try {
            stmt = DB_Connection.getConnection().createStatement();
        } catch (SQLException | ClassNotFoundException e) {throw new RuntimeException(e);}
        ResultSet rs;
        try {
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {throw new RuntimeException(e);}
        try {
            while (rs.next()) {
                if(Objects.equals(rs.getString(1), "benefitLibrary")){
                    benefitLibrary = rs.getInt(2);
                }
            }
        } catch (Exception e) {throw new RuntimeException(e);}
        return benefitLibrary;
    }

    public static void setBenefitLibrary(int benefitLibrary) throws SQLException, ClassNotFoundException {
        EditSalary es = new EditSalary();
        es.updateSalaryAmount("benefitLibrary", benefitLibrary);
    }

    public static int getBenefitResearch() {
        int benefitResearch = 0;
        try {
            DB_Connection.getConnection();
        } catch (SQLException | ClassNotFoundException e) {throw new RuntimeException(e);}
        String query = "select * from salary";
        Statement stmt = null;
        try {
            stmt = DB_Connection.getConnection().createStatement();
        } catch (SQLException | ClassNotFoundException e) {throw new RuntimeException(e);}
        ResultSet rs;
        try {
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {throw new RuntimeException(e);}
        try {
            while (rs.next()) {
                if(Objects.equals(rs.getString(1), "benefitResearch")){
                    benefitResearch = rs.getInt(2);
                }
            }
        } catch (Exception e) {throw new RuntimeException(e);}
        return benefitResearch;
    }

    public static void setBenefitResearch(int benefitResearch) throws SQLException, ClassNotFoundException {
        EditSalary es = new EditSalary();
        es.updateSalaryAmount("benefitResearch", benefitResearch);
    }

    public static double calculatePayment(boolean isPermanent, int basicPayment, int benefit, int extraFamilyMembers, String dateofEmployment) {
        basicPayment += benefit;
        if (isPermanent) {
            String[] currentDate = new String[10];
            for(int i=0; i<=9; i++){
                currentDate[i] = "" + LocalDate.now().toString().charAt(i);
            }

            String[] startingDate = new String[10];
            for(int i=0; i<=9; i++){
                startingDate[i] = "" + dateofEmployment.charAt(i);
            }

            int kratoumeno = 0;
            if (Integer.parseInt(currentDate[5]) * 10 + Integer.parseInt(currentDate[6]) < Integer.parseInt(startingDate[5]) * 10 + Integer.parseInt(startingDate[6])) {
                kratoumeno = 1;
            }

            int xroniaPouPerasan = ((Integer.parseInt(currentDate[0]) * 1000 + Integer.parseInt(currentDate[1]) * 100 + Integer.parseInt(currentDate[2]) * 10 + Integer.parseInt(currentDate[3])) - (Integer.parseInt(startingDate[0]) * 1000 + Integer.parseInt(startingDate[1]) * 100 + Integer.parseInt(startingDate[2]) * 10 + Integer.parseInt(startingDate[3])) - kratoumeno) ;

            if(xroniaPouPerasan>0){
                return basicPayment + (xroniaPouPerasan-1) * basicPayment * 0.15  + extraFamilyMembers * (basicPayment * 0.05);
            }else{
                return basicPayment + extraFamilyMembers * (basicPayment * 0.05);
            }
        } else {
            return basicPayment +  extraFamilyMembers * (basicPayment * 0.05);
        }
    }

    public static String getPermanentEmployeeType(String iban) throws SQLException, ClassNotFoundException {
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();

        ResultSet rs;
        rs = stmt.executeQuery("select * from permanentemployee");
        while (rs.next()) {
            if(Objects.equals(rs.getString(1), iban)){
                return rs.getString("EmployeeType");
            }
        }
        return "Not found";
    }

    public static String getTemporaryEmployeeType(String iban) throws SQLException, ClassNotFoundException {
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();

        ResultSet rs;
        rs = stmt.executeQuery("select * from temporaryemployee");
        while (rs.next()) {
            if(Objects.equals(rs.getString(1), iban)){
                return rs.getString("EmployeeType");
            }
        }
        return "Not found";
    }

    public static String[] getAllPermanentEmployeeIbans() throws SQLException, ClassNotFoundException{
        String[] permibans = new String[1000];

        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();

        ResultSet rs;
        rs = stmt.executeQuery("select IBAN from permanentemployee");
        int i=0;
        while (rs.next()) {
            permibans[i] = rs.getString("IBAN");
            i++;
        }
        return permibans;
    }

    public static String[] getAllTemporaryEmployeeIbans() throws SQLException, ClassNotFoundException{
        String[] tempibans = new String[1000];

        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();

        ResultSet rs;
        rs = stmt.executeQuery("select IBAN from temporaryemployee");
        int i=0;
        while (rs.next()) {
            tempibans[i] = rs.getString("IBAN");
            i++;
        }
        return tempibans;
    }

    public static int getTemporaryEmployeeAmount() throws SQLException, ClassNotFoundException {
        int amount = 0;

        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();

        ResultSet rs;
        rs = stmt.executeQuery("select IBAN from temporaryemployee");
        while (rs.next()) {
            amount++;
        }
        return amount;
    }

    public static int getPermanentEmployeeAmount() throws SQLException, ClassNotFoundException {
        int amount = 0;

        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();

        ResultSet rs;
        rs = stmt.executeQuery("select IBAN from permanentemployee");
        while (rs.next()) {
            amount++;
        }
        return amount;
    }

    public static int getPermanentEmployeeExtraFamilyMembers(String iban) throws SQLException, ClassNotFoundException{
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();

        ResultSet rs;
        rs = stmt.executeQuery("select * from permanentemployee");
        while (rs.next()) {
            if(Objects.equals(rs.getString(1), iban)){
                return rs.getInt("Married") + rs.getInt("Kids");
            }
        }
        return 0;
    }

    public static int getTemporaryEmployeeExtraFamilyMembers(String iban) throws SQLException, ClassNotFoundException{
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();

        ResultSet rs;
        rs = stmt.executeQuery("select * from temporaryemployee");
        while (rs.next()) {
            if(Objects.equals(rs.getString(1), iban)){
                return rs.getInt("Married") + rs.getInt("Kids");
            }
        }
        return 0;
    }

    public static String getPermanentEmployeeDateOfEmployeement(String iban) throws SQLException, ClassNotFoundException{
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();

        ResultSet rs;
        rs = stmt.executeQuery("select * from permanentemployee");
        while (rs.next()) {
            if(Objects.equals(rs.getString(1), iban)){
                return rs.getString("startingDate");
            }
        }
        return null;
    }

    public static String getTemporaryEmployeeDateOfEmployeement(String iban) throws SQLException, ClassNotFoundException{
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();

        ResultSet rs;
        rs = stmt.executeQuery("select * from temporaryemployee");
        while (rs.next()) {
            if(Objects.equals(rs.getString(1), iban)){
                return rs.getString("startingDate");
            }
        }
        return null;
    }

    public static int getTemporaryEmployeeOnlyContractPayment(String iban) throws SQLException, ClassNotFoundException{
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();

        ResultSet rs;
        rs = stmt.executeQuery("select * from temporaryemployee");
        while (rs.next()) {
            if(Objects.equals(rs.getString(1), iban)){
                int contract = rs.getInt("Payment") - (int) (0.05 * rs.getInt("Payment") * rs.getInt("Kids") - (int) (0.05 * rs.getInt("Payment") * rs.getInt("Married")));
                if(Objects.equals(rs.getString("EmployeeType"), "Educational")){
                    contract -= Utilities.getBenefitLibrary();
                }
                return contract;
            }
        }
        return 0;
    }

    public static void updateAllPaymentsPermamentEmployee(){
        EditPermanentEmployee epe = new EditPermanentEmployee();
        try {
            for (String iban : Utilities.getAllPermanentEmployeeIbans()) {
                if(iban != null) {
                    if (Objects.equals(Utilities.getPermanentEmployeeType(iban), "Educational")) {
                        epe.updatePermanentEmployeePayment(iban, (int) Utilities.calculatePayment(true, Utilities.getBasicPaymentEducational(), Utilities.getBenefitResearch(), Utilities.getPermanentEmployeeExtraFamilyMembers(iban), Utilities.getPermanentEmployeeDateOfEmployeement(iban)));
                    } else {
                        epe.updatePermanentEmployeePayment(iban, (int) Utilities.calculatePayment(true, Utilities.getBasicPaymentManaging(), 0, Utilities.getPermanentEmployeeExtraFamilyMembers(iban), Utilities.getPermanentEmployeeDateOfEmployeement(iban)));
                    }
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void updateAllPaymentsTemporaryEmployee(){
        EditTemporaryEmployee ete = new EditTemporaryEmployee();
        try{
            for (String iban : Utilities.getAllTemporaryEmployeeIbans()) {
                if(iban != null) {
                    int contract = Utilities.getTemporaryEmployeeOnlyContractPayment(iban);
                    if (Objects.equals(Utilities.getTemporaryEmployeeType(iban), "Educational")) {
                        ete.updateTemporaryEmployeePayment(iban, (int) Utilities.calculatePayment(false, contract, Utilities.getBenefitLibrary(), Utilities.getPermanentEmployeeExtraFamilyMembers(iban), Utilities.getPermanentEmployeeDateOfEmployeement(iban)));
                    } else {
                        ete.updateTemporaryEmployeePayment(iban, (int) Utilities.calculatePayment(false, contract, 0, Utilities.getPermanentEmployeeExtraFamilyMembers(iban), Utilities.getPermanentEmployeeDateOfEmployeement(iban)));
                    }
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static int getPermanentEmployeeSalary(String iban) throws SQLException, ClassNotFoundException{
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();

        ResultSet rs;
        rs = stmt.executeQuery("select * from permanentemployee");
        while (rs.next()) {
            if(Objects.equals(rs.getString(1), iban)){
                return rs.getInt("Payment");
            }
        }
        return 0;
    }

    public static int getTemporaryEmployeeSalary(String iban) throws SQLException, ClassNotFoundException{
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();

        ResultSet rs;
        rs = stmt.executeQuery("select * from temporaryemployee");
        while (rs.next()) {
            if(Objects.equals(rs.getString(1), iban)){
                return rs.getInt("Payment");
            }
        }
        return 0;
    }

    public static String getPermanentEmployeeName(String iban) throws SQLException, ClassNotFoundException{
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();

        ResultSet rs;
        rs = stmt.executeQuery("select * from permanentemployee");
        while (rs.next()) {
            if(Objects.equals(rs.getString(1), iban)){
                return rs.getString("FullName");
            }
        }
        return null;
    }

    public static String getTemporaryEmployeeName(String iban) throws SQLException, ClassNotFoundException{
        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();

        ResultSet rs;
        rs = stmt.executeQuery("select * from temporaryemployee");
        while (rs.next()) {
            if(Objects.equals(rs.getString(1), iban)){
                return rs.getString("FullName");
            }
        }
        return null;
    }


}
