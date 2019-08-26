<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use GuzzleHttp\Exception\ClientException;
use GuzzleHttp\Client;
use Auth;
use Session;

class OrderController extends Controller
{
    public function order(Request $request)
    {
        $paddress = $request->psyaddress;
        $token = Session::get('token');

        $adressarray = array(['userAddress' => $paddress]);
        $adressjson = json_encode($adressarray);


        //dd($adressjson);
        $json = json_encode(Session::get('pizzaOrder'));
        
        //dd($json);
        //dd($adressjson);
        

    
        $client = new Client([
            'headers' => [
            'Content-Type' => 'application/json',
            'Authorization' => 'Bearer '.$token
            ]
        ]);
        
        $response = $client->post('http://localhost:8080/psf-rest/auth/address', 
            ['body' => $adressjson]
        );
        
        $response2 = $client->post('http://localhost:8080/psf-rest/auth/order', 
            ['body' => $json]
        );


        //$paddress = $request->psyaddress;
        //$token = Session::get('token');
//
        //$adressarray = array(['userAddress' => $paddress]);
     //$adressjson = json_encode($adressarray);
//
//
        ////dd($adressjson);
        //$json = json_encode(Session::get('pizzaOrder'));
        //
        ////dd($json);
        ////dd($adressjson);
        //
//
    //
        //$client = new Client([
        //    'headers' => [
        //    'Content-Type' => 'application/json',
        //    'Authorization' => 'Bearer '.$token
        //    ]
        //]);
        //
        //$response = $client->get('http://localhost:8080/auth/address?userAddress='.$paddress);
       //
        //
        //$response2 = $client->post('http://localhost:8080/auth/order', 
        //    ['body' => $json]
        //);
        
    
        
        //return view('order');
    }
}
