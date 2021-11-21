import { createAction, handleActions } from "redux-actions";
import * as api from '../../../lib/api/myInfo/myInfo'
import createRequestThunk from '../../../lib/api/myInfo/createRequestThunk'

// 액션 타입 선언
// 한 요청당 세 개를 만들어야 한다.
const GET_EMAIL = 'myinfo/GET_EMAIL';
const GET_EMAIL_SUCCESS = 'myinfo/GET_EMAIL_SUCCESS';
const GET_EMAIL_FAILURE = 'myinfo/GET_EMAIL_FAILURE';

const UPDATE_EMAIL = 'myinfo/UPDATE_EMAIL';
const UPDATE_EMAIL_SUCCESS = 'myinfo/UPDATE_EMAIL_SUCCESS';
const UPDATE_EMAIL_FAILURE = 'myinfo/UPDATE_EMAIL_FAILURE';

const SET_PHONE = 'myinfo/SET_PHONE';

const GET_PW = 'myinfo/GET_PW';
const GET_PW_SUCCESS = 'myinfo/GET_PW_SUCCESS';
const GET_PW_FAILURE = 'myinfo/GET_PW_FAILURE';

// thunk 함수 생성
// thunk 함수 내부에서는 시작할 때, 성공했을 때, 실패했을 때 다른 액션을 디스패치한다.

export const getEmail = createRequestThunk(GET_EMAIL, api.getEmail);
export const updateEmail = createRequestThunk(UPDATE_EMAIL, api.updateEmail);
export const setPhone = createAction(SET_PHONE, phone => phone);
export const getPw = createRequestThunk(GET_PW, api.getPw);

// 초기 상태를 선언한다
// 요청의 로딩 중 상태는 loading이라는 객체에서 관리한다.

const initialState = {
  email: null,
  phone: null,
  pw: null
};

const myinfo = handleActions(
  {
    [GET_EMAIL_SUCCESS]: (state, action) => ({
      ...state,
      email: action.payload
    }),
    [GET_EMAIL_FAILURE]: (state, action) => ({
      ...state
    }), 
    [UPDATE_EMAIL_SUCCESS]: (state, action) => ({
      ...state,
      email: action.payload
    }),
    [UPDATE_EMAIL_FAILURE]: (state, action) => ({
      ...state
    }), 
    [SET_PHONE]: (state, { payload: phone }) => ({
      ...state,
      phone,
    }),
    [GET_PW_SUCCESS]: (state, action) => ({
      ...state,
      pw: action.payload
    }),
    [GET_PW_FAILURE]: (state, action) => ({
      ...state
    }), 
  },
  initialState
);

export default myinfo;

