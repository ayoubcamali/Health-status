package org.meicode.oopsection1;

public class Skin {
    private String name;
    private String medicalCondition;
    private String fed ="Need to be fed";

    public Skin(String name, String medicalCondition, String fed) {
        this.name = name;
        this.medicalCondition = medicalCondition;
        this.fed = fed;
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

    public void setFed(String fed) {
        this.fed = fed;
    }
}
