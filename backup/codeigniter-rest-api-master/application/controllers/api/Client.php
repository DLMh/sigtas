<?php

require APPPATH.'libraries/REST_Controller.php';

class Client extends REST_Controller{

  public function __construct(){

    parent::__construct();
    //load database
   
    $this->load->model(array("api/client_model"));
    $this->load->library(array("form_validation"));
    $this->load->helper("security");
  }

  /*
    INSERT: POST REQUEST TYPE
    UPDATE: PUT REQUEST TYPE
    DELETE: DELETE REQUEST TYPE
    LIST: Get REQUEST TYPE
  */
  // GET: <project_url>/index.php/student
  public function index_get(){
    // list data method
    //echo "This is GET Method";
    // SELECT * from client;
    $clients = $this->client_model->get_clients();
    

    //print_r($query->result());

    if(count($clients) > 0){

      $this->response(array(
        "status" => 1,
        "message" => "Clients found",
        "data" => $clients
      ), REST_Controller::HTTP_OK);
    }else{

      $this->response(array(
        "status" => 0,
        "message" => "No client found",
        "data" => $clients
      ), REST_Controller::HTTP_NOT_FOUND);
    }
  }

  public function index_post(){
    // insert data method

    //print_r($this->input->post());die;

    // collecting form data inputs

      $num=$this->security->xss_clean($this->input->post('num'));
      
      $this->form_validation->set_rules("num", "Num", "required");
      if($this->form_validation->run() === FALSE){

        // we have some errors
        $this->response(array(
          "status" => 0,
          "message" => "All fields are needed"
        ) , REST_Controller::HTTP_NOT_FOUND);
      }else{
      if(!empty($num)){
        // all values are available

        if($this->client_model->insert_client($num)){
          $this->response(array(
            "status" => 1,
            "message" => "client has been created"
          ), REST_Controller::HTTP_OK);
        }else{

          $this->response(array(
            "status" => 0,
            "message" => "Failed to create client"
          ), REST_Controller::HTTP_INTERNAL_SERVER_ERROR);
        }
      }else{
        // we have some empty field
        $this->response(array(
          "status" => 0,
          "message" => "All fields are needed"
        ), REST_Controller::HTTP_NOT_FOUND);
      }
    }
  }

  public function index_delete(){
    // delete data method
    $data = json_decode(file_get_contents("php://input"));
    $client_id = $this->security->xss_clean($data->NUM);

    if($this->client_model->delete_client($client_id)){
      // retruns true
      $this->response(array(
        "status" => 1,
        "message" => "client has been deleted"
      ), REST_Controller::HTTP_OK);
    }else{
      // return false
      $this->response(array(
        "status" => 0,
        "message" => "Failed to delete client"
      ), REST_Controller::HTTP_NOT_FOUND);
    }
  }

}
  


 ?>