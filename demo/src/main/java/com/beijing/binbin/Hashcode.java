package com.beijing.binbin;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Hashcode {
    public static void main(String[] args) {
        Hashcode code = new Hashcode();
        Hashcode code1 = new Hashcode();
        System.out.println(code.hashCode());
        Object o = new Object();
        System.out.println(o.hashCode());
        System.out.println(code.equals(code));
        System.out.println(code.equals(o));
        System.out.println(code.equals(code1));
        Book book = null;
//        System.out.println(book.toString());
        System.out.println(code.toString());
//        book.name.isEmpty();
        String a = "";
        String abc = new String("ab");
        String ba = "ab";
        System.out.println(a == ba);
        System.out.println(a == abc);
        System.out.println(ba == abc);
//        if (a=="")
        if (a == ba) {
            System.out.println("kong");
        }
        String aaa = null;
//        aaa.equals(a);
        if (aaa == null || aaa == "") {

        }
        String c = null;
        System.out.println(abc.isEmpty());
//        if (c!=null||c.isEmpty()==true){
//            System.out.println("wolaid");
//
//        }
        Book book1 = new Book("12222", 2, "1");
        Book b = new Book("33331", 2, "1");
        Book bc = new Book("33331", 2, "1");
        Book ccc = new Book("13333", 2, "1");
        List<Book> saqq = new ArrayList<>();
        saqq.add(book1);
        saqq.add(b);
        saqq.add(bc);
        saqq.add(ccc);
        saqq.stream().distinct().forEach(book2 -> System.out.println(book2.name));
        Integer[] arr = {1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 4, 3, 3, 2, 1, 5, 6, 6, 6, 5, 43,};
        Stream<Integer> integerStream = Arrays.stream(arr);
        Stream<Integer> integerStream1 = Stream.of(arr);
        integerStream1.distinct()
                .filter(integer -> integer > 2)
                .forEach(integer -> System.out.println(integer));

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("bbb",111);
        hashMap.put("xxsad3啊啊啊",222);
        hashMap.put("aaaa",222);
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        Stream<Map.Entry<String, Integer>> stream = entries.stream();
        stream.filter(new Predicate<Map.Entry<String, Integer>>() {
            @Override
            public boolean test(Map.Entry<String, Integer> stringIntegerEntry) {
                return stringIntegerEntry.getValue()>111;
            }
        }).forEach(new Consumer<Map.Entry<String, Integer>>() {
            @Override
            public void accept(Map.Entry<String, Integer> stringIntegerEntry) {
                System.out.println(stringIntegerEntry.getKey()+"\n"+stringIntegerEntry.getValue());
            }
        });

        Optional<String> a1 = Optional.ofNullable(a);
        a1.ifPresent(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });


    }

}
