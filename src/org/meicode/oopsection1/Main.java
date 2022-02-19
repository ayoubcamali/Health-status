package org.meicode.oopsection1;

import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {
        String chooseAnOrgan = "Choose an Organ: \n    1. Left Eye \n    2. Right Eye \n    3. Heart \n    " +
                "4. Stomach \n    5. Skin \n    6. Quit " ;
    Person person = new Person(new Eye("Left Eye","Short sighted","blue"),
            new Eye("Left Eye","Short sighted","blue"),
            new Heart("Heart","Normal",65),new Stomach("Stomach","PUD"
    ),new Skin("Skin","Burned",""),"Tom",25);
        Eye leftEye = new Eye("Left Eye","Short sighted","blue");
        Eye rightEye = new Eye("Roght Eye","Normal","Blue");
        Heart heart = new Heart("Heart","Normal",65);
        System.out.println( "Name: " +person.getName());
        System.out.println("Age"+ person.getAge());


        while (true){
            System.out.println(chooseAnOrgan);
            Scanner sc= new Scanner(System.in);
            int a = sc.nextInt();
            if (a == 1) {
                System.out.println("Name:" + person.getLeftEye().getName());
                System.out.println("Medical Condition:" + person.getLeftEye().getMedicalCondition());
                System.out.println("Color:" + person.getLeftEye().getColor());
                System.out.println("        1. Close the Eye");
                Scanner sc1= new Scanner(System.in);
                final int b = sc1.nextInt();
                if (b == 1){
                    System.out.println("Left Eye Closed");
                }else {
                    System.out.print("");
                }
            }else if (a == 2){
                System.out.println("Name:" + person.getRightEye().getName());
                System.out.println("Medical Condition:" + person.getRightEye().getMedicalCondition());
                System.out.println("color" + person.getRightEye().getColor());
                System.out.println("        1. Close the Eye");
                Scanner sc1= new Scanner(System.in);
                final int b = sc1.nextInt();
                if (b == 1){
                    System.out.println("Right Eye Closed");
                }else {
                    System.out.print("");
                }
            }else if (a == 3){
                System.out.println("Name:" + person.getHeart().getName());
                System.out.println("Medical Condition:" + person.getHeart().getMedicalCondition());
                System.out.println("Heart rate changed" + person.getHeart().getRate());
                System.out.println("        1. Change the heart rate");
                Scanner sc1= new Scanner(System.in);
                final int b = sc1.nextInt();
                if (b == 1){
                    System.out.println("Enter the new heart rate");
                    Scanner sc2= new Scanner(System.in);
                    final int c = sc2.nextInt();
                    person.heart.setRate(c);
                    System.out.println("Heart rate changed to: "+ c);
                }else {
                    System.out.print("");
                }
            }else if (a == 4){
                System.out.println("Name:" + person.getStomach().getName());
                System.out.println("Medical Condition:" + person.getStomach().getMedicalCondition());
                System.out.println(person.getStomach().getFed());
                System.out.println("        1. Digest");
                Scanner sc1= new Scanner(System.in);
                final int b = sc1.nextInt();
                if (b == 1){
                    System.out.println("Digesting begin...");
                }else {
                    System.out.print("");
                }

            }else if (a == 5){
                System.out.println("Name:" + person.getSkin().getName());
                System.out.println("Medical Condition:" + person.getSkin().getMedicalCondition());
            }else if(a == 6){
                break;
            }else{

            }
        }
}
}
