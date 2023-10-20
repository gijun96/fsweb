


const time1 = document.querySelector(".time1");
const time2 = document.querySelector(".time2");

setInterval(() => {
  const today = new Date();
  const year = today.getFullYear();
  const month = (today.getMonth() + 1).toString().padStart(2, "0");
  const date = today.getDate().toString().padStart(2, "0");
  let day = today.getDay();
  switch (day) {
    case 0:
      day = "일";
      break;
      case 1:
      day = "월";
      break;
    case 2:
      day = "화";
      break;
      case 3: 
      day = "수";
      break;
      case 4: 
      day = "목";
      break;
      case 5:
        day ="금";
        break;
        case 6:
        day ="토";
        break;
  }
  let amPm ="오전";
  let hour = today.getHours().toString().padStart(2, "0");
  if(hour >12){
    amPm = "오후";
    hour -=12;
    hour = hour.toString().padStart(2, "0");
  }
  const min = today.getMinutes().toString().padStart(2, "0");
  const sec = today.getSeconds().toString().padStart(2, "0");

  time1.innerText = `${year}년 ${month}월 ${date}일 ${day}요일\n`;
  time2.innerText = `${amPm} ${hour} : ${min} : ${sec}`;
},1000);
