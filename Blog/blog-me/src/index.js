import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import { createStore } from 'redux';
import { Provider } from 'react-redux';
import rootReducer from './modules/login';

// store : 저장공간(리듀서, state)
const store = createStore(rootReducer);

ReactDOM.render(
  // Provider 컴포넌트 사용하여 store 연동
 <Provider store={store}>
    <App />
  </Provider>,
  document.getElementById('root')
);

reportWebVitals();
