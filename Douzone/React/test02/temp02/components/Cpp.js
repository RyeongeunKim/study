import React, { Component } from "react";

class Bpp extends Component {
  render() {
    return (
      <div className="background-color">
        <h1>This is Cpp.js</h1>
        <h3>{this.props.num}</h3>
        <button onClick={this.props.onInc}>λ§μ</button>
        <button onClick={this.props.onDec}>λΊμ</button>
      </div>
    );
  }
}
export default Bpp;