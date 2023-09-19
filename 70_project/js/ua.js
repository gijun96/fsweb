
// index.html => navigator.userAgent를 구분하여 location.href를 실행
// main.html => window일때 실행
// m/index.html => mobile일때 실행
// 구분하여 구성


const ua = navigator.userAgent.toLowerCase();
if(ua.indexOf('window')>0){
  // ua에 window 문자열이 있으면 데스크탑 http://id.dothome.co.kr/index.html 
  location.href = 'http://nikea.dothome.co.kr/main.html';
  // console.log("Window User");
}else{
  // ua에 window 문자열이 없으면 모바일 http://id.dothome.co.kr/m/index.html
  location.href = 'http://nikea.dothome.co.kr/m/index.html';
}