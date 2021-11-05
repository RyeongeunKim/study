import React from 'react';
import { useDispatch } from 'react-redux';
import { createAction, handleActions } from 'redux-actions';
import axios from 'axios';
import { takeLatest, put, call } from 'redux-saga/effects';
import { useSelector } from 'react-redux';
import produce from 'immer';

const initialState = {
  login: {
    username: '',
    password: ''
  },
  auth: null,
  authError: null,
  result: ''
};

const createRequestActionTypes = type => {
  const SUCCESS = `${type}_SUCCESS`;
  const FAILURE = `${type}_FAILURE`;
  return [type, SUCCESS, FAILURE];
};

function createRequestSaga(type, request) { //type : REGISTER, request: API
  const SUCCESS = `${type}_SUCCESS`;
  const FAILURE = `${type}_FAILURE`;

  return function*(action) {
    const response = yield call(request, action.payload);
      console.log(response.data);
    if(response.data === 'OK2') {
      // 함수 호출
      yield put({
        type: SUCCESS,
        payload: response.data, //ok or ng
        meta: response,
      });
    } else {
      yield put({
        type: FAILURE,
        payload: response.data,
        meta: response,
      });
    }
  };
}

const CHANGE_FIELD = 'auth/CHANGE_FIELD';
const [LOGIN, LOGIN_SUCCESS, LOGIN_FAILURE] = createRequestActionTypes(
  'App/LOGIN'
);

const changeField = createAction(
  CHANGE_FIELD,
  ({ form, key, value }) => ({
    form, // register , login
    key, // username, password, passwordConfirm
    value // 실제 바꾸려는 값
  })
);

export const auth = handleActions(
  {
    [CHANGE_FIELD]: (state, { payload: { form, key, value } }) =>
      produce(state, draft => {
        draft[form][key] = value; // 예: state.register.username을 바꾼다
      }),
    // 로그인 성공
    [LOGIN_SUCCESS]: (state, { payload: auth }) => ({
      ...state,
      authError: null,
      auth: auth
    }),
    // 로그인 실패
    [LOGIN_FAILURE]: (state, { payload: error }) => ({
      ...state,
      authError: error,
    }),
  },
  initialState
);
const client = axios.create();

const authApi = ({ username, password }) =>
client.post('/api/auth/login', { username, password });

// saga 생성
// 수정하기
const loginSaga = createRequestSaga(LOGIN, authApi);

export function* authSaga() {
  yield takeLatest(LOGIN, loginSaga);  // put LOGIN_SUCCCESS 디스패치 발생
}

const App = () => {
  const dispatch = useDispatch();
  const { form, auth, authError } = useSelector((auth)=>({
    form: auth.login,
    auth: auth.auth,
    authError: auth.authError
  })); 

  const onSubmit = e => {
    e.preventDefault();
    // login액션에 payload 값 전달
    const { username, password } = form;
    console.log(username);
    console.log(password);
    dispatch(login({ username, password }));
  };

  const login = createAction(LOGIN, ({ username, password }) => ({
    username,
    password
  }));

  // 인풋 변경 이벤트 핸들러
  const onChange = e => {
    const { value, name } = e.target;
    dispatch(
      changeField({
        form: 'login',
        key: name,
        value,
      }),
    );
  };

  return (
      <form onSubmit={onSubmit} onChange={onChange}>
        <input 
          placeholder="이름"
          name="username"
        />
        <input 
          placeholder="패스워드"
          name="password"
        />
        <button type='submit'>제출</button>
        <h1>{authError === null ? auth : authError}</h1>
      </form>
  );
};
export default App;
