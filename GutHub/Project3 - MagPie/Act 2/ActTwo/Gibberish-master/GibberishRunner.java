
/**
 * Mad Libs 
 *
 * @Zephyr Granger
 * @10/11/18
 */
public class GibberishRunner
{
    // instance variables - replace the example below with your own
    
    public static void main()
    {
        // put your code here
        WordList5000 wordList5000 = new WordList5000();
        Gibberish gibberish = new Gibberish();
        String s = gibberish.makeGibberish(wordList5000);
        
        System.out.println (s);
    }
    
}
