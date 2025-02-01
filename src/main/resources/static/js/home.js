var selectonhover =document.querySelectorAll('.selectonhover')
var optiononhover = document.getElementById("optiononhover")
selectonhover.addEventListener('mouseover', () => {
    optiononhover.style.display = 'block';
    console.log("hover property working")
})
