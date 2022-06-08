package _001_createPattern._003_clone.deepClone;

import java.io.Serializable;

public class Citation implements Cloneable , Serializable {

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void show() {
        System.out.println("student " + student.getName());
    }
}
