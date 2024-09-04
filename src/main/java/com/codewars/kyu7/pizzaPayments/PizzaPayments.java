package com.codewars.kyu7.pizzaPayments;

/**
 * Kate and Michael want to buy a pizza and share it. Depending on the price of the pizza, they are going to divide
 * the costs:
 * <ul>
 * <li>If the pizza is less than €5,- Michael invites Kate, so Michael pays the full price.</li>
 * <li>Otherwise Kate will contribute 1/3 of the price, but no more than €10 (she's broke :-) and Michael pays the rest.</li>
 * </ul>
 * How much is Michael going to pay? Calculate the amount with two decimals, if necessary.
 */
public class PizzaPayments {
    public static double michaelPays(double cost) {
        double amount = cost < 5d ? cost : cost / 3d > 10d ? cost - 10d : cost - (cost / 3d);
        return Math.round(amount * 100.0) / 100.0;
    }
}
