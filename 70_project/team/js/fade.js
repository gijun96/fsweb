
const prev_btn = document.querySelector('.btn_l');
const next_btn = document.querySelector('.btn_r');
const li = document.querySelector('.item_li');



    var opacity =0;
        var intervalID=0;
	//순수 자바스크립트 클릭 이벤트 Fade out 실행
	document.querySelector('btnfadeOut').addEventListener('click', function() {
		intervalID = setInterval(hide,200);
	});
    
	//순수 자바스크립트 클릭 이벤트 Fade in
	document.getElementById('btnfadeIn').addEventListener('click', function() {
		intervalID = setInterval(show,200);
	});
 
	function hide(){
		var div = document.getElementById("img1");
		opacity = Number(window.getComputedStyle(div).getPropertyValue("opacity"));
		
		if(opacity>0){
            //Fade out 핵심 부분
			opacity = opacity-0.1;
			div.style.opacity=opacity;
			//img.style.opacity=opacity;
		}
		else{
			clearInterval(intervalID);
		}
	}
	
	function show(){
		var div = document.getElementById("img1");
		opacity = Number(window.getComputedStyle(div).getPropertyValue("opacity"));
		
		if(opacity<1){
        	//Fade in 핵심 부분
			opacity = opacity+0.1;
			div.style.opacity=opacity;
			//img.style.opacity=opacity;
		}
		else{
			clearInterval(intervalID);
		}
	}	 