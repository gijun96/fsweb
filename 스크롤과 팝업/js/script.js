$(function () {
  var he = 0;
  $(window).resize(function () {
    // 현재 브라우저 높이를 he에 저장
    he = $(window).height();

    $("section > div").height(he);
    // 브라우저 시작시 강제로 resize를 실행
  });
    $(window).trigger("resize");

    $(window).scroll(function () {
      var sct = $(window).scrollTop();
      $("#sTop").text(sct);
      if (sct >= 100) {
        $("nav").addClass("fixed");
      } else {
        $("nav").removeClass("fixed");
      }
      // popup
      $("#notice_wrap").draggable();
    });

    if ($.cookie("popup") == "none") {
      $("#notice_wrap").hide();
    }
    var chk = $("#expiresChk");

    $('.closeBtn').on("click", closePop);
    function closePop() {
      if (chk.is(":checked")) {
        /* 체크가 되어있으면 */
        $.cookie("popup", "none", {expires: 3});
        // chk변수가 checked를 가지고 있으면
        // popup에 none을 3일동안 저장한 값을 가지고 있다.
      }
      $("#notice_wrap").fadeOut('fast');
    }

  //   // popup
  //   $('#popup').draggable();

  //   // 'pop이라는 쿠키가 존재하고 그 값이 no와 다르면'
  //   if($.cookie('pop')!='no'){
  //     $('#popup').show();
  //   }

  //   $('#popup area:eq(0)').click(function(){
  //     $('#popup').fadeOut('fast');
  //   });

  //   $('#popup area:eq(1)').click(function(){
  //     $.cookie('pop','no',{expires:1});
  //     $('#popup').fadeOut('fast');
});
