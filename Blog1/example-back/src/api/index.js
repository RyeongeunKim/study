import Router from 'koa-router'; 
import auth from './auth';

// 라우터 객체 생성
const api = new Router();

// url('/api/auth') 경로로 라우터 설정
api.use('/auth', auth.routes());

// 라우터 내보내기
export default api;