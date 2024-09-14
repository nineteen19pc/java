package day9;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ColorLists {
    public static void main(String[] args) {
      
//        List<String> colors = Arrays.asList("Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet");
        
        String [] aaa = {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};
		List<String> colors= Arrays.asList(aaa);

        
        List<String> Upcase = colors.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Colors in Uppercase: " + Upcase);

       
        List<String> LWcase = colors.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println("Colors in Lowercase: " + LWcase);

        
        List<String> mless = colors.stream().filter(color -> color.toLowerCase().compareTo("m") < 0).collect(Collectors.toList());
        System.out.println("Colors less than m : " + mless);

        
        List<String> FiveAlpha = colors.stream().filter(color -> color.length() <= 5).collect(Collectors.toList());
        System.out.println("Colors with 5 alphabets or less: " + FiveAlpha);
    }
}

