package com.dge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dge.models.Enterprise;
@Repository
public interface EnterpriseRepository  extends JpaRepository<Enterprise,Long> {
    // @Query("SELECT e.REGIST_NAME,e.ADDRESS_E_MAIL,e.TAX_CONTACT_NAME,tp.MAILING_ADDRESS,tp.FISCAL_NO FROM ENTERPRISE e JOIN TAX_PAYER tp ON e.TAX_PAYER_NO=tp.TAX_PAYER_NO")
	// List<TaxpayerJoin> find();
}
