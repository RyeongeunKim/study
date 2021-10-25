import React, { Component } from "react";

class Bpp extends Component {
  render() {
    return (
      <div className="background-color">
        <h1>This is Cpp.js</h1>
        <h3>{this.props.num}</h3>
        <button onClick={this.props.onInc}>덧셈</button>
        <button onClick={this.props.onDec}>뺄셈</button>
      </div>
    );
  }
}
export default Bpp;