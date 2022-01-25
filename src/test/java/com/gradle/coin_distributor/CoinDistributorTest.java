package com.gradle.coin_distributor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CoinDistributorTest {
    @Test
    public void zeroGiven() {
        CoinDistributorProcessor cd = new CoinDistributorProcessor();
        List<Integer> list = cd.distribute(0);
        assertEquals(List.of(), list);
    }

    @Test
    public void onePennyPiece() {
        CoinDistributorProcessor cd = new CoinDistributorProcessor();
        List<Integer> list = cd.distribute(1);
        assertEquals(List.of(1), list);
    }

    @Test
    public void twoPennyPiece() {
        CoinDistributorProcessor cd = new CoinDistributorProcessor();
        List<Integer> list = cd.distribute(2);
        assertEquals(List.of(2), list);
    }

    @Test
    public void threePennies() {
        CoinDistributorProcessor cd = new CoinDistributorProcessor();
        List<Integer> list = cd.distribute(3);
        assertEquals(List.of(2, 1), list);
    }

    @Test
    public void fourPennies() {
        CoinDistributorProcessor cd = new CoinDistributorProcessor();
        List<Integer> list = cd.distribute(4);
        assertEquals(List.of(2, 2), list);
    }

    @Test
    public void fivePencePiece() {
        CoinDistributorProcessor cd = new CoinDistributorProcessor();
        List<Integer> list = cd.distribute(5);
        assertEquals(List.of(5), list);
    }

    @Test
    public void sixPennies() {
        CoinDistributorProcessor cd = new CoinDistributorProcessor();
        List<Integer> list = cd.distribute(6);
        assertEquals(List.of(5, 1), list);
    }

    @Test
    public void tenPencePiece() {
        CoinDistributorProcessor cd = new CoinDistributorProcessor();
        List<Integer> list = cd.distribute(10);
        assertEquals(List.of(10), list);
    }

    @Test
    public void thirteenPennies() {
        CoinDistributorProcessor cd = new CoinDistributorProcessor();
        List<Integer> list = cd.distribute(13);
        assertEquals(List.of(10, 2, 1), list);
    }

    @Test
    public void fifteenPennies() {
        CoinDistributorProcessor cd = new CoinDistributorProcessor();
        List<Integer> list = cd.distribute(15);
        assertEquals(List.of(10, 5), list);
    }

    @Test
    public void twentyPencePiece() {
        CoinDistributorProcessor cd = new CoinDistributorProcessor();
        List<Integer> list = cd.distribute(20);
        assertEquals(List.of(20), list);
    }

    @Test
    public void fortyPennies() {
        CoinDistributorProcessor cd = new CoinDistributorProcessor();
        List<Integer> list = cd.distribute(40);
        assertEquals(List.of(20, 20), list);
    }

    @Test
    public void fiftyPencePiece() {
        CoinDistributorProcessor cd = new CoinDistributorProcessor();
        List<Integer> list = cd.distribute(50);
        assertEquals(List.of(50), list);
    }

    @Test
    public void onePoundPiece() {
        CoinDistributorProcessor cd = new CoinDistributorProcessor();
        List<Integer> list = cd.distribute(100);
        assertEquals(List.of(100), list);
    }

    @Test
    public void twoPoundPiece() {
        CoinDistributorProcessor cd = new CoinDistributorProcessor();
        List<Integer> list = cd.distribute(200);
        assertEquals(List.of(200), list);
    }

    @Test
    public void fourPounds() {
        CoinDistributorProcessor cd = new CoinDistributorProcessor();
        List<Integer> list = cd.distribute(400);
        assertEquals(List.of(200, 200), list);
    }

    @Test
    public void fivePoundsNinetyNinePence() {
        CoinDistributorProcessor cd = new CoinDistributorProcessor();
        List<Integer> list = cd.distribute(599);
        assertEquals(List.of(200, 200, 100, 50, 20, 20, 5, 2, 2), list);
    }
}