/*
//Q.11
function F2(){
    this.a = 10
    }
    let ins1 = new F2();
    let ins2 = new F2();
    
    // 여기에 코드 작성
    
    console.log(ins1.f === ins2.f);
*/

/*
//Q.10
function solution(s) {
    let ar = s.split(' ');
    ar.sort(func);

    function func(a, b){ // 첫번째 인자, 두번째 인자 비교
        return a - b;
    }

    var answer = ar[0] + ' ' + ar[ar.length-1]
    return answer;
    }
console.log(solution('1 2 3'));
*/

/*
//Q.9
    // 변경 후 좌석
    //***코드***
    // 변경 전 좌석
    let info = [
    {name:'김민건', seat:1},
    {name:'오정환', seat:2},
    {name:'박정민', seat:3},
    {name:'송용민', seat:4},
    {name:'김나은', seat:5},
    {name:'최예준', seat:6},
    {name:'최진웅', seat:7},
    {name:'이우주', seat:8},
    {name:'박주은', seat:9},
    {name:'박진현', seat:10},
    {name:'김령은', seat:11},
    {name:'김경도', seat:12},
    {name:'강아름', seat:13},
    {name:'윤성준', seat:14},
    {name:'김상연', seat:15},
    {name:'박유나', seat:16},
    {name:'이태훈', seat:17},
    {name:'최영진', seat:18},
    {name:'이용연', seat:19},
    {name:'강동하', seat:20},
    {name:'채송화', seat:21},
    {name:'김도훈', seat:22},
    {name:'이재현', seat:23},
    {name:'김수인', seat:24},
    {name:'이수빈', seat:25},
    {name:'김진우', seat:26}
    ]

    // 변경 후 좌석
    let info2 = [
    {name:'김민건'},
    {name:'오정환'},
    {name:'박정민'},
    {name:'송용민'},
    {name:'김나은'},
    {name:'최예준'},
    {name:'최진웅'},
    {name:'이우주'},
    {name:'박주은'},
    {name:'박진현'},
    {name:'김령은'},
    {name:'김경도'},
    {name:'강아름'},
    {name:'윤성준'},
    {name:'김상연'},
    {name:'박유나'},
    {name:'이태훈'},
    {name:'최영진'},
    {name:'이용연'},
    {name:'강동하'},
    {name:'채송화'},
    {name:'김도훈'},
    {name:'이재현'},
    {name:'김수인'},
    {name:'이수빈'},
    {name:'김진우'}
    ]

    // 중복 좌석이 발생하지 않도록 반복문을 돌면서 새로 지정된 좌석 번호들은 stack 변수에 담고
    // 이를 반복문을 돌 때마다 검사를 통해 중복 좌석이 발생하지 않도록 합니다.
    // 해당 stack 변수를 아래의 for문 내에서 활용하세요.
    const stack = [];

    for(let i=0; i<26; i++){

        // 이전 좌석 번호를 담는 변수
        let temp = info[i].seat;
        // 랜덤 좌석을 담을 변수
        let randSeat;

        while(true){
            // 구현 : 랜덤 좌석 부여를 위해 randSeat 초기화하세요. 주의 사항 : 정수입니다. 실수 아닙니다.
            randSeat = Math.floor((Math.random()*26)+1); // 1~26
            if((temp === randSeat) || (stack.includes(randSeat))){
                // 구현 : 조건에 충족할 때 처리
                continue;
            }

            else{
                // 구현 : 조건에 충족하지 않을 때 처리
                stack.push(randSeat);
                break;
            }
        };
        // 랜덤좌석 부여.
        info2[i]['seat'] = randSeat;

    }

    console.log('=============변경 전 좌석=============');
    console.log(info);
    console.log('=============변경 후 좌석=============');
    console.log(info2);
*/
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
// Q.5 정답
let a = 1;  
function car(){
    // var a = 1;
    function kia(){
        console.log(a++);
    }

    tire(kia);
}
function tire(fn){
    console.log('타이어 교체');
    fn();
}

car();
car(); 
*/

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
//Q.2 정답
// 콜백함수
// 비동기
function buy_async(item, price, quantity) {
    console.log(item + " 상품을 " + quantity + "개 골라서 점원에게 주었습니다.");
    setTimeout(function () {
        console.log("계산이 필요합니다.");
        var total = price * quantity;
        return total;
    }, 1000);
}

function pay(tot) { 
    console.log(tot + "원을 지불하였습니다."); 
}
// var tot = buy_async("고구마", 1000, 5);
// pay(tot);

// 동기
function buy_sync(item, price, quantity, callback) {
    console.log(item + " 상품을 " + quantity + "개 골라서 점원에게 주었습니다.");
    setTimeout(function () {
        console.log("계산이 필요합니다.");
        var total = price * quantity;
        callback(total);
    }, 1000);
}
buy_sync("호박", 2000, 3, pay);
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
// Q.1 정답
function Student(name,age,stuNum){
    this.name = name
    this.age = age
    this.stuNum = stuNum
​
    this.showInfo = ()=>{
        console.log(name,age,stuNum);
    }
}
let stu01 = new Student('홍길동',20,20211002);
stu01.showInfo();
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