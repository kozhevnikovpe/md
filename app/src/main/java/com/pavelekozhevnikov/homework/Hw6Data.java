package com.pavelekozhevnikov.homework;

import java.util.ArrayList;
import java.util.List;

public class Hw6Data {

    List<Product> list;

    public Hw6Data() {

        list = new ArrayList<>();
        list.add(new Product("Томаты",120.0));
        list.add(new Product("Малина",12.0));
        list.add(new Product("Лимон",10.0));
        list.add(new Product("Апельсин",20.0));
        list.add(new Product("Киви",23.0));
        list.add(new Product("Черника",54.0));
        list.add(new Product("Голубика",22.0));
    }

    public List<Product> getList() {
        return list;
    }
}
