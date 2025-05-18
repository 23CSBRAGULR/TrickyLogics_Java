import java.util.Scanner;

public class VowelReversal {

    public static char vowels[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    static void vowelCountAndPositions(String sentence) {
        int length = sentence.length();
        char sentenceArray[] = new char[length];

        for(int i = 0; i < length; i++) {
            sentenceArray[i] = sentence.charAt(i);
        }

        int count = 0;
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < vowels.length; j++) {
                if(sentenceArray[i] == vowels[j]) {
                    count++;
                }
            }
        }

        char vowelsInSentence[] = new char[count];
        int vowelIndex[] = new int[count];
        int index = 0;
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < vowels.length; j++) {
                if(sentenceArray[i] == vowels[j]) {
                    vowelsInSentence[index] = sentenceArray[i];
                    vowelIndex[index] = i;
                    index++;
                }
            }
        }

        /*for(int i = 0; i < vowelsInSentence.length; i++) {
            System.out.println(vowelIndex[i] + " " + vowelsInSentence[i]);
        }*/

        char reversedVowels[] = new char[vowelsInSentence.length];
        index = 0;
        for(int i = vowelsInSentence.length - 1; i >= 0; i--) {
            reversedVowels[index] = vowelsInSentence[i];
            index++;
        }
        
        boolean vowelOrNot = false;
        for(int i = 0; i < sentenceArray.length; i++) {
            for(int j = 0; j < vowelIndex.length; j++) {
                if(i == vowelIndex[j]) {
                    vowelOrNot = true;
                    System.out.print(reversedVowels[j]);
                }
            }
            if(vowelOrNot == false) {
                System.out.print(sentenceArray[i]);
            }
            else {
                vowelOrNot = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter the Word(s) : ");
        String words = inputs.nextLine();
        vowelCountAndPositions(words);
        inputs.close();
    }
}