package mainClasses;

public class TemporaryEmployee extends Employee{
    String startingContractDate, endingContractDate;

    public String getstartingContractDate() {
        return startingContractDate;
    }

    public void setstartingContractDate(String startingContractDate) {
        this.startingContractDate = startingContractDate;
    }

    public String getendingContractDate() {
        return endingContractDate;
    }

    public void setendingContractDate(String endingContractDate) {
        this.endingContractDate = endingContractDate;
    }
}
