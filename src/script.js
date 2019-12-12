let inputs = document.querySelectorAll('input');
let button = document.querySelector('#submit');
let h1 = document.querySelector('h1');

button.addEventListener('click', function(e){
    e.preventDefault();
    h1.innerText = '123';
});