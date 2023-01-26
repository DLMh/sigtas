package com.dge.dto;

import com.dge.models.Enterprise;

public class InfoContribu {
    
    private Enterprise enterprise;

    public Enterprise getEnterprise() {
        return this.enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public InfoContribu() {
    }

    public InfoContribu(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    @Override
    public String toString() {
        return "{" +
            " enterprise='" + getEnterprise() + "'" +
            "}";
    }

}
