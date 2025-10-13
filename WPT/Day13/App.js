import React from 'react';
import Factorial from './Factorial';
import Calculator from './Calculator';
import OperationCal from './OperationCal';
import {FirstComponent }from './Components'
import { SecondComponent } from './Components';
import { ThirdComponent } from './Components';
import TextTrans from './TextTrans';

function App() {
  return (
    <div>
      <Factorial number={5} />
      <Calculator num1={11} num2={2} />
      <OperationCal num1={12} num2={6} operation={'division'} />
      <FirstComponent/>
      <SecondComponent/>
      <ThirdComponent/>
      <TextTrans/>
    </div>
  );
}

export default App;
