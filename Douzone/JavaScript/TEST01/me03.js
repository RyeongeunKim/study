
// ex6
console.log('먼저');

let num = 0;
let id = setInterval(() => {
        console.log(num++);
    }, 
    2000
);

setTimeout( 
    ()=>{
        clearInterval(id)  
        console.log('출력될까요');
    },
    13000 
)

console.log('누가');

/*
// ex5)
// f1 = function(){
//     console.log('lion');
//     return function(){
//         console.log('elephant');
//     }
// };

// f1()();

(()=>{
    console.log('lion');
    return ()=>{
        console.log('elephant');
    }
})()();
*/

/*
// ex4)
let f1 = function(fc){  
    console.log('빨리 ');
    fc();   
};


let f2 = function(){
    console.log('퇴근시켜줘');
};

f1(f2);
*/

/*
// ex3) 
const arr1 = [6, 4, 2, 1, 2, 4, 3, 2];

// 중복제거1
const filterArr1 = arr1.filter((element, index)=>{
    return arr1.indexOf(element) === index;
});

console.log(filterArr1);

const arr2 = [6, 4, 2, 1, 2, 4, 3, 2];

// 중복제거2
let filterArr2 = [];
arr2.forEach((element)=>{
    if(!filterArr2.includes(element)) { // 배열이 특정 요소를 포함하고 있는지 판별
        filterArr2.push(element);
    }
});

console.log(filterArr2);


// 중복제거3
const arr3 = [6, 4, 2, 1, 2, 4, 3, 2];
const a = new Set(arr3); // Set 객체는 자료형에 관계 없이 원시 값과 객체 참조 모두 유일한 값을 저장할 수 있다

const uniqueArr = [...a]; // a에 대한 모든 요소

console.log(uniqueArr);
*/

/*
// ex2) 중요
let a = 123;
let b = '123';
let c = {name : '핑핑이'};
let d = {name : '핑핑이'};
let f = c;
f.name = '집게사장';

console.log(a == b); // true
console.log(a === b); // false
console.log(c === d); // false // 객체 -> 다른 메모리 주소를 할당받음
console.log(c === f); // true // f <-- c => 같은 메모리 주소
console.log(c, f); // 집게사장, 집게사장
*/

/*
// ex1) 
let a = 2;
let b = 3; 
let c = 3; 
console.log(a**b**c); // 거듭제곱은 뒤에서 부터 계산 => console.log(a**(b**c));
                      // 2 3 3 => 2의 3의 3제곱승 = 134217728
console.log(Math.pow(a, b)); // 제곱구하는 함수
*/
