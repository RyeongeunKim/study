var arr = [];

for (var i = 0; i < 5; i++) {  // var는 전역이기 때문에 for문 작업후 i값은 5가 되어 있다
    arr[i] = () => i           // 만약 let(지역변수)를 사용시 0,1,2,3,4 값을 출력한다
}

for(var index of arr){
    console.log(index());  // 5,5,5,5,5
}
console.log('-------------------');
arr = [];
for(var j = 0;j<5;j++){
    arr[j] = function(id) {
        console.log('id1 '+id);
        return function() {
            console.log('id2 '+id);
            
            return id;
        }
    }(j)
    //arr[j] = ((id)=>()=>id)(j)
}

for(let index2 in arr){
    console.log(arr[index2]());  // 0,1,2,3,4
}