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
    
    <section id="cart-content">
        @if(Session::get('status') == 'Logged')
        <div class="shopping-cart">
            <div class="div cart-header">
                <h3>Your shopping cart</h3>
                <i class="fas fa-shopping-cart"></i>
            </div>
            <table class="list">
            <tr class="titles">
                <th>
                Name
                </th>
                <th>
                Quantity
                </th>
                <th>
                Addition
                </th>
            </tr>
            @if(Session::get('pizzaOrder'))
            @foreach(Session::get('pizzaOrder') as $pizzaItem)
            <tr class="item">
                <th id="name-color">
                {{$pizzaItem['productName']}}
                </th>
                <th>
                {{$pizzaItem['quantity']}}
                </th>
                <th>
                {{$pizzaItem['additionName']}}
                </th>
            </tr>
            @endforeach
            @else
            <tr class="item">
                <th>No items to display</th>
            </tr>
            @endif
            </table>
            <a class="add-more" href="">+</a>
            <br>
            <a class="cart-order" href="">Order</a>
        </div>
        @else
        <div class="login-warning">
            <h4>Please <a href="{{ url('/signup') }}">login</a> to view this page</h4>
        </div>
        @endif
    </section>

    
    <script src="js/jquery.js"></script>
    
    <script type="text/javascript" src="js/responsive-menu.js">
    </script>
    
</body>

</html>