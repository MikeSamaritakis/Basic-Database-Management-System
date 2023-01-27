package mainClasses;

public class FiredTempEmployee extends Employee {
    String startingContractDatefired, endingContractDatefired;

    public String getstartingContractDatefired() {
        return startingContractDatefired;
    }

    public void setstartingContractDatefired(String startingContractDatefired) {
        this.startingContractDatefired = startingContractDatefired;
    }

    public String getendingContractDatefired() {
        return endingContractDatefired;
    }

    public void setendingContractDatefired(String endingContractDate) {
        this.endingContractDatefired = endingContractDate;
    }
}
