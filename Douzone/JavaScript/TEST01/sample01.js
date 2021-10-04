
/*
// ex69)
let obj = {
    a:10,
    b:'호랑이'
}
// 객체 >> JSON
let str = JSON.stringify(obj)
console.log(str, typeof(str));

// >>> 전송......
let obj2 = JSON.parse(str);
console.log(obj2, typeof(obj2));
*/


// ex68) 수학함수

//Math.PI
console.log(Math.PI); // 3.141592653589793

// random
console.log(Math.random()); // 0.0~1.0 사이의 값을 랜덤하게 뽑음
console.log(Math.random()*10); // 소수점까지 나옴
console.log('이거==>' + Math.floor(Math.random()*10)); // Math.floor -> 소수점 이하 자르기

// Math.sin -> 알면 좋고 몰라도 상관 X
// 직각삼각형의 각도 30도 -> 높이/빗변의 비율
console.log(Math.sin(30));

// radian값 구하기
let r = Math.PI * 30.0 / 180.0;
console.log(Math.sin(r));

// abs, ceil, floor, round
// min, max, log, pow, sqrt

// sqrt? 제곱근 구하기
console.log(1.7*1.7);
console.log(Math.sqrt(30)); //1.7320508075688772 // 30? 30Radian


/*
// ex67-2) 상속
function Apple(){
    this.query={
        name:'홍길동',
        age:100
    }
}

function Orange(){
    this.request = {
        x:10,
        y:20
    }
}

Orange.prototype = new Apple();
Orange.prototype.constructor = Orange;

let ctx = new Orange();
console.log(ctx);
console.log(ctx.query); // query? 상속구조에서 부모가 있다! 사용가능
console.log(ctx.request);
*/

/*
// ex67-1) 상속
function Apple(){
    this.a = 10;
}

function Orange(){
    this.b = 20;
}

Orange.prototype = new Apple();
Orange.prototype.constructor = Orange;

let obj = new Orange();
console.log(obj.a, obj.b);
*/

/*
// ex66-5) 생성자 함수
function MakeInfo(name, n1, n2){
        this.name = name, 
        this.n1 = n1,
        this.n2 = n2
}

let ar = [];
ar.push(new MakeInfo('호랑이0',10,60));
ar.push(new MakeInfo('호랑이1',20,70));
ar.push(new MakeInfo('호랑이2',30,80));
ar.push(new MakeInfo('호랑이3',40,90));
ar.push(new MakeInfo('호랑이4',50,10));

ar.forEach((v,i)=>{
    ar[i].sum = v.n1 + v.n2;
})

MakeInfo.prototype.output = function(){
    console.log(this.name, this.n1, this.n2 , '| sum : ',this.sum);
}

for(let index in ar){
    ar[index].output();
}
*/

/*
// ex66-4) 생성자 함수
function MakeInfo(name, n1, n2){
        this.name = name, 
        this.n1 = n1,
        this.n2 = n2

}
let ar = [];
ar.push(new MakeInfo('호랑이0',10,60));
ar.push(new MakeInfo('호랑이1',20,70));
ar.push(new MakeInfo('호랑이2',30,80));
ar.push(new MakeInfo('호랑이3',40,90));
ar.push(new MakeInfo('호랑이4',50,10));

ar.forEach((v,i)=>{
    ar[i].sum = v.n1 + v.n2;
})

ar.forEach((v,i)=>{
    console.log(v.name, v.n1, v.n2, v.sum);
})
*/

/*
// ex66-3)
function makeInfo(name, n1, n2){
    let obj = {
        name:name, // k v
        n1:n1,
        n2:n2,
    }
    return obj;
}
let ar = [];
ar.push(makeInfo('호랑이0',10,60));
ar.push(makeInfo('호랑이1',20,70));
ar.push(makeInfo('호랑이2',30,80));
ar.push(makeInfo('호랑이3',40,90));
ar.push(makeInfo('호랑이4',50,10));

ar.forEach((v,i)=>{
    console.log(v.name, v.n1, v.n2);
})
*/

/*
// ex66-2)
let ar = [];
ar.push({name:'호랑이0',n1:10,n2:60});
ar.push({name:'호랑이1',n1:20,n2:70});
ar.push({name:'호랑이2',n1:30,n2:80});
ar.push({name:'호랑이3',n1:40,n2:90});
ar.push({name:'호랑이4',n1:50,n2:10});

ar.forEach((v,i)=>{
    console.log(v.name, v.n1, v.n2);
})
*/

