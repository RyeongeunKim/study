import {combineReducers} from 'redux';
import bppReducer from '../modules/bpp';
import cppReducer from '../modules/cpp';

const rootReducer = combineReducers({
  bppReducer,
  cppReducer,
})

export default rootReducer;