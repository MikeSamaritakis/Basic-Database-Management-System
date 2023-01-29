    function showPerm(){
        hideTemp();
        hideDel();
        hideEdittemp();
        hideEditperm();
        hidepayment();
        hideEditPayment();
        hideDelperm();
        document.getElementById("perm").style.display = "block";
    }

    function reloadpage(){
        location.reload();
    }

    function hidePerm(){
        document.getElementById("perm").style.display = "none";
    }

    function showTemp(){
        hidePerm();
        hideDel();
        hideEdittemp();
        hideEditperm();
        hidepayment();
        hideEditPayment();
        hideDelperm();
        document.getElementById("temp").style.display = "block";
    }

    function showEdittemp(){
        hideTemp();
        hidePerm();
        hideDel();
        hideEditperm();
        hidepayment();
        hideEditPayment();
        hideDelperm();
        document.getElementById("edittinfo").style.display = "block";
    }

    function  hideEdittemp(){
        document.getElementById("edittinfo").style.display = "none";
    }

    function showEditperm(){
        hideTemp();
        hidePerm();
        hideDel();
        hideEdittemp();
        hidepayment();
        hideEditPayment();
        hideDelperm();
        document.getElementById("editpinfo").style.display = "block";
    }

    function  hideEditperm(){
        document.getElementById("editpinfo").style.display = "none";
    }

    function showpayment(){
        hideTemp();
        hidePerm();
        hideDel();
        hideEdittemp();
        hideEditperm();
        hideEditPayment();
        hideDelperm();
        document.getElementById("payment").style.display = "block";
    }

    function  hidepayment(){
        document.getElementById("payment").style.display = "none";
    }

    function hideTemp(){
        document.getElementById("temp").style.display = "none";
    }

    function showDel(){
        hideTemp();
        hidePerm();
        hideEdittemp();
        hideEditperm();
        hidepayment();
        hideEditPayment();
        hideDelperm();
        document.getElementById("deleteemp").style.display = "block";
    }

    function hideDel(){
        document.getElementById("deleteemp").style.display = "none";
    }

    function hideDelperm(){
        document.getElementById("deleteperm").style.display = "none";
    }

    function showDelperm(){
        hideTemp();
        hidePerm();
        hideEdittemp();
        hideEditperm();
        hidepayment();
        hideEditPayment();
        hideDelperm();
        document.getElementById("deleteemp").style.display = "block";
    }

    function showEditPayment(){
        hideDel();
        hideTemp();
        hidePerm();
        hideEdittemp();
        hideEditperm();
        hidepayment();
        hideDelperm();
        document.getElementById(("EditPayment")).style.display = "block";
    }

    function hideEditPayment(){
        document.getElementById(("EditPayment")).style.display = "none";
    }

    function hideAll(){
        hideTemp();
        hidePerm();
        hideDel();
        hideEdittemp();
        hideEditperm();
        hidepayment();
        hideEditPayment();
        hideDelperm();
    }
