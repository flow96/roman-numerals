package katas.romannumerals;

/**
 * A converter class to convert arabic numerals to roman numerals
 * The converter can be accessed by the public method, but uses internally a private recursive method
 *
 */
public class Converter {

    /**
     * Converts an arabic number to a roman number, by calling the private recursive method
     * @param number
     * @return
     */
    public String convertToRoman(int number){
        // Calling the recursive method with default values
        return convertToRoman("", number);
    }


    /**
     * Converting an arabic number to a roman number by using a recursive method
     * @param currentRomanString
     * @param remaining
     * @return
     */
    private String convertToRoman(String currentRomanString, int remaining){
        if(remaining == 0)  // Exit condition (done)
            return currentRomanString;

        if(remaining >= RomanNumbers.M.getNumber())     // 1000
            return convertToRoman(currentRomanString + RomanNumbers.M, (remaining - RomanNumbers.M.getNumber()));
        if(remaining >= RomanNumbers.CM.getNumber())    // 900
            return convertToRoman(currentRomanString + RomanNumbers.CM, (remaining - RomanNumbers.CM.getNumber()));
        if(remaining >= RomanNumbers.D.getNumber())    // 500
            return convertToRoman(currentRomanString + RomanNumbers.D, (remaining - RomanNumbers.D.getNumber()));
        if(remaining >= RomanNumbers.CD.getNumber())    // 400
            return convertToRoman(currentRomanString + RomanNumbers.CD, (remaining - RomanNumbers.CD.getNumber()));
        if(remaining >= RomanNumbers.C.getNumber())    // 100
            return convertToRoman(currentRomanString + RomanNumbers.C, (remaining - RomanNumbers.C.getNumber()));
        if(remaining >= RomanNumbers.XC.getNumber())    // 90
            return convertToRoman(currentRomanString + RomanNumbers.XC, (remaining - RomanNumbers.XC.getNumber()));
        if(remaining >= RomanNumbers.L.getNumber())    // 50
            return convertToRoman(currentRomanString + RomanNumbers.L, (remaining - RomanNumbers.L.getNumber()));
        if(remaining >= RomanNumbers.XL.getNumber())    // 40
            return convertToRoman(currentRomanString + RomanNumbers.XL, (remaining - RomanNumbers.XL.getNumber()));
        if(remaining >= RomanNumbers.X.getNumber())    // 10
            return convertToRoman(currentRomanString + RomanNumbers.X, (remaining - RomanNumbers.X.getNumber()));
        if(remaining >= RomanNumbers.IX.getNumber())    // 9
            return convertToRoman(currentRomanString + RomanNumbers.IX, (remaining - RomanNumbers.IX.getNumber()));
        if(remaining >= RomanNumbers.V.getNumber())    // 5
            return convertToRoman(currentRomanString + RomanNumbers.V, (remaining - RomanNumbers.V.getNumber()));
        if(remaining >= RomanNumbers.IV.getNumber())    // 4
            return convertToRoman(currentRomanString + RomanNumbers.IV, (remaining - RomanNumbers.IV.getNumber()));
        // Subtract 1
        return convertToRoman(currentRomanString + RomanNumbers.I, (remaining - RomanNumbers.I.getNumber()));
    }

}
