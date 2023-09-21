const circle =document.querySelector('.circle');
let number = document.getElementById("number");
let counter = 0;
const maxVal = 65;
const stk_dsharr = 460;
// let offset = (stk_dsharr *(maxVal/100));
setInterval(()=>{
  if(counter === maxVal ){
    clearInterval();
  }else{
    counter += 1;
    number.innerHTML = counter + "%";
    let = offset --;
  }
  // circle.style.strokeDashOffset = offset;
}, 30)

