
/*
// ex40) 배열 안 객체

let ar = [
    {
        n: '호랑이',
        a: 10,
    },
    {
        n: '코끼리',
        a: 20,
    },
    {
        n: '독수리',
        a: 30,
    },
]
console.log(ar);

for (const key in ar) {
    console.log(key);
    let e = ar[key];
    console.log(e);
    //console.log(e.n, e.a);
    console.log(e['n'], e['a']);
}

let sum = 0;
for (const v of ar) {
    sum += v.a;
}
console.log(sum);

let br = ar.map(
    (v, k)=> v.n + v.a
)

console.log(br);
*/

/*
// ex39) forin | forof | foreach
let ar = [10, 20, 30];
console.log(ar);

// forin = index 이용하여 출력하기
for (const index in ar) {
    console.log(index, ar[index]);
}console.log('--------------');

// forof - 값을 받아서 사용
for (const value of ar) {
    console.log(value);
}console.log('--------------');

// foreach - 배열에 내장되어 있는 iterator 사용
ar.forEach(
    function(v, i){
        console.log(v, i);
    }
);console.log('1--------------');

// 위 코드 람다로 변형
ar.forEach((v, i)=>{
        console.log(v, i);
});console.log('2--------------');

// map 함수 - 기존의 데이터를 가공해서 새로운 데이터를 만든다 
let br = ar.map(
    (num)=>{
        return num * 10;
    }
)
console.log(br);

// 위와 같은 코드
br = ar.map(num=> num * 10)
console.log(br);

let cr = [0, 1, 2, 3]
let dr = cr.map(
    // num => {
    //     if(num % 2)
    //         return 'odd'
    //     else 
    //         return 'even'
    // }

    // 삼항연산
    // num => {
    //     return (num % 2) ? 'odd' : 'even'
    // }

    num => (num % 2) ? 'odd' : 'even'
);
console.log('');
*/

/*
// ex38) 배열3 - 배열 안에 데이터넣기
let ar = [
    10,
    '호랑이',
    true,
    [10, 20, 30], // 배열 안에 배열
    {name:'독수리', age:10}, // 객체
    function(){},
    undefined
];
console.log(ar);
*/

/*
// ex37) 배열2 - 배열만들기
let ar = [10, 20, 30];
let br = Array(); // []
let cr = Array(5);
let dr = Array(10, 20, 30);
console.log(dr);
*/

/*
// ex36) 배열1
let ar = [10, 20, 30];
console.log(ar);
console.log(ar.length); // 배열길이
console.log(typeof(ar)); // 타입
console.log(Array.isArray(ar)); // 배열이 맞으면 true

*/

/*
// ex35) 객체6 - 객체 병합 문법
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

let obj04 = {...obj01, ...obj02} 
console.log(obj04);

let f1 = (o) => {
    console.log(o.d);
}
f1({...obj01, ...obj02})
*/
/*
// ex34) 객체5 - 객체의 키, 값 추출
let obj = {
    a:10,
    b:20,
}
console.log(Object.keys(obj));
console.log(Object.values(obj));
*/

/*
// ex33) 객체4
let obj = {
    a:10,
}
obj.b = 20;
console.log(obj);

obj['c'] = 30;
console.log(obj);

for (let i = 0; i < 4; i++) {
    obj['tiger'+i] = i*100;
}
console.log(obj);
*/ 

/*
// ex32) 객체3 : 외부의 변수가 가지고 있는 값을 키값으로 사용

let c = 'tiger';
let obj = {
    a:10,
    b:20,
    [c]:30 // c가 가지고 있는 값을 키값으로 사용함
}
console.log(obj.a, obj.b, obj.tiger);
*/

/*
// ex31) 객체2
let obj = {
    a:10,
    b:20,
    f1:function(){
        console.log(
            this.a, 
            this.b);
    },
// f2:()=>{ 
//     console.log(
//         this.a, // 에러발생 -> 람다에서는 this를 사용할 수 없다
//         this.b);
// }, // <- 문법에러 아님, 끝났다는 의미? 가끔 사용
    f2:function(){
        for(const key in this){
            console.log(this[key]);
        }
    }
}
obj.f1();
console.log('------------------------');
obj.f2();
*/
/*
// ex30) 객체1
let obj = {
    a:10,
    b:20,
    f1:()=>{console.log('f1');
    }
}
console.log(obj);
obj.b = 99; // 데이터 갱신
obj.c = 30; // 데이터 추가 - 없는 속성을 사용하면 만들어진다
console.log(obj);

delete(obj.b) // 속성 제거
console.log(obj);

obj.f2 = () => {console.log('test');}
obj.f2();
delete(obj.f1); // 함수 제거
*/

/*
// ex29) 키값출력
let t = {
    name:'호랑이',
    age:100,
    bl:true
}

for (const key in t) {
    //console.log(key); // 키값출력
    console.log(t[key]);
}

console.log(t.name, t.age);

with(t){
    console.log(2, name, age);
}
*/

