import java.util.*;
public class PigLatin {
    public static void main(String[] args) {

        String word;
        Scanner sc = new Scanner(System.in);
        char c;
        int count = 0,size;
        final String end = "ay";

        System.out.print("Please enter a word: ");
        word = sc.nextLine();

        for(int i = 0;i < word.length();++i){
            c = word.charAt(0);
            size = word.length();
            if(count == 0 && isVowel(c)){
                word = word.substring(1, size);
                word += c;
                ++count;
            }
            else if(isVowelY(c)){
                word = word.substring(1, size);
                word += c;
            }
        }
        word = word + end;
        System.out.println("The pig latin version is: "+word);
    }

    public static boolean isVowel(char c){
        return c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u';
    }

    public static boolean isVowelY(char c){
        return c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'y';
    }
}
