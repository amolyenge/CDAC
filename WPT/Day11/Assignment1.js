const args = process.argv.slice(2)
if(args === 0){
    console.log("Enter a  Number");
    process.exit(1);
}

const num = parseInt(args[0]);

if(isNaN(num) || num < 0){
    console.log("Please Enter the non negative number.")
    process.exit(1);
}

function fact(num){
    if(num == 0 || num == 1){
        return 1;
    }

    return num * fact(num - 1);
}

console.log(`The Factorial of Number is : ${fact(num)}`);
