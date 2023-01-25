    function showPerm(){
        document.getElementById("perm").style.display = "block";
        hideTemp();
    }

    function hidePerm(){
        document.getElementById("perm").style.display = "none";
    }

    function showTemp(){
        document.getElementById("temp").style.display = "block";
        hidePerm();
    }

    function hideTemp(){
        document.getElementById("temp").style.display = "none";
    }

    function hideAll(){
    hideTemp();
    hidePerm();
    }



