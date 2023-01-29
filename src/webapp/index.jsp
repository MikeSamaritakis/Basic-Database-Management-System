<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="UTF-8">
    <meta charset="ISO-8859-1">
    <style><%@include file="/WEB-INF/CSS.css"%></style>
    <script><%@include file="/WEB-INF/JS.js"%></script>

</head>
<body>
<div class="hire temp/perm">
    <center>  <h1> UOC Database</h1> </center>
    <hr>
    <div class="buttonslogreg">
        <form method="get" action="Servlets.Insert">
        <button type="submit" name="FillDB"  value="Call Servlet" onclick="reloadpage()">Fill Database</button>
        </form>

        <button type="button" name="HireTemp" onclick='showTemp()'>Hire Temporary Employee</button>
        <button type="button" name="HirePerm" onclick='showPerm()'>Hire Permanent Employee</button>
        <button type="button" name="Delete" onclick='showDel()'>Delete Employee by IBAN</button>
        <button type="button" name="EditTInfo" onclick='showEdittemp()'>Edit Temporary Employee Info by IBAN</button>
        <button type="button" name="EditPInfo" onclick='showEditperm()'>Edit Permanent Employee Info by IBAN</button>
        <button type="button" name="calcpayment" onclick='showpayment()'>Submit Payments</button>
        <button type="button" name="changepayment" onclick='showEditPayment()'>Edit Payment</button>
<%--        <button type="button" name="SalarySumPerEmployeeType" value="Call Servlet">Salary Sum Per Employee Type</button>--%>
        <button type="button" name="Hide" onclick='hideAll()'>Hide Current Form</button>
<%--        <button type="button" name="MaxMinMedianSalaryPerEmployeeType" onclick='showTemp()'>MaxMinMedianSalaryPerEmployeeType</button>--%>
<%--        <button type="button" name="AverageIncreaseInSalaryAndBenefitPerTimePeriod" onclick='showTemp()'>Average Increase In Salary And Benefit Per Time Period</button>--%>
<%--        <button type="button" name="AttributesAndSalaryOfAnEmployee" onclick='showTemp()'>Attributes And Salary Of An Employee</button>--%>
<%--        <button type="button" name="AttributesAndSalaryOfAnEmployee" onclick='showTemp()'>Attributes And Salary Of An Employee</button>--%>



    </div>
