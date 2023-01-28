package database.tables;

import database.DB_Connection;

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
//        System.out.println(getBasicPaymentEducational());
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
}
