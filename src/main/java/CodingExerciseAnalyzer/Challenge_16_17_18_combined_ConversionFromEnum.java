package CodingExerciseAnalyzer;

/**
 * Challenge_16_17_18_combined_ConversionFromEnum
 * Challenge: CodingExerciseAnalyzer
 *
 * @author Stefan Kiers
 * @since 18-8-2026
 */
/* TODO: conversion class icm enum, in de enums zit een constructor die de data manipuleert.
        om uit te breiden : voeg new base toe aan enum met de waarde.
 */

    enum NumberBase{
        BINARY(2),
        OCTAL(8),
        DECIMAL(10),
        HEXADECIMAL(16);

        // je kan dus ook constructors toevoegen aan enums.... de tering...
        private final int base;
        NumberBase(int base){
            this.base = base;
        }
        public int getBase(){
            return base;
        }
}

class Challenge_16_17_18_combined_ConversionFromEnum {
    static String convertInput(String input, NumberBase fromBase, NumberBase toBase){
        int value = Integer.parseInt(input,fromBase.getBase());
        return Integer.toString(value, toBase.getBase()).toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(convertInput("1101", NumberBase.BINARY, NumberBase.HEXADECIMAL));
        System.out.println(convertInput("13", NumberBase.DECIMAL, NumberBase.HEXADECIMAL));
        System.out.println(convertInput("13", NumberBase.DECIMAL, NumberBase.OCTAL));
    }
}
