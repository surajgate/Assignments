console.log("This is clock.js")
var a;
function updateClock(){
    // Get the current date
    let currentTime = new Date();

    // Extract hour, minute and seconds from the date
    let currentHour = currentTime.getHours();
    let currentMinutes = currentTime.getMinutes();
    let currentSeconds = currentTime.getSeconds();

    var month = currentTime.getMonth();
    var day = currentTime.getDay();
    var year = currentTime.getFullYear();

    var output = month + '/' + day + '/' + year 
    document.getElementById("date").innerHTML = output;

    // Pad 0 if minute or second is less than 10 (single digit)
    currentMinutes = (currentMinutes < 10 ? "0": "") + currentMinutes;
    currentSeconds = (currentSeconds < 10 ? "0": "") + currentSeconds; 

    // Convert railway clock to AM/PM clock
    currentHour = (currentHour>12) ? currentHour - 12 : currentHour;
    currentHour = (currentHour==0) ?  12 : currentHour;
    
    // Choose AM/PM as per the time of the day
    let timeOfDay = (currentHour < 12 ) ? "AM" : "PM";

    // Prepare the time string from hours, minutes and seconds
    let currentTimeStr = currentHour + ":" + currentMinutes  
                        + ":" + currentSeconds + " " + timeOfDay;

    // Insert the time string inside the DOM
    document.getElementById("result").innerHTML = currentTimeStr;
    //  a = setInterval('updateClock()', 1000);
     console.log(typeof a);
    }
    function start(){
        a = setInterval('updateClock()', 1000);
    }
    function stop(){
        // alert();
        console.log(typeof a);
        clearInterval(a);        
    }
 

