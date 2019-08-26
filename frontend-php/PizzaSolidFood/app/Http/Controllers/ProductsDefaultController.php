<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use GuzzleHttp\Exception\ClientException;

use Storage;

class ProductsDefaultController extends Controller
{
    public function products()
    {
        $client = new \GuzzleHttp\Client();
        $response = $client->request('POST', 'http://localhost:8080/psf-rest/public/products');
        $products = $response->getBody()->getContents();
        //print_r($products);

        $array = json_decode($products, true);

        foreach(json_decode($products) as $pizza){
            $image = base64_decode($pizza->image);
            Storage::disk('public')->put("$pizza->productName.jpg" , $image);
        }

        return view('products')->with('pizza', $array);
    }
}
