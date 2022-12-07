package com.dongtaidaili.bin;

import com.beijing.binbin.Bin;

public class Main {
//    @Bin("bb")
    private String test;
    public static void main(String[] args) {
        Student student = new Student("xiaobin");
//        student.wakeup();
        ProxyPerson proxyPerson = new ProxyPerson(student);
        proxyPerson.sleep();
        student.sleep();
        Person person22 = new Student("yangy");
        ProxyPerson wo你明 = new ProxyPerson(new Person() {
            @Override
            public void sleep() {
                System.out.println("wo你明");
                ;
            }
        });
        wo你明.sleep();
//        System.out.println(test);
        System.out.println(Student.class);
        Class<Student> studentClass = Student.class;
    }
}