<br><br>

    <form id="EditPayment" style="display: none" method="post" action="Servlets.PaymentUpdate">
        <br>
        <label> New basic payment for educational permanent employees</label><br>
        <input type="number" id="paymenteditbasicpaymenteducational" name="paymenteditbasicpaymenteducational" ><br><br>

        <label> New basic payment for managing permanent employees</label><br>
        <input type="number" id="paymenteditbasicpaymentmanaging" name="paymenteditbasicpaymentmanaging" ><br><br>

        <label> New library benefit</label><br>
        <input type="number" id="paymenteditlibrarybenefit" name="paymenteditlibrarybenefit" ><br><br>

        <label> New research benefit</label><br>
        <input type="number" id="paymenteditresearchbenefit" name="paymenteditresearchbenefit"><br><br>

        <button type="submit" name="EditPaymentSubmit" value="Call Servlet">Submit</button>

    </form>

    <form id="payment" style="display: none" method="get" action="Servlets.PaymentUpdate">
        <button type="submit" name="paymentSubmit" value="Call Servlet">Submit Payments for all employees</button>
    </form>

    <form id="edittinfo" style="display: none" method="get" action="Servlets.EditForm">
        <br>
        <label> IBAN</label><br>
        <input type="text" id="edittiban" name="edittiban" placeholder="Type in the IBAN"><br><br>

        <label> Name</label><br>
        <input type="text" id="edittname" name="edittname" placeholder="Type in the name"><br>

        <label> Address</label><br>
        <input type="text" id="edittaddress" name="edittaddress" placeholder="Type in the address"><br>

        <label> Phone number</label><br>
        <input type="number" id="edittphonenumber" name="edittphonenumber" placeholder="Type in the phone number"><br><br>

        <label> Bank name</label><br>
        <input type="text" id="edittbankname" name="edittbankname" placeholder="Type in the bank's name"><br>

        <label> Department</label><br>
        <input type="text" id="edittdepartment" name="edittdepartment" placeholder="Type in the department"><br>

        <label> Starting date</label><br>
        <input type="date" id="edittstartingdate" name="edittstartingdate"><br><br>

        <label> Type of employee</label><br>
        <label> Educational Staff</label>
        <input type="radio" id="edittemployeetypeeducation" name="edittemployeetype" value="Educational"><br>
        <label> Managing Staff</label>
        <input type="radio" id="edittemployeetypemanagement" name="edittemployeetype" value="Management"><br><br>

        <label> Is the employee Married?</label><br>
        <label> Yes</label>
        <input type="radio" id="edittmarriedtrue" name="edittmarried" value="1"><br>
        <label> No</label>
        <input type="radio" id="edittmarriedfalse" name="edittmarried" value="0"><br><br>

        <label> Number of kids</label><br>
        <input type="number" id="edittkids" name="edittkids" placeholder="Type in the number of kids"><br><br>

        <label> Amount of contract payment</label><br>
        <input type="number" id="edittpaymentamount" name="edittpaymentamount" placeholder="Type in the amount of payment"><br><br>

        <label> Start of contract</label><br>
        <input type="date" id="edittstartofcontract" name="edittstartofcontract"><br><br>

        <label> End of contract</label><br>
        <input type="date" id="edittendofcontract" name="edittendofcontract"><br><br>

        <button type="submit" name="edittSubmit" value="Call Servlet">Submit</button>
    </form>

    <form id="editpinfo" style="display: none" method="post" action="Servlets.EditForm">
        <br>
        <label> IBAN</label><br>
        <input type="text" id="editpiban" name="editpiban" placeholder="Type in the IBAN"><br><br>

        <label> Name</label><br>
        <input type="text" id="editpname" name="editpname" placeholder="Type in the name"><br>

        <label> Address</label><br>
        <input type="text" id="editpaddress" name="editpaddress" placeholder="Type in the address"><br>

        <label> Phone number</label><br>
        <input type="number" id="editpphonenumber" name="editpphonenumber" placeholder="Type in the phone number"><br><br>

        <label> Bank name</label><br>
        <input type="text" id="editpbankname" name="editpbankname" placeholder="Type in the bank's name"><br>

        <label> Department</label><br>
        <input type="text" id="editpdepartment" name="editpdepartment" placeholder="Type in the department"><br>

        <label> Starting date</label><br>
        <input type="date" id="editpstartingdate" name="editpstartingdate"><br><br>

        <label> Type of employee</label><br>
        <label> Educational Staff</label>
        <input type="radio" id="editpemployeetypeeducation" name="editpemployeetype" value="Educational"><br>
        <label> Managing Staff</label>
        <input type="radio" id="editpemployeetypemanagement" name="editpemployeetype" value="Management"><br><br>

        <label> Is the employee Married?</label><br>
        <label> Yes</label>
        <input type="radio" id="editpmarriedtrue" name="editpmarried" value="1"><br>
        <label> No</label>
        <input type="radio" id="editpmarriedfalse" name="editpmarried" value="0"><br><br>

        <label> Number of kids</label><br>
        <input type="number" id="editpkids" name="editpkids" placeholder="Type in the number of kids"><br><br>

        <label> Amount of contract payment</label><br>
        <input type="number" id="editppaymentamount" name="editppaymentamount" placeholder="Type in the amount of payment"><br><br>

        <button type="submit" name="editpSubmit" value="Call Servlet">Submit</button>
    </form>

    <form id="deleteemp" style="display: none" method="post" action="Servlets.Servlet">
        <label> Delete Employee by IBAN </label><br>
        <input type="text" id="diban" name="diban"><br>
        <button type="submit" name="dSubmit" value="Call Servlet">Delete</button>
    </form>

    <form id="temp" style="display: none" method="get" action="Servlets.Servlet" >
        <br>
        <label> IBAN</label><br>
        <input type="text" id="tiban" name="tiban" placeholder="Type in the IBAN"><br><br>

        <label> Name</label><br>
        <input type="text" id="tname" name="tname" placeholder="Type in the name"><br>

        <label> Address</label><br>
        <input type="text" id="taddress" name="taddress" placeholder="Type in the address"><br>

        <label> Phone number</label><br>
        <input type="number" id="tphonenumber" name="tphonenumber" placeholder="Type in the phone number"><br><br>

        <label> Bank name</label><br>
        <input type="text" id="tbankname" name="tbankname" placeholder="Type in the bank's name"><br>

        <label> Department</label><br>
        <input type="text" id="tdepartment" name="tdepartment" placeholder="Type in the department"><br>

        <label> Starting date</label><br>
        <input type="date" id="tstartingdate" name="tstartingdate"><br><br>

        <label> Type of employee</label><br>
        <label> Educational Staff</label>
        <input type="radio" id="temployeetypeeducation" name="temployeetype" value="Educational"><br>
        <label> Managing Staff</label>
        <input type="radio" id="temployeetypemanagement" name="temployeetype" value="Management"><br><br>

        <label> Is the employee Married?</label><br>
        <label> Yes</label>
        <input type="radio" id="tmarriedtrue" name="tmarried" value="1"><br>
        <label> No</label>
        <input type="radio" id="tmarriedfalse" name="tmarried" value="0"><br><br>

        <label> Number of kids</label><br>
        <input type="number" id="tkids" name="tkids" placeholder="Type in the number of kids"><br><br>

        <label> Amount of contract payment</label><br>
        <input type="number" id="tpaymentamount" name="tpaymentamount" placeholder="Type in the amount of payment"><br><br>

        <label> Start of contract</label><br>
        <input type="date" id="tstartofcontract" name="tstartofcontract"><br><br>

        <label> End of contract</label><br>
        <input type="date" id="tendofcontract" name="tendofcontract"><br><br>

        <button type="submit" name="tSubmit" value="Call Servlet">Submit</button>
    </form>

    <form id="perm" style="display: none" method="get" action="Servlets.Servlet">
        <br>
        <label> IBAN</label><br>
        <input type="text" id="piban" name="piban" placeholder="Type in the IBAN"><br><br>

        <label> Name</label><br>
        <input type="text" id="pname" name="pname" placeholder="Type in the name"><br>

        <label> Address</label><br>
        <input type="text" id="paddress" name="paddress" placeholder="Type in the address"><br>

        <label> Phone number</label><br>
        <input type="number" id="pphonenumber" name="pphonenumber" placeholder="Type in the phone number"><br><br>

        <label> Bank name</label><br>
        <input type="text" id="pbankname" name="pbankname" placeholder="Type in the bank's name"><br>

        <label> Department</label><br>
        <input type="text" id="pdepartment" name="pdepartment" placeholder="Type in the department"><br>

        <label> Starting date</label><br>
        <input type="date" id="pstartingdate" name="pstartingdate"><br><br>

        <label> Type of employee</label><br>
        <label> Educational Staff</label>
        <input type="radio" id="pemployeetypeeducation" name="pemployeetype" value="Educational"><br>
        <label> Managing Staff</label>
        <input type="radio" id="pemployeetypemanagement" name="pemployeetype" value="Management"><br><br>

        <label> Is the employee Married?</label><br>
        <label> Yes</label>
        <input type="radio" id="pmarriedtrue" name="pmarried" value="1"><br>
        <label> No</label>
        <input type="radio" id="pmarriedfalse" name="pmarried" value="0"><br><br>

        <label> Number of kids</label><br>
        <input type="number" id="pkids" name="pkids" placeholder="Type in the number of kids"><br><br>

<%--        <label> Amount of payment</label><br>--%>
<%--        <input type="number" id="ppaymentamount" name="ppaymentamount" placeholder="Type in the amount of payment"><br><br>--%>


        <button type="submit" name="pSubmit" value="Call Servlet">Submit</button>


    </form>

</div>
</body>

</html>