package com.rakovets.course.design.practice.solid.pizzeria.service;
import javax.lang.model.util.SimpleElementVisitor14;

import static com.rakovets.course.design.practice.solid.pizzeria.model.PizzaMenu.list;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Order {
    public static char getPizza () {
        Date date = new Date();
        Scanner scanner = new Scanner(System.in);
        Integer pizzanumber = null;
        String allOrder = "ok";
        System.out.println("\nEnter number of pizza from menu..");
        do try {
            pizzanumber = scanner.nextInt();
            int finalPizzanumber1 = pizzanumber;
            list.stream()
                    .filter(pizza -> pizza.getNumber() == finalPizzanumber1)
                    .forEach(System.out::println);
            if (pizzanumber > 5) {
                System.out.println("Number is not correct, please try again");
                return 0;
            }
        } catch (InputMismatchException e) {
            pizzanumber = null;
            System.out.println("Order accepted, " + date);
        } while (pizzanumber <= 5) ;
        //System.out.println("Order accepted, " + date);
        return 0;
    }
}
