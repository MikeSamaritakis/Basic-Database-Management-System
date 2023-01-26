    function showPerm(){
        hideAll();
        document.getElementById("perm").style.display = "block";
    }

    function hidePerm(){
        document.getElementById("perm").style.display = "none";
    }

    function showTemp(){
        hideAll();
        document.getElementById("temp").style.display = "block";
    }

    function showEdittemp(){
        hideAll();
        document.getElementById("edittinfo").style.display = "block";
    }

    function  hideEdittemp(){
        document.getElementById("edittinfo").style.display = "none";
    }

    function showEditperm(){
        hideAll();
        document.getElementById("editpinfo").style.display = "block";
    }

    function  hideEditperm(){
        document.getElementById("editpinfo").style.display = "none";
    }

    function showpayment(){
        document.getElementById("payment").style.display = "block";
    }

    function  hidepayment(){
        hideAll();
        document.getElementById("payment").style.display = "none";
    }

    function hideTemp(){
        document.getElementById("temp").style.display = "none";
    }

    function showDel(){
        hideTemp();
        hidePerm();
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
