
//Write a program that given a monetary amount (in Sterling) in pence returns a list containing the smallest number of coins that are needed to provide that amount. e.g.:
//        37 => [20, 10, 5, 2]
//        598 => [200, 200, 100, 50, 20, 20, 5, 2, 1]
//        When writing the code:
//        You are not allowed to write any production code unless it is to make a failing unit test pass
//        You are not allowed to write any more of a unit test than is sufficient to fail
//        You are not allowed to write any more production code than is sufficient to pass the one failing unit test

package com.gradle.coin_distributor;

import java.util.ArrayList;
import java.util.List;

public class CoinDistributorProcessor {
    public static void main(String[] args) {
        System.out.println("Hi!");
    }

    public List<Integer> distribute(int givenValue) {
        List<Integer> coins = new ArrayList<>();

        int[] availableCoins = {200, 100, 50, 20, 10, 5, 2, 1};

        for (int coinN: availableCoins) {
            while (givenValue >= coinN) {
                coins.add(coinN);
                givenValue -= coinN;
            }
        }

        return coins;
    }
}
