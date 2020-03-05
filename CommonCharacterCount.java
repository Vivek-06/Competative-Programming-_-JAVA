import java.util.*;
public class CommonCharacterCount{
	public static void main(String[] args) {
		String str1 = "aabcc";
		String str2 = "adcaa";
		int count=0;
		int i;

		int[] freq1 = new int[26];
		int[] freq2 = new int[26];
		Arrays.fill(freq1,0);
		Arrays.fill(freq2,0);
		for(i=0;i<str1.length();i++){
			freq1[str1.charAt(i) - 'a']++;
		}
		for(i=0;i<str2.length();i++){
			freq2[str2.charAt(i)-'a']++;
		}
		for(i=0;i<26;i++){
			count += (Math.min(freq1[i], freq2[i]));
		}
		
		System.out.println(count);
	}
}