// Javascript

// $(document).ready(function () {

//   $('#wrap').fullpage({
//      sectionsColor: ['lightblue', 'skyblue', 'cadetblue', 'darkblue'],
//      navigation: true,
//      navigationTooltips: ['툴팁1', '툴팁2', '툴팁3', '툴팁4'],
//      showActiveTooltip: true,
//   });

//   var vid = $('video').get(0);
//   vid.load();

//   $('.s1').mouseenter(function(){
//      vid.play();
//   });
//   $('.s1').mouseleave(function(){
//      vid.pause();
//   });


//   $('#tab>ul>li').click(function () {
//      var i = $(this).index();
//      $('#tab div').css({ display: 'none' })
//      $('#tab div').eq(i).css({ display: 'block' });
//      $('#tab>ul>li').css({ backgroundColor:'#444', zIndex:0,color:'#fff' });
//      $(this).css({ backgroundColor: '#fff', zIndex: 1, color:'#444' });
//   });

//   $('#tab div:eq(0) li').click(function () {
//      var num = $(this).index();
//      if (num == 0) {
//         window.open('about:blank').location.href = "http://widesign.dothome.co.kr";
//      } else if (num == 1) {
//         window.open('about:blank').location.href = "http://hurom.dothome.co.kr";
//      } else if (num == 2) {
//         window.open('about:blank').location.href = "http://monami3.dothome.co.kr";
//      } else {
//         window.open('about:blank').location.href = "http://ikea.dothome.co.kr";
//      }
//   });
//   $('#tab div:eq(1) li').click(function () {
//      var num = $(this).index();
//      if (num == 0) {
//         window.open('about:blank').location.href = "http://widesign.dothome.co.kr";
//      } else if (num == 1) {
//         window.open('about:blank').location.href = "http://hurom.dothome.co.kr";
//      } else if (num == 2) {
//         window.open('about:blank').location.href = "http://monami3.dothome.co.kr";
//      } else {
//         window.open('about:blank').location.href = "http://ikea.dothome.co.kr";
//      }
//   });

//   var mySlider = $('.bxslider').bxSlider({
//      slideWidth: 400,
//      maxSlides: 3,
//      moveSlides: 1,
//      slideMargin: 10,
//      captions: true,
//      auto: true,
//      autoHover: true,
//      controls: false,
//      pager: false,
//      onSlideBefore: function () { autoPager(); }
//   });

//   $('.pBtn').click(function () {
//      mySlider.goToPrevSlide();
//      autoPager();
//      return false;
//   });
//   $('.nBtn').click(function () {
//      mySlider.goToNextSlide();
//      autoPager();
//      return false;
//   });

//   $('#mainImg .pager li').click(function () {
//      var num = $(this).index();
//      mySlider.goToSlide(num);
//      return false;
//   });

//   function autoPager() {
//      $('#mainImg .pager li').removeClass('active');
//      var current = mySlider.getCurrentSlide();
//      $('#mainImg .pager li').eq(current).addClass('active');
//   }

// });