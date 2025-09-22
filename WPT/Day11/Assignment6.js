const args = process.argv.slice(2);

function printPattern(n) {
  for (let i = n; i > 0; i--) {
    console.log('* '.repeat(i).trim());
  }
}

if (args.length !== 1) {
  console.error('Error: Please provide exactly one command line argument.');
  process.exit(1);
}

const n = Number(args[0]);

if (!Number.isInteger(n) || n < 1 || n > 5) {
  console.error('Error: Input must be an integer between 1 and 5.');
  process.exit(1);
}

printPattern(n);
