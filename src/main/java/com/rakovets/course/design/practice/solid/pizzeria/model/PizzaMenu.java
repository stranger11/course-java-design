package com.rakovets.course.design.practice.solid.pizzeria.model;

import java.util.List;

public class PizzaMenu {
    public static List<Pizza> list = List.of(
            new Pizza (1, "carbonara", "parmezan", "ham", "tomato",
                    "thin", "pesto", "basil", 100.0),
            new Pizza (2, "pepperoni", "chedr", "salami", "tomato, pepper",
                    "thin", "barbeque", "olives", 80.0),
            new Pizza (3, "classic", "dgugas", "chiken", "tomato, cucumber",
                    "fat", "ketchup", "capers", 85.50),
            new Pizza (4, "margarita", "parmezan, dgugas, chedr, prezident", "none",
                    "none", "thin", "cheesy", "sun-dried tomato", 70.0),
            new Pizza (5, "mushrooms", "classic", "ham", "pepper", "fat",
                    "mayonnaise", "mushrooms", 79.0)
    );
}
