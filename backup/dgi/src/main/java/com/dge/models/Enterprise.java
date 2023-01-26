package com.dge.models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table
public class Enterprise {
    @Id
	@SequenceGenerator(
		name = "enterprise_sequence",
		sequenceName = "enterprise_sequence",
		allocationSize=1
	)
	@GeneratedValue(
		strategy = GenerationType.SEQUENCE,
		generator = "enterprise_sequence"
	)
    private Long ENTERPRISE_NO;
    @ManyToOne
	private Taxpayer Tax_payer;
    @Column(name = "ENT_TYPE_NO")
	private Long ENT_TYPE_NO;
    @Column(name="PHONE_NO")
	private String PHONE_NO;
    @JsonFormat(pattern="dd-MM-yyyy")
    @Column(name = "START_DATE")
	private LocalDate START_DATE;
    @Column(name = "ENTRY_DATE")
    @JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate ENTRY_DATE;
    @Column(name = "ISC_YR_START")
	private Long ISC_YR_START;
    @Column(name = "FISC_YR_END")
	private Long FISC_YR_END;
    @Column(name = "URIDICAL_FORM_NO")
	private Long JURIDICAL_FORM_NO;
    @ManyToOne
	private Sector_activity SECTOR_ACT_NO;
    @Column(name = "OCCUPATION_NO")
	private Long OCCUPATION_NO;
    @Column(name = "")
	private Long CON_TITLE_NO;
    @Column(name = "USUAL_NAME")
	private String USUAL_NAME ;
    @Column(name = "FAX_NO")
	private String FAX_NO;
    @Column(name = "ADDRESS_E_MAIL")
	private String ADDRESS_E_MAIL;
    @Column(name = "TAX_CONTACT_NAME")
	private String TAX_CONTACT_NAME ;
    @JsonFormat(pattern="dd-MM-yyyy")
    @Column(name = "CLOSE_DATE")
	private LocalDate CLOSE_DATE;
    @Column(name = "PLACE_CREATED")
	private String PLACE_CREATED;
    @Column(name = "UNMIK_APPL_NR")
	private String UNMIK_APPL_NR;
    @Column(name = "ORIGIN_CAPITAL_NO")
	private Long ORIGIN_CAPITAL_NO;
    @Column(name = "NO_EMPLOYEES")
	private Long NO_EMPLOYEES;
    @Column(name = "PREV_REG_NO")
	private String PREV_REG_NO;
    @Column(name = "CUSTOM_NO")
	private String CUSTOM_NO;
    @Column(name = "MANAGER_FIRST_NAME")
	private String MANAGER_FIRST_NAME;
    @Column(name = "MANAGER_LAST_NAME")
	private String MANAGER_LAST_NAME;
    @Column(name = "RATE_ZONE_NO")
	private Long RATE_ZONE_NO;
    @Column(name = "BUSINESS_SIZ")
	private String BUSINESS_SIZ;
    @JsonFormat(pattern="dd-MM-yyyy")
    @Column(name = "UPDATE_DATE")
	private LocalDate UPDATE_DATE;
    @Column(name = "MOBILE_PHONE")
    private String  MOBILE_PHONE;
    @Column(name = "COUNTRY_NO")
	private Long COUNTRY_NO;
    @Column(name = "ENTER_DATE")
    @JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate ENTER_DATE;
    @ManyToOne
	private Ird_employee ENTER_USER;
    @ManyToOne
	private Ird_employee UPDATE_USER;
    @Column(name = "FROM_ESTAB_NO")
	private Long FROM_ESTAB_NO;
    @Column(name = "TAXABLE_TURNOVER ")
	private Long TAXABLE_TURNOVER ;
    @Column(name = "COMM_REG_NO")
	private String COMM_REG_NO;
    @Column(name = "REGIST_NAME ")
	private String REGIST_NAME ;
    @JsonFormat(pattern="dd-MM-yyyy")
    @Column(name = "REG_DATE")
	private LocalDate REG_DATE;
    @Column(name = "NOMINATED_OFFICER")
	private String NOMINATED_OFFICER;
    @Column(name = "MAIN_ENTERPRISE")
	private String MAIN_ENTERPRISE;
    @Column(name = "COUNTRY_NO_ORIGIN_CAPITAL")
	private Long COUNTRY_NO_ORIGIN_CAPITAL; 


    public Enterprise() {
    }

    public Enterprise(String ADDRESS_E_MAIL, String TAX_CONTACT_NAME,String REGIST_NAME) {      
        this.ENTERPRISE_NO = ENTERPRISE_NO;
        this.ADDRESS_E_MAIL = ADDRESS_E_MAIL;
        this.TAX_CONTACT_NAME = TAX_CONTACT_NAME;
        this.REGIST_NAME = REGIST_NAME;  
    }

    

