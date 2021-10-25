import React, { Component } from "react";

class Bpp extends Component {
  render() {
    return (
      <div className="background-color">
        <h1>This is Bpp.js</h1>
        <h3>{this.props.num}</h3>
        <button onClick={this.props.onInc}>증가</button>
        <button onClick={this.props.onDec}>감소</button>
      </div>
    );
  }
}
export default Bpp;