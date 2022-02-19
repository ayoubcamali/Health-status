package org.meicode.oopsection1;

public class Person {
    Eye leftEye ;
    Eye rightEye;
    Heart heart ;
    Stomach stomach;
    Skin skin;
    private String name;
    private int Age;

    public Person(Eye leftEye, Eye rightEye, Heart heart, Stomach stomach, Skin skin, String name, int age) {
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
        this.name = name;
        Age = age;
    }

    public Person(Eye leftEye, Eye rightEye, Heart heart) {
    }

    public Eye getLeftEye() {
        return leftEye;
    }

    public void setLeftEye(Eye leftEye) {
        this.leftEye = leftEye;
    }

    public Eye getRightEye() {
        return rightEye;
    }

    public void setRightEye(Eye rightEye) {
        this.rightEye = rightEye;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public Stomach getStomach() {
        return stomach;
    }

    public void setStomach(Stomach stomach) {
        this.stomach = stomach;
    }

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setHeart() {
    }
}
