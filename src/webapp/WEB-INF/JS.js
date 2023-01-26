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
    }
