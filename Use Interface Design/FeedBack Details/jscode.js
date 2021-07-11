var Feedback=[];
function addFeedback(){
    var string=document.getElementById("feedback").value;
    Feedback.push(string);
 document.getElementById("feedback").value = "";
    document.getElementById("result").innerHTML = "<h2>" + "Feedback Details " + "</h2>"+"Successfully Added Feedback Details!";
}
 
function displayFeedback(){
    document.getElementById("result").innerHTML="";
  document.getElementById("result").innerHTML += "<h2>" + "Feedback Details " + "</h2>";
    for (var i=0;i<Feedback.length;i++) {
        document.getElementById("result").innerHTML += "Feedback " + (i+1) + "<br>"+Feedback[i]+"<br>";
    }
    Feedback=[];
}
