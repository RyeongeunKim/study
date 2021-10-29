import {createAction, handleActions} from 'redux-actions'

const ACTION_OK = 'ACTION_OK';
const ACTION_NG = 'ACTION_NG';
export const action_ok = createAction(ACTION_OK);
export const action_ng = createAction(ACTION_NG);
// state 초기값 설정
const initState = {
    msg:'FAIL',
}

// reducer
export default handleActions({
    [ACTION_OK]: (state, action) => ({msg: 'OK'}),
    [ACTION_NG]: (state, action) => ({msg: 'NG'})
    },
    initState
);