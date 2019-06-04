<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Pizza Solid Food | Home</title>
    <link rel="icon" href="icon/pizza.png">
    <link href="../css/all.css" rel="stylesheet">
    <script defer src="../js/all.js"></script>
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
                    <li class="active-page"><a href="{{ url('/') }}">Home</a></li>
                    <li><a href="{{ url('/menu') }}">Menu</a></li>
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
    <section id="welcome">
        <div class="container c2r1">
            <div class="welcome-text">
                <h2>Welcome</h2>
                <h3>to our restaurant</h3>
                <p>Pizza Solid Food serves pizza and seasonal fare with a focus on fresh, local ingredients. Opened by native New Yorkers, the concept was born by friends whose vision was to provide the neighborhood with delicious comfort food in a cozy, intimate setting.</p>
            </div>
            <div class="welcome-image">
                <img src="../img/home/menu-restaurant-vintage-table.jpg" alt="">
            </div>
        </div>
    </section>
    <section id="our-team">
        <div class="container">
            <div class="title">
                <h2>Our Team</h2>
            </div>
            <div class="team">
                <div class="first-member">
                    <img src="../img/home/First.png" alt="">
                    <h3>Arman Kibee</h3>
                </div>
                <div class="second-member">
                    <img src="../img/home/Second.png" alt="">
                    <h3>Jamey Giovannini</h3>
                </div>
                <div class="third-member">
                    <img src="../img/home/Third.png" alt="">
                    <h3>Hervey Troutman</h3>
                </div>
                <div class="fourth-member">
                    <img src="../img/home/Fourth.png" alt="">
                    <h3>Tamarra Garber</h3>
                </div>
                <div class="fifth-member">
                    <img src="../img/home/Fifth.png" alt="">
                    <h3>Rosana Finley</h3>
                </div>
                <div class="sixth-member">
                    <img src="../img/home/Sixth.png" alt="">
                    <h3>Salome Calkins</h3>
                </div>
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
    
    <script type="text/javascript" src="../js/responsive-menu.js">
    </script>
    
</body>

</html>