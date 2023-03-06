package IntegerToRoman;

public class IntergerToRoman {
	public static String integerToRoman(int num) {
	    // Create lookup tables for Roman numerals and their values
	    String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	    int[] romanValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

	    // Initialize an empty string to store the Roman numeral representation
	    String romanNumeral = "";

	    // Iterate through the lookup tables to convert the integer to Roman numerals
	    for (int i = 0; i < romanNumerals.length; i++) {
	        while (num >= romanValues[i]) {
	            num -= romanValues[i];
	            romanNumeral += romanNumerals[i];
	        }
	    }

	    return romanNumeral;
	}
}
