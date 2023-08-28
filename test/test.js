// 테이블을 불러온다
const t1 = document.querySelector('.t1');
const t2 = document.querySelector('.t2');
// // 버튼을 불러온다
const btn1 = document.querySelector('.nbtn1');
const btn2 = document.querySelector('.nbtn2');
// 버튼을 클릭했을때 이벤트

// // 함수
function table1(){
    t2.style.display
    t1.style.display = 'block';
    console.log('btn1 click');
}
function table2(){
    t2.style.display = 'none';
    t1.style.display = 'block';
    console.log('btn2 click');
}
// 실행
btn1.addEventListener('click', table1);
btn2.addEventListener('click', table2);
