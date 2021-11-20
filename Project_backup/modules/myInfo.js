import { createAction, handleActions } from "redux-actions";

const READPHONE = "myinfo/READPHONE";
const READEMAIL = "myinfo/READEMAIL";

const initialState = {
  readEmail: {
    userEmail: '',
  },
  readPhone: {
    userPhone: '',
  }
};

export const readPhone = createAction(READPHONE, userPhone => userPhone);
export const readEmail = createAction(READEMAIL, userEmail => userEmail);

export const myinfo = handleActions(
  {
  [READEMAIL]: (state, { payload: readEmail }) => ({
    ...state,
    readEmail,
    }),
  [READPHONE]: (state, { payload: readPhone }) => ({
    ...state,
    readPhone,
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
