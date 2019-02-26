package katas.romannumerals;

/**
 * RomanNumbers enum with all common roman numbers from 1.. 1000
 *
 * @author Florian Lutze
 * @version 1.0
 */
public enum RomanNumbers {

    I(1),
    IV(4),
    V(5),
    IX(9),
    X(10),
    XL(40),
    L(50),
    XC(90),
    C(100),
    CD(400),
    D(500),
    CM(900),
    M(1000);

    // Arabic number linked to each roman number
    private final int number;


    RomanNumbers(int number){
        this.number = number;
    }

    /**
     * Returns the arabic number of a roman numeral
     * @return arabic value
     */
    public int getNumber() {
        return number;
    }
}
