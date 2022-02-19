package org.meicode.oopsection1;

public class Stomach {
    private String name;
    private String medicalCondition;
    private String fed ="Need to be fed";

    public Stomach(String name, String medicalCondition) {
        this.name = name;
        this.medicalCondition = medicalCondition;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    public String getFed() {
        return fed;
    }

    public void setFed(String torne) {
        this.fed = torne;
    }
}
