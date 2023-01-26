<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class AuthController extends CI_Controller {

	public function index()
	{
		echo 'coucou';
	}

    public function token()
	{
		$jwt=new JWT();

        $JwtSecretkey="code";
        $data = array(
            'userId'=>145,
            'email'=>'admin@gmail.com',
            'userType'=>'admin'
        );
        $token=$jwt->encode($data,$JwtSecretkey,'HS256');
        echo $token; 
	}

    public function decode_token()
	{
        $token=$this->uri->segment(3);

		$jwt=new JWT();

        $JwtSecretkey="code";

        
        $decoded_token=$jwt->decode($token,$JwtSecretkey,'HS256');
        // echo '<pre>';
        // print_r($decoded_token);

        $token1=$jwt->jsonEncode($decoded_token);
        echo $token1;
	}
}