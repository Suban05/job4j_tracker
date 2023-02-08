package ru.job4j.pojo;

import java.sql.Date;
import java.time.LocalDateTime;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ложкин Андрей Васильевич");
        student.setGroup("08-221");
        student.setStartDate(Date.valueOf("2022-08-10"));
        System.out.println(student.getFullName());
        System.out.println(student.getGroup());
        System.out.println(student.getStartDate());
    }
}
