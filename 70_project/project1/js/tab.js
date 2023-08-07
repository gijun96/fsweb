const tab = document.querySelector('tab_btn');
// const tab_1 = document.querySelector('#tab1');
// const tab_2 = document.querySelector('#tab2');
const tab_btn = document.querySelectorAll('tab_btn li');



function tabClick(e){
    e.preventEvent();
    for(i =0; i<tab.length; i++){
        console.log(i);
        for(j=0; j<tab.length; j++){
            console.log(j);
        
        }
    }
}

tab_btn.addEventLister('click', tabClick);



// tab_1.addEventListener('click', ()=>{
//     tab_2.classList.add('tab_block');
//     tab_1.classList.remove('tab_none');
//     tab_1.classList.add('tab_block');
// })

// tab_2.addEventListener('click', ()=>{
//     tab_1.classList.add('tab_block');
//     tab_2.classList.remove('tab_none');
//     tab_2.classList.add('tab_block');
// })