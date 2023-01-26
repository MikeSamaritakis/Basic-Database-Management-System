package database.tables;

import java.time.Instant;
import java.time.LocalDate;


public class Utilities {
    public static int calculatePayment(boolean isPermanent, int basicPayment, int extraFamilyMembers, String dateofEmployment) {
        if (isPermanent) {
            // int yearsInEmployment = Integer.parseInt(java.time.LocalDate.now().toString().replaceAll("-","")) - Integer.parseInt(startingDate.replaceAll("-",""));
            String[] currentDate = new String[]{LocalDate.now().toString().replaceAll("-", "")};
            String[] startingDate = new String[]{dateofEmployment.replaceAll("-", "")};
            int kratoumeno = 0;
            if (Integer.parseInt(currentDate[6]) * 10 + Integer.parseInt(currentDate[7]) - Integer.parseInt(startingDate[6]) * 10 + Integer.parseInt(startingDate[7]) < 0) {
                kratoumeno++;
            }

            if (Integer.parseInt(currentDate[4]) * 10 + Integer.parseInt(currentDate[5]) - Integer.parseInt(startingDate[4]) * 10 + Integer.parseInt(startingDate[5]) + kratoumeno < 0) {
                kratoumeno = 1;
            } else {
                kratoumeno = 0;
            }
            int xroniaPouPerasan = ((Integer.parseInt(currentDate[0]) * 1000 + Integer.parseInt(currentDate[1]) * 100 + Integer.parseInt(currentDate[2]) * 10 + Integer.parseInt(currentDate[3])) - (Integer.parseInt(startingDate[0]) * 1000 + Integer.parseInt(startingDate[1]) * 100 + Integer.parseInt(startingDate[2]) * 10 + Integer.parseInt(startingDate[3])) +kratoumeno) ;


            return basicPayment + xroniaPouPerasan*basicPayment*(15/100) + extraFamilyMembers*(basicPayment*(5/100));
        } else {
            return basicPayment +  extraFamilyMembers*(basicPayment*(5/100));
        }


    }
}
