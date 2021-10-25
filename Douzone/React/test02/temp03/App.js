import React, { Component } from 'react';

import BppContainer from './containers/BppContainer';
import CppContainer from './containers/CppContainer';

class App extends Component {
  render() {
    return (
      <div>
        <h1>App</h1>
        <BppContainer/>
        <CppContainer/>
      </div>
    );
  }
}

export default App;