package com.dge.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="TAX_PAYER")
public class Taxpayer {
    @Id
	@SequenceGenerator(
		name = "taxpayer_sequence",
		sequenceName = "taxpayer_sequence",
		allocationSize=1
	)
	@GeneratedValue(
		strategy = GenerationType.SEQUENCE,
		generator = "taxpayer_sequence"
	)
    private Long TAX_PAYER_NO;
	private Long TP_TYPE_NO;
	private Long COUNTRY_NO;
	private String NSF_CHEQUE;
	private Long CITY_NO;
	private String MAILING_ADDRESS;
	private String RESIDENT;
    @ManyToOne
	private Taxpayer REP_TAX_PAYER_NO;
	private Long FISC_YR_START;
	private Long FISC_YR_END;
	private Long BRANCH_NO;
	private Long REP_TYPE_NO;
	private Long POST_CODE_NO;
	private Long REP_REASON_NO;
	private String BANK_ACCT_NO;
	private String REP_TAXR_NAME;
    @JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate ENTER_DATE;
    @ManyToOne
	private Ird_employee ENTER_USER;
	private String FISCAL_NO;//NIF
	private String STREET_NO;
	private String DOOR_NO;
	private Long LOCALITY_NO;
	private String ACCOUNT_HOLDER;
	private Long BANK_NO;
    @JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate UPDATE_DATE;
	private Long TAX_CENTRE_NO;
	private String TEMPORARY_TIN;
	private Long TP_STYPE_NO;
	private Long LANG_NO;
	private String SENSITIVE;
	private String TAXPYR_COMMENT ;
	private String IF_EMAIL_REMITTANCE;
	@ManyToOne
	private Ird_employee UPDATE_USER;
	private String USE_TIN_AS_VAT_ID;
	private Long WEREDA_NO ;
	private String KEBELE_DESC;
	private String PO_BOX;
	private String USE_LOCAL_DATE;
	private String TIN_FROM_FLAG;
    @JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate TIN_SIGTAS_CREATE_DATE;
    @JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate TIN_SIGTAS_LAST_UPDATE_DATE;
	private Long TIN_UPDATED_VALUES;
	private String TIN_VAT_FLAG_REMOVED;
	private String PREVIOUS_TIN;
	private String SEND_CORR_TO_REPR;
	private String EXPORTER;
    @ManyToOne
	private Fiscal_regime FISCREGIME_NO;
	private Long CAT_NO;
	private Long TP_STATUS_NO;
	private String FISCAL_NO_SIGTAS_OLD;
    @JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate INACTIF_DATE;


