const users = [
    {
        id: 1,
        username: 'kre920718',
        password: '1234',
    }
]

// POST /api/auth/login
export const login = async ctx => {
    // koa 모듈은 ctx로 request와 response에 대해 처리할 수 있다.
    // ctx : context의 줄임말. 웹 요청과 응답에 관한 정보.
    // ctx.request.body : 클라이언트의 요청과 함께 넘어온 데이터
    console.log(ctx.request.body);
    const {username, password} = ctx.request.body;

    // username 또는 password 미입력에 대한 처리
    if(!username || !password){
        ctx.body = '실패'
        console.log(ctx.status);
        return;
    }

    try{
        // Array.find() : 배열 내에 매개변수로 넘긴 값과 동일한 요소가 있으면 가져온다.
        const user = await users.find(u => u.username === username);
        console.log(user);
        // ID 동일 여부 검사
        if(!user){  // username에 해당하는 USER가 존재하지 않으면
            ctx.body = '실패'
            console.log(ctx.body);
            console.log('존재 하지 않는 id 정보입니다.');
            return;    
        }
        else{       // username에 해당하는 USER가 존재하면
            const checkpassword = await user.password === password;
            // PASSWORD 동일 여부 검사
            if(!checkpassword){  // password가 다르면
                ctx.body = '실패'
                console.log(ctx.body);
                console.log('패스워드가 틀렸습니다.');
                return;
            }
            else{           // password가 같으면
                ctx.body = '성공'
                console.log(ctx.body);
                console.log('로그인 성공');
            }
        }
    // catch : request에 문제가 있을 때, 예외처리를 던진다.
    } catch (e) {
        console.log('error');
        console.log(ctx.status);
        ctx.throw(500, e);
    }
}