    public Long getENTERPRISE_NO() {
        return this.ENTERPRISE_NO;
    }

    public void setENTERPRISE_NO(Long ENTERPRISE_NO) {
        this.ENTERPRISE_NO = ENTERPRISE_NO;
    }

    public Taxpayer getTax_payer() {
        return this.Tax_payer;
    }

    public void setTax_payer(Taxpayer Tax_payer) {
        this.Tax_payer = Tax_payer;
    }

    public Long getENT_TYPE_NO() {
        return this.ENT_TYPE_NO;
    }

    public void setENT_TYPE_NO(Long ENT_TYPE_NO) {
        this.ENT_TYPE_NO = ENT_TYPE_NO;
    }

    public String getPHONE_NO() {
        return this.PHONE_NO;
    }

    public void setPHONE_NO(String PHONE_NO) {
        this.PHONE_NO = PHONE_NO;
    }

    public LocalDate getSTART_DATE() {
        return this.START_DATE;
    }

    public void setSTART_DATE(LocalDate START_DATE) {
        this.START_DATE = START_DATE;
    }

    public LocalDate getENTRY_DATE() {
        return this.ENTRY_DATE;
    }

    public void setENTRY_DATE(LocalDate ENTRY_DATE) {
        this.ENTRY_DATE = ENTRY_DATE;
    }

    public Long getISC_YR_START() {
        return this.ISC_YR_START;
    }

    public void setISC_YR_START(Long ISC_YR_START) {
        this.ISC_YR_START = ISC_YR_START;
    }

    public Long getFISC_YR_END() {
        return this.FISC_YR_END;
    }

    public void setFISC_YR_END(Long FISC_YR_END) {
        this.FISC_YR_END = FISC_YR_END;
    }

    public Long getJURIDICAL_FORM_NO() {
        return this.JURIDICAL_FORM_NO;
    }

    public void setJURIDICAL_FORM_NO(Long JURIDICAL_FORM_NO) {
        this.JURIDICAL_FORM_NO = JURIDICAL_FORM_NO;
    }

    public Sector_activity getSECTOR_ACT_NO() {
        return this.SECTOR_ACT_NO;
    }

    public void setSECTOR_ACT_NO(Sector_activity  SECTOR_ACT_NO) {
        this.SECTOR_ACT_NO = SECTOR_ACT_NO;
    }

    public Long getOCCUPATION_NO() {
        return this.OCCUPATION_NO;
    }

    public void setOCCUPATION_NO(Long OCCUPATION_NO) {
        this.OCCUPATION_NO = OCCUPATION_NO;
    }

    public Long getCON_TITLE_NO() {
        return this.CON_TITLE_NO;
    }

    public void setCON_TITLE_NO(Long CON_TITLE_NO) {
        this.CON_TITLE_NO = CON_TITLE_NO;
    }

    public String getUSUAL_NAME() {
        return this.USUAL_NAME;
    }

    public void setUSUAL_NAME(String USUAL_NAME) {
        this.USUAL_NAME = USUAL_NAME;
    }

    public String getFAX_NO() {
        return this.FAX_NO;
    }

    public void setFAX_NO(String FAX_NO) {
        this.FAX_NO = FAX_NO;
    }

    public String getADDRESS_E_MAIL() {
        return this.ADDRESS_E_MAIL;
    }

    public void setADDRESS_E_MAIL(String ADDRESS_E_MAIL) {
        this.ADDRESS_E_MAIL = ADDRESS_E_MAIL;
    }

    public String getTAX_CONTACT_NAME() {
        return this.TAX_CONTACT_NAME;
    }

    public void setTAX_CONTACT_NAME(String TAX_CONTACT_NAME) {
        this.TAX_CONTACT_NAME = TAX_CONTACT_NAME;
    }

    public LocalDate getCLOSE_DATE() {
        return this.CLOSE_DATE;
    }

    public void setCLOSE_DATE(LocalDate CLOSE_DATE) {
        this.CLOSE_DATE = CLOSE_DATE;
    }

    public String getPLACE_CREATED() {
        return this.PLACE_CREATED;
    }

    public void setPLACE_CREATED(String PLACE_CREATED) {
        this.PLACE_CREATED = PLACE_CREATED;
    }

    public String getUNMIK_APPL_NR() {
        return this.UNMIK_APPL_NR;
    }

    public void setUNMIK_APPL_NR(String UNMIK_APPL_NR) {
        this.UNMIK_APPL_NR = UNMIK_APPL_NR;
    }

