package org.meicode.oopsection1;

public class Eye {
    private String Name;
    private String medicalCondition;
    private String color;

    public Eye(String name, String medicalCondition, String color) {
        Name = name;
        this.medicalCondition = medicalCondition;
        this.color = color;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
