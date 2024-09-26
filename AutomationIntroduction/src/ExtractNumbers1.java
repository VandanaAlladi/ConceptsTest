public class ExtractNumbers1 {
    public static void main(String[] args) {
        String input = "agyu567";
        
        // Use regex to find numbers
        String numbers = input.replaceAll("[^0-9]", ""); // Replace non-numeric characters with an empty string
        
        // Print the extracted numbers
        System.out.println("Extracted numbers: " + numbers);
    }
}
