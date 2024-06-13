package model;

import model.Person;

public class Student extends Person {
    private int studentCode;
    private String classCode;

    public Student(String name, String dob, boolean gender, String phoneNumber, int studentCode, String classCode) {
        super(name, dob, gender, phoneNumber);
        this.studentCode = studentCode;
        this.classCode = classCode;
    }
    public Student(String name, String dob, boolean gender, String phoneNumber, String classCode) {
        super(name, dob, gender, phoneNumber);
        this.classCode = classCode;
    }



    public Student(int studentCode, String classCode) {
        this.studentCode = studentCode;
        this.classCode = classCode;
    }

    public Student(){

    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }


    @Override
    public String toString() {
        //1,Nguyen Dung,CLASS1,09/12/2001,1,0901234567
        return getStudentCode()+","+getName()+","+getClassCode()+","+getDob()+"," + isGender()+","+getPhoneNumber();
    }
}
