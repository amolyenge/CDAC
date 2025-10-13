import React, { useEffect } from 'react';

const Lifecycle = () => {
  useEffect(() => {
    console.log('Component Mounted');

    return () => {
      console.log('Component Unmounted');
    };
  }, []);

  useEffect(() => {
    console.log('Component Updated');
  });

  return (
    <div>
      <h2>Lifecycle </h2>
      <p>Hello</p>
    </div>
  );
};

export default Lifecycle;
