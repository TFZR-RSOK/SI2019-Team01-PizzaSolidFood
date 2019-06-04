<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Pizza Solid Food | Menu</title>
    <link rel="icon" href="icon/pizza.png">
    <link href="../css/all.css" rel="stylesheet">
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
                    <li><a href="{{ url('/') }}">Home</a></li>
                    <li class="active-page"><a href="{{ url('/menu') }}">Menu</a></li>
                    <li><a href="{{ url('/gallery') }}">Gallery</a></li>
                    <li><a href="{{ url('/about-us') }}">About Us</a></li>
                    <li><a href="{{ url('/contact') }}">Contact</a></li>
                </ul>
                <div class="menu-trigger"><i class="fas fa-bars"></i></div>
            </nav>
        </div>
    </header>
    <section id="title-image">
        <div class="container">
            <div class="header-content">
                <h2>Pizza Solid Food</h2>
                <h4>30 years of experience Direct to you!</h4>
            </div>
        </div>
        <div class="bg-image"></div>
        <div class="mask"></div>
    </section>
    
    <section id="menu-content">
        <div class="container">
            <div class="title">
                <h2>MENU</h2>    
            </div>
            <div class="menu">
                <article>
                    <img src="../img/menu/1.jpg" alt="pizza image">
                    <h2>Quattro Stagioni</h2>
                    <p>tomato sauce <br> mozzarella <br> ham <br> black olives <br> mushrooms <br> artichoke peas <br> salami <br> eggs</p>
                    <input type="button" value="Order">
                </article>
                <article>
                    <img src="../img/menu/2.jpg" alt="pizza image">
                    <h2>Margherita</h2>
                    <p>sliced buffalo <br> mozzarella from Campania<br> basil <br> extra virgin <br> olive oil </p>
                    <input type="button" value="Order">
                </article>
                <article>
                    <img src="../img/menu/3.jpg" alt="pizza image">
                    <h2>Hawaii</h2>
                    <p>ham <br> pineapple </p>
                    <input type="button" value="Order">
                </article>
                <article>
                    <img src="../img/menu/4.jpg" alt="pizza image">
                    <h2>Garlic Fingers</h2>
                    <p>melted butter <br> garlic <br> bacon </p>
                    <input type="button" value="Order">
                </article>
                <article>
                    <img src="../img/menu/5.jpg" alt="pizza image">
                    <h2>Meat Feast</h2>
                    <p>tomato sauce <br> mozzarella <br> minced meat <br> Maltese sausage <br> other meat </p>
                    <input type="button" value="Order">
                </article>
                <article>
                    <img src="../img/menu/6.jpg" alt="pizza image">
                    <h2>Peperoni</h2>
                    <p>tomato sauce <br> mozzarella <br> peperoni </p>
                    <input type="button" value="Order">
                </article>
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
    
    <script src="../jquery.js"></script>
    
    <script type="text/javascript" src="../js/responsive-menu.js"></script>
    
</body>

</html>