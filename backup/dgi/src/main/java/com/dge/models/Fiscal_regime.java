package com.dge.models;

import javax.persistence.*;

@Entity
@Table(name="FISCAL_REGIME")
public class Fiscal_regime {

    @Id
	@SequenceGenerator(
		name = "fiscal_regime_sequence",
		sequenceName = "fiscal_regime_sequence",
		allocationSize=1
	)
	@GeneratedValue(
		strategy = GenerationType.SEQUENCE,
		generator = "fiscal_regime_sequence"
	)
    private Long FISCAL_REGIME_NO;
	private String FISCAL_REGIME_DESC;
	private String FISCAL_REGIME_DESC_F;
	private String FISCAL_REGIME_DESC_S;

    public Fiscal_regime() {
    }

    public Long getFISCAL_REGIME_NO() {
        return this.FISCAL_REGIME_NO;
    }

    public void setFISCAL_REGIME_NO(Long FISCAL_REGIME_NO) {
        this.FISCAL_REGIME_NO = FISCAL_REGIME_NO;
    }

    public String getFISCAL_REGIME_DESC() {
        return this.FISCAL_REGIME_DESC;
    }

    public void setFISCAL_REGIME_DESC(String FISCAL_REGIME_DESC) {
        this.FISCAL_REGIME_DESC = FISCAL_REGIME_DESC;
    }

    public String getFISCAL_REGIME_DESC_F() {
        return this.FISCAL_REGIME_DESC_F;
    }

    public void setFISCAL_REGIME_DESC_F(String FISCAL_REGIME_DESC_F) {
        this.FISCAL_REGIME_DESC_F = FISCAL_REGIME_DESC_F;
    }

    public String getFISCAL_REGIME_DESC_S() {
        return this.FISCAL_REGIME_DESC_S;
    }

    public void setFISCAL_REGIME_DESC_S(String FISCAL_REGIME_DESC_S) {
        this.FISCAL_REGIME_DESC_S = FISCAL_REGIME_DESC_S;
    }

    @Override
    public String toString() {
        return "{" +
            " FISCAL_REGIME_NO='" + getFISCAL_REGIME_NO() + "'" +
            ", FISCAL_REGIME_DESC='" + getFISCAL_REGIME_DESC() + "'" +
            ", FISCAL_REGIME_DESC_F='" + getFISCAL_REGIME_DESC_F() + "'" +
            ", FISCAL_REGIME_DESC_S='" + getFISCAL_REGIME_DESC_S() + "'" +
            "}";
    }

}
