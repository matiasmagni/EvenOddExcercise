package com.oddEvenExercise;

public class Main {
    public static void main(String[] args) {

        System.out.println("-------ALL EVEN-----------");

        System.out.println(1);
        System.out.println("Resultado obtenido:");
        System.out.println(NumberUtils.areAllEven(1));
        System.out.println("Resultado esperado:");
        System.out.println("false");

        if (NumberUtils.areAllEven(1) == false) {
            System.out.println("OK!");
        } else {
            System.out.println("not OK!");
        }

        System.out.println(2);
        System.out.println("Resultado obtenido:");
        System.out.println(NumberUtils.areAllEven(2));
        System.out.println("Resultado esperado:");
        System.out.println("true");

        if (NumberUtils.areAllEven(2) == true) {
            System.out.println("OK!");
        } else {
            System.out.println("not OK!");
        }

        System.out.println(25);
        System.out.println("Resultado obtenido:");
        System.out.println(NumberUtils.areAllEven(25));
        System.out.println("Resultado esperado:");
        System.out.println("false");

        if (NumberUtils.areAllEven(25) == false) {
            System.out.println("OK!");
        } else {
            System.out.println("not OK!");
        }

        System.out.println(2046);
        System.out.println("Resultado obtenido:");
        System.out.println(NumberUtils.areAllEven(2046));
        System.out.println("Resultado esperado:");
        System.out.println("true");

        if (NumberUtils.areAllEven(2046) == true) {
            System.out.println("OK!");
        } else {
            System.out.println("not OK!");
        }

        System.out.println(3468);
        System.out.println("Resultado obtenido:");
        System.out.println(NumberUtils.areAllEven(3468));
        System.out.println("Resultado esperado:");
        System.out.println("false");

        if (NumberUtils.areAllEven(3468) == false) {
            System.out.println("OK!");
        } else {
            System.out.println("not OK!");
        }

        System.out.println(-27);
        System.out.println("Resultado obtenido:");
        System.out.println(NumberUtils.areAllEven(-27));
        System.out.println("Resultado esperado:");
        System.out.println("false");

        if (NumberUtils.areAllEven(-27) == false) {
            System.out.println("OK!");
        } else {
            System.out.println("not OK!");
        }

        System.out.println(-3468);
        System.out.println("Resultado obtenido:");
        System.out.println(NumberUtils.areAllEven(-3468));
        System.out.println("Resultado esperado:");
        System.out.println("false");

        if (NumberUtils.areAllEven(-3468) == false) {
            System.out.println("OK!");
        } else {
            System.out.println("not OK!");
        }

        System.out.println(-2);
        System.out.println("Resultado obtenido:");
        System.out.println(NumberUtils.areAllEven(-2));
        System.out.println("Resultado esperado:");
        System.out.println("true");

        if (NumberUtils.areAllEven(-2) == true) {
            System.out.println("OK!");
        } else {
            System.out.println("not OK!");
        }

        System.out.println("-------ALL ODD-----------");

        System.out.println(25);
        System.out.println("Resultado obtenido:");
        System.out.println(NumberUtils.areAllOdd(25));
        System.out.println("Resultado esperado:");
        System.out.println("false");

        if (NumberUtils.areAllOdd(25) == false) {
            System.out.println("OK!");
        } else {
            System.out.println("not OK!");
        }

        System.out.println(-27);
        System.out.println("Resultado obtenido:");
        System.out.println(NumberUtils.areAllOdd(-27));
        System.out.println("Resultado esperado:");
        System.out.println("false");

        if (NumberUtils.areAllOdd(-27) == false) {
            System.out.println("OK!");
        } else {
            System.out.println("not OK!");
        }

        System.out.println(2046);
        System.out.println("Resultado obtenido:");
        System.out.println(NumberUtils.areAllOdd(2046));
        System.out.println("Resultado esperado:");
        System.out.println("false");

        if (NumberUtils.areAllOdd(2046) == false) {
            System.out.println("OK!");
        } else {
            System.out.println("not OK!");
        }

        System.out.println(3468);
        System.out.println("Resultado obtenido:");
        System.out.println(NumberUtils.areAllOdd(3468));
        System.out.println("Resultado esperado:");
        System.out.println("false");

        if (NumberUtils.areAllOdd(3468) == false) {
            System.out.println("OK!");
        } else {
            System.out.println("not OK!");
        }

        System.out.println(135);
        System.out.println("Resultado obtenido:");
        System.out.println(NumberUtils.areAllOdd(135));
        System.out.println("Resultado esperado:");
        System.out.println("true");

        if (NumberUtils.areAllOdd(135) == true) {
            System.out.println("OK!");
        } else {
            System.out.println("not OK!");
        }

    }
}