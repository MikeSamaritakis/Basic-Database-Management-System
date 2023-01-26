    function showPerm(){
        hideTemp();
        hideDel();
        hideEdittemp();
        hideEditperm();
        hidepayment();
        document.getElementById("perm").style.display = "block";
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
        document.getElementById("temp").style.display = "block";
    }

    function showEdittemp(){
        hideTemp();
        hidePerm();
        hideDel();
        hideEditperm();
        hidepayment();
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
        document.getElementById("deleteemp").style.display = "block";
    }

    function hideDel(){
        document.getElementById("deleteemp").style.display = "none";
    }

    function hideAll(){
        hideTemp();
        hidePerm();
        hideDel();
        hideEdittemp();
        hideEditperm();
        hidepayment();
    }
