package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Printable[] printables = {createObject("TsarBomb"), createObject("Baby"), createObject("Fat")};
        for (Printable a : printables){
            a.printInfo();
        }
    }

    private static NuclearRocket createObject(String className) {
        switch (className) {
            case "TsarBomb": {
                return new TsarBomb(26500, 1961, 58, "thermonuclear");
            }
            case "Baby": {
                return new Baby(4400, 1945, 18, 1945);
            }
            case "Fat": {
                return new Fat(4670, 1945, 21, "Нагасаки");
            }
        }
        return null;
    }
}