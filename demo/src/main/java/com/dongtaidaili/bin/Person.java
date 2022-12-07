package com.dongtaidaili.bin;

public interface Person {
    default void wakeup() {
        System.out.println("???");
    }

    default void sleep() {
        System.out.println("???");
    }
}
