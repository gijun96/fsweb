    //  progressBar
    const myBar = document.querySelectorAll('.progressBar');
    let persent = [];
    
    function fill(idx){
       persent = [65, 90, 75];
      let counter = 0;
      setInterval(()=>{
        for(let i = 0; i < myBar.length;i++){
          if(counter === persent[idx]){
            clearInterval();
          }else{
            counter ++;
            myBar[idx].style.width = `${counter}%`;
            myBar[idx].innerHTML = counter + "%";
          }
        }
      }, 15)
    }
  
      fill(0);
      fill(1);
      fill(2);
    // prgBtn.addEventListener('click', ()=>{
    //   fill(0);
    //   fill(1);
    //   fill(2);
    // });

    // scrollEvent

    window.onscroll = ()=>{
      // console.log(window.scrollY);
      if(window.screenY >= 800){
        myBar.style.transform = 'tanslateY(0)';
        myBar.style.transition = '.8s';
        
      }else{
        myBar.style.transform = 'tanslateY(-400px)';
        myBar.style.transition = 'none';

      }
    }