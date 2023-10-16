
$(function(){
  setTimeout(function(){
    $(".slider li .text0").addClass('on');
    $(".slider li .atext0").addClass('on');
  });
  var bx = $(".slider").bxSlider({
    auto: true,
    controls:false,
    pager:false,
    mode:'fade',
    pause:3000, // 실제 슬라이드 속도 - setInterval과 비슷
    autoHover: true,
    onslideBefore: function(){

    },
    onSlideAfter: function(){

      var k = bx.getCurrentSlide();
      $(".slider li").find('h2').removeClass('on');
      $(".slider li").find('p').removeClass('on');
      $(".slider li .text"+k).addClass('on');
      $(".slider li .atext"+k).addClass('on');
    },
  });


  const sublist = document.querySelectorAll(".sub li a");

  for(let i =0;i<sublist.length;i++){
      sublist[i].addEventListener("mouseenter", ()=>{
        for(let j=0; j<sublist.length;j++){
          sublist[j].classList.remove("on");
        }
        sublist[i].classList.add("on");
      }, "mouseleave", ()=>{
          EventTarget.classList.remove("on");
      });
  }

});


