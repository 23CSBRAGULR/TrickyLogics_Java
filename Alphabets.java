public class Alphabets {
    public static void main(String[] args) {
        int ascii;
        char alphabets = 'A';
        ascii = alphabets;
        
        for(int i = ascii; i < (ascii+26); i++) {
            alphabets = (char) i;
            System.out.print(alphabets + " ");
        }

        char alpha;

        for(alpha = 'a'; alpha <= 'z'; ++alpha) {
            System.out.print(alpha + " ");
        }
    }
}