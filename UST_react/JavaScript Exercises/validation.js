
function submitForm(){
    event.preventDefault();
let email=document.getElementById("email").value;
let nameval=document.getElementById("name").value;
let purpose=document.getElementById("purpose").value;
let remark=document.getElementById("remark").value;
    if(email.length==0){
     document.getElementById("err-email").style.visibility="visible";
    }
    if(nameval.length==0){
        document.getElementById("err-name").style.visibility="visible";
       }
       if(purpose.length==0){
        document.getElementById("err-purpose").style.visibility="visible";
       }
       if(remark.length==0){
        document.getElementById("err-remark").style.visibility="visible";
       }
    
}