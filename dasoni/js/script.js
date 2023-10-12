const sublist = document.querySelectorAll(".sub li a");

for(let i =0;i<sublist.length;i++){
    sublist[i].addEventListener("mouseenter", ()=>{
      for(let j=0; j<sublist.length;j++){
        sublist[j].classList.remove("on");
      }
      sublist[i].classList.add("on");
    }), "mouseleave", ()=>{
      for(let j=0; j<sublist.length;j++){
        sublist[j].classList.remove("on");
      }
    }
}