<?php
    
    header('Content-Type: application/json');

    $url = "https://api.thecatapi.com/v1/images/search";
    $response = file_get_contents($url);
    echo $response;
    /* $response = file_get_contents($url);
    $data = json_decode($response, true); 

    if (!empty($data) && isset($data[0]['url'])) {
        echo "<img src='" . $data[0]['url'] . "' alt='Gato' width='300'>";
    } else {
        echo "No se pudo obtener la imagen del gato.";
    } */
?>