import React, { useState, useEffect } from 'react';

const CounterTable = () => {
  const [count, setCount] = useState(0);
  const [tableData, setTableData] = useState([]);

  useEffect(() => {
    if (count > 0) {
      setTableData(prev => [...prev, count]);
    }
  }, [count]);

  return (
    <div>
      <h2>Counter in Table</h2>
      <p>Count: {count}</p>
      <button onClick={() => setCount(count + 1)}>Increment</button>

      {tableData.length > 0 && (
        <table border="1" style={{ marginTop: '10px' }}>
          <thead>
            <tr>
              <th>no</th>
              <th>Value</th>
            </tr>
          </thead>
          <tbody>
            {tableData.map((val, index) => (
              <tr key={index}>
                <td>{index + 1}</td>
                <td>{val}</td>
              </tr>
            ))}
          </tbody>
        </table>
      )}
    </div>
  );
};

export default CounterTable;
