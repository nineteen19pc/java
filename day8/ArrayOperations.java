package day8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayOperations {

    public static void main(String[] args) {
        // Example array of double values
        Double[] data = {45.0, 23.5, 87.0, 12.3, 34.5, 23.5, 76.8, 50.0, 67.8, 10.0, 
                         12.3, 55.6, 90.7, 45.0, 67.8, 34.5, 33.0, 77.7, 89.0, 66.0};

        // 1. Sort the first 10 values, remove duplicates, and print
        List<Double> sortedFirstTen = Arrays.stream(data)
                                            .limit(10)
                                            .distinct()
                                            .sorted()
                                            .collect(Collectors.toList());
        System.out.println("Sorted first 10 values (duplicates removed): " + sortedFirstTen);

        // 2. Increment each value by 10%
        List<Double> incrementedData = Arrays.stream(data)
                                             .map(value -> value * 1.10)
                                             .collect(Collectors.toList());
        System.out.println("Values after 10% increment: " + incrementedData);

        // 3. Print all values greater than 50
        List<Double> valuesGreaterThanFifty = incrementedData.stream()
                                                             .filter(value -> value > 50)
                                                             .collect(Collectors.toList());
        System.out.println("Values greater than 50: " + valuesGreaterThanFifty);

        // 4. Print the total of all values
        double total = incrementedData.stream()
                                      .mapToDouble(Double::doubleValue)
                                      .sum();
        System.out.println("Total of all values: " + total);

        // 5. Print min, max, and average values
        double minValue = incrementedData.stream()
                                         .mapToDouble(Double::doubleValue)
                                         .min()
                                         .orElse(Double.NaN);

        double maxValue = incrementedData.stream()
                                         .mapToDouble(Double::doubleValue)
                                         .max()
                                         .orElse(Double.NaN);

        double avgValue = incrementedData.stream()
                                         .mapToDouble(Double::doubleValue)
                                         .average()
                                         .orElse(Double.NaN);

        System.out.println("Min value: " + minValue);
        System.out.println("Max value: " + maxValue);
        System.out.println("Average value: " + avgValue);
    }
}