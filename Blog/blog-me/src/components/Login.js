import React, { Component } from "react";

class Login extends Component {
  render() {
    return (
      <div>
        <h1>Login</h1>
        {/* this.props.xxx -> 부모로 부터 값을 받음 */}
        <h3>{this.props.msg}</h3>
        <button onClick={this.props.onClick}>로그인</button>
      </div>
    );
  }
}
export default Login;