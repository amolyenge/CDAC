const divide = (a, b) => {
  if (b === 0) {
    return 'Error: Division by zero';
  }
  return a / b;
};

console.log(divide(10,0));