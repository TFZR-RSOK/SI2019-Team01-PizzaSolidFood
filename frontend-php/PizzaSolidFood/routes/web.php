<?php

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', 'HomeDefaultController@home');

Route::get('/signup',['as' => 'signup', function () {
    return view('signup');
}]);

Route::get('/profile',['as' => 'profile', function () {
    return view('profile');
}]);

Route::get('/shopping-cart',['as' => 'shopping-cart', function () {
    return view('cart');
}]);


Route::get('/product/{id}', 'ProductPageController@productPage');



Route::get('/signout','Signout@signout');

Route::get('/json', 'GuzzleController@getRemoteData');

Route::get('/addItem/pId/{id}/pName/{name}/payment/{payment}/quantity/{quan}/orderNum/{ordernum}/adName/{adname}', 'AddItemController@addItem');

Auth::routes();



Route::get('/redirect/{service}', 'SocialAuthController@redirect');
Route::get('/callback/{service}', 'SocialAuthController@callback');
Route::get('/google','SocialAuthController@google');