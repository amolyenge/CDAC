import React, { useState } from 'react';
import axios from 'axios';

const PTable = () => {
  const [posts, setPosts] = useState([]);
  const [loading, setLoading] = useState(false);

  const fetchPosts = async () => {
    setLoading(true);
    const response = await axios.get('https://jsonplaceholder.typicode.com/posts');
    setPosts(response.data);
    setLoading(false);
  };

  return (
    <div>
      <button onClick={fetchPosts}>Load Data</button>
      {posts.length > 0 && (
        <table border="2" cellPadding="10" style={{ marginTop: '20px'}}>
          <thead>
            <tr>
              <th>ID</th>
              <th>Title</th>
              <th>Body</th>
            </tr>
          </thead>
          <tbody>
            
            {posts.map(post => (
              <tr key={post.id}>
                <td>{post.id}</td>
                <td>{post.title}</td>
                <td>{post.body}</td>
              </tr>
            ))}

          </tbody>
        </table>
      )}
    </div>
  );
};

export default PTable;
