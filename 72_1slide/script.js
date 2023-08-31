
// {}: 객체(object)
// 객체.메서드()
// 자스 데이터 : 숫자, 문자열, 불린, 객체{}, ...
/*
  객체 정의
  {
    속성: 값,
    속성: 값,
    속성: 값,
    속성: 값,
    속성: 값;
  }
 */
// 요소.메서드()
// $(jquery선택자).bxSlider();


$('.bxslider').bxSlider({
  // auto: true,
  // autoControls: true,
  // stopAutoOnClick: true,
  pager: true,
  slideWidth: 1320,
  minSlides:3,
  maxSlides:3,
  moveSlide:3
});

const wrapper = document.querySelector(".bx-wrapper");
wrapper.style.border= "none";