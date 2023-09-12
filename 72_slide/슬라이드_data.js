// 데이터 정의
const imgObj = {
  imgData1: {
    imgSrc: "./assets/pic1.jpg",
    imgAlt: "img1",
  },
  imgData2: {
    imgSrc: "./assets/pic2.jpg",
    imgAlt: "img2",
  },
  imgData3: {
    imgSrc: "./assets/pic3.jpg",
    imgAlt: "img3",
  },
  imgData4: {
    imgSrc: "./assets/pic4.jpg",
    imgAlt: "img4",
  },
  imgData5: {
    imgSrc: "./assets/pic5.jpg",
    imgAlt: "img5",
  },
  imgData6: {
    imgSrc: "./assets/pic6.jpg",
    imgAlt: "img6",
  },
  imgData7: {
    imgSrc: "./assets/pic7.jpg",
    imgAlt: "img7",
  },
};

// 슬라이드 이미지 개수
// let slideCount = 10;

// 데이터 정의
// const imgObj = {};

// 슬라이드 이미지 생성
/* for (let i=1; i<=slideCount; i++) {
            console.log(i);
            imgObj['imgData' + i] = {
                imgSrc: `/assets/images/pic${i}.jpg`,
                imgAlt: `이미지${i}`
            };
        } */

// 슬라이드 이미지 개수 초기화
let slideCount = 0;

// for ~ in 제어문
for (let i in imgObj) {
  slideCount++;
  // console.log(slideCount);
}

// 요소 선택
const list = document.querySelector(".slide");

// 이미지를 요소에 삽입
for (let i = 1; i <= slideCount; i++) {
  list.innerHTML += `
                <li class="items"><img src="${
                  imgObj["imgData" + i].imgSrc
                }" alt="${imgObj["imgData" + i].imgAlt}"></li>
                `;
}

const listItem = document.querySelectorAll(".slide li");
// 이전 버튼
const prevBtn = document.querySelector(".prevBtn");
// 다음 버튼
const nextBtn = document.querySelector(".nextBtn");
// 자동 슬라이드
// 반복실행: setInterval(function(){코드}, 시간);
// 1회 실행: setTimeout(function(){코드}, 시간);

// 3초 마다 moveSlide() 실행
// setInterval(moveSlide, 3000);
let i = 0;
let crn = 0;

prevBtn.addEventListener("click", () => {
  // tar = e.target;
  // console.log(tar);
  if (crn === 0) {
    i === 5;
  }
  prevSlide();
  crn--;
  console.log(i);
});

nextBtn.addEventListener("click", () => {
  // tar = e.target;
  // console.log(tar);
  if (crn === 0) i += 1;
  // } else if (crn === slideCount) {
  //   i === 0;
  // }
  nextSlide();
  crn++;
  // console.log(i);
});

function prevSlide() {
  // console.log(i);
  listItem[i].style.right = "0%";
  listItem[i].style.zIndex = "1";

  for (let j = 0; j < slideCount; j++) {
    if (i !== j) {
      listItem[j].style.right = "-100%";
      listItem[j].style.zIndex = "-1";
    }
  }

  setTimeout(function () {
    listItem[i].style.right = "100%";
  }, 500);

  i--;
  if (i === 0) i = 5;
}

function nextSlide() {
  // console.log(i);
  listItem[i].style.left = "0%";
  listItem[i].style.zIndex = "1";

  for (let j = 0; j < slideCount; j++) {
    if (i !== j) {
      listItem[j].style.left = "-100%";
      listItem[j].style.zIndex = "-1";
    }
  }

  setTimeout(function () {
    listItem[i].style.left = "100%";
  }, 500);

  i++;
  if (i === 5) i = 0;
}

// 슬라이드가 넘어갈 때 클릭하면 반응하지않음
