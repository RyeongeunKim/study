import React, { Component } from 'react';

class Counter extends Component {
    // 컴포넌트의 생성자 메서드
    constructor(props){

        // constuctor 작성 시 반드시 super(props) 호출해야함
        // 이 함수 호출 시 Component 클래스가 지닌 생성자 함수를 호출함
        super(props); 

        // state의 초깃값 설정하기
        // 컴포넌트의 state는 객체 형식이어야 한다.
        this.state = {
            number: 0
        };
    }

    render() {
        const { number } = this.state; // state를 조회할 때는 this.state로 조회한다.
        return (
            <div>
                <h1>{number}</h1>
                <button
                // onClick을 통해 버튼이 클릭되었을 때 호출된 함수를 지정한다.
                onClick={() => {
                    this.setState({ number: number + 1});
                }}
                >
                +1
                </button>
            </div>
        );
    }
}

export default Counter;