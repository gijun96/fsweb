$(window).bind('wheel', function(event){
  if (event.originalEvent.wheelDelta > 0 || event.originalEvent.detail < 0) {
      // scroll up
      console.log("스크롤 위로");
      document.querySelector('header').style.transform = "translateY(0px)";

  }
  else {
      // scroll down
      // console.log("스크롤 아래로");
      document.querySelector('header').style.transform = "translateY(-55px)";
  }
});