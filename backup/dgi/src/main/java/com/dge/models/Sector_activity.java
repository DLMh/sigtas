package com.dge.models;

import javax.persistence.*;

@Entity
@Table(name="SECTOR_ACTIVITY")
public class Sector_activity {
    @Id
	@SequenceGenerator(
		name = "sector_activity_sequence",
		sequenceName = "sector_activity_sequence",
		allocationSize=1
	)
	@GeneratedValue(
		strategy = GenerationType.SEQUENCE,
		generator = "sector_activity_sequence"
	)
    private Long SECTOR_ACT_NO;
	private String SECTOR_ACT_DESC;
	private String SECTOR_ACT_DESC_F;
	private String SECTOR_ACT_DESC_S;

    public Sector_activity() {
    }

    public Sector_activity(String SECTOR_ACT_DESC, String SECTOR_ACT_DESC_F, String SECTOR_ACT_DESC_S) {
        this.SECTOR_ACT_DESC = SECTOR_ACT_DESC;
        this.SECTOR_ACT_DESC_F = SECTOR_ACT_DESC_F;
        this.SECTOR_ACT_DESC_S = SECTOR_ACT_DESC_S;
    }
    

    public Long getSECTOR_ACT_NO() {
        return this.SECTOR_ACT_NO;
    }

    public void setSECTOR_ACT_NO(Long SECTOR_ACT_NO) {
        this.SECTOR_ACT_NO = SECTOR_ACT_NO;
    }

    public String getSECTOR_ACT_DESC() {
        return this.SECTOR_ACT_DESC;
    }

    public void setSECTOR_ACT_DESC(String SECTOR_ACT_DESC) {
        this.SECTOR_ACT_DESC = SECTOR_ACT_DESC;
    }

    public String getSECTOR_ACT_DESC_F() {
        return this.SECTOR_ACT_DESC_F;
    }

    public void setSECTOR_ACT_DESC_F(String SECTOR_ACT_DESC_F) {
        this.SECTOR_ACT_DESC_F = SECTOR_ACT_DESC_F;
    }

    public String getSECTOR_ACT_DESC_S() {
        return this.SECTOR_ACT_DESC_S;
    }

    public void setSECTOR_ACT_DESC_S(String SECTOR_ACT_DESC_S) {
        this.SECTOR_ACT_DESC_S = SECTOR_ACT_DESC_S;
    }

    @Override
    public String toString() {
        return "{" +
            " SECTOR_ACT_NO='" + getSECTOR_ACT_NO() + "'" +
            ", SECTOR_ACT_DESC='" + getSECTOR_ACT_DESC() + "'" +
            ", SECTOR_ACT_DESC_F='" + getSECTOR_ACT_DESC_F() + "'" +
            ", SECTOR_ACT_DESC_S='" + getSECTOR_ACT_DESC_S() + "'" +
            "}";
    }

}
