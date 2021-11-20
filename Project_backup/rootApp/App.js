// /*
// 폴더 구조
// ::  Page -> Component(UI) -> Container(디스패치) -> Modules(리듀서) 
// :: -> Container(useSelector) -> Component

// LoginPage(page) -> AuthTemplate(component) -> LoginForm(container) -> modules -> 
// AuthForm(component) -> LoginPage(page)

// 1. Page(Loginpage) : Component 가 Container 를 감싸고 있는 구조 
// 예) AuthTemplate(Components), LoginForm(Container)

// 2. Component(AuthTemplate, AuthForm) : 기본 템플릿

// 3. Container(LoginForm) : dispatch, onSubmit, useSelector, useCallback 등 함수 처리, 
// return 의 경우 Component 에 state 를 전달하는 방식으로 처리 (return AuthForm)
// */

// import { Provider } from "react-redux";
// import { createStore } from "redux";
// import rootReducer from './src/modules/index'
// import React from 'react';
// import Apps from "./src/App"; 
// //import { composeWithDevTools } from "redux-devtools-extension";
// //import createSagaMiddleware from "@redux-saga/core";

// //const sagaMiddleware = createSagaMiddleware()

// // 1. Redux에서 사용할 저장소(store) 생성
// // 2. applyMiddleware 함수를 통해 redux-saga 미들웨어를 적용
// const store = createStore(rootReducer);
//     //composeWithDevTools(applyMiddleware(sagaMiddleware))

// // 3. 리덕스 사가 미들웨어 실행
// //sagaMiddleware.run(rootSaga) 

// // 4. App 부분을 <Provider store={store}></Provider>로 감싸서 store를 사용할 수 있게 한다
// const App = () => {
//     return (
//         <Provider store={store}>
//             <Apps />
//         </Provider>
//     );
// };
// export default App;

// //import App from './src/App';
// //export default App;

import React from 'react';
import Apps from "./src/App"; 
import { createStore, applyMiddleware } from 'redux';
import rootReducer, { rootSaga } from './src/modules/index'
import { Provider } from 'react-redux';
import createSagaMiddleware from 'redux-saga';
 
const sagaMiddleware = createSagaMiddleware();
const store = createStore(
    rootReducer,
    applyMiddleware(sagaMiddleware),
);

sagaMiddleware.run(rootSaga);
  
const App = () => {
    return (
        <Provider store={store}>
            <Apps />
        </Provider>
    );
}
  
export default App;