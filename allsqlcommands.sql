create table firedpermanentemployee
(
    IBAN         char(255) not null
        primary key,
    Fullname     char(255) null,
    Address      char(255) null,
    Telephone    int       null,
    BankName     char(255) null,
    Department   char(255) null,
    startingDate char(255) null,
    EmployeeType char(255) null,
    Married      int(1)    null,
    Kids         int       null,
    Payment      int       null
);

create table firedtemporaryemployee
(
    IBAN                 char(255) not null
        primary key,
    Fullname             char(255) null,
    Address              char(255) null,
    Telephone            int       null,
    BankName             char(255) null,
    Department           char(255) null,
    startingDate         char(255) null,
    EmployeeType         char(255) null,
    Married              int(1)    null,
    Kids                 int       null,
    Payment              int       null,
    startingContractDate char(255) null,
    endingContractDate   char(255) null
);

create table paymenthistory
(
    payment_id  int auto_increment
        primary key,
    PaymentName char(255) null,
    PaymentDate char(255) null,
    Salary      int       null
);

create table permanentemployee
(
    IBAN         char(255) not null
        primary key,
    Fullname     char(255) null,
    Address      char(255) null,
    Telephone    int       null,
    BankName     char(255) null,
    Department   char(255) null,
    startingDate char(255) null,
    EmployeeType char(255) null,
    Married      int(1)    null,
    Kids         int       null,
    Payment      int       null
);

create table salary
(
    ETYPE  char(255) not null
        primary key,
    AMOUNT int       null
);

create table temporaryemployee
(
    IBAN                 char(255) not null
        primary key,
    Fullname             char(255) null,
    Address              char(255) null,
    Telephone            int       null,
    BankName             char(255) null,
    Department           char(255) null,
    startingDate         char(255) null,
    EmployeeType         char(255) null,
    Married              int(1)    null,
    Kids                 int       null,
    Payment              int       null,
    startingContractDate char(255) null,
    endingContractDate   char(255) null
);


stmt.execute("CREATE DATABASE HY360_2022");

"INSERT INTO "
+ " firedpermanentemployee (IBAN,FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,"
                    + "Payment,Kids)"
                    + " VALUES ("
                    + "'" + permemployee.getIBAN() + "',"
                    + "'" + permemployee.getFullName() + "',"
                    + "'" + permemployee.getAddress() + "',"
                    + "'" + permemployee.getTelephone() + "',"
                    + "'" + permemployee.getBankName() + "',"
                    + "'" + permemployee.getDepartment() + "',"
                    + "'" + permemployee.getstartingDate() + "',"
                    + "'" + permemployee.getEmployeeType() + "',"
                    + "'" + permemployee.getMarried() + "',"
                    + "'" + permemployee.getPayment() + "',"
                    + "'" + permemployee.getKids() + "'"
                    + ")";

"INSERT INTO "
+ " temporaryemployee (IBAN,FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Kids,"
                    + "Payment,startingContractDate,endingContractDate)"
                    + " VALUES ("
                    + "'" + tempemployee.getIBAN() + "',"
                    + "'" + tempemployee.getFullName() + "',"
                    + "'" + tempemployee.getAddress() + "',"
                    + "'" + tempemployee.getTelephone() + "',"
                    + "'" + tempemployee.getBankName() + "',"
                    + "'" + tempemployee.getDepartment() + "',"
                    + "'" + tempemployee.getstartingDate() + "',"
                    + "'" + tempemployee.getEmployeeType() + "',"
                    + "'" + tempemployee.getMarried() + "',"
                    + "'" + tempemployee.getKids() + "',"
                    + "'" + tempemployee.getPayment() + "',"
                    + "'" + tempemployee.getstartingContractDate() + "',"
                    + "'" + tempemployee.getendingContractDate() + "'"
                    + ")";

"INSERT INTO "
+ " paymenthistory (PaymentName,"
                    + " PaymentDate, Salary)"
                    + " VALUES ("
                    + "'" + paymenthist.getPaymentName() + "',"
                    + "'" + paymenthist.getPaymentDate() + "',"
                    + "'" + paymenthist.getSalary() + "'"
                    + ")";

"INSERT INTO "
+ " permanentemployee (IBAN,FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,"
                    + "Payment,Kids)"
                    + " VALUES ("
                    + "'" + permemployee.getIBAN() + "',"
                    + "'" + permemployee.getFullName() + "',"
                    + "'" + permemployee.getAddress() + "',"
                    + "'" + permemployee.getTelephone() + "',"
                    + "'" + permemployee.getBankName() + "',"
                    + "'" + permemployee.getDepartment() + "',"
                    + "'" + permemployee.getstartingDate() + "',"
                    + "'" + permemployee.getEmployeeType() + "',"
                    + "'" + permemployee.getMarried() + "',"
                    + "'" + permemployee.getPayment() + "',"
                    + "'" + permemployee.getKids() + "'"
                    + ")";

