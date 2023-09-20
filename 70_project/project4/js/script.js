const tit1 = document.querySelector('.sec3 .tit1');
const tit2 = document.querySelector('.sec3 .tit2');
const proBtn = document.querySelector('.sec3 .proBtn');
const des = document.querySelector('.des');
const proImg = document.querySelector('#product');
window.addEventListener('scroll', ()=>{
    console.log(document.documentElement.scrollTop);
    let st = document.documentElement.scrollTop;
    if(st >1700){
      tit1.style.transform = 'translateX(0)';
      tit2.style.transform = 'translateX(0)';
      proBtn.style.transform = 'translateX(0)';
      proImg.style.scale ='1';
      des.style.opacity = '1';
    }else{
      tit1.style.transform = 'translateX(-400px)';
      tit2.style.transform = 'translateX(-400px)';
      proBtn.style.transform = 'translateX(-400px)';
      proImg.style.scale ='1.5';
      des.style.opacity = '0';

    }
})

// //carousel
// sec2 tab
const sec2_btn = document.querySelectorAll(".btn li"),
  tablist = document.querySelectorAll("#tabs div");
for (let i = 0; i < sec2_btn.length; i++) {
  sec2_btn[i].addEventListener("click", (e) => {
    e.preventDefault();
    for (let j = 0; j < sec2_btn.length; j++) {
      tablist[j].classList.remove("on");
    }
    tablist[i].classList.add("on");
  });
}


// //sec2 tab

// sec4 video

      // 변수 선언
      const vidWrap = document.querySelector(".vid"),
        vid = document.querySelector(".vid video"),
        sec4_btn = document.querySelector(".sec4 .btn"),
        btnSpan = document.querySelector(".btn span");

      // 다중 이벤트 인식
      vidWrap.addEventListener(
        "mouseenter",
        () => {
          sec4_btn.style.display = "block";
        },
        "mouseleave",
        () => {
          sec4_btn.style.display = "none";
        }
      );
      // btn click 이벤트 인식
      sec4_btn.addEventListener("click", () => {
        vid.play();
        btnSpan.classList.toggle("on");
        if (btnSpan.classList.contains("on")) vid.pause();
      });

