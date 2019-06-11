# REST Service and Logic
This is a folder for files that support and integrate REST servisce of the application and provide logic for the application.


*.war* files are in target -> *psf-rest.war*

1. Copy WAR file from target/psf-rest.war to the tomcat/webapps/ folder
2. From a terminal navigate to tomcat/bin folder and execute
    * catalina.bat run (on Windows)
3. Go to http://localhost:8080/psf-rest/*API*


## API

*/auth* - protected end-points

*/public* - public end-points

###*/auth/login*    

**METHOD:** "GET"

Params: ```void```

Returns:
```json
{
  "id": 4,
  "name": "John",
  "lastName": "Doe",
  "email": "John.Doe@gmail.com",
  "userType": 0,
  "address": null,
  "points": 0,
  "monthlyOrders": 0,
  "token": "token string"
}
```

###*/auth/logout*

**METHOD:** "GET"

Params: ```Token string ```

Returns: ```void```
<hr>

###*/public/products*

**METHOD:** "POST"

Params: ```void ```

Returns: 
```json
[
    {
        "idProd": 1,
        "productName": "Napoletana",
        "productPrice": 12.35,
        "discountForPremiumUsers": 20,
        "productSize": 100,
        "productDescription": "mozzarella cheese, baked ham, mushroom, artichoke and tomato and pizza pugliese, prepared with tomato, mozzarella and onions",
        "imgPath": "image01"
    },
    {
        "idProd": 2,
        "productName": "Margherita",
        "productPrice": 15.99,
        "discountForPremiumUsers": 69,
        "productSize": 100,
        "productDescription": "San Marzano tomatoes, mozzarella fior di latte, fresh basil, salt and extra-virgin olive oil",
        "imgPath": "image02"
    },
    {
        "idProd": 3,
        "productName": "Quattro stagioni",
        "productPrice": 20.99,
        "discountForPremiumUsers": 21,
        "productSize": 100,
        "productDescription": "artichokes, tomatoes or basil, mushrooms and ham or prosciutto, or olives",
        "imgPath": "image03"
    }
]
```

###*/public/additions*

**METHOD:** "POST"

Params: ```void```

Returns: 
```json
[
    {
        "id": 1,
        "additionName": "Bacon",
        "additionPrice": 0.5
    },
    {
        "id": 2,
        "additionName": "Cheese",
        "additionPrice": 0.25
    },
    {
        "id": 3,
        "additionName": "Mushroom",
        "additionPrice": 0.75
    }
]
```

