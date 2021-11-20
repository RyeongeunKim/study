import { createAction, handleActions } from "redux-actions";
import { takeLatest } from 'redux-saga/effects';
import createRequestSaga, {
  createRequestActionTypes
} from '../../../lib/api/createRequestSaga';
import * as myinfoAPI from '../../../lib/api/myinfo'

const READPHONE = "myinfo/READPHONE";
//const READEMAIL = "myinfo/READEMAIL";

const [
  READEMAIL,
  READEMAIL_SUCCESS,
  READEMAIL_FAILURE,
] = createRequestActionTypes('post/READ_POST');

export const readPhone = createAction(READPHONE, userPhone => userPhone);

export const readEmail = createAction(READEMAIL, u_phone => u_phone);

// saga 생성
const readEmailSaga = createRequestSaga(READEMAIL, myinfoAPI.readEmail);
export function* myinfoSaga(){
  yield takeLatest(READEMAIL, readEmailSaga);
}

const initialState = {
  readEmail: {
    userEmail: '',
  },
  readPhone: {
    userPhone: '',
  },
  error: null,
};

const myinfo = handleActions(
  {
  // 이메일 select 성공
  [READEMAIL_SUCCESS]: (state, { payload: readEmail }) => ({
    ...state,
    readEmail,
    error: null,
  }),
  
  
  // 이메일 select 실패
  [READEMAIL_FAILURE]: (state, { payload: readEmail }) => ({
    ...state,
    readEmail,
    error: null,
  }),
  [READPHONE]: (state, { payload: readPhone }) => ({
    ...state,
    readPhone,
    }),    
  },
  initialState
);

export default myinfo;

// export const myinfo1 = handleActions(
//   {
//     [READ_MYINFO]: (state, { payload: userInfo }) => ({
//       //...state,
//       userInfo,
//     }),
//   },
//   initialState
// );

