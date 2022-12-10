var noOfDays = null;
var noOfPersons = null;
var type = null;
var result;
function myFunction() {
    // alert();
    noOfDays = document.getElementById('x1').value;
    noOfPersons = document.getElementById('x2').value;
    type = document.getElementById('Type-of-Stay').value;

    // console.log(typeof type);
    // console.log(noOfDays, noOfPersons,type);

    switch (type) {

        case "Economy":
            result = noOfDays * noOfPersons * 500;
            break;

        case "Business":
            if(noOfDays > 3)
            {
                result = ( noOfDays * noOfPersons * 1000 ) - (noOfPersons * 100); 
            }
            else
            {
                result = noOfDays * noOfPersons * 1000;
            }
            break;

        case "Delux":
            if(noOfDays > 5)
            {
                result = ( noOfDays * noOfPersons * 2000 ) - (noOfPersons * 250); 
            }
            else
            {
                result = noOfDays * noOfPersons * 1000;
            }
            break;

        default:
            break;
    }

    document.getElementById('result').innerHTML = 'Total Expenses = &#2352; '+ result;
}