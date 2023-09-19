// const btn = document.querySelectorAll('.btn li');
// const tablist = document.querySelectorAll('.tab');

// for(let i =0; i< btn.length; i++){
//   btn[i].addEventListener('click', ()=>{
//     for(let j =0;j<btn.length;j++){
//       tablist[j].classList.remove('on');
//     }
//    tablist[i].classList.add('on');
//   })
// }

const btn = document.querySelectorAll(".btn li"),
  tablist = document.querySelectorAll("#tabs div");
for (let i = 0; i < btn.length; i++) {
  btn[i].addEventListener("click", (e) => {
    
    for (let j = 0; j < btn.length; j++) {
      tablist[j].classList.remove("on");
    }
    tablist[i].classList.add("on");
  });
}

