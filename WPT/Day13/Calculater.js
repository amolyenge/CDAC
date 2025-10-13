import React from 'react';

const Calculator = ({ num1, num2 }) => {
  return (
    <div>
      <h1>Results are</h1>
      <p>Addition of {num1} and {num2} is: {num1 + num2}</p>
      <p>Subtraction {num1} and {num2} is: {num1 - num2}</p>
      <p>Multiplication of: {num1 * num2}</p>
      <p>Division: {num1 / num2}</p>
    </div>
  );
};

export default Calculator;
