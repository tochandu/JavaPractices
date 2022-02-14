package JavaPractices.cks;

/**
 * A student is taking a cryptography class and has found anagrams to be very useful. Two strings are anagrams of each other if the first string's letters can be rearranged to form the second string. In other words, both strings must contain the same exact letters in the same exact frequency. For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.
 * The student decides on an encryption scheme that involves two large strings. The encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. Determine this number.
 * Given two strings,  and , that may or may not be of the same length, determine the minimum number of character deletions required to make  and  anagrams. Any characters can be deleted from either of the strings.
 * Example
 *
 *
 * Delete  from  and  from  so that the remaining strings are  and  which are anagrams. This takes  character deletions.
 */
public class MakingAnagrams {
    public static void main(String[] args) {
        String a = "fcrxzwscanmligyxyvym";
        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        makeAnagram(a, b);
    }
    public static int makeAnagram(String a, String b) {
        // Write your code here
     int k = 0;
     int count1[] = new int[26];
     int count2[] = new int[26];
     
      for (int i=0;i <a.length();i++) {
          count1[a.charAt(i) -'a']++;
      }
        for (int i=0;i <b.length();i++) {
            count2[b.charAt(i) -'a']++;
        }
          for (int i=0; i<26;i++)  {
              k += Math.abs(count1[i] - count2[i]);
          }
        System.out.println(k);
        return k;
    }
}
