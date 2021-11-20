import client from './client'

// 이메일 읽어오기
export const getEmail = u_phone => {
    client.get(`http://172.24.192.1:8080/api/getEmail/${u_phone}`)
    .then((response)=>{
       console.log('axios------>'+response.data.data.u_email);
       let email = response.data.data.u_email;
       return {
           type: 'myinfo/READEMAIL',
           payload: email
       }
    })
};
