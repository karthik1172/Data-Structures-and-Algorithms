public class AnagramOfBothStrings {
    //https://practice.geeksforgeeks.org/problems/anagram-of-string/1?page=1&difficulty[]=-1&category[]=Strings&sortBy=submissions
    public int remAnagrams(String s1,String s2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(char ch : s1.toCharArray()) {
            arr1[ch -'a']++;
        }
        for(char ch : s2.toCharArray()) {
            arr2[ch -'a']++;
        }
        int res = 0;
        for(int i=0; i<26; i++) {
            res+=Math.abs(arr1[i] - arr2[i]);
        }
        return res;
    }
}