/*
// ex66-1)
let obj0 = {name:'호랑이0',n1:10,n2:60}
let obj1 = {name:'호랑이1',n1:20,n2:70}
let obj2 = {name:'호랑이2',n1:30,n2:80}
let obj3 = {name:'호랑이3',n1:40,n2:90}
let obj4 = {name:'호랑이4',n1:50,n2:10}

let ar = [];
ar.push(obj0);
ar.push(obj1);
ar.push(obj2);
ar.push(obj3);
ar.push(obj4);

ar.forEach((v,i)=>{
    console.log(v, i);
    console.log(v.name, v.n1, v.n2);
    console.log('');
})
*/

/*
// ex65)
let obj = {

}
obj.f1 = function(){
    console.log('1');
}
obj.f1();

function F1(){

}
F1.prototype.f1 = function(){
    console.log('2');
}
let ins = new F1();
ins.f1();
*/

/*
// ex64) 
function f1(){
    return {
        a:10,
        f:function(){}
    }
}
let obj1 = f1();
let obj2 = f1();
console.log(obj1.f === obj2.f); // false -> 함수가 다르다?

function F1(){
    this.a = 10;
    this.f = function(){}
}
let ins1 = new F1();
let ins2 = new F1();
console.log(ins1.f === ins2.f); // false

function F2(){
    this.a = 10;
}

F2.prototype.f = function(){}

let ins3 = new F2();
let ins4 = new F2();

console.log(ins3.f === ins4.f); // true -> 메모리 절약
*/


/*
// ex63) 사용못하는 디스
let obj = { // obj는 객체
    n:10,
    obj2:{
        f1:()=>{
            console.log(this);
            console.log(this.n);
        }
    }
}
obj.obj2.f1();

function Fffff(){

}

// 인스턴스
let ins = new Fffff();
*/

//결과
// {}
// undefined

/*
// ex62) 
// 생성자함수(클래스) >> new

function Func(){
    this.num = 100;
    this.obj = {
        num:200,
        f1:()=>{ // arrow의 this : 자신을 감싸고 있는 {} 밖의 변수를 가리킨다
            console.log(this.num);
        },
        f2:function(){ // 객체 안의 변수 사용
            console.log(this.num);
        }
    }
}
let ins = new Func();
ins.obj.f1();
ins.obj.f2();
*/

/*
// ex61) 객체 안에서 에로우 함수를 사용할 때
// this를 주의(사용하지 말자) 하자

let obj = {
    num:100,
    func01:()=>{ // 01 -> 03(동일문법) ES6 이전
        console.log(this);
        console.log(this.num);
    },
    func02:function(){
        console.log(this);
        console.log(this.num);
    },
    func03(){ // 01 -> 03(동일문법) ES6 이후
        console.log(this);
        console.log(this.num);
    },
}

obj.func01();
obj.func02();
obj.func03();
*/

/*
// ex60)문자열, 배열, 객체

// length - 문자열, 배열 O

// 문자열
let st = '령은';
console.log(st.length); // 2

// 배열
let ar = [10, 20, 31];
console.log(ar.length); // 3

// 객체 X
let obj = {a:10, b:20}
console.log(obj.length); // undefined

console.log('-------------');

// forEach - 배열 O
ar.forEach(element => {
    console.log(element); // 10 20 31
});

// st.array.forEach(element => {
//     console.log(element);
// });

// obj.array.forEach(element => {
//     console.log(element);
// });

console.log('-------------');

// forIn - 문자열, 배열, 객체 O

for (let k in st) {
    console.log(k + ":" + st[k]); // 0:령 1:은
}

console.log('-------------');

for (const k in ar) {
    console.log(k + ":" + ar[k]); // 0:10 1:20 2:31
}

console.log('-------------');

for (const k in obj) {
    console.log(k + ":" + obj[k]); // a:10 b:20
}

console.log('-------------');

// forof - 문자열, 배열 O
for (let i of st) {
    console.log(i); // 령 은
}

for (let i of ar) {
    console.log(i); // 10 20 31
}

// 객체 X
// for (let i of obj) {
//     console.log(i);
// }

// map : 배열 O
let br = ar.map(
    num => (num % 2)? 'odd' : 'even' 
);
console.log(br); // [ 'even', 'even', 'odd' ]

// 문자열 X
// let cr = st.map(
//     ss => '호랑이'
// );
// console.log(cr);

// 객체 X
// let cr = obj.map(
//     o => {a:30}
// );
// console.log(cr);
*/

