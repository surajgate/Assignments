var array = [];
var obb;
function myFunction() {


    var rollNo = document.getElementById('x1').value;
    var name = document.getElementById('x2').value;
    var age = document.getElementById('x3').value;

    // console.log(rollNo, name, age);

    var obj = {
        roll: rollNo,
        n: name,
        a: age
    }
    array.push(obj);
    console.log(array);

    // array.forEach(element => {

    //     var x = "";
    //     console.log(element);
    //     x = x + `
    //         <tr>
    //         <td>${element.roll}</td>
    //         <td>${element.n}</td>
    //         <td>${element.a}</td>
    //         </tr>
    //         `


    //     console.log(x);
    //     document.getElementById('result').innerHTML = x;
    // });
}

var x = "";
function print() {
    document.getElementById("t").style.visibility = "visible"


    for (var i = 0; i < array.length; ++i) {

        console.log(i);
        x = x + `
            <tr>
            <td>${array[i].roll}</td>
            <td>${array[i].n}</td>
            <td>${array[i].a}</td>
            </tr>
            `


        console.log(x);
        document.getElementById('result').innerHTML = x;
    }
}