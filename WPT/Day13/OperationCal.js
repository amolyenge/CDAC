import React from 'react';

const OperationCal = ({ num1, num2, operation }) => {
  const calculate = () => {
    switch (operation) {
      case 'addition':
        return num1 + num2;

      case 'substraction':
        return num1 - num2;

      case 'multiplication':
        return num1 * num2;

      case 'division':
          
    }
  };

  return (
    <div>
      <h1>operation is : {operation}</h1>
      <p>result of {num1} {operation} {num2}: {calculate()}</p>
    </div>
  );
};

export default OperationCal;
