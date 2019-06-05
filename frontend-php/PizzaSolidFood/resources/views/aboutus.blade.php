<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Pizza Solid Food | About Us</title>
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
                    <li><a href="{{ url('/') }}">Home</a></li>
                    <li><a href="{{ url('/menu') }}">Menu</a></li>
                    <li><a href="{{ url('/gallery') }}">Gallery</a></li>
                    <li class="active-page"><a href="{{ url('/about-us') }}">About Us</a></li>
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

    <section id="our-story">
        <div class="container">
            <div class="content">
                <div class="our-story">
                    <h2>Our Story</h2>
                    <p>Italian cuisine restaurant Pizza Solid Food is located in the heart of Belgrade, in Dorćol district, the old city neighborhood known for its multicultural atmosphere. Restaurant owner himself has been actively engaged in decorating the restaurant interior and the smallest details were taken into account, wrought iron wine cellar, painted walls, a small gallery with a few tables, discreet home lighting lamps, comfortable chairs, so your stay would be as pleasant as possible. Restaurant terrace offers all possibilities for a pleasant stay and relaxation during and after the working day, and refreshments to all those who have decided to spend the day sightseeing Belgrade</p>
                </div>
            </div>
        </div>
    </section>

    <section id="about-us">
        <div class="container">
            <div class="content">
                <div class="about-us">
                    <h2>About</h2>
                    <p>It's difficult to tell the story of Dorćol that would be totally acceptable and concievable, but we will try our best to bring you closer to rich history, spirit and ambience of this area, and Belgrade as well. Although without set borders, it is considered that Dorćol covers the northern part and the lower town of Kalemegdan, and the area between the streets of kneza Mihaila and the Danube River. The name of the neighborhood comes from Turkish words dört (four) and yol (road), literally meaning "four roads" or colloquially "intersection (of four roads)", "crossroads". These were the roads to Istanbul, Vidin, Sever, and probably Dubrovnik. During the Turkish occupation of Belgrade, Dorćol was a well known trading centre, with many markets and traders of different nationalities. Also, it was a center of Belgrade's Jewish community, remnant of which is the modern Jevrejska ("Jewish") street in Dorćol. After Belgrade became a capital of independent Serbia, Dorćol kept its multinational character for a long time. Over time the old low houses and narrow streets were changed into modern buildings. Still, some parts, though vanishing one by one, resemble the old look. Dorćol is a location of some of the oldest city buildings. The oldest surviving private house in downtown Belgrade that is still used as a residence is located in the Dorćol district</p>
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

    <script src="js/jquery.js"></script>
    
    <script type="text/javascript" src="js/responsive-menu.js">
    </script>

</body>

</html>