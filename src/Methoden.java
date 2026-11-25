public class Methoden {
    public static void main(String[] args) {

        char c = 'Y';

        int offset = (c - 'A'  + 2) % 26;
        System.out.println(offset);

        int z = 'A' + offset;
        char cNeu = (char)z;
        System.out.println(cNeu);

    }
}
