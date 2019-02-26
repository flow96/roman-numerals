package katas.romannumerals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {


    @Test
    public void testConvertToRoman() {
        assertEquals("IX", new Converter().convertToRoman(9));
        assertEquals("XI", new Converter().convertToRoman(11));
        assertEquals("XXII", new Converter().convertToRoman(22));
        assertEquals("XXI", new Converter().convertToRoman(21));
        assertEquals("XX", new Converter().convertToRoman(20));
        assertEquals("XIX", new Converter().convertToRoman(19));
        assertEquals("XCIX", new Converter().convertToRoman(99));
        assertEquals("C", new Converter().convertToRoman(100));
        assertEquals("MM", new Converter().convertToRoman(2000));
        assertEquals("MCMXCIX", new Converter().convertToRoman(1999));
        assertEquals("MMI", new Converter().convertToRoman(2001));
    }
}
