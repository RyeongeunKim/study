import React, { Component } from 'react';
import { connect } from 'react-redux';

class App extends Component {
  render() {
    return (
      <div>
        <h1>호랑이</h1>
        <h1>{this.props.num}</h1>
        <button onClick={this.props.onInc}>버튼</button>
      </div>
    );
  }
}
// App : 이전값과 변경값이 동일하면 App로 안간다.
const stateToProps = state => {
  console.log('stateToProps', state.num);
  return {num:state.num}; // num -> tttt도 가능
}

const dispatchToProps = dispatch => {
  return {
    //f1:()=>{}
    // f1함수가 호출이 되면 'INC'문자열을 전송하시오
    // 어디에? reducers
    // f1:()=>{dispatch({type:'INC'});}
    onInc:()=>{
      console.log('dispatchToProps');
      dispatch({type:'INC'});
    }
  };
}

// store ------>> num : 100
export function reducers(state={num:100}, action){
  console.log('reducers', action.type);
  return { num:state.num + 1 } // num 변경하면 안됨
}
// store <<------ num : 101
export default App = connect(
  stateToProps,
  dispatchToProps
)(App);