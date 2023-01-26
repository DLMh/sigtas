<?php

class Client_model extends CI_Model{

  public function __construct(){
    parent::__construct();
 
  }

  public function get_clients(){

    $query = $this->db->query('SELECT * FROM client');
    return $query->result();
  }
  public function insert_client($Num){

    $req='INSERT INTO Client VALUES ('.$Num.')';
    return $this->db->query($req);
}
public function delete_client($client_id){

  // delete method
  $req='DELETE FROM Client where NUM='.$client_id.'';
  return $this->db->query($req);
}
}
// 
// SELECT * FROM document where tax_payer_no=244
 ?>
