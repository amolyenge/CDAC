import React, { useState } from 'react';

const TextInputL = () => {
  const [input, setInput] = useState('');
  const [list, setList] = useState([]);

  const handleBlur = () => {
    if (input.trim()) {
      setList(prev => [...prev, input.trim()]);
      setInput('');
    }
  };

  return (
    <div>
      <h2>Text Input to List</h2>
      <input
        type="text"
        value={input}
        onChange={e => setInput(e.target.value)}
        onBlur={handleBlur}
        placeholder="Type and click outside"
      />

      {list.length > 0 && (
        <ol style={{ marginTop: '10px' }}>
          {list.map((item, index) => (
            <li key={index}>{item}</li>
          ))}
        </ol>
      )}
    </div>
  );
};

export default TextInputL;
