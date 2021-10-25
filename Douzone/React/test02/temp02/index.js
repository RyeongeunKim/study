import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

import {combineReducers, createStore} from 'redux';
import {Provider} from 'react-redux';

import bppReducer from './modules/bpp';
import cppReducer from './modules/cpp';

const rootReducer = combineReducers({
  bppReducer,
  cppReducer,
})

const store = createStore(rootReducer);

ReactDOM.render(
  <Provider store={store}>
    <App />
  </Provider>,
  document.getElementById('root')
);
reportWebVitals();

