import React, { Component } from 'react';

class TextTrans extends Component {
  constructor(props) {
    super(props);
    this.state = {
      text: ''
    };
  }

  handleChange = (event) => {
    this.setState({ text: event.target.value });
  };

  handleUpperCase = () => {
    console.log(this.state.text.toUpperCase());
  };

  handleLowerCase = () => {
    console.log(this.state.text.toLowerCase());
  };

  render() {
    return (
      <div style={{ padding: '20px' }}>
        <input
          type="text"
          value={this.state.text}
          onChange={this.handleChange}
          placeholder="Enter text here"
        />
        <br /><br />
        <button onClick={this.handleUpperCase}>Upper Case</button>
        <button onClick={this.handleLowerCase} style={{ marginLeft: '10px' }}>
          Lower Case
        </button>
      </div>
    );
  }
}

export default TextTrans;
