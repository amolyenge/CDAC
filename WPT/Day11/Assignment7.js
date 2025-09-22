const args = process.argv.slice(2);

if (args.length !== 10) {
  console.log("Please enter exactly 10 numbers.");
  process.exit(1);
}

const numbers = args.map(Number);

if (numbers.some(isNaN)) {
  console.log("Please enter valid numbers.");
  process.exit(1);
}

console.log("Numbers array:", numbers);

function isPrime(num) {
  if (num <= 1) return false;
  if (num === 2) return true;
  if (num % 2 === 0) return false;
  for (let i = 3; i <= Math.sqrt(num); i += 2) {
    if (num % i === 0) return false;
  }
  return true;
}

const sumEvenNumbers = numbers.filter(n => n % 2 === 0).reduce((a, b) => a + b, 0);

const sumEvenIndex = numbers.filter((_, idx) => idx % 2 === 0).reduce((a, b) => a + b, 0);

const sumPrimeNumbers = numbers.filter(isPrime).reduce((a, b) => a + b, 0);

console.log("Sum of even numbers:", sumEvenNumbers);
console.log("Sum of numbers at even indices:", sumEvenIndex);
console.log("Sum of prime numbers:", sumPrimeNumbers);
