import Router from 'koa-router'; 
// import * as authCtrl from './auth.ctrl';
import * as authCtrl from './auth.ctrl';

// 라우터 객체 생성
const auth = new Router();

// url('/api/auth/login') 으로 post 요청이 오면 auth Controller에 있는 login 로직 처리 함수 실행.
auth.post('/login', authCtrl.login);

export default auth;