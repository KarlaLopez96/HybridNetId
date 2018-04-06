package com.karla.direccionip;

/**
 * Created by Karla on 6/4/2018.
 */

public class Mascara {

    public static int[] plecaADecimal(int mascara) {
        int[] mascarDecimal = new int[4];

        mascarDecimal[0] = mascarDecimal[1] = mascarDecimal[2] =mascarDecimal[3] = 255;
        switch (mascara) {
            case 31:
                mascarDecimal[3] = 254;
                break;
        }

        return mascarDecimal;

    }
}
