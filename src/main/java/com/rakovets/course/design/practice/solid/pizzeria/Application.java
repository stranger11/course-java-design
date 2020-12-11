package com.rakovets.course.design.practice.solid.pizzeria;
import com.rakovets.course.design.practice.solid.pizzeria.model.PizzaMenu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;

import static com.rakovets.course.design.practice.solid.pizzeria.service.Order.*;

public class Application {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(PizzaMenu.list);
        System.out.println(getPizza());
    }
}