/*
// ex28)
let str = '';
str += 'let a = 10;'
str += 'console.log(a);'
console.log(str);
eval(str); // 가급적 사용 X
*/

/*
// ex27) 자습 - 비동기 처리(드림코딩)
console.log('1');
setTimeout(()=> console.log('2'), 1000);
console.log('3');

// Syschrobous callback
function printImmediately(print){
    print();
}
printImmediately(() => console.log('hello'));

// Asyschrobous callback
function printWithDelay(print, timeout){
    setTimeout(print, timeout);
}
printWithDelay(() => console.log('async callback'),2000);
*/
/*
// ex27)
for(let i=0; i<3; i++){
    (function(x){
        setTimeout(
            ()=>{ console.log(i); },
            1000
        )
    })(i)
}
*/

/*
// ex26) 비동기 함수 예제
console.log('1');

// // setTimeout : 2초 뒤에 함수를 콜
// setTimeout(
//     function(){
//         console.log('3');
//     },
//     2000 // 2초
// )


// 비동기 함수
// setInterval : 2초에 한번씩 함수를 콜해라
let num = 0;
let id = setInterval(() => {
        console.log(num++);
},2000)

 setTimeout(
    () => {
        clearInterval(id)
        console.log('exit');
    },
    13000    
 )

console.log('2');
*/

/*
// ex25)

// 1
let t = () => () => 100;


// 2
t = () => () => {
    return 100;
}

// 3
t = () =>{ return () => {
        return 100;
    }
}
console.log(t()());

// 4
t = (a) => {return () => {
        return 100 + a;
    }
}

console.log(t(10)());

// 5
t = (a) => {
    return (b) => {
        return b + a;
    }
}
console.log(t(10)(20));

// 6
t = (a) => {
    return (b) => b + a;
}
t = (a) => (b) => b + a; 
t = a => b => b + a;  // 인수 전달이 한 개일 때만 괄호 생략 가능

// 7
t = (a, c) => (b, d) => a*b+c*d;
*/

/*
// ex24)
let f1 = ()=>{
    return 100;
}
let f2 = ()=> 100; // 위와 같은 코드

let f3 = ()=> {
    return console.log('1');
}

let f4 = ()=> console.log('1'); // 위와 같은 코드

let t = a => b => 100;
*/

/*
// ex23)

// 즉시 실행 함수
(function(a){
    (function(b){

    });
})();

// 위의 코드를 람다로 사용함
((a)=>{
    (b)=>{
    }
})();

let f1 = function(fc){
    fc(10);
}

f1((( a ) => { 
    (( b ) => { 
        console.log(a+b);
    })(20)
}));
*/

/*
// ex22)
let f1 = function(a){
    console.log(a);
}
f1(1);

// (a) => {}
f1 = (a)=>{
    console.log(a);
}
f1(2);

// (a) => { (b)=>{} }
let f2 = (a)=>{
    console.log(a);
    
    let f2 = (b)=>{
        console.log(b);
    }
    f1(a+3);
}
f2(3)
*/

/*
// ex21)
let f1 = function(){
    let a = 100;
    return function(){
        console.log(a);
    }
}

f1()();
*/

/*
// ex20)
(function(){
    console.log('1');
    return function(){
        console.log('2');
    }
})()();
*/
/*
// ex19)
let f1 = function(fc){
    console.log('1');
    let f2 = function(){
        console.log('2');
    }
    // f2 자체를 return
    // return f2(); -> f2 콜
    return f2; 
}
f1()();

let f3 = function(fc){
    console.log('3');

    return function(){
        console.log('4');
    };
}
f3()();
*/

/*
// ex18)
// fc = 
let f1 = function(fc){
    console.log('1');
    fc();
}

let f2 = function(fc){
    console.log('2');
}
// 방법1
f1(f2);
// 방법2
f1(function(){
    console.log('3');
});
// 방법3
f1(()=>{
    console.log('4');
});
*/

