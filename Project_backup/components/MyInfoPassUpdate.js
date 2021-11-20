import React, { useEffect, useState } from 'react';
import { StyleSheet, TouchableOpacity, View, Text, Alert, TextInput } from 'react-native';
import { images } from './MyInfoImages';
import IconButton from './MyInfoIconButton';
import AsyncStorage from '@react-native-async-storage/async-storage';
import axios from 'axios';
import { useNavigation } from '@react-navigation/native'
import { read_myInfo } from '../../../modules/client/myinfo/myInfo'
import { useSelector, useDispatch } from 'react-redux';

export const Contents = () => {
    const navigation = useNavigation();
    AsyncStorage.setItem('u_phone', '01023454710');
    //const [data, setData] = useState([])

    const { userEmail } = useSelector(({ myinfo }) => ({
      userEmail: myinfo.uesrInfo.userEmail,
    }));

    // dispatch : 리듀서로 값 전달
    const dispatch = useDispatch();

    useEffect(() => {
    async function getStorage() {
      if (await AsyncStorage.getItem("u_phone")) {
        let LocalData = await AsyncStorage.getItem("u_phone");

        axios({
          method: "GET",
          url: "http://172.29.240.1:8080/api/getEmail/"+LocalData,
        }).then((res) => {
          let LocalEmail = res.data.data.u_email;
          console.log('로컬-->'+LocalEmail);
          //setEmail(LocalEmail)
          dispatch(read_myInfo({userEmail: LocalEmail}));
        });
      }
    }
      getStorage();
        }, []);
  
    function onPress(){
      Alert.alert('변경!');
    }

    const [number, onChangeNumber] = React.useState(null);
  
    return (
      <View style={[styles.container, {height: 300, backgroundColor: '#CEEDFF', marginTop: 50}]}>
        <View style={styles.myInfo}>
          <IconButton type={images.email}/>
          <Text style={{fontSize: 18, marginLeft: 21}}>{userEmail}</Text>
        </View>
        <View style={styles.myInfo}>
          <IconButton type={images.email}/>
          <TextInput
          style={styles.input}
          onChangeText={onChangeNumber}
          value={number}
          placeholder="비밀번호 변경"
          keyboardType="numeric"
          />
        </View>
        <View style={styles.btnContainer}>
          <TouchableOpacity
            style={styles.btn}
            onPress={onPress}
            >
            <Text style={[{ fontSize: 18 }, styles.text]}>변경</Text>
          </TouchableOpacity>
        </View>
        <View style={styles.btnContainer}>
          <TouchableOpacity
          onPress={() => navigation.goBack()}
          >
          <Text>뒤로가기</Text>
          </TouchableOpacity>
          </View>
      </View>
    );
  };

  const styles = StyleSheet.create({
    container: {
      width: '95%',
      justifyContent: 'center',
      height: 190,
    },
    myInfo: {
      flexDirection: 'row',
      alignItems: 'center',
      borderRadius: 10,
      padding: 5,
      margin: 3,
    },
    myInfoText: {
      flex: 1,
      fontSize: 22
    },
    footer: {
      height: 80,
    },
    btnContainer: {
      flex: 1,
      justifyContent: "center",
      paddingHorizontal: 10
    },
    btn: {
      backgroundColor: "#5AA0C8",
      borderRadius: 10,
      //width: Platform.OS === "android" ? 155 : "50%",
      margin: 10,
      alignItems: "center",
      paddingVertical: 8,
      padding: 10,
      width: '90%',
    },
    text: {
      color: "white",
      fontWeight: "bold",
      margin: 10,
    },
    input: {
      height: 40,
      margin: 12,
      borderWidth: 1,
      borderColor: '#CEEDFF',
      padding: 10,
      flex:1, 
      fontSize: 18
    },
  });