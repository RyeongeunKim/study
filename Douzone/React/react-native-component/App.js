import React from 'react';
import { Text, View, Button } from 'react-native';
import MyButton from './components/MyButton';
import Counter from './components/Counter';
import EventButton from './components/EventButton';
import EventInput from './components/EventInput';

const App = () => {
    return (
        <View 
         style={{
             flex: 1,
             backgroundColor: '#fff',
             alignItems: 'center',
             justifyContent: 'center',
         }}
        >
            {/* <Text style={{ fontSize: 30, marginBottom: 10}}>My Button component</Text>
            <MyButton title="Button" onPress={() => alert('props')}/>
            <MyButton title="Button" onPress={() => alert('children')}>
                Children Props
            </MyButton>
            <MyButton onPress={() => alert('default')} /> */}
            {/* <Counter /> */}
            {/* <EventButton/> */}
            <EventInput/>
        </View>
    );
};



export default App;