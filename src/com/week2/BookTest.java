package com.week2;
/**
 * List接口练习
 * 2019.3.19
 */

import java.util.ArrayList;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book(151,"茶馆",33.5));
        list.add(new Book(1,"骆驼祥子",150.0));
        list.add(new Book(26,"朝花夕拾",66.6));
        list.add(new Book(820,"孔乙己",65.0));
        System.out.println(list);

        list.add(2,new Book(3,"三国演义",99.3));
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.set(2,new Book(9,"钢铁是怎样炼成的",10.5));
        System.out.println(list);
        System.out.println(list.get(1));

        list.add(new Book(1,"秘密花园",114.0));
        System.out.println(list);
        System.out.println(list.indexOf(new Book(1,"十万个为什么",15.0)));
        System.out.println(list.lastIndexOf(new Book(1,"西游记a",64.0)));
    }
}
