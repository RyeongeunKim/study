import { all } from '@redux-saga/core/effects';
import { combineReducers } from 'redux';
// // import { all } from 'redux-saga/effects';
// // import auth, { authSaga } from './auth/index';
//import {check} from './check/check';
//import {external} from './external/external';
import myinfo, {myinfoSaga} from './client/myinfo/myInfo'
// import list from './list/index';
// import myInfo from './myinfo/index';

// // const rootReducer = combineReducers({
// //   auth,
// //   check,
// //   external,
// //   list,
// //   myInfo,
// // });
const rootReducer = combineReducers({
  //external,
  myinfo,
});

export function* rootSaga() {
  //yield all([authSaga(), userSaga(), writeSaga(), postSaga(), postsSaga()]);
  yield all([myinfoSaga()]);
}

export default rootReducer;