    public Taxpayer() {
    }
    public Taxpayer(String  FISCAL_NO,String MAILING_ADDRESS) {
        this.TAX_PAYER_NO= TAX_PAYER_NO;
        this.FISCAL_NO = FISCAL_NO;
        this.MAILING_ADDRESS = MAILING_ADDRESS;
    }


    
    public Taxpayer(Long TP_TYPE_NO, Long COUNTRY_NO, String NSF_CHEQUE, Long CITY_NO, String MAILING_ADDRESS, String RESIDENT, Taxpayer REP_TAX_PAYER_NO, Long FISC_YR_START, Long FISC_YR_END, Long BRANCH_NO, Long REP_TYPE_NO, Long POST_CODE_NO, Long REP_REASON_NO, String BANK_ACCT_NO, String REP_TAXR_NAME, LocalDate ENTER_DATE, Ird_employee ENTER_USER, String FISCAL_NO, String STREET_NO, String DOOR_NO, Long LOCALITY_NO, String ACCOUNT_HOLDER, Long BANK_NO, LocalDate UPDATE_DATE, Long TAX_CENTRE_NO, String TEMPORARY_TIN, Long TP_STYPE_NO, Long LANG_NO, String SENSITIVE, String TAXPYR_COMMENT, String IF_EMAIL_REMITTANCE, Ird_employee UPDATE_USER, String USE_TIN_AS_VAT_ID, Long WEREDA_NO, String KEBELE_DESC, String PO_BOX, String USE_LOCAL_DATE, String TIN_FROM_FLAG, LocalDate TIN_SIGTAS_CREATE_DATE, LocalDate TIN_SIGTAS_LAST_UPDATE_DATE, Long TIN_UPDATED_VALUES, String TIN_VAT_FLAG_REMOVED, String PREVIOUS_TIN, String SEND_CORR_TO_REPR, String EXPORTER, Fiscal_regime FISCREGIME_NO, Long CAT_NO, Long TP_STATUS_NO, String FISCAL_NO_SIGTAS_OLD, LocalDate INACTIF_DATE) {
        
        this.TP_TYPE_NO = TP_TYPE_NO;
        this.COUNTRY_NO = COUNTRY_NO;
        this.NSF_CHEQUE = NSF_CHEQUE;
        this.CITY_NO = CITY_NO;
        this.MAILING_ADDRESS = MAILING_ADDRESS;
        this.RESIDENT = RESIDENT;
        this.REP_TAX_PAYER_NO = REP_TAX_PAYER_NO;
        this.FISC_YR_START = FISC_YR_START;
        this.FISC_YR_END = FISC_YR_END;
        this.BRANCH_NO = BRANCH_NO;
        this.REP_TYPE_NO = REP_TYPE_NO;
        this.POST_CODE_NO = POST_CODE_NO;
        this.REP_REASON_NO = REP_REASON_NO;
        this.BANK_ACCT_NO = BANK_ACCT_NO;
        this.REP_TAXR_NAME = REP_TAXR_NAME;
        this.ENTER_DATE = ENTER_DATE;
        this.ENTER_USER = ENTER_USER;
        this.FISCAL_NO = FISCAL_NO;
        this.STREET_NO = STREET_NO;
        this.DOOR_NO = DOOR_NO;
        this.LOCALITY_NO = LOCALITY_NO;
        this.ACCOUNT_HOLDER = ACCOUNT_HOLDER;
        this.BANK_NO = BANK_NO;
        this.UPDATE_DATE = UPDATE_DATE;
        this.TAX_CENTRE_NO = TAX_CENTRE_NO;
        this.TEMPORARY_TIN = TEMPORARY_TIN;
        this.TP_STYPE_NO = TP_STYPE_NO;
        this.LANG_NO = LANG_NO;
        this.SENSITIVE = SENSITIVE;
        this.TAXPYR_COMMENT = TAXPYR_COMMENT;
        this.IF_EMAIL_REMITTANCE = IF_EMAIL_REMITTANCE;
        this.UPDATE_USER = UPDATE_USER;
        this.USE_TIN_AS_VAT_ID = USE_TIN_AS_VAT_ID;
        this.WEREDA_NO = WEREDA_NO;
        this.KEBELE_DESC = KEBELE_DESC;
        this.PO_BOX = PO_BOX;
        this.USE_LOCAL_DATE = USE_LOCAL_DATE;
        this.TIN_FROM_FLAG = TIN_FROM_FLAG;
        this.TIN_SIGTAS_CREATE_DATE = TIN_SIGTAS_CREATE_DATE;
        this.TIN_SIGTAS_LAST_UPDATE_DATE = TIN_SIGTAS_LAST_UPDATE_DATE;
        this.TIN_UPDATED_VALUES = TIN_UPDATED_VALUES;
        this.TIN_VAT_FLAG_REMOVED = TIN_VAT_FLAG_REMOVED;
        this.PREVIOUS_TIN = PREVIOUS_TIN;
        this.SEND_CORR_TO_REPR = SEND_CORR_TO_REPR;
        this.EXPORTER = EXPORTER;
        this.FISCREGIME_NO = FISCREGIME_NO;
        this.CAT_NO = CAT_NO;
        this.TP_STATUS_NO = TP_STATUS_NO;
        this.FISCAL_NO_SIGTAS_OLD = FISCAL_NO_SIGTAS_OLD;
        this.INACTIF_DATE = INACTIF_DATE;
    }


    public Long getTAX_PAYER_NO() {
        return this.TAX_PAYER_NO;
    }

    public void setTAX_PAYER_NO(Long TAX_PAYER_NO) {
        this.TAX_PAYER_NO = TAX_PAYER_NO;
    }

