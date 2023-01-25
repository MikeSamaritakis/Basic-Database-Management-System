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

        <label> Employee type</label><br>
        <input type="text" id="temployeetype" name="temployeetype" placeholder="Type in the type of the employee"><br>

        <label> Is the employee Married?</label><br>
        <input type="hidden" id="tmarried2" name="tmarried" value="false">
        <input type="checkbox" id="tmarried" name="tmarried" checked="true"><br><br>

        <label> Amount of payment</label><br>
        <input type="number" id="tpaymentamount" name="tpaymentamount" placeholder="Type in the amount of payment"><br><br>

        <label> Date of payment</label><br>
        <input type="date" id="tpaymentdate" name="tpaymentdate"><br><br>

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
        <input type="number" id="pphonenumber" name="pphone number" placeholder="Type in the phone number"><br><br>

        <label> Bank name</label><br>
        <input type="text" id="pbankname" name="pbankname" placeholder="Type in the bank's name"><br>

        <label> Department</label><br>
        <input type="text" id="pdepartment" name="pdepartment" placeholder="Type in the department"><br>

        <label> Starting date</label><br>
        <input type="date" id="pstartingdate" name="pstartingdate"><br><br>

        <label> Employee type</label><br>
        <input type="text" id="pemployeetype" name="pemployeetype" placeholder="Type in the type of the employee"><br>

        <label> Is the employee Married?</label><br>
        <input type="hidden" id="pmarried2" name="pmarried" value="false">
        <input type="checkbox" id="pmarried" name="pmarried" checked="true"><br><br>

        <label> Amount of payment</label><br>
        <input type="number" id="ppaymentamount" name="ppaymentamount" placeholder="Type in the amount of payment"><br><br>

        <label> Date of payment</label><br>
        <input type="date" id="ppayment date" name="ppaymentdate"><br><br>

        <button type="submit" name="pSubmit" value="Call Servlet">Submit</button>
    </form>


</div>
</body>

</html>