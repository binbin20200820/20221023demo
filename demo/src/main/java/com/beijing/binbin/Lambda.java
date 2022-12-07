package com.beijing.binbin;

import java.util.function.IntBinaryOperator;

public class Lambda {
    public static void main(String[] args) {
        //先自己手写匿名内部类
        int i = calculateNum(new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left + right;
            }
        });
        //快捷键转换
        int ij = calculateNum((left, right) -> left + right);
        //自己手动转换
        int iii = calculateNum((int left, int right) -> {
            return left + right;
        });
        System.out.println(i);


    }

    public static int calculateNum(IntBinaryOperator intBinaryOperator) {
        int a = 10;
        int b = 10;
        return intBinaryOperator.applyAsInt(a, b);
    }


}
