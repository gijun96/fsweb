//  carousel의 객체를 불러온다.
const carousel = document.querySelector(".carousel");
//  prevBtn 과 nextBtn의 객체를 불러온다.
const prevBtn = document.querySelector(".prev");
const nextBtn = document.querySelector(".next");

let index = 0;
// prev버튼 눌렀을때
prevBtn.addEventListener('click', () => {
    // 초기 화면에서 prevBtn을 클릭했을때
    if(index ===0) {
        // index값을 2로 하여 마지막 이미지로 이동
        index = 2;
        // 초기화면을 제외한 화면에서 prevBtn을 클릭했을때
    }else{
        // index값을 1씩 -하여 이전 이미지로 이동
        index -= 1;
    }
    // 버튼을 눌렀을때 index값을 1씩 추가하여 이미지의 x값을 i를 곱하여 옆으로 밀어준다.
    carousel.style.transform = `translate3d(-${500 * index}px, 0, 0)`;
});
    

// next 버튼 눌렀을때
nextBtn.addEventListener('click', () =>{
    // 이미지의 index값이 2보다 작을때(마지막 이미지가 아닐 경우)
    if(index <2){
        // 이미지의 index값을 1씩 증가하여 다음 이미지로 이동
        index += 1;
        // 현재 마지막 이미지을 경우
    }else{
        // 이미지의 index값을 0으로 하여 첫번쨰 이미지로 이동
        index = 0;
    }
    // 버튼을 눌렀을때 index값을 1씩 추가하여 이미지의 x값을 i를 곱하여 옆으로 밀어준다.
    carousel.style.transform = `translate3d(-${500 * index}px, 0, 0)`;
});

