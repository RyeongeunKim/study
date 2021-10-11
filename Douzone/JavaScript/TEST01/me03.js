
// ex13) 출력값을 적으시오
function F1(){
    this.a = 10
    this.f = function(){}
  }
    
  let ins1 = new F1();
  let ins2 = new F1();
  console.log(ins1.f === ins2.f); 
  console.log(ins1.a === ins2.a); 


/*
// ex12) 출력값을 적으시오
let obj = {
    a:10,
    b:'호랑이'
  }
  
let str = JSON.stringify(obj)  
console.log(typeof(str));	// string


let obj2 = JSON.parse(str);
console.log(typeof(obj2));	// object
*/

/*
// ex11) 배열 CRUD

let arr = ['고라니', 15, '긴꼬리원숭이', '앵무새', 200];
let ar = ['안녕', '내'];
let br = ['이름은', '엄준식'];

// 1. 배열의 마지막 요소를 출력하세요
//console.log(arr[arr.length-1]);
//let a = arr.pop();
//console.log(a);
console.log(arr.pop());

// 2. '고라니123'을 추가하세요
arr.push('고라니123');
console.log(arr);


// 3. concat()함수를 이용하여 두 배열을 합치시오
let cr = ar.concat(br);
console.log(cr);

// 4. join()함수를 이용하여 cr을 하나의 문자열로 만드시오
// ex) 안녕 내 이름은 엄준식
console.log(cr.join(' '));


// 5. unshift(), shift() 함수를를 이용하여 안녕 내 이름은 엄준식을, 잘가 내 이름은 엄준식으로 바꾸시오
cr.shift();
console.log(cr);
cr.unshift('잘가');
console.log(cr);
*/

/*
// ex10) forin, forof
let ar = [
    {
        n:'호랑이',
        a:10,
    },    
    {
        n:'코끼리',
        a : 20,
    },
    {
        n:'독수리',
        a: 30,
    },
];


// 1. '호랑이', '코끼리', '독수리'를 출력하시오
for(const key in ar){
    // console.log(ar[key].n);
    let aa = ar[key]
    console.log(aa.n);
    
}

// 2. '호랑이', '코끼리', '독수리'의 index번호를 출력해보시오
for(const key of ar){
    let a = ar.indexOf(key)
    console.log(a);
    //console.log(ar.indexOf(key));
}
*/

/*
// ex9) 출력값을 적으시오

const fruits = ['apple', 'banana', 'orange'];

const a = fruits.forEach((item, i)=>{
  return `${item} - ${i}`;
});


// 1
console.log(a); // [ 'apple - 0', 'banana - 1', 'orange - 2' ]

const b = fruits.map((item, i)=>{
    return  `${item} - ${i}`;
})

// 2
console.log(b); // [ { id: 0, name: 'apple' } { id: 1, name: 'banana' } { id: 2, name: 'orange' }  ]

const c = fruits.map((item, i)=>{
    return {
        id : i,
        name : item
    }
})

c.forEach(item => console.log(item));

// 3
console.log(c); // [ { id: 0, name: 'apple' }, { id: 1, name: 'banana' }, { id: 2, name: 'orange' }  ]
*/

/*
// ex8) 다음 식을 삼항연산자로 바꾸시오

let cr = [0, 1, 2, 3];

let dr = cr.map(
     // (num) => (num % 2) ? 'odd' : 'even'
     (num) => {return (num % 2) ? 'odd':'even'}
);

console.log(dr);
*/

/*
// ex7) 객체 CRUD
let obj = {
    a:10,
    b:20,
    f1: ()=>{
        console.log('oo');
    }
};

obj.a = 300;
obj.tiger = 50;
delete(obj.b);
console.log(obj);
*/

/*
// ex6)
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
*/

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
