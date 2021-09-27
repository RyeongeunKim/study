

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