    public Long getTP_TYPE_NO() {
        return this.TP_TYPE_NO;
    }

    public void setTP_TYPE_NO(Long TP_TYPE_NO) {
        this.TP_TYPE_NO = TP_TYPE_NO;
    }

    public Long getCOUNTRY_NO() {
        return this.COUNTRY_NO;
    }

    public void setCOUNTRY_NO(Long COUNTRY_NO) {
        this.COUNTRY_NO = COUNTRY_NO;
    }

    public String getNSF_CHEQUE() {
        return this.NSF_CHEQUE;
    }

    public void setNSF_CHEQUE(String NSF_CHEQUE) {
        this.NSF_CHEQUE = NSF_CHEQUE;
    }

    public Long getCITY_NO() {
        return this.CITY_NO;
    }

    public void setCITY_NO(Long CITY_NO) {
        this.CITY_NO = CITY_NO;
    }

    public String getMAILING_ADDRESS() {
        return this.MAILING_ADDRESS;
    }

    public void setMAILING_ADDRESS(String MAILING_ADDRESS) {
        this.MAILING_ADDRESS = MAILING_ADDRESS;
    }

    public String getRESIDENT() {
        return this.RESIDENT;
    }

    public void setRESIDENT(String RESIDENT) {
        this.RESIDENT = RESIDENT;
    }

    public Taxpayer getREP_TAX_PAYER_NO() {
        return this.REP_TAX_PAYER_NO;
    }

    public void setREP_TAX_PAYER_NO(Taxpayer REP_TAX_PAYER_NO) {
        this.REP_TAX_PAYER_NO = REP_TAX_PAYER_NO;
    }

    public Long getFISC_YR_START() {
        return this.FISC_YR_START;
    }

    public void setFISC_YR_START(Long FISC_YR_START) {
        this.FISC_YR_START = FISC_YR_START;
    }

    public Long getFISC_YR_END() {
        return this.FISC_YR_END;
    }

    public void setFISC_YR_END(Long FISC_YR_END) {
        this.FISC_YR_END = FISC_YR_END;
    }

    public Long getBRANCH_NO() {
        return this.BRANCH_NO;
    }

    public void setBRANCH_NO(Long BRANCH_NO) {
        this.BRANCH_NO = BRANCH_NO;
    }

    public Long getREP_TYPE_NO() {
        return this.REP_TYPE_NO;
    }

    public void setREP_TYPE_NO(Long REP_TYPE_NO) {
        this.REP_TYPE_NO = REP_TYPE_NO;
    }

    public Long getPOST_CODE_NO() {
        return this.POST_CODE_NO;
    }

    public void setPOST_CODE_NO(Long POST_CODE_NO) {
        this.POST_CODE_NO = POST_CODE_NO;
    }

    public Long getREP_REASON_NO() {
        return this.REP_REASON_NO;
    }

    public void setREP_REASON_NO(Long REP_REASON_NO) {
        this.REP_REASON_NO = REP_REASON_NO;
    }

    public String getBANK_ACCT_NO() {
        return this.BANK_ACCT_NO;
    }

    public void setBANK_ACCT_NO(String BANK_ACCT_NO) {
        this.BANK_ACCT_NO = BANK_ACCT_NO;
    }

    public String getREP_TAXR_NAME() {
        return this.REP_TAXR_NAME;
    }

