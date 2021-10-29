import Koa from 'koa';
import Router from 'koa-router';
import api from './api';
import bodyParser from 'koa-bodyparser';

const app = new Koa(); // app : koa 모듈을 통해서 서버 객체 생성.
const router = new Router(); // 라우터 객체 생성

// 클라이언트로부터 요청 데이터가 왔을 때, 해당 데이터를 JSON 타입으로 받도록 해주는 모듈을
// koa 서버 객체(app)에서 사용하겠다고 선언.
app.use(bodyParser());  

// url('/api') 경로로 라우터 설정.
router.use('/api', api.routes()); 

// app(koa 서버).use : 라우터 등의 미들웨어 함수를 app에 적용시켜 사용할 수 있도록 한다.
app.use(router.routes()).use(router.allowedMethods());

// app(koa 서버)을 4000번 포트로 열어 실행하겠다...
app.listen(4000, () => {
    console.log('server start');
})