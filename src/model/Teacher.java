package model;

import model.Person;

public class Teacher extends Person {
    private int teacherCode;

    public Teacher(String name, String dob, boolean gender, String phoneNumber, int teacherCode) {
        super(name, dob, gender, phoneNumber);
        this.teacherCode = teacherCode;
    }

    public Teacher(int teacherCode) {
        this.teacherCode = teacherCode;
    }
    public Teacher(){

    }

    public int getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(int teacherCode) {
        this.teacherCode = teacherCode;
    }


}
