package com.example.designmode.prototypemode;

import androidx.annotation.NonNull;

public class SuperStudent implements Cloneable
{
    public String skill;
    public Student student;

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @NonNull
    @Override
    public Object clone() throws CloneNotSupportedException{
        SuperStudent newSuperStudent = (SuperStudent)super.clone();
        newSuperStudent.setStudent((Student)student.clone());
        return newSuperStudent;
    }
}