/*
// ex59) reduce 6 - 덧셈 간단 예시
const oneTwoThree = [1, 2, 3];

// 초기값 O
result = oneTwoThree.reduce((acc, cur, i) => {
    console.log(acc, cur, i);
    return acc + cur;
}, 0);

result;

// 0 1 0
// 1 2 1
// 3 3 2

console.log('----------------');

// 초기값 X
sum = oneTwoThree.reduce((acc, cur, i) => {
    console.log(acc, cur, i);
    return acc + cur;
});

sum;

// 1 2 1
// 3 3 2
*/

/*
// ex58) reduce 5 - 속성으로 객체 분류하기
var people = [
    {name: 'Alice', age: 21},
    {name: 'Max', age: 20},
    {name: 'Jane', age: 20}
];

function groupBy(objectArray, property){
    return objectArray.reduce(function(acc, obj){
        var key = obj[property];
        if(!acc[key]){
            acc[key] = [];
        }
        acc[key].push(obj);
        return acc;
    }, {});
}

var groupedPeople = groupBy(people, 'age');
console.log(groupedPeople);
*/

/*
// ex57) reduce 4(중요) - 객체 내의 인스턴스 개수 세기
var names = ['Alice', 'Bob', 'Tiff', 'Bruce', 'Alice'];

var countedNames = names.reduce(function(allNames, name){
    if(name in allNames){       // 누적값에 이름이 있을 경우
        allNames[name]++;
    } else {
        allNames[name] = 1;     // 누적값에 이름이 없을 경우
    }
    return allNames;
}, {});

console.log(countedNames);
*/

/*
// ex56) reduce 3 - 중첩 배열 펼치기
var flattened = [[0, 1], [2, 3], [4, 5]].reduce(
    function(accumulator, currentValue){
        return accumulator.concat(currentValue);
    },[]
);

console.log(flattened);

// 화살표 함수
var flattened2 = [[0, 1], [2, 3], [4, 5]].reduce(
    (accumulator, currentValue) => accumulator.concat(currentValue),
    []
);
    
console.log(flattened2);
*/

/*
// ex55) reduce 2 - 객체 배열에서의 값 합산
var initialValue = 0;
var sum = [{x: 1}, {x:2}, {x:3}].reduce(function(accumulator, currentValue){
    return accumulator + currentValue.x;
},initialValue)

console.log(sum);

// 화살표 함수
initialValue = 0;
var total = [{x:1}, {x:2}, {x:3}].reduce(
    (accumulator, currentValue) => accumulator + currentValue.x
    ,initialValue
);

console.log(total);
*/

/*
// ex54) reduce 1 - 배열의 모든 값 합산
let initialValue = 0;
let sum = [0, 1, 2, 3].reduce(function (accumulator, currentValue){
    return accumulator + currentValue;
}, 0)
console.log(sum); // 6

// 화살표 함수
var total = [0, 1, 2, 3].reduce(
    (accumulator, currentValue) => accumulator + currentValue, 0
)

console.log(total); // 6
*/

/*
// ex53)
let ar = ['tiger', 'cat', 'dog', 'lion']
// 글자가 3글자보다 작은거 필터링해서 출력
let br = ar.filter(v => v.length < 4);
console.log(br); // [ 'cat', 'dog' ]
*/

/*
// ex52) some(), filter()
// - some() : 하나라도 만족하면 true 
// - filter() : 원본 데이터에서 특정 조건에 만족하는 데이터만 뽑아내기
let ar = [1, 6, 11, 39, 21]

console.log(ar.some(v => v % 2 == 0)); // true -> 6

let br = ar.filter( v => v < 15);
console.log(br);
*/

/*
// ex51) every : 모두 만족하면 true
let ar = [1, 2, 10, 39, 20]
let br = [1, 2, 10, 50, 20]

function func(value){
    return value < 40;
}
console.log(ar.every(func));          // true - 모두 만족
console.log(br.every(func));          // false - 하나라도 실패
console.log(br.every((v) => v < 40)); // 위를 람다로 
console.log(br.every(                 // 생략 전 코드
    (v) => {return v < 40;}
));
*/

/*
//ex50) indexof 
let ar = ['tiger', 'cat', 'tiger', 'lion', 'apple']
console.log(ar.indexOf('lion'));
console.log(ar.indexOf('dog'));

console.log(ar.indexOf('lion', 3));      // 찾으려는 위치값 지정

console.log(ar.indexOf('tiger'));        // 앞에서 부터 찾기
console.log(ar.lastIndexOf('tiger'));    // 뒤에서 부터 찾기
*/

/*
// ex49) splice
let ar = [1,2,3];

// [시작위치, 삭제항목수, 추가항목,,,]
    // 1? 1부터 
    // 0?데이터를 삭제하지 마라
    // 10,20,30 추가해라
ar.splice(1,0,10,20,30); 
console.log(ar); // [1, 10, 20, 30, 2, 3]
ar.splice(1,2,88,99); 
console.log(ar); // [1, 88, 99, 30, 2, 3]
let br = [66, 55, 44, 33];
ar.splice(0,0,br); 
console.log(ar); // [66, 55, 44, 33]
*/

