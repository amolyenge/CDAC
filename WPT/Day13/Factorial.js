import React from 'react';

const Factorial = ({ number }) => {
  const calculateFactorial = (n) => {
    if (n < 0) return 'only positive is allowed';
    if (n === 0 || n === 1) return 1;
    let result = 1;
    for (let i = 2; i <= n; i++) {
      result *= i;
    }
    return result;
  };

  return (
    <div>
      <h3>Factorial of {number} is: {calculateFactorial(number)}</h3>
    </div>
  );
};

export default Factorial;
