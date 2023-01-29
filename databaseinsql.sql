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


