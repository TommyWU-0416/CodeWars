package Strings.bio;

/**
 * https://www.codewars.com/kata/5556282156230d0e5e000089
 */
public class Bio {
    public String dnaToRna(String dna) {
        dna = dna.replace('T', 'U');
        return dna;  // Do your magic!
    }
}
