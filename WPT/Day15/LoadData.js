import React, { useState } from 'react';

const DataTable = () => {
  const [data, setData] = useState([]);
  const [showTable, setShowTable] = useState(false);

  const fetchData = async () => {
    try {
      const response = await fetch('https://jsonplaceholder.typicode.com/posts');
      const jsonData = await response.json();
      setData(jsonData);
      setShowTable(true);
    } catch (error) {
      console.error('Error fetching data:', error);
    }
  };

  const renderTableHeader = () => {
    if (data.length === 0) return null;
    return (
      <tr>
        {Object.keys(data[0]).map((key) => (
          <th key={key}>{key}</th>
        ))}
      </tr>
    );
  };

  const renderTableRows = () => {
    return data.map((item, index) => (
      <tr key={index}>
        {Object.values(item).map((value, i) => (
          <td key={i}>{value}</td>
        ))}
      </tr>
    ));
  };

  return (
    <div>
      <button onClick={fetchData}>Load Data</button>
      {showTable && (
        <table border="1" cellPadding="10" style={{ marginTop: '20px', borderCollapse: 'collapse' }}>
          <thead>{renderTableHeader()}</thead>
          <tbody>{renderTableRows()}</tbody>
        </table>
      )}
    </div>
  );
};

export default DataTable;
