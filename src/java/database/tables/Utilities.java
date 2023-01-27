package database.tables;

import java.time.Instant;
import java.time.LocalDate;


public class Utilities {
    private static int basicPaymentEducational = 1200;
    private static int basicPaymentManaging = 1400;
    private static int benefitResearch = 300;
    private static int benefitLibrary = 150;

    public static int getBasicPaymentEducational() {
        return basicPaymentEducational;
    }

    public static void setBasicPaymentEducational(int abasicPaymentEducational) {
        basicPaymentEducational = abasicPaymentEducational;
    }

    public static int getBasicPaymentManaging() {
        return basicPaymentManaging;
    }

    public static void setBasicPaymentManaging(int abasicPaymentManaging) {
        basicPaymentManaging = abasicPaymentManaging;
    }

    public static int getBenefitLibrary() {
        return benefitLibrary;
    }

    public static void setBenefitLibrary(int abenefitLibrary) {
        benefitLibrary = abenefitLibrary;
    }

    public static int getBenefitResearch() {
        return benefitResearch;
    }

    public static void setBenefitResearch(int abenefitResearch) {
        benefitResearch = abenefitResearch;
    }

    public static double calculatePayment(boolean isPermanent, int basicPayment, int extraFamilyMembers, String dateofEmployment) {
        if (isPermanent) {
            // int yearsInEmployment = Integer.parseInt(java.time.LocalDate.now().toString().replaceAll("-","")) - Integer.parseInt(startingDate.replaceAll("-",""));
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
