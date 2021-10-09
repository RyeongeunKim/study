
// ex10-2) forin | forof | foreach
let ar = [10, 20, 30];
console.log(ar);

// forin : index를 이용하여 출력하기
for (const index in ar) {
    console.log(index, ar[index]);
}console.log('--------------');

// forof : 값을 받아서 사용
for (const value of ar) {
    console.log(value);
}console.log('--------------');

// foreach : 배열에 내장되어 있는 iterator 사용
ar.forEach(
    function(v, i){
        console.log(v, i);
    }
);console.log('--------------');

/*
// ex10-1) 배열만들기
let ar = [10, 20, 30];
let br = Array(); // []
let cr = Array(5);
let dr = Array(10, 20, 30);
console.log(dr); // [10, 20, 30]
*/

/*
// ex09-5) 객체 병합 문법 

// 1. 옛날방식
let obj01 = {
    a:10,
    b:20,
}
let obj02 = {
    c:30,
    d:40,
}

// 병합하고 싶은 객체 이름 넣기
let obj03 = Object.assign(obj01, obj02);
console.log(obj03);

// 2. ES6(리액트에서 사용)
let obj04 = {...obj01, ...obj02}
console.log(obj04);

let f1 = (o) => {
    console.log(o.a);
    console.log(o.b);
    console.log(o.c);
    console.log(o.d);
}
f1({...obj01, ...obj02})
*/

/*
// ex09-4) 객체의 키, 값 추출 방법
let obj = {
    a:10,
    b:20,
}
console.log(Object.keys(obj));
console.log(Object.values(obj));
*/

/*
// ex09-3) 객체 생성 시 키값 사용 방법
let obj = {
    a:10,
}
obj.b = 20; // 없는 속성 -> 데이터 추가
console.log(obj);

obj['c'] = 30;
console.log(obj);

console.log('-------------------------------');

let count = Object.keys(obj).length;

console.log(count);

console.log('-------------------------------');

for(let i=0; i<4; i++){
    obj['tiger'+i] = i * 100;
}    

console.log(obj);
*/

/*
// ex09-2) 값을 키값으로 사용
let c = 'tiger';
let obj = {
    a:10,
    b:20,
    [c]:30  // c가 가지고 있는 값을 키값으로 사용함
}
console.log(obj.a, obj.b, obj.tiger);

for(const key in obj){
    console.log(key + ":" + obj[key]); // 키와 값 출력하기
}
*/

/*
// ex09-1) 객체 - 추가, 제거
let obj = {
    a:10,
    b:20,
    f1:()=>{console.log('f1');}
}

console.log(obj);
obj.a = 99; // 데이터 갱신
obj.c = 30; // 데이터 추가 -> 없는 속성을 사용하면 만들어진다
console.log(obj);

delete(obj.b);
console.log(obj);

obj.f2 = () => {console.log('test');}
obj.f2();
delete(obj.f1); // 함수 제거
console.log(obj);
*/

/*
// ex08) 객체 키값출력

let t = {
    name:'호랑이',
    age:100,
    bl:true
}

for(const key in t){
    console.log(key + ":" + t[key]); // 키와 값 출력하기
}

console.log(t.name + ":" + t.age);

with(t){ // 사용 X
    console.log(name + ":" + age);
}
*/

/*
// ex07) 이중 arrow

// 1
let t = () => () => 100;

// 2
t = () => () => {
    return 100;
}

// 3
t = () => {return() => {
    return 100;
    }
}
console.log(t()()); // 100

// 4
t = (a) => {return() => {
    return 100 + a 
    }
}

console.log(t(100)()); // 200

// 5
t = (a) => {
    return (b) => {
        return b + a;
    }
}
console.log(t(10)(20)); // 30

// 6
t = (a) => {
    return (b) => b + a;
}
t = (a) => (b) => b + a;
t = a => b => b + a; // 인수 전달이 한 개일 때만 괄호 생략 가능

// 7
t = (a, b) => (c, d) => (a * b) + (c * d);
console.log(t(1,2)(3,4)); // 14
*/

/*
// ex06-2) 요약
let f1 = ()=>{
    return 100;
}

let f2 = ()=> 100;

let f3 = ()=> {
    return console.log('1');
}

let f4 = ()=> console.log('1');
*/

/*
// ex06-1) 람다 경우의 수

let f1 = function(a){
    console.log(a);
}
f1(1);

// 1. (a) => {}
f1 = (a) => {
    console.log(a);
}
f1(2);

// (a) => { (b)=>{} }
let f2 = (a)=>{
    console.log(a);
    
    let f2 = (b)=>{
        console.log(b);
    }
    f2(100)
    f1(a+3);
    
}
f2(3)

// 2. 즉시 실행 함수
// // 즉시 실행 함수
// (function(a){
//     (function(b){

//     });
// })();

// // 위의 코드를 람다로 변경
// ((a)=>{
//     (b)=>{

//     }
// })

let f3 = function(fc){
    fc(10);
}

f3(((a)=>{
    ((b)=>{
        console.log(a+b);
    })(20)
}));
*/

/*
// ex05) 클로저 함수 
// 지역변수가 사라지지 않고 계속 사용할 수 있는 상태로 남아있는 것
let f1 = function(){
    let a = 100;
    return function(){
        console.log(a);
    }
}

f1()();
*/

/*
// ex04) 자기 함수를 호출해서 리턴하는 함수
(function(){
    console.log('1');
    return function(){
        console.log('2');
    }
})()();
*/

/*
// ex03) 리턴 함수
let f1 = function(fc){
    console.log('1');
    let f2 = function(){
        console.log('2');
    }
    // f2 자체를 return
    // refurn f2(); -> f2 콜
    return f2;
}
f1()();

let f3 = function(fc){
    console.log('3');
    
    return function(){
        console.log('4');
    }
}
f3()();
*/

/*
// ex02) 콜백 함수
let f1 = function(fc){ // fc? 매개변수 이름.. yoyo도 가능
    console.log('1');
    fc();
}

let f2 = function(fc){
    console.log('2');
}

// 방법 1
f1(f2);

// 방법 2
f1(function(){
    console.log('3');
});

// 방법 3
f1(()=>{
    console.log('4');
})
*/

/*
// ex01) 내부 함수
let f1 = function(){
    console.log('1');
    
    let f2 = function(){
        console.log('2');
    }
    f2();
}
f1();

f1 = function(){
    console.log('3');
    
    let f2 = function(){
        console.log('4');
    }
    f2();
}
f1();
*/