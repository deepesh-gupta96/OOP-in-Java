import java.util.*;
public class Alphabetize2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three words: ");
        String word1 = input.next();
        String word2 = input.next();
        String word3 = input.next();

        if(word1.compareTo(word2) <= 0 && word2.compareTo(word3) <= 0){
            System.out.println("1"+word1+ " "+word2+ " "+word3);
        }else if (word3.compareTo(word1)>= 0&& word1.compareTo(word2) <= 0){
            System.out.println("3"+word1+ " "+word3+ " "+word2);}
        else if (word1.compareTo(word2)<= 0&& word3.compareTo(word2) <= 0){
            System.out.println("2 "+word3+ " "+word1+ " "+word2);
        }
        else {
            System.out.println(" You did not enter the words in alphabetical order ");
        }
    }
}