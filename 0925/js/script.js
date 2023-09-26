const list = document.querySelector(".list");
let i = 0;
function auto(){
  setInterval(() => {
    if (i === 3){
      setTimeout(() => {
      i=0;
      list.style.transition = "none";
      list.style.transform = `translateX(-${1200 * i}px)`;
    }, 500);
  }
  list.style.transition = ".5s";
  list.style.transform = `translateX(-${1200 * i}px)`;
  i++;
}, 2000);
}
auto();