/*
// ex48) slice()
// slice * -> 원본 데이터 손상 X
let ar = [10, 20, 30, 40, 50, 60];

// [2,4)
// s <= x < e
let br = ar.slice(2, 4); // index 2, 3
console.log(br);         // [30, 40]
*/

/*
// ex47) sort4
let ar = [
    {n:30, s:'삼성'}, // n값에 대해 정렬
    {n:20, s:'롯데'},
    {n:10, s:'현대'},
];

function func(a, b){

    return a.n - b.n;
}

ar.sort(func);

console.log(ar);
console.log('test');
*/

/*
// ex47) sort3 - 절대값 구하기
let ar = [-52, 73, -43, 32];
// 7, 10, 7, 5
// 32, 52, 43, 72 
function func(a, b){
    let c = Math.abs(a);
    let d = Math.abs(b);

    return c - d;
}

ar.sort(func);

console.log(ar); // [32, -43, -52, 73]
*/

/*
// ex46) sort2
let ar = [52, 73, 43, 32];
// 7, 10, 7, 5
// 32, 52, 43, 72 
function func(a, b){
    let c = a / 10 + a % 10; // 활용도 △
    let d = b / 10 + b % 10; // 활용도 △

    return c - d;
}

ar.sort(func);

console.log(ar);
*/

/*
// ex45) sort1 : 문자열 기준으로 사전순으로 정렬
let ar = [80, 20, 10, 15];
ar.sort();
console.log(ar); // [10, 15, 20, 80] 

// 정렬된게 아니다?
let ar2 = [52, 273, 103, 32];
ar2.sort();
console.log(ar2); // [103, 273, 32, 52]

// 정렬해보자! - 인터페이스 방식
function func(a, b){
    // if(a > b){ 
    //     return +1; // 양수
    // } else { 
    //     return -1; // 음수
    // }
    // return (a > b) ? +1 : -1; // 순차정렬 // 역순정렬 : a < b
    return a - b; // js는 성립됨, 다른 언어는 안되는 경우도 있다
}

ar2.sort(func); // 함수 콜백 방식 사용
console.log(ar2); // [32, 52, 103, 273]
*/


/* 
// ex44) join, reverse, shift
// join()
let ar = ['tiger', 'lion', 'cat'];
console.log(ar.join());      // tiger,lion,cat
console.log(ar.join(''));    // tigerlioncat
console.log(ar.join('-'));   // tiger-lion-cat
console.log(ar.join(' + ')); // tiger + lion + cat

// reverse()
let ar2 = [10, 20, 30];
console.log(ar2.reverse());  // [30, 20, 10]

// shift() : 데이터 삭제
// unshift() : 데이터 추가
console.log(ar2.shift());      // 데이터 삭제 
console.log(ar2);              // [20, 10]
console.log(ar2.unshift(40));  // 데이터 추가
console.log(ar2);              // [40, 20, 10]

console.log(ar2.unshift(50,60,70));
console.log(ar2);              // [50, 60, 70, 40, 20, 10]
*/

/*
// ex43) concat()
let ar = [10, 20, 30];
let br = ar.concat(40);
console.log(ar);
console.log(br);

let cr = [40, 50, 60];
let dr = ar.concat(cr);

// [10, 20, 30, 40, 50, 60]
console.log(dr);
console.log('test');

// [10, 20, 30, [40, 50, 60]] 
ar.push(cr);
console.log(ar);

console.log('test');
*/


/*
// ex42) 배열의 함수2 - stack 구조
let ar = [80, 20, 10, 15];

// pop()* => 원본 데이터가 손상된다
let num = ar.pop(); // (빼기) <-> push (넣기) => stack 구조 
console.log(ar, num);

// push()*
ar.push(20);
console.log(ar, num);
*/

/*
// ex41) 배열의 함수1 

let ar = [80, 20, 10, 15];
console.log(ar, typeof(ar));

let br = ar.toString();
console.log(br, typeof(br));


let st01 = '80,20,10,15';
console.log(st01, typeof(st01));

let date = new Date(); // 날짜 관련 함수, 참고만(빈도수 ▽)
console.log(date);
console.log(date.toLocaleDateString());
*/

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

console.log(1);
console.log(ar);
console.log(2);

for (const v of ar) {
    console.log(v);
}

console.log(3);
console.log(ar);
console.log(4);

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