package com.dongtaidaili.bin;

public class ProxyPerson implements Person {
    private Person person;

    public ProxyPerson(Person person) {
        this.person = person;
    }

    @Override
    public void sleep() {
        System.out.println("我是代理类");
        //person.sleep();//代理的类对象
    }
}
