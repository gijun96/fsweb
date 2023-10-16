$(function () {
  setTimeout(function () {
    $(".slider li .text0").addClass("on");
    $(".slider li .atext0").addClass("on");
    $(".slider li .circle_poss").addClass("on");
  });
  var bx = $(".slider").bxSlider({
    auto: true,
    controls: true,
    pager: false,
    pause: 4000, // 실제 슬라이드 속도
    autoHover: true,
    mode: "fade",
    onSlideBefore: function () {},
    onSlideAfter: function () {
      var k = bx.getCurrentSlide();
      $(".slider li").find("h2").removeClass("on");
      $(".slider li").find("p").removeClass("on");
      $(".slider li .circle_poss").removeClass("on");
      $(".slider li .text" + k).addClass("on");
      $(".slider li .atext" + k).addClass("on");
      $(".slider li .circle_poss").addClass("on");
    },
  });

  
});
