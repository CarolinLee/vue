package com.heeexy.example.entity;

public class regulationWithBLOBs extends regulation {
    private String regulationid;

    private String introduction;

    private String typicalproduct;

    private String interpretation;

    public String getRegulationid() {
        return regulationid;
    }

    public void setRegulationid(String regulationid) {
        this.regulationid = regulationid == null ? null : regulationid.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getTypicalproduct() {
        return typicalproduct;
    }

    public void setTypicalproduct(String typicalproduct) {
        this.typicalproduct = typicalproduct == null ? null : typicalproduct.trim();
    }

    public String getInterpretation() {
        return interpretation;
    }

    public void setInterpretation(String interpretation) {
        this.interpretation = interpretation == null ? null : interpretation.trim();
    }
}