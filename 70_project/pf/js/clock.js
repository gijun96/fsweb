
function setClock(){
    const dateinfo = new Date();
    const hour = modifyNumber(dateinfo.getHours());
    const min = modifyNumber(dateinfo.getMinutes());
    const year = dateinfo.getFullYear();
    // monthIndex를 반환해주기 때문에 1을 더해준다.
    const month = dateinfo.getMonth()+1;
    const date = dateinfo.getDate();
    document.getElementById('time').innerHTML = hour + ":" + min;
    document.getElementById('date').innerHTML = year + "년" + month + "월" + date + "일";

}
// parseInt() : 문자열을 숫자로 변환
function modifyNumber(time){
    if(parseInt(time)<10){
        return "0" + time;
    }
    else
        return time;
    
}
window.onload = function(){
    setClock();
    // 1초마다 setClock 함수 실행
    setInterval(setClock, 1000); 
} 

