<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Welcome extends CI_Controller {

	/**
	 * Index Page for this controller.
	 *
	 * Maps to the following URL
	 * 		http://example.com/index.php/welcome
	 *	- or -
	 * 		http://example.com/index.php/welcome/index
	 *	- or -
	 * Since this controller is set as the default controller in
	 * config/routes.php, it's displayed at http://example.com/
	 *
	 * So any other public methods not prefixed with an underscore will
	 * map to /index.php/welcome/<method_name>
	 * @see https://codeigniter.com/user_guide/general/urls.html
	 */

	public function index()
	{
		$this->load->view('index1');
	}
	public function liste()
	{
		$url="http://localhost:8181/api/v1/utilisateur";
		$r=file_get_contents($url);
		$data=array();
		$data['result']=$r;


		var_dump($data);
	}
	public function log()
	{
		redirect('welcome/accueil');
	}

	public function accueil()
	{
		$api_url = "http://localhost:8181/api/v1/taxpayer";
		$r=file_get_contents($api_url);
		$tab=array();
		$tab['page']='home.php';
		$tab['d']=json_decode($r,true);
		$this->load->view('template',$tab);
	}

	public function signalement()
	{
		$tab=array();
		$tab['page']='signalement.php';
		$this->load->view('template',$tab);
	}
	function inscrire()
	{
		
		$email=$this->input->post('email');
		$nom=$this->input->post('nom');
		$mdp=$this->input->post('mdp');				
		$data=array(
			'nom'=>$nom, 
			'email'=>$email,
			'mdp'=>$mdp
		);
		$json=json_encode($data);		
		$api_url = "http://localhost:8181/api/v1/utilisateur/inscrire";
		
		$header=[
			"Content-type:application/json;charset=UTF-8",
 			"Accept-language:en"
		];
		$init=curl_init();
		curl_setopt_array($init,[
				CURLOPT_URL =>$api_url,
				CURLOPT_RETURNTRANSFER=>true,
				CURLOPT_CUSTOMREQUEST=>'POST',
				CURLOPT_POSTFIELDS=>$json,
				CURLOPT_HTTPHEADER=>$header
			]);
		$res=curl_exec($init);
		$status=curl_getinfo($init,CURLINFO_HTTP_CODE);
		curl_close($init);
		if($status==400){
			$r=(array)json_decode($res);
			$tab=array();
			$tab['erreur']=$r;
			$this->load->view('index1',$tab);
		}else{
			var_dump($status);
			var_dump($res);
		}
	}
}
// ito ra apiasa file_get_contents
		// $option=[
		// 	"http"=>[
		// 		"method"=>"POST",
		// 		"header"=>"Content-type:application/json;charset=UTF-8\r\n",
		// 					"Accept-language:en",
		// 		"content"=>$json
		// 	]
		// 	];
		// 	$context=stream_context_create($option);



		// 	try {
		// 			$r=file_get_contents($api_url,false,$context);
		// 			print_r($http_response_header);
		// 			if($r!=null){
		// 				var_dump($r);
		// 				$rr=(array)json_decode($r);
		// 				var_dump($rr['id']);
		// 				echo 'minatsy';
		// 			}else {
		// 				throw new Exception('Utilisateur existe deja');
		// 			}
		// 	}catch (Exception $e){
		// 		$error = $e->getMessage();
		// 		echo $error;
		// 	}