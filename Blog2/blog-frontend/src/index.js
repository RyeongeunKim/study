import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';
import reportWebVitals from './reportWebVitals';
import createSagaMiddleware from 'redux-saga';
import { auth, authSaga } from './App';
import { createStore, applyMiddleware } from 'redux';
import { composeWithDevTools } from 'redux-devtools-extension';
import { Provider } from 'react-redux';

// saga 사용하기 위해서 Middleware 생성
const sagaMiddleware = createSagaMiddleware();
// reducer 담는 store 생성
const store = createStore(
  auth,
  composeWithDevTools(applyMiddleware(sagaMiddleware)),
);

// saga 실행
sagaMiddleware.run(authSaga);

ReactDOM.render(
  <Provider store={store}>
      <App />

  </Provider>,
  document.getElementById('root')
);

reportWebVitals();
