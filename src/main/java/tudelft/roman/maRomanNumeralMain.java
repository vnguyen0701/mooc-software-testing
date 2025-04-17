package tudelft.roman;

public class maRomanNumeralMain {
    public static void main(String[] args) {
        myRomanNumeral rN = new myRomanNumeral();
        System.out.println("Inserted VI. Outputted: " + rN.convert("VI") + " Expected: 6");
        System.out.println("Inserted MCMLXXXIV. Outputted: " + rN.convert("MCMLXXXIV") + " Expected: 1984");
        System.out.println("Inserted K. Outputted: " + rN.convert("K") + " Expected: -1");
        System.out.println("Inserted XXC. Outputted: " + rN.convert("XXC") + " Expected: -1");
    }
}
