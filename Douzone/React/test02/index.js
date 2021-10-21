import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

// App 안에 reduce 함수를 들고와라
import {reducers} from './App'; 
import {createStore} from 'redux';
import {Provider} from 'react-redux';

const store = createStore(reducers);

ReactDOM.render(
  <Provider store={store}>
    <App />,
  </Provider>,
  document.getElementById('root')
);

reportWebVitals();
