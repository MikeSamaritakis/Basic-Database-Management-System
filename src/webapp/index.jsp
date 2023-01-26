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
    <center>  <h1> Hire Employee</h1> </center>
    <hr>
    <div class="buttonslogreg">
        <button type="submit" name="HireTemp" onclick='showTemp()'>Hire Temporary Employee</button>
        <button type="submit" name="HirePerm" onclick='showPerm()'>Hire Permanent Employee</button>
        <button type="submit" name="Hide" onclick='hideAll()'>Hide Current Form</button>
    </div>


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
        <input type="radio" id="temployeetypeeducation" name="temployeetype" value="Education"><br>
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

<%--        <label> Date of payment</label><br>--%>
<%--        <input type="date" id="tpaymentdate" name="tpaymentdate"><br><br>--%>

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
        <input type="radio" id="pemployeetypeeducation" name="pemployeetype" value="Education"><br>
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

<%--        <label> Date of payment</label><br>--%>
<%--        <input type="date" id="ppayment date" name="ppaymentdate"><br><br>--%>



        <button type="submit" name="pSubmit" value="Call Servlet">Submit</button>


    </form>


</div>
</body>

</html>