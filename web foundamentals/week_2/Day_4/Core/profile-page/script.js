console.log("page loaded...");
function change(){
    var name=document.querySelector("#naj")
    name.innerHTML="najem eddine";
}

function remove(){
    var card1=document.querySelector("#num1")
    card1.remove();
    
    var i=document.querySelector(".badge")
    i.innerHTML=1;
}

function remove1(){
    var card1=document.querySelector("#num2")
    card1.remove();
    var i=document.querySelector(".badge")
    i.innerHTML=0;
}


