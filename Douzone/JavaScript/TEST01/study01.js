


/*
//Q.8
let str = '';
str += 'let a = 10;'
str += 'console.log(a);'
console.log(str);
eval(str);
*/

/*
//Q.7
// 1.
function t (a) {
    return function (b) {
    return a + b;
    }
}
    
//2
t = (a) => {
    return function (b) {
        return a + b;
    }
}

//3
t = (a) => {
    return (b) => { return a + b };
}
console.log(t(10)(20));

//4
t = (a) => (b) => a + b;

//5
t = a => b => a + b; // 인수 전달이 한 개일 때만 괄호 생략 가능
*/

/*
//Q.6 
let t = {
    name:'호랑이',
    age:100
}

let k = {
    name:'코끼리',
    age:200
}

let d = {
    name:'독수리',
    age:300
}

for (const key in k) {
    console.log(k[key]);
}

console.log(k.name, k.age);

function Zoo(name, age){
    let obj = {}
    obj['name'] = name;
    obj['age'] = age;
    this.showInfo = ()=>{
        console.log(name + " " + age);
    }
}

let ar = [];
ar.push(new Zoo('호랑이', 20));
ar.push(new Zoo('기린', 30));
ar.push(new Zoo('요요', 12));

for (let i in ar) {
    ar[i].showInfo();
}
*/

// function Student(){
//     this.name = '홍길동'
//     this.age = 20
//     this.stuNum = 20211002
//     this.showInfo = ()=>{
//         console.log(this.name + " " + this.age + " " + this.stuNum);
        
//     }
// }

// let student = new Student();
// student.showInfo();

/*
//Q.5 클로즈 함수

// function car(){
//     let a = 1;
// }

// function tire(fn){

// }

// car();
// car();

let a = 1;
let car = function(){
    return function(){
        console.log("타이어 교체 " + a);
        a++;
    }
}

car()();
car()();
*/


/*
//Q.4 즉시 실행 함수(애로우 이용)
function f1(){
    console.log('1');
    return function(n){
    console.log(n);
    }
    }
    f1()(5);

(()=>{
    console.log('1');
    return function(n){
        console.log(n);
        
    }
})()(5);
*/
/* 
//Q.3 재귀함수
function fact(n) {
    if (n == 1) {
    return 1;
    } else {
    return n * fact(n - 1);
    }
    }
    console.log("5! = " + fact(5) );
*/

/*
//Q.2 비동기 코드 -> 동기식 코드 
function buy_async(item, price, quantity) {
    console.log(item + " 상품을 " + quantity + "개 골라서 점원에게 주었습니다.");

    (function(){
        console.log("계산이 필요합니다.");
        var total = price * quantity;
        return function(){
            console.log(total + "원을 지불하였습니다.");
        }  
    })()();
}
    
var tot = buy_async("고구마", 1000, 5);
*/

/*
// Q.1 생성자 함수
function Student(){
    this.name = '홍길동'
    this.age = 20
    this.stuNum = 20211002
    this.showInfo = ()=>{
        console.log(this.name + " " + this.age + " " + this.stuNum);
        
    }
}

let student = new Student();
student.showInfo();
*/
