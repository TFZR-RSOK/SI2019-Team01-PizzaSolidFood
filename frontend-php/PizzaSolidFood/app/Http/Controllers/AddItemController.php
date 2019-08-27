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
        $orderNum = Session::get('sessionNum');
        
        
        $adName = $adname;

        $userId = Session::get('userId');
        $userMail = Session::get('email');
        $userType = Session::get('userType');
        
        
        

        Session::push('pizzaOrder', [
            'mail'=> $userMail,
            'userType'=> $userType,
            'productName'=> $productName,
            'payment'=> $ppayment,
            'quantity'=> $quant,
            'orderNum'=> $orderNum,
            'additionName'=> $adName
        ]); 

        

        //$user_details = session('pizzaOrder');
        //dd($user_details);

        return redirect()->route('shopping-cart');

    }
}
