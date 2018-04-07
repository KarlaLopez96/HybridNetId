package com.karla.direccionip;

/**
 * Created by Karla on 6/4/2018.
 */

public class Mascara {

    public static int[] plecaADecimal(int mascara) {
        int[] mascarDecimal = new int[5];

        mascarDecimal[0] = mascarDecimal[1] = mascarDecimal[2] =mascarDecimal[3]=mascarDecimal[4] = 255;

        switch (mascara) {
            case 31:
                mascarDecimal[3] = 254;
                break;
            case 30:
                mascarDecimal[3] = 252;
                break;
            case 29:
                mascarDecimal [3] = 248;
                break;
            case 28:
                mascarDecimal [3] = 240;
                break;
            case 27:
                mascarDecimal [3] = 224;
                break;
            case 26:
                mascarDecimal [3] = 192;
                break;
            case 25:
                mascarDecimal [3] = 128;
                break;
                //EL dos signfica la clase C.
            case 24:
                mascarDecimal [3] = 0;
                mascarDecimal[4] = 2;
                break;
            case 23:
                mascarDecimal [3] = 0;
                mascarDecimal [2] = 254;
                break;
            case 22:
                mascarDecimal [3] = 0;
                mascarDecimal [2] = 252;
                break;
            case 21:
                mascarDecimal [3] = 0;
                mascarDecimal [2] = 248;
                break;
            case 20:
                mascarDecimal [3] = 0;
                mascarDecimal [2] =240;
                break;
            case 19:
                mascarDecimal [3] = 0;
                mascarDecimal [2] = 224;
                break;
            case 18:
                mascarDecimal [3] = 0;
                mascarDecimal [2] = 192;
                break;
            case 17:
                mascarDecimal [3] = 0;
                mascarDecimal [2] = 122;
                mascarDecimal[4] = 2;
                //Comienza la clase B = 1
                break;
            case 16:
                mascarDecimal [3] = 0;
                mascarDecimal [2] = 0;
                mascarDecimal[4] = 1;
                break;
            case 15:
                mascarDecimal [3] = 0;
                mascarDecimal [2] = 0;
                mascarDecimal [1] = 254;
                break;
            case 14:
                mascarDecimal [3] = 0;
                mascarDecimal [2] = 0;
                mascarDecimal [1] = 252;
                break;
            case 13:
                mascarDecimal [3] = 0;
                mascarDecimal [2] = 0;
                mascarDecimal [1] = 248;
                break;
            case 12:
                mascarDecimal [3] = 0;
                mascarDecimal [2] = 0;
                mascarDecimal [1] = 240;
                break;
            case 11:
                mascarDecimal [3] = 0;
                mascarDecimal [2] = 0;
                mascarDecimal [1] = 224;
                break;
            case 10:
                mascarDecimal [3] = 0;
                mascarDecimal [2] = 0;
                mascarDecimal [1] = 192;
                break;
            case 9:
                mascarDecimal [3] = 0;
                mascarDecimal [2] = 0;
                mascarDecimal [1] = 128;
                mascarDecimal[4] = 1;
                break;
            //Comienza la clase A=0
            case 8:
                mascarDecimal [3] = 0;
                mascarDecimal [2] = 0;
                mascarDecimal [1] = 0;
                mascarDecimal[4] = 0;
                break;
            case 7:
                mascarDecimal [3] = 0;
                mascarDecimal [2] = 0;
                mascarDecimal [1] = 0;
                mascarDecimal [0] = 254;
                break;
            case 6:
                mascarDecimal [3] = 0;
                mascarDecimal [2] = 0;
                mascarDecimal [1] = 0;
                mascarDecimal [0] = 252;
                break;
            case 5:
                mascarDecimal [3] = 0;
                mascarDecimal [2] = 0;
                mascarDecimal [1] = 0;
                mascarDecimal [0] = 248;
                break;
            case 4:
                mascarDecimal [3] = 0;
                mascarDecimal [2] = 0;
                mascarDecimal [1] = 0;
                mascarDecimal [0] = 240;
                break;
            case 3:
                mascarDecimal [3] = 0;
                mascarDecimal [2] = 0;
                mascarDecimal [1] = 0;
                mascarDecimal [0] = 224;
                break;
            case 2:
                mascarDecimal [3] = 0;
                mascarDecimal [2] = 0;
                mascarDecimal [1] = 0;
                mascarDecimal [0] = 192;
                break;
            case 1:
                mascarDecimal [3] = 0;
                mascarDecimal [2] = 0;
                mascarDecimal [1] = 0;
                mascarDecimal [0] = 128;
                break;
            case 0:
                mascarDecimal [3] = 0;
                mascarDecimal [2] = 0;
                mascarDecimal [1] = 0;
                mascarDecimal [0] = 0;
                break;
        }

        return mascarDecimal;

    }
}
