import React, { Component } from 'react';
import BppContainer from './containers/BppContainer';

class App extends Component {
  render() {
    let action = {payload:{a:1,b:2}}
    console.log(action.payload.a);

    let {payload} = {payload:{a:1,b:2}}
    console.log(payload.a, payload.b);

    return (
      <div>
        <h1>App</h1>
        <BppContainer/>
      </div>
    );
  }
}

export default App;