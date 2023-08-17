const modal = document.querySelector(".modal");
const popup = document.querySelector(".popup");

const exit_btn= document.querySelector(".exit_btn");


exit_btn.addEventListener('click', () =>{
    modal.style.display= "hidden";
})