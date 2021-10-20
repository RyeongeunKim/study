import React, { Component } from 'react';

class App extends Component {
  componentDidMount = async () => {
    const response = await fetch('http://date.jsontest.com/', {
      method: 'post',
      headers: {
        'Content-Type': 'application/json',
      },
      body: { a:"react", b:200 },
    });
    const body = await response.json();
    alert(body.date)
  }
  
  render() {
    return (
      <h1>fetch post</h1>
    );
  }
}


export default App;