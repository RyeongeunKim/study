// ex8) 가변 인수 전달
let f5 = ((...args) => {
    console.log(arguments);
    
    console.log(typeof(args));
    console.log(args.length);
    let sum = 0;
    for (let arg of args) {
        sum += arg;
    }
    console.log(sum);
})(10, 20, 30);


// 함수 생성

// 호출

///////////////////////////////////////////////////////////////////
// ex7) 함수 기본꼴 4가지(인수전달, return)

// 인수전달 X, return X

// 인수전달 O, return X

// 인수전달 X, return O

// 인수전달 O, return O

// 호출


////////////////////////////////////////////////////////////////
// ex6) 생성자 함수

// 선언


// 사용 


/*
// ex5) 즉시 실행 함수 예제

// 기본꼴
function f4(num){
    console.log(num);
}
f4(100);

// 즉시 실행 함수


// 위의 코드를 람다


(function(dt){
    let start = new Date().getTime();
    while(new Date().getTime()<start+dt);
})(5000);
console.log('test');
*/


// ex4) 함수 표현법

// 1. 기본꼴(Hoisting O)

// 2. 함수를 변수에 담기(Hoisting X)

// 3. 람다식(많이 사용)

// 4. 즉시 실행 함수(IIFE) : 만들고 바로 호출

// 5. 위의 코드를 람다로 사용함


/////////////////////////////////////////////////////////////////////////////////////////

/*
// ex3) 자습 - 비동기 처리(드림코딩)
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
// ex2) 짧은 if(단줄 처리)
let a = 10;
if(a > 3){
    console.log('test1');
}
a > 3 && console.log('test2');

if(!false){
    console.log('test3');
}
false || console.log('test4');
*/

/*
// ex1) Date 함수
let r = +'2000';
console.log(typeof(r));

let start = new Date().getTime();
console.log(start);
for(var i = 0; new Date().getTime() < start + 1000; i++){
}
console.log(i);

while(new Date().getTime()<start+2000); 
console.log("호랑이");
*/