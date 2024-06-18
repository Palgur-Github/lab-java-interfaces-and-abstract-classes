package Ironhack.schl;

import java.math.BigDecimal;
import java.math.RoundingMode;

// Task 1: Create BigDecimal methods to round up and negate numbers.
public class Main {
    public static void main(String[] args) {

        // Initialize the bigDecimal numbers.
        BigDecimal bigDecimal1 = new BigDecimal("41.234644545940950495678"); //This is one way to create a BigDecimal
        BigDecimal bigDecimal2 = BigDecimal.valueOf(-51.0458454590495409504989); //This is another way to create a BigDecimal.
        // Round up the number to the nearest hundredth.
        BigDecimal output1 = bigDecimal1.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println(bigDecimal1 + " becomes " + output1);
        BigDecimal output2 = bigDecimal2.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println(bigDecimal2 + " becomes " + output2);
        // Negate the number and round it to the nearest tenth.
        BigDecimal output3 = bigDecimal1.negate().setScale(1, RoundingMode.HALF_EVEN);
        System.out.println(bigDecimal1 + " becomes " + output3);
        BigDecimal output4 = bigDecimal2.negate().setScale(1, RoundingMode.HALF_EVEN);
        System.out.println(bigDecimal2 + " becomes " + output4);

    }
}