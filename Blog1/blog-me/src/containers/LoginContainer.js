import axios from 'axios';
import { useDispatch, useSelector } from 'react-redux';
import Login from "../components/Login";
import { action_ok, action_ng } from "../modules/login";

const LoginContainer = () => {

    // useSelector : 스토어에서 상태값가져오기
    // state : 컴포넌트가 가지는 상태값
    const msg = useSelector((state) => state.msg);

    // dispatch : 리듀서로 값 전달
    // dispatch 인스턴스 생성
    const dispatch = useDispatch();

    function onClick(){

        // axios? 서버 HTTP 비동기 통신 모듈
        // axios와 fetch 함수는 promise 객체 기반이기 때문에 then, catch 함수로 처리할 수 있다
        // URL로 post 방식으로 요청
        axios.post('/api/auth/login',
            {
                // 서버로 값 전달
                //num: 1,
                uid: 'kre',
                pwd: '1234'
            }
            // 서버로 부터 온 응답객체
        ).then((response) => { 
            const strStatus = response.data
            console.log(strStatus, typeof(strStatus));
            if(strStatus==='OK'){
                // 응답코드가 200이면 dispatch로 tiger 액션 발생
                console.log('dispatch 200');
                dispatch(action_ok());
            }
            else{
                // 200이 아니면 lion 액션 발생
                console.log('dispatch error');
                dispatch(action_ng());
            }
        })
    };

    return (
        // Login -> 컨테이너의 자식 컴포넌트
        <Login
            // 자식에게 값 전달
            msg={msg}
            onClick={()=>{onClick()}}
        />
    );
};

export default LoginContainer;