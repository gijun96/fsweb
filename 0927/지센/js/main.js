$(function(){
  var status;
  $(window).resize(function(){
    var w = $(this).width(); //화면의 넓이를 w에 대입
    if(w <= 850){
      status = "mobile";  
    }else{
      status ="pc";
      if($(".mobile_nav").hasClass('active')){
        $('.mobile_nav, .container, .transparency').removeClass("active");
        $(".sub").slideUp(300);
      }
    }
      $('.mobile_tab').click(function(){
        $('.mobile_nav, .container, .transparency').addClass("active");
      });
      $('.transparency').click(function(){
      $('.mobile_nav, .container, .transparency').removeClass("active");
      $(".sub").slideUp(300);
      
    })
    $(".mobile_nav>ul>li>a").click(function(){
      if($(this).next('.sub').css('display')==='none'){
        $('.mobile_nav .sub').slideUp(300);
        $(this).next('.sub').slideDown(300);
      }else{
        $(this).next('.sub').slideUp(300);
      }
      return false;
    });
  });

  $('.nav ul').hover(function(){
    $(this).addClass('over');
  },(function(){
    $(this).removeClass('over');
  }));

});