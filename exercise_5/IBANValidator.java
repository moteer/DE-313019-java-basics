package exercise_5;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Validate a given String if it represents a German IBAN. Following criteria have to fulfilled:
 * <ul>
 *     <li>String starting with "DE"</li>
 *     <li>Length: 22</li>
 *     <li>Modulo 97 validation rule fulfilled (see: Wikipedia)</li>
 * </ul>
 *
 * @link https://de.wikipedia.org/wiki/Internationale_Bankkontonummer#Prüfsumme
 */
public class IBANValidator {
    public static void main(String[] args) {
        // "DE65 100 400 600 100 400 600";
        String testIBANValid = "DE23 6005 0101 1111 2222 33";
        String testIBANInvalid = "DE12 345 678 910 234 567 89";

        System.out.println(testIBANInvalid + " is valid? " + validateIBAN(testIBANInvalid));
        System.out.println(testIBANValid + " is valid? " + validateIBAN(testIBANValid));
    }

    private static boolean validateIBAN(String iban) {
        //1. split
        String[] ibanArray = iban.split(" ");

        //2. check condition starting with "DE"
        if (!ibanArray[0].startsWith("DE")) {
            System.out.println("not starting with DE");
            return false;
        }

        //3. check length (remove spaces first!)
        if (iban.replaceAll(" ", "").length() != 22) {
            return false;
        }

        //4. check mod 97-rule
        //4.1 convert country code: A=10, B=11,... Z=35
        char c1 = ibanArray[0].charAt(0);
        char c2 = ibanArray[0].charAt(1);
        int codeC1 = c1 - 'A' + 10;  // 68 - 65 + 10 = 13
        int codeC2 = c2 - 'A' + 10;
        //4.2 write converted country code and the validation number back to first element of array
        ibanArray[0] = "" + codeC1 + codeC2 + ibanArray[0].charAt(2) + ibanArray[0].charAt(3);
        //4.3 rearrange the array to get it checked via mod 97 rule: first group at the end
        String tmp = ibanArray[0]; // save first element
        for (int i = 1; i < ibanArray.length; i++) {
            ibanArray[i - 1] = ibanArray[i]; // shift elements left
            if (i == ibanArray.length - 1) {
                ibanArray[i] = tmp;
            }
        }
        //4.3 Convert to a BigInteger
        StringBuilder ibanConverted = new StringBuilder();
        for (String group : ibanArray) {
            ibanConverted.append(group);
        }
        BigInteger intIBAN = new BigInteger(ibanConverted.toString());

        //4.4 Finally: Check mod 97 == 1
        if (!intIBAN.remainder(new BigInteger("97")).equals(new BigInteger("1"))) {
            return false;
        }


        return true;
    }
}