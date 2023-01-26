package com.dge.models;

import javax.persistence.*;

@Entity
@Table(name="IRD_EMPLOYEE")
public class Ird_employee {
    @Id
	@SequenceGenerator(
		name = "ird_employee_sequence",
		sequenceName = "ird_employee_sequence",
		allocationSize=1
	)
	@GeneratedValue(
		strategy = GenerationType.SEQUENCE,
		generator = "ird_employee_sequence"
	)
    private Long IRD_EMPLOYEE_NO;
	private String IRD_EMP_EMPLOYEE_NO;
	private String IRD_EMP_FIRST_NAME;
	private String IRD_EMP_LAST_NAME;
	private String IRD_LOGIN_ID;
	private Long PAYMENT_LOC_NO;
	private Long LANG_NO;
	private Long TAX_CENTRE_NO;
	private String SENSITIVE;
	private String UPDATE_ALL_TAX_CENTRES;
    @ManyToOne
	private Division DIVISION_NO;
	private String IRD_EMP_PWD;

    public Ird_employee() {
    }

    public Ird_employee( String IRD_EMP_EMPLOYEE_NO, String IRD_EMP_FIRST_NAME, String IRD_EMP_LAST_NAME, String IRD_LOGIN_ID, Long PAYMENT_LOC_NO, Long LANG_NO, Long TAX_CENTRE_NO, String SENSITIVE, String UPDATE_ALL_TAX_CENTRES, Division DIVISION_NO, String IRD_EMP_PWD) {
        super();
        this.IRD_EMP_EMPLOYEE_NO = IRD_EMP_EMPLOYEE_NO;
        this.IRD_EMP_FIRST_NAME = IRD_EMP_FIRST_NAME;
        this.IRD_EMP_LAST_NAME = IRD_EMP_LAST_NAME;
        this.IRD_LOGIN_ID = IRD_LOGIN_ID;
        this.PAYMENT_LOC_NO = PAYMENT_LOC_NO;
        this.LANG_NO = LANG_NO;
        this.TAX_CENTRE_NO = TAX_CENTRE_NO;
        this.SENSITIVE = SENSITIVE;
        this.UPDATE_ALL_TAX_CENTRES = UPDATE_ALL_TAX_CENTRES;
        this.DIVISION_NO = DIVISION_NO;
        this.IRD_EMP_PWD = IRD_EMP_PWD;
    }


    public Long getIRD_EMPLOYEE_NO() {
        return this.IRD_EMPLOYEE_NO;
    }

    public void setIRD_EMPLOYEE_NO(Long IRD_EMPLOYEE_NO) {
        this.IRD_EMPLOYEE_NO = IRD_EMPLOYEE_NO;
    }

    public String getIRD_EMP_EMPLOYEE_NO() {
        return this.IRD_EMP_EMPLOYEE_NO;
    }

    public void setIRD_EMP_EMPLOYEE_NO(String IRD_EMP_EMPLOYEE_NO) {
        this.IRD_EMP_EMPLOYEE_NO = IRD_EMP_EMPLOYEE_NO;
    }

    public String getIRD_EMP_FIRST_NAME() {
        return this.IRD_EMP_FIRST_NAME;
    }

    public void setIRD_EMP_FIRST_NAME(String IRD_EMP_FIRST_NAME) {
        this.IRD_EMP_FIRST_NAME = IRD_EMP_FIRST_NAME;
    }

    public String getIRD_EMP_LAST_NAME() {
        return this.IRD_EMP_LAST_NAME;
    }

    public void setIRD_EMP_LAST_NAME(String IRD_EMP_LAST_NAME) {
        this.IRD_EMP_LAST_NAME = IRD_EMP_LAST_NAME;
    }

    public String getIRD_LOGIN_ID() {
        return this.IRD_LOGIN_ID;
    }

    public void setIRD_LOGIN_ID(String IRD_LOGIN_ID) {
        this.IRD_LOGIN_ID = IRD_LOGIN_ID;
    }

    public Long getPAYMENT_LOC_NO() {
        return this.PAYMENT_LOC_NO;
    }

    public void setPAYMENT_LOC_NO(Long PAYMENT_LOC_NO) {
        this.PAYMENT_LOC_NO = PAYMENT_LOC_NO;
    }

    public Long getLANG_NO() {
        return this.LANG_NO;
    }

    public void setLANG_NO(Long LANG_NO) {
        this.LANG_NO = LANG_NO;
    }

    public Long getTAX_CENTRE_NO() {
        return this.TAX_CENTRE_NO;
    }

    public void setTAX_CENTRE_NO(Long TAX_CENTRE_NO) {
        this.TAX_CENTRE_NO = TAX_CENTRE_NO;
    }

    public String getSENSITIVE() {
        return this.SENSITIVE;
    }

    public void setSENSITIVE(String SENSITIVE) {
        this.SENSITIVE = SENSITIVE;
    }

    public String getUPDATE_ALL_TAX_CENTRES() {
        return this.UPDATE_ALL_TAX_CENTRES;
    }

    public void setUPDATE_ALL_TAX_CENTRES(String UPDATE_ALL_TAX_CENTRES) {
        this.UPDATE_ALL_TAX_CENTRES = UPDATE_ALL_TAX_CENTRES;
    }

    public Division getDIVISION_NO() {
        return this.DIVISION_NO;
    }

    public void setDIVISION_NO(Division DIVISION_NO) {
        this.DIVISION_NO = DIVISION_NO;
    }

    public String getIRD_EMP_PWD() {
        return this.IRD_EMP_PWD;
    }

    public void setIRD_EMP_PWD(String IRD_EMP_PWD) {
        this.IRD_EMP_PWD = IRD_EMP_PWD;
    }

    @Override
    public String toString() {
        return "{" +
            " IRD_EMPLOYEE_NO='" + getIRD_EMPLOYEE_NO() + "'" +
            ", IRD_EMP_EMPLOYEE_NO='" + getIRD_EMP_EMPLOYEE_NO() + "'" +
            ", IRD_EMP_FIRST_NAME='" + getIRD_EMP_FIRST_NAME() + "'" +
            ", IRD_EMP_LAST_NAME='" + getIRD_EMP_LAST_NAME() + "'" +
            ", IRD_LOGIN_ID='" + getIRD_LOGIN_ID() + "'" +
            ", PAYMENT_LOC_NO='" + getPAYMENT_LOC_NO() + "'" +
            ", LANG_NO='" + getLANG_NO() + "'" +
            ", TAX_CENTRE_NO='" + getTAX_CENTRE_NO() + "'" +
            ", SENSITIVE='" + getSENSITIVE() + "'" +
            ", UPDATE_ALL_TAX_CENTRES='" + getUPDATE_ALL_TAX_CENTRES() + "'" +
            ", DIVISION_NO='" + getDIVISION_NO() + "'" +
            ", IRD_EMP_PWD='" + getIRD_EMP_PWD() + "'" +
            "}";
    }

}
