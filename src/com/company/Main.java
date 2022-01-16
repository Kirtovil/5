package com.company;

public class Main {

    public static void main(String[] args) {
	int[] a = new int[3];
    a[0] = 1;
    a[1] = 2;
    a[2] = 3;
    double[] b = {1.57, 7.654, 9.986};
    int[] c = {56, 96, 25};


        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if(i < a.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
            if(i < b.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
            if(i < c.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for(int i = 2; i < a.length && i >= 0; i--) {
            System.out.print(a[i]);
            if(i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for(int i = 2; i < b.length && i >= 0; i --) {
            System.out.print(b[i]);
            if(i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for(int i = 2; i < c.length && i >= 0; i--) {
            System.out.print(c[i]);
            if(i > 0) {
                System.out.print(", ");
            }
        }


        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i]++;
            }
            System.out.print(a[i] + " ");
        }
    }
}
