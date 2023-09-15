const wrap = document.querySelector(".wrap");
const sec = document.querySelectorAll(".sec");
const sec_h = sec[0].offsetHeight;
// console.log(sec_h);
const html = document.documentElement;
let scrollY_val = html.scrollTop;




for (let i = 0; i < sec.length; i++) {
  sec[i].addEventListener("wheel", (e) => {
    // 기본 이벤트 제거
    e.preventDefault();
    // 마우스 휠 내림
    if (e.deltaY > 0) {
      if (e.currentTarget === sec[sec.length - 1]) return;
      scrollY_val += sec_h;
      // console.log(event.currentTarget);
    } else {
      // 마우스 휠 올림
      if (e.currentTarget === sec[0]) return;
      // console.log(event.currentTarget);
      scrollY_val -= sec_h;
    }
    html.scrollTop = scrollY_val;
  });
}
