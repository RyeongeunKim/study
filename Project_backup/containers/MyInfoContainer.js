import { Contents } from '../../../components/client/myinfo/MyInfo'
import AsyncStorage from '@react-native-async-storage/async-storage';
import React, { useEffect } from 'react';
import { useSelector, useDispatch } from 'react-redux';
import { Alert } from 'react-native';
import { setPhone } from '../../../modules/client/myinfo/myInfo'

const MyInfoContainer = () => {

  const dispatch = useDispatch();

  const { phone } = useSelector(({ myinfo }) => ({
    phone: myinfo.phone
  }))

  AsyncStorage.setItem('u_phone', '01023454710');

  useEffect(() => {
    async function getStorage() {
        if (await AsyncStorage.getItem("u_phone")) {
        let u_phone = await AsyncStorage.getItem("u_phone");
        dispatch(setPhone(u_phone));
      }
    }
    getStorage();
  }, []);

  function onPress(){
    Alert.alert('asyncStorage & 704p 참고');
  }
  
  return (
      <Contents
          phone={phone}
          onPress={onPress}
      />
  );
};

export default MyInfoContainer;