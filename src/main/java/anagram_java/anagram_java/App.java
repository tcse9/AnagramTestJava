package anagram_java.anagram_java;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	AnagramString instance = new AnagramString();

        System.out.println(instance.isAnagram("bleat", "table"));
        System.out.println(instance.isAnagram("eat", "tar"));
    }
}
