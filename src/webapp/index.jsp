<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="UTF-8">
    <meta charset="ISO-8859-1">
    <style><%@include file="/WEB-INF/CSS.css"%></style>
    <script><%@include file="/WEB-INF/JS.js"%></script>

</head>
<body id="grad1">
<div class="hire temp/perm">
    <center>  <h1> UOC Database</h1>
        <hr>
        <div class="buttons">
            <form id="filldb" method="get" action="Servlets.Insert">
            <button class="btn" type="submit" name="FillDB" value="Call Servlet" onclick="reloadpage()">Fill Database</button>
            </form>
            <button class="btn" type="button" name="HireTemp" onclick='showTemp()'>Hire Temporary Employee</button>
            <button class="btn" type="button" name="HirePerm" onclick='showPerm()'>Hire Permanent Employee</button>
            <button class="btn" type="button" name="Delete" onclick='showDel()'>Delete Temporary Employee by IBAN</button>
<%--            <button class="btn" type="button" name="Delete" onclick='showDelperm()'>Delete Permanent Employee by IBAN</button>--%>
            <button class="btn" type="button" name="EditTInfo" onclick='showEdittemp()'>Edit Temporary Employee Info by IBAN</button>
            <button class="btn" type="button" name="EditPInfo" onclick='showEditperm()'>Edit Permanent Employee Info by IBAN</button>
            <button class="btn" type="button" name="calcpayment" onclick='showpayment()'>Submit Payments</button>
            <button class="btn" type="button" name="changepayment" onclick='showEditPayment()'>Edit Payment</button>
            <button class="btn" type="button" name="Hide" onclick='hideAll()'>Hide Current Form</button>
        </div>


        <form id="EditPayment" style="display: none" method="post" action="Servlets.PaymentUpdate">
            <br>
            <label class="txtedit"> New basic payment for educational permanent employees</label><br>
            <input class="edit" type="number" id="paymenteditbasicpaymenteducational" name="paymenteditbasicpaymenteducational" ><br><br>

            <label class="txtedit"> New basic payment for managing permanent employees</label><br>
            <input class="edit" type="number" id="paymenteditbasicpaymentmanaging" name="paymenteditbasicpaymentmanaging" ><br><br>

            <label class="txtedit"> New library benefit</label><br>
            <input class="edit" type="number" id="paymenteditlibrarybenefit" name="paymenteditlibrarybenefit" ><br><br>

            <label class="txtedit"> New research benefit</label><br>
            <input class="edit" type="number" id="paymenteditresearchbenefit" name="paymenteditresearchbenefit"><br><br>

            <button class="btn" type="submit" name="EditPaymentSubmit" value="Call Servlet">Submit</button>

        </form>

        <form id="payment" style="display: none" method="get" action="Servlets.PaymentUpdate">
            <center><button class="btn" style="margin-top: 2%" type="submit" name="paymentSubmit" value="Call Servlet">Submit Payments for all employees</button></center>
        </form>

        <form id="edittinfo" style="display: none" method="get" action="Servlets.EditForm">
            <br>
            <label class="txtedit"> IBAN</label><br>
            <input class="edit" type="text" id="edittiban" name="edittiban" placeholder="Type in the IBAN"><br><br>

            <label class="txtedit"> Name</label><br>
            <input  class="edit"type="text" id="edittname" name="edittname" placeholder="Type in the name"><br>

            <label class="txtedit"> Address</label><br>
            <input class="edit" type="text" id="edittaddress" name="edittaddress" placeholder="Type in the address"><br>

            <label class="txtedit"> Phone number</label><br>
            <input class="edit" type="number" id="edittphonenumber" name="edittphonenumber" placeholder="Type in the phone number"><br><br>

            <label class="txtedit"> Bank name</label><br>
            <input class="edit" type="text" id="edittbankname" name="edittbankname" placeholder="Type in the bank's name"><br>

            <label class="txtedit"> Department</label><br>
            <input class="edit" type="text" id="edittdepartment" name="edittdepartment" placeholder="Type in the department"><br>

            <label class="txtedit"> Starting date</label><br>
            <input class="edit" type="date" id="edittstartingdate" name="edittstartingdate"><br><br>

            <label class="txtedit"> Type of employee</label><br>
            <label class="txtedit"> Educational Staff</label>
            <input class="edit" type="radio" id="edittemployeetypeeducation" name="edittemployeetype" value="Education"><br>
            <label class="txtedit"> Managing Staff</label>
            <input class="edit" type="radio" id="edittemployeetypemanagement" name="edittemployeetype" value="Management"><br><br>

            <label class="txtedit"> Is the employee Married?</label><br>
            <label class="txtedit"> Yes</label>
            <input class="edit" type="radio" id="edittmarriedtrue" name="edittmarried" value="1"><br>
            <label class="txtedit"> No</label>
            <input class="edit" type="radio" id="edittmarriedfalse" name="edittmarried" value="0"><br><br>

            <label class="txtedit"> Number of kids</label><br>
            <input class="edit" type="number" id="edittkids" name="edittkids" placeholder="Type in the number of kids"><br><br>

            <label class="txtedit"> Amount of contract payment</label><br>
            <input class="edit" type="number" id="edittpaymentamount" name="edittpaymentamount" placeholder="Type in the amount of payment"><br><br>

            <label class="txtedit"> Start of contract</label><br>
            <input class="edit" type="date" id="edittstartofcontract" name="edittstartofcontract"><br><br>

            <label class="txtedit"> End of contract</label><br>
            <input class="edit" type="date" id="edittendofcontract" name="edittendofcontract"><br><br>

            <button class="btn" class="btn" type="submit" name="edittSubmit" value="Call Servlet">Submit</button>
        </form>

        <form id="editpinfo" style="display: none" method="post" action="Servlets.EditForm">
            <br>
            <label class="txtedit"> IBAN</label><br>
            <input class="edit" type="text" id="editpiban" name="editpiban" placeholder="Type in the IBAN"><br><br>

            <label class="txtedit"> Name</label><br>
            <input class="edit" type="text" id="editpname" name="editpname" placeholder="Type in the name"><br>

            <label class="txtedit"> Address</label><br>
            <input class="edit" type="text" id="editpaddress" name="editpaddress" placeholder="Type in the address"><br>

            <label class="txtedit"> Phone number</label><br>
            <input class="edit" type="number" id="editpphonenumber" name="editpphonenumber" placeholder="Type in the phone number"><br><br>

            <label class="txtedit"> Bank name</label><br>
            <input class="edit" type="text" id="editpbankname" name="editpbankname" placeholder="Type in the bank's name"><br>

            <label class="txtedit"> Department</label><br>
            <input class="edit" type="text" id="editpdepartment" name="editpdepartment" placeholder="Type in the department"><br>

            <label class="txtedit"> Starting date</label><br>
            <input class="edit" type="date" id="editpstartingdate" name="editpstartingdate"><br><br>

            <label class="txtedit"> Type of employee</label><br>
            <label class="txtedit"> Educational Staff</label>
            <input class="edit" type="radio" id="editpemployeetypeeducation" name="editpemployeetype" value="Education"><br>
            <label class="txtedit"> Managing Staff</label>
            <input class="edit" type="radio" id="editpemployeetypemanagement" name="editpemployeetype" value="Management"><br><br>

            <label class="txtedit"> Is the employee Married?</label><br>
            <label class="txtedit"> Yes</label>
            <input class="edit" type="radio" id="editpmarriedtrue" name="editpmarried" value="1"><br>
            <label class="txtedit"> No</label>
            <input class="edit" type="radio" id="editpmarriedfalse" name="editpmarried" value="0"><br><br>

            <label class="txtedit"> Number of kids</label><br>
            <input class="edit" type="number" id="editpkids" name="editpkids" placeholder="Type in the number of kids"><br><br>

            <label class="txtedit"> Amount of contract payment</label><br>
            <input class="edit" type="number" id="editppaymentamount" name="editppaymentamount" placeholder="Type in the amount of payment"><br><br>

            <button class="btn" type="submit" name="editpSubmit" value="Call Servlet">Submit</button>
        </form>
        <br>

        <form id="deleteemp" style="display: none" method="post" action="Servlets.Servlet">
            <label class="txtedit"> Delete Temporary Employee by IBAN </label><br>
            <input class="edit" type="text" id="diban" name="diban"><br>
            <br><button class="btn" type="submit" name="dSubmit" value="Call Servlet">Delete</button>
        </form>

        <form id="temp" style="display: none" method="get" action="Servlets.Servlet" >
            <label class="txtedit"> IBAN</label><br>
            <input class="edit" type="text" id="tiban" name="tiban" placeholder="Type in the IBAN"><br><br>

            <label class="txtedit"> Name</label><br>
            <input class="edit" type="text" id="tname" name="tname" placeholder="Type in the name"><br>

            <label class="txtedit"> Address</label><br>
            <input class="edit" type="text" id="taddress" name="taddress" placeholder="Type in the address"><br>

            <label class="txtedit"> Phone number</label><br>
            <input class="edit" type="number" id="tphonenumber" name="tphonenumber" placeholder="Type in the phone number"><br><br>

            <label class="txtedit"> Bank name</label><br>
            <input class="edit" type="text" id="tbankname" name="tbankname" placeholder="Type in the bank's name"><br>

            <label class="txtedit"> Department</label><br>
            <input class="edit" type="text" id="tdepartment" name="tdepartment" placeholder="Type in the department"><br>

            <label class="txtedit"> Starting date</label><br>
            <input class="edit" type="date" id="tstartingdate" name="tstartingdate"><br><br>

            <label class="txtedit"> Type of employee</label><br>
            <label class="txtedit"> Educational Staff</label>
            <input class="edit" type="radio" id="temployeetypeeducation" name="temployeetype" value="Education"><br>
            <label class="txtedit"> Managing Staff</label>
            <input class="edit" type="radio" id="temployeetypemanagement" name="temployeetype" value="Management"><br><br>

            <label class="txtedit"> Is the employee Married?</label><br>
            <label class="txtedit"> Yes</label>
            <input class="edit" type="radio" id="tmarriedtrue" name="tmarried" value="1"><br>
            <label class="txtedit"> No</label>
            <input class="edit" type="radio" id="tmarriedfalse" name="tmarried" value="0"><br>

            <label class="txtedit"> Number of kids</label><br>
            <input class="edit" type="number" id="tkids" name="tkids" placeholder="Type in the number of kids"><br><br>

            <label class="txtedit"> Amount of contract payment</label><br>
            <input class="edit" type="number" id="tpaymentamount" name="tpaymentamount" placeholder="Type in the amount of payment"><br><br>

            <label class="txtedit"> Start of contract</label><br>
            <input class="edit" type="date" id="tstartofcontract" name="tstartofcontract"><br><br>

            <label class="txtedit"> End of contract</label><br>
            <input class="edit" type="date" id="tendofcontract" name="tendofcontract"><br><br>

            <button class="btn" type="submit" name="tSubmit" value="Call Servlet">Submit</button>
        </form>

        <form id="perm" style="display: none" method="get" action="Servlets.Servlet">
            <label class="txtedit"> IBAN</label><br>
            <input class="edit" type="text" id="piban" name="piban" placeholder="Type in the IBAN"><br><br>

            <label class="txtedit"> Name</label><br>
            <input class="edit" type="text" id="pname" name="pname" placeholder="Type in the name"><br>

            <label class="txtedit"> Address</label><br>
            <input class="edit" type="text" id="paddress" name="paddress" placeholder="Type in the address"><br>

            <label class="txtedit"> Phone number</label><br>
            <input class="edit" type="number" id="pphonenumber" name="pphonenumber" placeholder="Type in the phone number"><br><br>

            <label class="txtedit"> Bank name</label><br>
            <input class="edit" type="text" id="pbankname" name="pbankname" placeholder="Type in the bank's name"><br>

            <label class="txtedit"> Department</label><br>
            <input class="edit" type="text" id="pdepartment" name="pdepartment" placeholder="Type in the department"><br>

            <label class="txtedit"> Starting date</label><br>
            <input class="edit" type="date" id="pstartingdate" name="pstartingdate"><br><br>

            <label class="txtedit"> Type of employee</label><br>
            <label class="txtedit"> Educational Staff</label>
            <input class="edit" type="radio" id="pemployeetypeeducation" name="pemployeetype" value="Education"><br>
            <label class="txtedit"> Managing Staff</label>
            <input class="edit" type="radio" id="pemployeetypemanagement" name="pemployeetype" value="Management"><br><br>

            <label class="txtedit"> Is the employee Married?</label><br>
            <label class="txtedit"> Yes</label>
            <input class="edit" type="radio" id="pmarriedtrue" name="pmarried" value="1"><br>
            <label class="txtedit"> No</label>
            <input class="edit" type="radio" id="pmarriedfalse" name="pmarried" value="0"><br>

            <label class="txtedit"> Number of kids</label><br>
            <input class="edit" type="number" id="pkids" name="pkids" placeholder="Type in the number of kids"><br><br>

            <button class="btn" type="submit" name="pSubmit" value="Call Servlet">Submit</button>

        </form>
    </center>
</div>
</body>

</html>