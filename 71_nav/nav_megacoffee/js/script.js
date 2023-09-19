  // 버튼 클릭 시
  // 햄버거 => X버튼으로 변경
  const mHeader = document.querySelector('#mHeader');
  const mBtn = document.querySelector('.mBtn');

  mBtn.addEventListener('click', ()=>{
    mBtn.classList.toggle('active');
    mHeader.style.right = "-100%";
    if(mBtn.classList.contains('active'))
    mHeader.style.right = "0%";
  })


  