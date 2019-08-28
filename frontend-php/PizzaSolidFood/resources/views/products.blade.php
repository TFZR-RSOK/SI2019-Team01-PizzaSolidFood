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
    <header class="fixed">
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
    
    <section id="menu-content">
        <div class="bg-image"></div>
        <div class="mask"></div>
        <div class="container">
            <div class="title">
                <h2>MENU</h2>    
            </div>
            <div class="menu">
                @if(count($pizza) > 1)
                    @foreach($pizza as $pizzas)
                        <article>
                            @php $filename = $pizzas['productName'] . '.jpg' @endphp
                            
                            <img src="{{ asset('storage/' .$filename) }}" alt="pizza image">
                            <h2> {{ $pizzas['productName'] }} </h2>
                            <br>
                            <br>
                            <br>
                            <br>
                            <a class="order-btn" href=" {{ url('/product/' .$pizzas['idProd']) }}">Add to cart</a>
                        </article>
                    @endforeach
                @endif
            </div>
        </div>
    </section>
    
    <footer>
        <div class="container">
            <div class="content">
                <div class="left-side">
                    <h2>Newsletter</h2>
                    <h3>Be first to know</h3>
                    <input type="email" placeholder="Your e-mail address">
                    <br>
                    <input type="button" value="Subscribe">
                </div>
                <div class="middle">
                    <h2>Pizza Solid Food</h2>
                    <h3>Social networks</h3>
                    <div class="social">
                        <a href=""><i class="fab fa-facebook"></i></a>
                        <a href=""><i class="fab fa-instagram"></i></a>
                        <a href=""><i class="fab fa-twitter"></i></a>
                    </div>
                </div>
                <div class="right-side">
                    <h2>Opening hours</h2>
                    <h4><span class="bold">Monday-Friday</span> 8AM-11PM</h4>
                    <h4><span class="bold">Saturday</span> 8AM-01PM</h4>
                    <h4><span class="bold">Sunday</span> 10AM-10PM</h4>
                </div>
            </div>
            <div class="copyright">
                <h4>&copy; 2019 Pizza Solid Food. All Rights Reserved.</h4>
            </div>
        </div>
    </footer>
    
    <script src="js/jquery.js"></script>
    
    <script type="text/javascript" src="js/responsive-menu.js">
    </script>
    
</body>

</html>