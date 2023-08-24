const prev_btn = document.querySelector(".btn_l");
const next_btn = document.querySelector(".btn_r");

const item_li = document.querySelector(".item_list");

let index = 0;

prev_btn.addEventListener("click", () => {
  if (index === 0) {
    index = 2;
    // prev_btn.style.display = 'none';
  } else {
    index -= 1;
  }
  console.log(index);
  indicator(index);
  item_li.style.transform = `translateX(-${1320 * index}px)`;
});

next_btn.addEventListener("click", () => {
  if (index === 2) {
    index = 0;
  } else {
    index += 1;
  }
  item_li.style.transform = `translateX(-${1320 * index}px)`;
  indicator(index);
  console.log(index);
});


// 인디케이터 클릭 시 translateX(78px);
// sec3 인디케이터
const cur_bar = document.querySelector('list_bar');


const ind1 = document.querySelector('ind1');
const ind2 = document.querySelector('ind2');
const ind3 = document.querySelector('ind3');
function indicator(){
  ind1.addEventListener("click", () =>{
    item_li.style.transform = `translateX(-${1320 * index}px)`;
    cur_bar.style.transform = `translateX(-${78 * index}px)`
    console.log("event 발생");
  })
  ind2.addEventListener('click', () =>{
    cur_bar.style.transform = `translateX(-${78 * index}px)`
  })
  ind3.addEventListener('click', () =>{
    cur_bar.style.transform = `translateX(-${78 * index}px)`;
  })
}