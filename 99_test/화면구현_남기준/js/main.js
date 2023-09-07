const sideOn_btn = document.querySelector(".sideOn_btn");
const side_menu = document.querySelector(".side_menu");
const ta_header = document.querySelector(".ta_header");
ta_header.addEventListener("mouseover", ()=>{
  side_menu.style.transform = "translateX(250px)";
})
ta_header.addEventListener("mouseout", ()=>{
  side_menu.style.transform = "translateX(-250px)";
})

//   /* .sideOn_btn img:hover {
  // transform: rotate(90deg);
  // transition-duration: 0.5s;
// } */
$('.sec1_slider').bxSlider({
  auto: true,
  autoControls: false,
  stopAutoOnClick: true,
  pager: true,
  slideWidth: 1600,
  controls: false,
});

$('.item_list').bxSlider({
  pager: false,
  slideWidth: 345,
  minSlides: 3, 
  maxSlides: 3,
  controls: true,
  auto: true  
});

document.querySelector(".item_list").style.background = "none";


let category = document.querySelectorAll(".category li");
console.log(category);

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
