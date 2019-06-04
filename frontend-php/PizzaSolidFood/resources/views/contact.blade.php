<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Pizza Solid Food | Contact</title>
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
                    <li><a href="{{ url('/menu') }}">Menu</a></li>
                    <li><a href="{{ url('/gallery') }}">Gallery</a></li>
                    <li><a href="{{ url('/about-us') }}">About Us</a></li>
                    <li class="active-page"><a href="{{ url('/contact') }}">Contact</a></li>
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

    <section id="contact">
        <div class="title">
            <div class="container">
                <h2>Contact</h2>
            </div>
        </div>
        <div class="container">
            <div class="contact-content">
                <div class="text">
                    <h2>We'd love to hear from you</h2>
                    <p>While we're good with smoke signals, there are simpler ways for us to get in touch and answer your questions. To get in touch with the Pizza Solid Food team simply fill out the contact form. Alternatively you can telephone us on 02 9251 5600 or email us at restaurant@psf.com </p>
                </div>
                <form action="#">
                    <input type="text" placeholder="E-mail address">
                    <br>
                    <input type="text" placeholder="You name">
                    <br>
                    <input type="text" placeholder="Subject">
                    <br>
                    <textarea name="" id="" cols="30" rows="10"></textarea>
                    <br>
                    <input type="button" value="Submit">
                </form>
            </div>
        </div>
    </section>
    
    <section id="our-location">
        <div class="title">
            <div class="container">
                <h2>Our Location</h2>
            </div>
        </div>
        <div class="mapouter"><div class="gmap_canvas"><iframe width="100%" height="500" id="gmap_canvas" src="https://maps.google.com/maps?q=zrenjanin&t=&z=17&ie=UTF8&iwloc=&output=embed" frameborder="0" scrolling="no" marginheight="0" marginwidth="0"></iframe><a href="https://www.emojilib.com">emojilib.com</a></div><style>.mapouter{position:relative;text-align:right;height:500px;width:100%;}.gmap_canvas {overflow:hidden;background:none!important;height:500px;width:100%;}</style></div>
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