/*
// ex17) 
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

/*
// ex16) 함수 표현법

// 1, 2 -> 펑션 네임 방식

// 1. 기본꼴 
f1(); // 위에 있어도 실행됨 -> Hoisting 가능
function f1(){
    console.log('1');   
}
f1();

// 2. 함수 자체를 변수에 담는다
//f2(); // 위에 있으면 실행 X  -> Hoisting 불가
let f2 = function(){
    console.log('2');
}
f2();

// 3. 람다식(90% 이상 사용)
let f3 = ()=>{
    console.log('3');
}
f3();

// 4. 즉시 실행 함수(IIFE) : 만들고 바로 호출
(function(){
    console.log('4')
})();

// 5. 위의 코드를 람다로 사용함
(()=>{
    console.log('5')
})();

(function(num){
    console.log(num);
})(200);

(function(dt){
    let start = new Date().getTime();
    while(new Date().getTime()<start+dt);
})(2000);
console.log('test');

// 생성자 함수 : 클래스와 동격이다.
// 첫자 소문자 : 함수
// 첫자 대문자 : 클래스
function Fff555(){ 
    this.num1 = 10 // 콤마 X
    this.num2 = 20 
    this.m1 = function(){
        console.log(this.num1);
    }
    this.m2 = ()=>{
        console.log(this.num2);
    }
}

let ins = new Fff555() // 객체 생성
ins.m1();
ins.m2();
new Fff555().m1()

// 인수전달 X, return X
function t1(){
    console.log('1');
}

// 인수전달 O, return X
function t2(n, s){
    console.log(n+s);
}

// 인수전달 X, return O 
function t3(n, s){
    console.log('3');
    return 888;
}

// 인수전달 O, return O 
function t4(n){
    console.log('4');
    return n*2;
}

t1()
t2(10, '호랑이')
console.log(t3());
console.log(t4(8));

function t5(){
    console.log(typeof(arguments));
    console.log(arguments.length);
    let sum = 0;
    for (let key in arguments) {
        sum += key;
    }
    console.log(sum);
}
t5(10, 20, 30)
*/
/*
// ex15)
let a = 10;
if(a > 3){
    console.log('test1');
}
a > 3 && console.log('test2');

if(!false){
    console.log('test3');
}
false || console.log('test4'); // 빈도수 떨어짐 
*/

/*
// ex14)
// == : 같으냐 
// === : 값, 타입 둘다 같으냐

console.log(100 == 100);
console.log(100 == '100');
console.log(100 === '100');
*/

//while(new Date().getTime()<start+2000); // 2초 동안 시간지연

/*
// ex13)
let start = new Date().getTime();
console.log(start);

//while(new Date().getTime()<start+2000); // 2초 동안 시간지연

console.log("호랑이");
*/

/*
// ex12)
let start = new Date().getTime();
console.log(start);
for(var i = 0; new Date().getTime() < start + 1000; i++){
}
console.log(i); // 1초 동안 for문이 돌았던 횟수
*/

/*
// ex11) Date()
let nn = new Date();
console.log(nn.getFullYear(), '년');
// 0월+1
console.log(nn.getMonth()+1, '월');
console.log(nn.getDate(), '일');
// 0(일) 1(월) 2(화)
console.log(nn.getDay(), '요일');
console.log(nn.getHours(), '시');
console.log(nn.getMinutes(), '분');
console.log(nn.getSeconds(), '초');

console.log(typeof(nn));
console.log(typeof(Date));
console.log(typeof nn);
console.log(typeof Date);
*/
/*
// ex10)
console.log(2 ** 4); // 승수 구하기
console.log(Math.pow(2, 4)); // 위와 동일
*/

/*
// ex9)
let s = '1000'; // 문자
let n = 1000; // 숫자
console.log(typeof(s), typeof(n));

console.log(Number(s) + 10);
console.log(parseInt(s)+10);
let r1 = s; // string
let r2 = +s; // number
let r3 = +'2000'; // number
console.log(typeof(r1), typeof(r2), typeof(r3));
console.log(String(n) + 10);
*/

/*
// ex8)
let str = "호랑이";
str += '독수리';
console.log(str);
*/
/*
// ex7)
const a = 10;
a = 20;
*/
/*
// ex6)
var a = 10;
if(true){
    var a = 20;
    console.log(a); // 20
}
console.log(a); // 20

let b = 10;
if(true){
    let b = 20; 
    console.log(b); // 20
}
console.log(b); // 10
*/
/*
// ex5)

let a = 10;
console.log(typeof(a));

a = '호랑이';
console.log(typeof(a));
*/

/*
// ex4)
let obj = {
    a:{
        c:{
            d:10
        }
    }
}
console.log(obj.a.c.d);
*/

/*
// ex3)
let tiger = {
    a:10,
    b:'호랑이',
    c:true,
    d:[],
    e:{},
    f:function(){},
    g:undefined
};

console.log(tiger, typeof(tiger));
console.log(tiger.a, typeof(tiger.a));
*/

/*
// ex2)
let a = 10;             // number 타입
let b = '호랑이';       // String 타입
let c = true;           // boolean 타입
let d = [];             // Object 타입
let e = {};             // Object 타입
let f = function(){};   // 함수 타입
let g = undefined;      // undefined 타입

console.log(typeof(a)); // type 확인
console.log(typeof(b));
console.log(typeof(c));
console.log(typeof(d));
console.log(typeof(e));
console.log(typeof(f));
console.log(typeof(g));
console.log(typeof(3.14));
*/

/*
// ex1) 출력코드와 변수 선언
console.log("호랑이");

var a = 10;
let b = 20;
const c = 30;
console.log(a, b, c);
*/