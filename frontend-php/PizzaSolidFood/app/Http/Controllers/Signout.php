<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

use Session;
use Auth;

class Signout extends Controller
{
    public function signout(){
        Session::flush();
        Auth::logout();
        return redirect()->route('home');
    }
}
