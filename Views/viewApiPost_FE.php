<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../Public/Styles/Styles.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <title>Api tipo POST</title>
</head>
<body>
    <header>
        <a href="../index.php"><div class="container__icon"><i class="fa-solid fa-house"></i></div></a>
    </header>
    <div class="container__formApi">
        <form action="../Data/ApiConnectionPost_BE.php" method="POST">
            <label for=""><input type="text" placeholder="Titulo" name="titulo" class="input">Titulo</label>
            <label for=""><input type="text" placeholder="Contenido" name="contenido" class="input">Contenido</label>
            <button class="btn__gato">Subir</button>
        </form>
    </div>

    <script src="../Public/JS/Main.js"></script>
</body>
</html>