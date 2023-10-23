const scrNav = document.querySelectorAll(".scrollNav li");
const article = document.querySelectorAll("article");


for (let i = 0; i < scrNav.length; i++) {
  scrNav[i].addEventListener("click", () => {
    for (let j = 0; j < scrNav.length; j++) {
      scrNav[j].classList.remove("on");
      article[j].classList.remove("on");
    }
    scrNav[i].classList.add("on");
    article[i].classList.add("on");
  });
}
