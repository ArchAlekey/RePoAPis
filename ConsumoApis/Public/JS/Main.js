function loadCat(){
    fetch('../Data/ApiConection.php')
    .then(response => response.json())
    .then(data => {
        if(data.length > 0){
            document.querySelector('.view__gato').src = data[0].url;
        }
    })
    .catch(error => console.error('Error: ', error));
}

loadCat();


/* document.addEventListener('DOMContentLoaded', function() {
    const btnHome = document.querySelector('.container__icon'); // Corregido el nombre de la clase

    if (btnHome) { // Verificar si el elemento existe
        btnHome.addEventListener('click', function() {
            window.location.href = "https://www.google.com";
        });
    } else {
        console.error("El elemento con la clase 'container__icon' no fue encontrado.");
    }
}); 
btn__home.addEventListener('click', function(){
    window.location.href = "https://www.google.com";
}); */