    public Long getORIGIN_CAPITAL_NO() {
        return this.ORIGIN_CAPITAL_NO;
    }

    public void setORIGIN_CAPITAL_NO(Long ORIGIN_CAPITAL_NO) {
        this.ORIGIN_CAPITAL_NO = ORIGIN_CAPITAL_NO;
    }

    public Long getNO_EMPLOYEES() {
        return this.NO_EMPLOYEES;
    }

    public void setNO_EMPLOYEES(Long NO_EMPLOYEES) {
        this.NO_EMPLOYEES = NO_EMPLOYEES;
    }

    public String getPREV_REG_NO() {
        return this.PREV_REG_NO;
    }

    public void setPREV_REG_NO(String PREV_REG_NO) {
        this.PREV_REG_NO = PREV_REG_NO;
    }

    public String getCUSTOM_NO() {
        return this.CUSTOM_NO;
    }

    public void setCUSTOM_NO(String CUSTOM_NO) {
        this.CUSTOM_NO = CUSTOM_NO;
    }

    public String getMANAGER_FIRST_NAME() {
        return this.MANAGER_FIRST_NAME;
    }

    public void setMANAGER_FIRST_NAME(String MANAGER_FIRST_NAME) {
        this.MANAGER_FIRST_NAME = MANAGER_FIRST_NAME;
    }

    public String getMANAGER_LAST_NAME() {
        return this.MANAGER_LAST_NAME;
    }

    public void setMANAGER_LAST_NAME(String MANAGER_LAST_NAME) {
        this.MANAGER_LAST_NAME = MANAGER_LAST_NAME;
    }

    public Long getRATE_ZONE_NO() {
        return this.RATE_ZONE_NO;
    }

    public void setRATE_ZONE_NO(Long RATE_ZONE_NO) {
        this.RATE_ZONE_NO = RATE_ZONE_NO;
    }

    public String getBUSINESS_SIZ() {
        return this.BUSINESS_SIZ;
    }

    public void setBUSINESS_SIZ(String BUSINESS_SIZ) {
        this.BUSINESS_SIZ = BUSINESS_SIZ;
    }

    public LocalDate getUPDATE_DATE() {
        return this.UPDATE_DATE;
    }

    public void setUPDATE_DATE(LocalDate UPDATE_DATE) {
        this.UPDATE_DATE = UPDATE_DATE;
    }

    public String getMOBILE_PHONE() {
        return this.MOBILE_PHONE;
    }

    public void setMOBILE_PHONE(String MOBILE_PHONE) {
        this.MOBILE_PHONE = MOBILE_PHONE;
    }

    public Long getCOUNTRY_NO() {
        return this.COUNTRY_NO;
    }

    public void setCOUNTRY_NO(Long COUNTRY_NO) {
        this.COUNTRY_NO = COUNTRY_NO;
    }

    public LocalDate getENTER_DATE() {
        return this.ENTER_DATE;
    }

    public void setENTER_DATE(LocalDate ENTER_DATE) {
        this.ENTER_DATE = ENTER_DATE;
    }

    public Ird_employee getENTER_USER() {
        return this.ENTER_USER;
    }

    public void setENTER_USER(Ird_employee ENTER_USER) {
        this.ENTER_USER = ENTER_USER;
    }

    public Ird_employee getUPDATE_USER() {
        return this.UPDATE_USER;
    }

    public void setUPDATE_USER(Ird_employee UPDATE_USER) {
        this.UPDATE_USER = UPDATE_USER;
    }

    public Long getFROM_ESTAB_NO() {
        return this.FROM_ESTAB_NO;
    }

    public void setFROM_ESTAB_NO(Long FROM_ESTAB_NO) {
        this.FROM_ESTAB_NO = FROM_ESTAB_NO;
    }

    public Long getTAXABLE_TURNOVER() {
        return this.TAXABLE_TURNOVER;
    }

    public void setTAXABLE_TURNOVER(Long TAXABLE_TURNOVER) {
        this.TAXABLE_TURNOVER = TAXABLE_TURNOVER;
    }

    public String getCOMM_REG_NO() {
        return this.COMM_REG_NO;
    }

    public void setCOMM_REG_NO(String COMM_REG_NO) {
        this.COMM_REG_NO = COMM_REG_NO;
    }

    public String getREGIST_NAME() {
        return this.REGIST_NAME;
    }

    public void setREGIST_NAME(String REGIST_NAME) {
        this.REGIST_NAME = REGIST_NAME;
    }

    public LocalDate getREG_DATE() {
        return this.REG_DATE;
    }

    public void setREG_DATE(LocalDate REG_DATE) {
        this.REG_DATE = REG_DATE;
    }

