package model;

public class ClassRoom {
    private String classCode;
    private String className;
    private int teacherCode;

    public ClassRoom(String classCode, String className, int teacherCode) {
        this.classCode = classCode;
        this.className = className;
        this.teacherCode = teacherCode;
    }
    public ClassRoom(){

    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(int teacherCode) {
        this.teacherCode = teacherCode;
    }
}
