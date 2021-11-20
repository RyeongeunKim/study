import { createAction, handleActions } from "redux-actions";
import * as myinfoAPI from '../../../lib/api/myinfo'

const READPHONE = "myinfo/READPHONE";
const READEMAIL = "myinfo/READEMAIL";
const GETEMAIL = "myinfo/GETEMAIL";

const initialState = {
  readEmail: {
    userEmail: '',
  },
  readPhone: {
    userPhone: '',
  },
  getEmail: {
    userEmail: '',
  },
};

export const readPhone = createAction(READPHONE, userPhone => userPhone);
export const readEmail = createAction(READEMAIL, userEmail => userEmail);
export const getEmail = createAction(GETEMAIL, myinfoAPI.getEmail);

export const myinfo = handleActions(
  {
  [READEMAIL]: (state, action) => ({
    ...state,
    readEmail: action.payload,
    }),
  [READPHONE]: (state, action) => ({
    ...state,
    readPhone,
    }),    
  [GETEMAIL]: (state, { payload: getEmail }) => ({
    ...state,
    getEmail,
    }),    
  },
  initialState
);


// export const myinfo1 = handleActions(
//   {
//     [READ_MYINFO]: (state, { payload: userInfo }) => ({
//       //...state,
//       userInfo,
//     }),
//   },
//   initialState
// );
