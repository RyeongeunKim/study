import { Contents } from '../../../components/client/myinfo/MyInfo'
import AsyncStorage from '@react-native-async-storage/async-storage';
import React, { useEffect } from 'react';
import { useSelector, useDispatch } from 'react-redux';
import { Alert } from 'react-native';
import { readPhone } from '../../../modules/client/myinfo/myInfo'

const LoginContainer = () => {

    const dispatch = useDispatch();

    AsyncStorage.setItem('u_phone', '01023454710');

    const { userPhone } = useSelector(({ myinfo }) => ({
      userPhone: myinfo.readPhone.userPhone,
    }));

    useEffect(() => {
      async function getStorage() {
          if (await AsyncStorage.getItem("u_phone")) {
          let LocalData = await AsyncStorage.getItem("u_phone");
          dispatch(readPhone({userPhone: LocalData}));
        }
      }
      getStorage();
    }, []);

    function onPress(){
      Alert.alert('asyncStorage & 704p 참고');
    }
    
    return (
        <Contents
            userPhone={userPhone}
            onPress={onPress}
        />
    );
};

export default LoginContainer;