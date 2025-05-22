//this program reverses the positions of only the vowels in the given word(s) and prints the result

import java.util.Scanner;

public class VowelReversal {

    //a public array the contains all the vowels(in both cases)
    public static char vowels[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    //the method that reverses the vowels's positions and prints the result
    static void vowelCountAndPositions(String sentence) {
        int length = sentence.length();
        char sentenceArray[] = new char[length];

        //iterating every characters of the given String into a character Array
        for(int i = 0; i < length; i++) {
            sentenceArray[i] = sentence.charAt(i);
        }

        //a for loop for determining the length of the vowel array
        int count = 0;
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < vowels.length; j++) {
                if(sentenceArray[i] == vowels[j]) {
                    count++;
                }
            }
        }

        //the insertion of both vowels and their positions in seperate arrays
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

        //reversing the vowel array and storing the values in another array
        char reversedVowels[] = new char[vowelsInSentence.length];
        index = 0;
        for(int i = vowelsInSentence.length - 1; i >= 0; i--) {
            reversedVowels[index] = vowelsInSentence[i];
            index++;
        }
        
        //the following for loop prints the reversed vowel array everytime 'i' is equal to vowelIndex[j]
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

        System.out.print("Enter the Word(s)\t: ");
        String words = inputs.nextLine();
        System.out.print("After Reversing vowels\t: ");
        vowelCountAndPositions(words);
        inputs.close();
    }
}