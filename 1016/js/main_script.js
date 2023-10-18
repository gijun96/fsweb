const circles = document.querySelector(".contact_circle");
const s2_t = document.querySelector(".s2_content .s2_tit");
const s2_v = document.querySelector(".s2_content .s2_video");
const s3_t = document.querySelector(".s3_tit");
const s3_li = document.querySelectorAll(".s3_ul li");
const html = document.documentElement;
const s4_t = document.querySelector(".s4_tit");
const s4_li = document.querySelector(".s4_li");

window.addEventListener("scroll", () => {
  let scY = html.scrollTop;
  console.log(scY);
  circles.style.transform = `translateY(${scY}px)`;

  if (scY > 700) {
    s2_t.classList.add("active");
    s2_v.classList.add("active");
  } else {
    s2_t.classList.remove("active");
    s2_v.classList.remove("active");
  }

  if (scY > 1300) {
    s3_t.classList.add("active");
    for (let i = 0; i < s3_li.length; i++) {
      s3_li[i].classList.add("active");
    }
  } else {
    s3_t.classList.remove("active");
    for (let i = 0; i < s3_li.length; i++) {
      s3_li[i].classList.remove("active");
    }
  }

  if(scY > 1900){
    s4_t.classList.add("active");
      s4_li.classList.add("active");
    
  }else{
    s4_t.classList.remove("active");
      s4_li.classList.remove("active");
  }
});
