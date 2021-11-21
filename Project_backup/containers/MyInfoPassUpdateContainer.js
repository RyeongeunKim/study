import { Contents } from '../../../components/client/myinfo/MyInfoPassUpdate'
import React, { useEffect } from 'react';
import { useSelector, useDispatch } from 'react-redux';
import { Alert } from 'react-native';
import { getPw } from '../../../modules/client/myinfo/myInfo'

const MyInfoPassUpdateContainer = () => {

  const dispatch = useDispatch();

  const { phone, pw, loadingPw } = useSelector(({ myinfo, loading }) => ({
    pw: myinfo.pw,
    loadingPw: loading.GET_PW,
    phone: myinfo.phone,
  }));

  //const [newEmail, onChangeNewEmail] = React.useState('');

  const [setPw, onChangeSetPw] = React.useState('');
  const [newPw, onChangeNewPw] = React.useState('');

  useEffect(() => {
    dispatch(getPw(phone));
  }, []);
  
  function onPress(){
    if(newEmail === ''){
      Alert.alert('빈 항목이 있습니다.');
    } else {
      dispatch(updateEmail({phone, newEmail}));
      Alert.alert('이메일이 성공적으로 변경되었습니다.');
      onChangeNewEmail('');
    }
  }
  
  return (
      // Login -> 컨테이너의 자식 컴포넌트
      <Contents
        pw={pw}
        loadingPw={loadingPw}
        // onPress={onPress}
        // newEmail={newEmail}
        // onChangeNewEmail={onChangeNewEmail}
      />
  );
};

export default MyInfoPassUpdateContainer;