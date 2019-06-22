<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Pizza Solid Food</title>
    <link rel="icon" href="icon/pizza.png">
    <link href="css/all.css" rel="stylesheet">
    <script defer src="js/all.js"></script>
    <link rel="stylesheet" href="css/app.css">
</head>


<body>
    <header>
        <div class="container c2r1">
            <div class="title">
                <img src="icon/pizza.svg" height="40px" width="40px">
                <h1>Pizza Solid Food</h1>
            </div>
            <nav>
                <ul>
                    <li><a href="{{url('/')}}">Home</a></li>
                </ul>
                <div class="menu-trigger"><i class="fas fa-bars"></i></div>
            </nav>
        </div>
    </header>
    
    <section id="product-content">
        <div class="product-img"></div>
        <div class="info">
            <h2 class="info-title">Name:</h2>
            <br>
            <h2 class="pizza-name">Pizza Name</h2>
            <br>
            <h2 class="info-title">Addition:</h2>
            <br>
            <div class="custom-select" style="width:200px;">
            <select>
                <option value="0">Select addition:</option>
                <option value="1">Bacon</option>
                <option value="2">Cheese</option>
                <option value="3">Moshrum</option>
            </select>
            </div>
            <br>
            <h2 class="info-title">Description:</h2>
            <br>
            <h4>Desc, desc, desc, desc, desc...</h4>
            <br>
            <h2 class="info-title">Quantity:</h2>
            <br>
            <input type="text" value="0">
            <br>
            <a class="order-btn" href="">ORDER</a>
        </div>
    </section>

    
    <script src="js/jquery.js"></script>
    
    <script type="text/javascript" src="js/responsive-menu.js">
    </script>
    
</body>

</html>