import React, { useState } from 'react';

function genPassword(length = 8) {
  const letters = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ';
  const numbers = '0123456789';
  const symbols = '!@#$%&*_?';
  const allChars = letters + numbers + symbols;

  let password = '';
  for (let i = 0; i < length; i++) {
    const randomChar = allChars[Math.floor(Math.random() * allChars.length)];
    password += randomChar;
  }
  return password;
}

function PassGenerator() {
  const [password, setPassword] = useState('');

  const handleGenerate = () => {
    const newPassword = genPassword(8);
    setPassword(newPassword);
  };

  return (
    <div style={{ fontFamily: 'Arial', padding: '20px' }}>
      <h2>Password Generator</h2>
      <button onClick={handleGenerate} style={{ padding: '10px 20px', fontSize: '16px' }}>
        Generate
      </button>
      {password && (
        <p style={{ marginTop: '20px', fontSize: '18px' }}>
          <strong>Password:</strong> {password}
        </p>
      )}
    </div>
  );
}

export default PassGenerator;
