public class CountVowelsAndConsonants {
    public int[] countVowelsAndConsonants(String s) {
        int vowels = 0;
        int consonants = 0;
        s = s.toLowerCase();
        
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        
        return new int[]{vowels, consonants};
    }
}