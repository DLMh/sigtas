package com.dge.models;

import javax.persistence.*;

@Entity
@Table(name="DIVISION")
public class Division {

    @Id
	@SequenceGenerator(
		name = "division_sequence",
		sequenceName = "division_sequence",
		allocationSize=1
	)
	@GeneratedValue(
		strategy = GenerationType.SEQUENCE,
		generator = "division_sequence"
	)
    private Long DIVISION_NO;
	private String DIVISION_DESC;
	private String DIVISION_DESC_F;
	private String DIVISION_DESC_S;

    public Division() {
    }
       

    public Division(Long DIVISION_NO) {
        this.DIVISION_NO = DIVISION_NO;
    }
    

    public Division(String DIVISION_DESC, String DIVISION_DESC_F, String DIVISION_DESC_S) {
        this.DIVISION_DESC = DIVISION_DESC;
        this.DIVISION_DESC_F = DIVISION_DESC_F;
        this.DIVISION_DESC_S = DIVISION_DESC_S;
    }
    

    public Long getDIVISION_NO() {
        return this.DIVISION_NO;
    }

    public void setDIVISION_NO(Long DIVISION_NO) {
        this.DIVISION_NO = DIVISION_NO;
    }

    public String getDIVISION_DESC() {
        return this.DIVISION_DESC;
    }

    public void setDIVISION_DESC(String DIVISION_DESC) {
        this.DIVISION_DESC = DIVISION_DESC;
    }

    public String getDIVISION_DESC_F() {
        return this.DIVISION_DESC_F;
    }

    public void setDIVISION_DESC_F(String DIVISION_DESC_F) {
        this.DIVISION_DESC_F = DIVISION_DESC_F;
    }

    public String getDIVISION_DESC_S() {
        return this.DIVISION_DESC_S;
    }

    public void setDIVISION_DESC_S(String DIVISION_DESC_S) {
        this.DIVISION_DESC_S = DIVISION_DESC_S;
    }

    @Override
    public String toString() {
        return "{" +
            " DIVISION_NO='" + getDIVISION_NO() + "'" +
            ", DIVISION_DESC='" + getDIVISION_DESC() + "'" +
            ", DIVISION_DESC_F='" + getDIVISION_DESC_F() + "'" +
            ", DIVISION_DESC_S='" + getDIVISION_DESC_S() + "'" +
            "}";
    }

}