    public void setREP_TAXR_NAME(String REP_TAXR_NAME) {
        this.REP_TAXR_NAME = REP_TAXR_NAME;
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

    public String getFISCAL_NO() {
        return this.FISCAL_NO;
    }

    public void setFISCAL_NO(String FISCAL_NO) {
        this.FISCAL_NO = FISCAL_NO;
    }

    public String getSTREET_NO() {
        return this.STREET_NO;
    }

    public void setSTREET_NO(String STREET_NO) {
        this.STREET_NO = STREET_NO;
    }

    public String getDOOR_NO() {
        return this.DOOR_NO;
    }

    public void setDOOR_NO(String DOOR_NO) {
        this.DOOR_NO = DOOR_NO;
    }

    public Long getLOCALITY_NO() {
        return this.LOCALITY_NO;
    }

    public void setLOCALITY_NO(Long LOCALITY_NO) {
        this.LOCALITY_NO = LOCALITY_NO;
    }

    public String getACCOUNT_HOLDER() {
        return this.ACCOUNT_HOLDER;
    }

    public void setACCOUNT_HOLDER(String ACCOUNT_HOLDER) {
        this.ACCOUNT_HOLDER = ACCOUNT_HOLDER;
    }

    public Long getBANK_NO() {
        return this.BANK_NO;
    }

    public void setBANK_NO(Long BANK_NO) {
        this.BANK_NO = BANK_NO;
    }

    public LocalDate getUPDATE_DATE() {
        return this.UPDATE_DATE;
    }

    public void setUPDATE_DATE(LocalDate UPDATE_DATE) {
        this.UPDATE_DATE = UPDATE_DATE;
    }

    public Long getTAX_CENTRE_NO() {
        return this.TAX_CENTRE_NO;
    }

    public void setTAX_CENTRE_NO(Long TAX_CENTRE_NO) {
        this.TAX_CENTRE_NO = TAX_CENTRE_NO;
    }

    public String getTEMPORARY_TIN() {
        return this.TEMPORARY_TIN;
    }

    public void setTEMPORARY_TIN(String TEMPORARY_TIN) {
        this.TEMPORARY_TIN = TEMPORARY_TIN;
    }

    public Long getTP_STYPE_NO() {
        return this.TP_STYPE_NO;
    }

    public void setTP_STYPE_NO(Long TP_STYPE_NO) {
        this.TP_STYPE_NO = TP_STYPE_NO;
    }

    public Long getLANG_NO() {
        return this.LANG_NO;
    }

    public void setLANG_NO(Long LANG_NO) {
        this.LANG_NO = LANG_NO;
    }

    public String getSENSITIVE() {
        return this.SENSITIVE;
    }

    public void setSENSITIVE(String SENSITIVE) {
        this.SENSITIVE = SENSITIVE;
    }

    public String getTAXPYR_COMMENT() {
        return this.TAXPYR_COMMENT;
    }

    public void setTAXPYR_COMMENT(String TAXPYR_COMMENT) {
        this.TAXPYR_COMMENT = TAXPYR_COMMENT;
    }

    public String getIF_EMAIL_REMITTANCE() {
        return this.IF_EMAIL_REMITTANCE;
    }

    public void setIF_EMAIL_REMITTANCE(String IF_EMAIL_REMITTANCE) {
        this.IF_EMAIL_REMITTANCE = IF_EMAIL_REMITTANCE;
    }

    public Ird_employee getUPDATE_USER() {
        return this.UPDATE_USER;
    }

    public void setUPDATE_USER(Ird_employee UPDATE_USER) {
        this.UPDATE_USER = UPDATE_USER;
    }

    public String getUSE_TIN_AS_VAT_ID() {
        return this.USE_TIN_AS_VAT_ID;
    }

    public void setUSE_TIN_AS_VAT_ID(String USE_TIN_AS_VAT_ID) {
        this.USE_TIN_AS_VAT_ID = USE_TIN_AS_VAT_ID;
    }

    public Long getWEREDA_NO() {
        return this.WEREDA_NO;
    }

    public void setWEREDA_NO(Long WEREDA_NO) {
        this.WEREDA_NO = WEREDA_NO;
    }

    public String getKEBELE_DESC() {
        return this.KEBELE_DESC;
    }

    public void setKEBELE_DESC(String KEBELE_DESC) {
        this.KEBELE_DESC = KEBELE_DESC;
    }

    public String getPO_BOX() {
        return this.PO_BOX;
    }

    public void setPO_BOX(String PO_BOX) {
        this.PO_BOX = PO_BOX;
    }

    public String getUSE_LOCAL_DATE() {
        return this.USE_LOCAL_DATE;
    }

    public void setUSE_LOCAL_DATE(String USE_LOCAL_DATE) {
        this.USE_LOCAL_DATE = USE_LOCAL_DATE;
    }

    public String getTIN_FROM_FLAG() {
        return this.TIN_FROM_FLAG;
    }

    public void setTIN_FROM_FLAG(String TIN_FROM_FLAG) {
        this.TIN_FROM_FLAG = TIN_FROM_FLAG;
    }

    public LocalDate getTIN_SIGTAS_CREATE_DATE() {
        return this.TIN_SIGTAS_CREATE_DATE;
    }

    public void setTIN_SIGTAS_CREATE_DATE(LocalDate TIN_SIGTAS_CREATE_DATE) {
        this.TIN_SIGTAS_CREATE_DATE = TIN_SIGTAS_CREATE_DATE;
    }

    public LocalDate getTIN_SIGTAS_LAST_UPDATE_DATE() {
        return this.TIN_SIGTAS_LAST_UPDATE_DATE;
    }

    public void setTIN_SIGTAS_LAST_UPDATE_DATE(LocalDate TIN_SIGTAS_LAST_UPDATE_DATE) {
        this.TIN_SIGTAS_LAST_UPDATE_DATE = TIN_SIGTAS_LAST_UPDATE_DATE;
    }

    public Long getTIN_UPDATED_VALUES() {
        return this.TIN_UPDATED_VALUES;
    }

    public void setTIN_UPDATED_VALUES(Long TIN_UPDATED_VALUES) {
        this.TIN_UPDATED_VALUES = TIN_UPDATED_VALUES;
    }

    public String getTIN_VAT_FLAG_REMOVED() {
        return this.TIN_VAT_FLAG_REMOVED;
    }

    public void setTIN_VAT_FLAG_REMOVED(String TIN_VAT_FLAG_REMOVED) {
        this.TIN_VAT_FLAG_REMOVED = TIN_VAT_FLAG_REMOVED;
    }

    public String getPREVIOUS_TIN() {
        return this.PREVIOUS_TIN;
    }

    public void setPREVIOUS_TIN(String PREVIOUS_TIN) {
        this.PREVIOUS_TIN = PREVIOUS_TIN;
    }

    public String getSEND_CORR_TO_REPR() {
        return this.SEND_CORR_TO_REPR;
    }

    public void setSEND_CORR_TO_REPR(String SEND_CORR_TO_REPR) {
        this.SEND_CORR_TO_REPR = SEND_CORR_TO_REPR;
    }

    public String getEXPORTER() {
        return this.EXPORTER;
    }

    public void setEXPORTER(String EXPORTER) {
        this.EXPORTER = EXPORTER;
    }

    public Fiscal_regime getFISCAL_REGIME_NO() {
        return this.FISCREGIME_NO;
    }

    public void setFISCAL_REGIME_NO(Fiscal_regime FISCAL_REGIME_NO) {
        this.FISCREGIME_NO = FISCAL_REGIME_NO;
    }

    public Long getCAT_NO() {
        return this.CAT_NO;
    }

    public void setCAT_NO(Long CAT_NO) {
        this.CAT_NO = CAT_NO;
    }

    public Long getTP_STATUS_NO() {
        return this.TP_STATUS_NO;
    }

    public void setTP_STATUS_NO(Long TP_STATUS_NO) {
        this.TP_STATUS_NO = TP_STATUS_NO;
    }

    public String getFISCAL_NO_SIGTAS_OLD() {
        return this.FISCAL_NO_SIGTAS_OLD;
    }

    public void setFISCAL_NO_SIGTAS_OLD(String FISCAL_NO_SIGTAS_OLD) {
        this.FISCAL_NO_SIGTAS_OLD = FISCAL_NO_SIGTAS_OLD;
    }

    public LocalDate getINACTIF_DATE() {
        return this.INACTIF_DATE;
    }

    public void setINACTIF_DATE(LocalDate INACTIF_DATE) {
        this.INACTIF_DATE = INACTIF_DATE;
    }

    @Override
    public String toString() {
        return "{" +
            " TAX_PAYER_NO='" + getTAX_PAYER_NO() + "'" +
            ", TP_TYPE_NO='" + getTP_TYPE_NO() + "'" +
            ", COUNTRY_NO='" + getCOUNTRY_NO() + "'" +
            ", NSF_CHEQUE='" + getNSF_CHEQUE() + "'" +
            ", CITY_NO='" + getCITY_NO() + "'" +
            ", MAILING_ADDRESS='" + getMAILING_ADDRESS() + "'" +
            ", RESIDENT='" + getRESIDENT() + "'" +
            ", REP_TAX_PAYER_NO='" + getREP_TAX_PAYER_NO() + "'" +
            ", FISC_YR_START='" + getFISC_YR_START() + "'" +
            ", FISC_YR_END='" + getFISC_YR_END() + "'" +
            ", BRANCH_NO='" + getBRANCH_NO() + "'" +
            ", REP_TYPE_NO='" + getREP_TYPE_NO() + "'" +
            ", POST_CODE_NO='" + getPOST_CODE_NO() + "'" +
            ", REP_REASON_NO='" + getREP_REASON_NO() + "'" +
            ", BANK_ACCT_NO='" + getBANK_ACCT_NO() + "'" +
            ", REP_TAXR_NAME='" + getREP_TAXR_NAME() + "'" +
            ", ENTER_DATE='" + getENTER_DATE() + "'" +
            ", ENTER_USER='" + getENTER_USER() + "'" +
            ", FISCAL_NO='" + getFISCAL_NO() + "'" +
            ", STREET_NO='" + getSTREET_NO() + "'" +
            ", DOOR_NO='" + getDOOR_NO() + "'" +
            ", LOCALITY_NO='" + getLOCALITY_NO() + "'" +
            ", ACCOUNT_HOLDER='" + getACCOUNT_HOLDER() + "'" +
            ", BANK_NO='" + getBANK_NO() + "'" +
            ", UPDATE_DATE='" + getUPDATE_DATE() + "'" +
            ", TAX_CENTRE_NO='" + getTAX_CENTRE_NO() + "'" +
            ", TEMPORARY_TIN='" + getTEMPORARY_TIN() + "'" +
            ", TP_STYPE_NO='" + getTP_STYPE_NO() + "'" +
            ", LANG_NO='" + getLANG_NO() + "'" +
            ", SENSITIVE='" + getSENSITIVE() + "'" +
            ", TAXPYR_COMMENT='" + getTAXPYR_COMMENT() + "'" +
            ", IF_EMAIL_REMITTANCE='" + getIF_EMAIL_REMITTANCE() + "'" +
            ", UPDATE_USER='" + getUPDATE_USER() + "'" +
            ", USE_TIN_AS_VAT_ID='" + getUSE_TIN_AS_VAT_ID() + "'" +
            ", WEREDA_NO='" + getWEREDA_NO() + "'" +
            ", KEBELE_DESC='" + getKEBELE_DESC() + "'" +
            ", PO_BOX='" + getPO_BOX() + "'" +
            ", USE_LOCAL_DATE='" + getUSE_LOCAL_DATE() + "'" +
            ", TIN_FROM_FLAG='" + getTIN_FROM_FLAG() + "'" +
            ", TIN_SIGTAS_CREATE_DATE='" + getTIN_SIGTAS_CREATE_DATE() + "'" +
            ", TIN_SIGTAS_LAST_UPDATE_DATE='" + getTIN_SIGTAS_LAST_UPDATE_DATE() + "'" +
            ", TIN_UPDATED_VALUES='" + getTIN_UPDATED_VALUES() + "'" +
            ", TIN_VAT_FLAG_REMOVED='" + getTIN_VAT_FLAG_REMOVED() + "'" +
            ", PREVIOUS_TIN='" + getPREVIOUS_TIN() + "'" +
            ", SEND_CORR_TO_REPR='" + getSEND_CORR_TO_REPR() + "'" +
            ", EXPORTER='" + getEXPORTER() + "'" +
            ", FISCAL_REGIME_NO='" + getFISCAL_REGIME_NO() + "'" +
            ", CAT_NO='" + getCAT_NO() + "'" +
            ", TP_STATUS_NO='" + getTP_STATUS_NO() + "'" +
            ", FISCAL_NO_SIGTAS_OLD='" + getFISCAL_NO_SIGTAS_OLD() + "'" +
            ", INACTIF_DATE='" + getINACTIF_DATE() + "'" +
            "}";
    }


}
