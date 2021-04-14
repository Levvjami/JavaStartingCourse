package com.timdaris;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    //getter methods
    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName(){
        String returnValue = "";
        if (!firstName.equals("") && !lastName.equals("")){
            returnValue = firstName + " " + lastName;
        }else if (firstName.equals("")){
            returnValue = lastName;
        }else if (lastName.equals("")){
            returnValue = firstName;
        }
        return returnValue;
    }

    //setter methods

    public void setAge(int age) {
        if (age < 1 || age > 100){
            this.age = 0;
        }else{
            this.age = age;
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //other methods
    public boolean isTeen(){
        boolean returnValue = false;
        if (age < 20 && age > 12){
            returnValue = true;
        }
        return returnValue;
    }
}
