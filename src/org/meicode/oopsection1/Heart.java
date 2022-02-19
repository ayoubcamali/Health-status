package org.meicode.oopsection1;

public class Heart {
    private String name;
    private String medicalCondition;
    private int rate;

    public Heart(String name, String medicalCondition, int rate) {
        this.name = name;
        this.medicalCondition = medicalCondition;
        this.rate = rate;
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

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
