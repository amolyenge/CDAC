function calculate(...a) {
    let sum = 0;
    for (let i = 0; i < a.length; i++) {
        sum += a[i];
    }

    console.log("Addition of " + (a.length) + " numbers = " + sum);

}

// diaplaying only odd numbers.

function oddNum(...b){
    console.log("Odd numbers are: ")
    for(let i = 0; i < b.length; i++){
        if(b[i] % 2 != 0){
            console.log(b[i])
        }
    }
}

calculate(1,2,3,4,5,6,7,8,9)
calculate(2,4,6)
calculate(2,3)
calculate(3,4,5,6,7,8,9)

// odd numbers 
oddNum(1,2,3,4,5,6,7,8,9,10)
oddNum(2,4,5,67,8,9,0)
oddNum(87,65,43,67,88,98,55)