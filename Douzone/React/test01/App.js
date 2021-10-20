import React, {Component} from 'react';
import './App.css'

class App extends Component {
  constructor(props){
    super(props)
    this.state = {}
    console.log('1000');
  }
  static getDerivedStateFromProps(props,stat){
    console.log('2000');
    return {}
  }

  render() {
    console.log('2');
    return(
      <div>
        <h1>호랑이</h1>
      </div>
    );
  }
  componentDidMount(){
    console.log('4000');
  }
}



export default App;