    public String getNOMINATED_OFFICER() {
        return this.NOMINATED_OFFICER;
    }

    public void setNOMINATED_OFFICER(String NOMINATED_OFFICER) {
        this.NOMINATED_OFFICER = NOMINATED_OFFICER;
    }

    public String getMAIN_ENTERPRISE() {
        return this.MAIN_ENTERPRISE;
    }

    public void setMAIN_ENTERPRISE(String MAIN_ENTERPRISE) {
        this.MAIN_ENTERPRISE = MAIN_ENTERPRISE;
    }

    public Long getCOUNTRY_NO_ORIGIN_CAPITAL() {
        return this.COUNTRY_NO_ORIGIN_CAPITAL;
    }

    public void setCOUNTRY_NO_ORIGIN_CAPITAL(Long COUNTRY_NO_ORIGIN_CAPITAL) {
        this.COUNTRY_NO_ORIGIN_CAPITAL = COUNTRY_NO_ORIGIN_CAPITAL;
    }

    @Override
    public String toString() {
        return "{" +
            " ENTERPRISE_NO='" + getENTERPRISE_NO() + "'" +
            ", Tax_payer='" + getTax_payer() + "'" +
            ", ENT_TYPE_NO='" + getENT_TYPE_NO() + "'" +
            ", PHONE_NO='" + getPHONE_NO() + "'" +
            ", START_DATE='" + getSTART_DATE() + "'" +
            ", ENTRY_DATE='" + getENTRY_DATE() + "'" +
            ", ISC_YR_START='" + getISC_YR_START() + "'" +
            ", FISC_YR_END='" + getFISC_YR_END() + "'" +
            ", JURIDICAL_FORM_NO='" + getJURIDICAL_FORM_NO() + "'" +
            ", SECTOR_ACT_NO='" + getSECTOR_ACT_NO() + "'" +
            ", OCCUPATION_NO='" + getOCCUPATION_NO() + "'" +
            ", CON_TITLE_NO='" + getCON_TITLE_NO() + "'" +
            ", USUAL_NAME='" + getUSUAL_NAME() + "'" +
            ", FAX_NO='" + getFAX_NO() + "'" +
            ", ADDRESS_E_MAIL='" + getADDRESS_E_MAIL() + "'" +
            ", TAX_CONTACT_NAME='" + getTAX_CONTACT_NAME() + "'" +
            ", CLOSE_DATE='" + getCLOSE_DATE() + "'" +
            ", PLACE_CREATED='" + getPLACE_CREATED() + "'" +
            ", UNMIK_APPL_NR='" + getUNMIK_APPL_NR() + "'" +
            ", ORIGIN_CAPITAL_NO='" + getORIGIN_CAPITAL_NO() + "'" +
            ", NO_EMPLOYEES='" + getNO_EMPLOYEES() + "'" +
            ", PREV_REG_NO='" + getPREV_REG_NO() + "'" +
            ", CUSTOM_NO='" + getCUSTOM_NO() + "'" +
            ", MANAGER_FIRST_NAME='" + getMANAGER_FIRST_NAME() + "'" +
            ", MANAGER_LAST_NAME='" + getMANAGER_LAST_NAME() + "'" +
            ", RATE_ZONE_NO='" + getRATE_ZONE_NO() + "'" +
            ", BUSINESS_SIZ='" + getBUSINESS_SIZ() + "'" +
            ", UPDATE_DATE='" + getUPDATE_DATE() + "'" +
            ", MOBILE_PHONE='" + getMOBILE_PHONE() + "'" +
            ", COUNTRY_NO='" + getCOUNTRY_NO() + "'" +
            ", ENTER_DATE='" + getENTER_DATE() + "'" +
            ", ENTER_USER='" + getENTER_USER() + "'" +
            ", UPDATE_USER='" + getUPDATE_USER() + "'" +
            ", FROM_ESTAB_NO='" + getFROM_ESTAB_NO() + "'" +
            ", TAXABLE_TURNOVER='" + getTAXABLE_TURNOVER() + "'" +
            ", COMM_REG_NO='" + getCOMM_REG_NO() + "'" +
            ", REGIST_NAME='" + getREGIST_NAME() + "'" +
            ", REG_DATE='" + getREG_DATE() + "'" +
            ", NOMINATED_OFFICER='" + getNOMINATED_OFFICER() + "'" +
            ", MAIN_ENTERPRISE='" + getMAIN_ENTERPRISE() + "'" +
            ", COUNTRY_NO_ORIGIN_CAPITAL='" + getCOUNTRY_NO_ORIGIN_CAPITAL() + "'" +
            "}";
    }

}
