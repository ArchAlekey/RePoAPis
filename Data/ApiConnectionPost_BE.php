<?php

if($_SERVER["REQUEST_METHOD"] === "POST"){

    $title = $_POST['titulo'];
    $body = $_POST['contenido'];


$urlPost = 'https://jsonplaceholder.typicode.com/posts';
    
$data = [
    "title" => $title,
    "body" => $body,
    "userId" => 1
];

$ch = curl_init($urlPost);

curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
curl_setopt($ch, CURLOPT_POST, true);
curl_setopt($ch, CURLOPT_HTTPHEADER, ["Content-Type: application/json"]);
curl_setopt($ch, CURLOPT_POSTFIELDS, json_encode($data));

$responsePOST = curl_exec($ch);
curl_close($ch);

echo "<h3>Respuesta de la API:</h3>";
echo "<pre>" . $responsePOST . "</pre>";

} else {
    echo "Método no permitido.";
}