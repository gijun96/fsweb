const list = document.querySelector(".list");
let i = 0;
setInterval(() => {
  if (i === 3){
    list.style.transition = "none";
    list.style.transition = "delay(.5s)";
    i=0;
  }
  list.style.transition = ".5s";
  list.style.transform = `translateX(-${1200 * i}px)`;
  console.log(i);
  i++;
}, 3000);