"UPDATE permanentemployee SET FullName='" + fullname + "' WHERE IBAN = '" + iban + "'";
    "UPDATE permanentemployee SET FullName='" + fullname + "' WHERE IBAN = '" + iban + "'";
        "UPDATE permanentemployee SET address='" + address + "' WHERE IBAN = '" + iban + "'";
            "UPDATE permanentemployee SET Telephone='" + telephone + "' WHERE IBAN = '" + iban + "'";
                "UPDATE permanentemployee SET BankName='" + bankname + "' WHERE IBAN = '" + iban + "'";
                    "UPDATE permanentemployee SET Department='" + department + "' WHERE IBAN = '" + iban + "'";
                        "UPDATE permanentemployee SET startingDate='" + startingdate + "' WHERE IBAN = '" + iban + "'";
                            "UPDATE permanentemployee SET EmployeeType='" + employeetype + "' WHERE IBAN = '" + iban + "'";
                                "UPDATE permanentemployee SET Married='" + married + "' WHERE IBAN = '" + iban + "'";
                                    "UPDATE permanentemployee SET Kids='" + kids + "' WHERE IBAN = '" + iban + "'";
                                        "UPDATE permanentemployee SET Payment='" + payment + "' WHERE IBAN = '" + iban + "'";

"INSERT INTO "
+ " salary (ETYPE, AMOUNT)"
                    + " VALUES ('BasicEducational','1200')";

"INSERT INTO "
+ " salary (ETYPE, AMOUNT)"
                    + " VALUES ('benefitLibrary','150')";

"INSERT INTO "
+ " salary (ETYPE, AMOUNT)"
                    + " VALUES ('benefitResearch','300')";

"UPDATE salary SET AMOUNT='" +  amount + "' WHERE ETYPE = '" + etype + "'";

"INSERT INTO "
+ " temporaryemployee (IBAN,FullName,Address,Telephone,BankName,Department,startingDate,EmployeeType,Married,Kids,"
                    + "Payment,startingContractDate,endingContractDate)"
                    + " VALUES ("
                    + "'" + tempemployee.getIBAN() + "',"
                    + "'" + tempemployee.getFullName() + "',"
                    + "'" + tempemployee.getAddress() + "',"
                    + "'" + tempemployee.getTelephone() + "',"
                    + "'" + tempemployee.getBankName() + "',"
                    + "'" + tempemployee.getDepartment() + "',"
                    + "'" + tempemployee.getstartingDate() + "',"
                    + "'" + tempemployee.getEmployeeType() + "',"
                    + "'" + tempemployee.getMarried() + "',"
                    + "'" + tempemployee.getKids() + "',"
                    + "'" + tempemployee.getPayment() + "',"
                    + "'" + tempemployee.getstartingContractDate() + "',"
                    + "'" + tempemployee.getendingContractDate() + "'"
                    + ")";

"DELETE FROM temporaryemployee WHERE IBAN = '" + ibantemp + "'";


"UPDATE temporaryemployee SET FullName='" + fullname + "' WHERE IBAN = '" + iban + "'";
    "UPDATE temporaryemployee SET FullName='" + fullname + "' WHERE IBAN = '" + iban + "'";
        "UPDATE temporaryemployee SET address='" + address + "' WHERE IBAN = '" + iban + "'";
            "UPDATE temporaryemployee SET Telephone='" + telephone + "' WHERE IBAN = '" + iban + "'";
                "UPDATE temporaryemployee SET BankName='" + bankname + "' WHERE IBAN = '" + iban + "'";
                    "UPDATE temporaryemployee SET Department='" + department + "' WHERE IBAN = '" + iban + "'";
                        "UPDATE temporaryemployee SET startingDate='" + startingdate + "' WHERE IBAN = '" + iban + "'";
                            "UPDATE temporaryemployee SET EmployeeType='" + employeetype + "' WHERE IBAN = '" + iban + "'";
                                "UPDATE temporaryemployee SET Married='" + married + "' WHERE IBAN = '" + iban + "'";
                                    "UPDATE temporaryemployee SET Kids='" + kids + "' WHERE IBAN = '" + iban + "'";
                                        "UPDATE temporaryemployee SET Payment='" + payment + "' WHERE IBAN = '" + iban + "'";
                                            "UPDATE temporaryemployee SET startingContractDate='" +  startingcontractdate + "' WHERE IBAN = '" + iban + "'";
                                                "UPDATE temporaryemployee SET endingContractDate='" +  endingcontractdate + "' WHERE IBAN = '" + iban + "'";

"select * from salary";

"select * from permanentemployee"

"select * from temporaryemployee"

"select IBAN from permanentemployee"

"select IBAN from temporaryemployee"

-- AND ALMOST ALL OF THE SERVLET: Insert.java