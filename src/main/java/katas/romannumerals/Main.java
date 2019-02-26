package katas.romannumerals;

import java.util.Scanner;

/**
 *
 * This is the Main method to test the Converter class
 * It will read an arabic number and use the Converter.java to convert it to a roman numeral
 *
 * @author Florian Lutze
 * @version 1.0
 */
public class Main {

    public static void main(String[] args){
        Converter converter = new Converter();
        Scanner scanner = new Scanner(System.in);
        System.out.print(" >> Enter a number (or 'q' to quit): ");
        String line;

        while(!(line = scanner.nextLine().trim()).toLowerCase().equals("q")) {
            try{
                // Parse the string to an integer
                int number = Integer.parseInt(line);
                System.out.println("----------------------" +
                        "\n >> Arabic: " + number +
                        "\n >> Roman: '" + converter.convertToRoman(number) + "'" +
                        "\n----------------------\n");

            }catch (NumberFormatException e){
                if(e.getMessage().equals("Number can not be negative"))
                    System.err.println(" >> Negative numbers are not supported");
                else if(e.getMessage().equals("Number too large"))
                    System.err.println(" >> '" + line + "' is too large, sorry");
                else
                    System.err.println(" >> '" + line + "' is not an arabic number");
            }
            System.out.print(" >> Enter a number: ");
        }
        System.out.println("Quitting...");
    }

}
