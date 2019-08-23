<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Auth;
use Session;

class AddItemController extends Controller
{
    public function addItem($id, $name, $payment, $quan, $ordernum, $adname){
        $productId = $id;
        $productName = $name;
        $ppayment = $payment;
        $quant = $quan;
        $orderNum = $ordernum;
        $adName = $adname;

        $userId = Session::get('userId');
        
        Session::push('pizzaOrder', [
            'mail'=> "johndoe@gmail.com",
            'userType'=> 0,
            'productName'=> $productName,
            'payment'=> $ppayment,
            'quantity'=> $quant,
            'orderNum'=> 1234,
            'additionName'=> $adName
        ]); 

        //$user_details = session('pizzaOrder');
        //dd($user_details);

        return redirect()->route('shopping-cart');

    }
}
