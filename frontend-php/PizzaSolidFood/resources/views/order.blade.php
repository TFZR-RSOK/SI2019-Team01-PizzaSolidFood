<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Pizza Solid Food</title>
    <link rel="icon" href="{{ asset ('icon/pizza.png') }}">
    <link href="{{ asset('css/all.css') }}" rel="stylesheet" type="text/css" >
    <script defer src=" {{ asset('js/all.js') }}"></script>
    <link href="{{ asset('css/app.css') }}" rel="stylesheet" type="text/css" >
</head>


<body>
    <header>
        <div class="container c2r1">
            <div class="title">
                <img src="{{asset ('icon/pizza.svg')}}" height="40px" width="40px">
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
    
    <section id="order-content">
        <div class="shopping-cart-order">
            <div class="div cart-header">
                <h3>Your order</h3>
                <i class="fas fa-shopping-cart"></i>
            </div>
            <div class="message">
                <p>Congratulations, you've successfully ordered!</p>
            </div>
            <br>
            <a class="cart-home" href=" {{ url('/') }} ">Home</a>
        </div>
    </section>

    
    <script src="js/jquery.js"></script>
    
    <script type="text/javascript" src="js/responsive-menu.js">
    </script>
    
</body>

</html>