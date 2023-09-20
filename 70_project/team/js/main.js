$('.sec1_slider').bxSlider({
  auto: true,
  autoControls: false,
  stopAutoOnClick: true,
  pager: true,
  slideWidth: 1600,
  controls: true,
  speed: 500,
  pause: 4000
});

$('.item_list').bxSlider({
  pager: true,
  slideWidth: 345,
  minSlides: 3, 
  maxSlides: 3,
  controls: true,
  auto: true,  
  stopAutoOnClick: true,
  button: true
});

document.querySelector(".item_list").style.background = "none";


const  popup = document.querySelector(".popup");
const  popup_X = document.querySelector(".popup_X");

popup_X.addEventListener("click", ()=>{
  popup.style.display = "none";
})


let category = document.querySelectorAll(".category li");
// console.log(category);

const ca_name = document.querySelector(".category_sub");
// window.innerWidth
// setInterval(windowWidth, 500);
// function windowWidth(){
//   console.log(window.innerWidth);
// }

window.onresize = function(){tablet()};

function tablet(){
  if(window.innerWidth < 992){
    category[1].style.display = "none";
    category[3].style.display = "none";
    category[4].style.display = "none";
    category[6].style.display = "none";
  }else if(window.innerWidth > 992){
    category[1].style.display = "block";
    category[3].style.display = "block";
    category[4].style.display = "block";
    category[6].style.display = "block";
  }
}

tablet();


const map =document.querySelector('.map');
const map_popup = document.querySelector('.popup');

map.addEventListener("click", ()=>{
  map_popup.style.display = "flex";
})

const pop_b_arr = document.querySelectorAll(".popup_b p");
console.log(pop_b_arr[0]);
console.log(pop_b_arr[1]);
const closeBtn = document.querySelectorAll(".close_btn");
// close_btn
console.log(closeBtn);

pop_b_arr[0].addEventListener("click", ()=>{
  map_popup.style.display = "none";
})

pop_b_arr[1].addEventListener("click", ()=>{
  map_popup.style.display = "none";
})