public class AlphabetShift{
	static String alphabetShift(String inputString){
		 char[] ss = inputString.toCharArray();
    	for (int i = 0; i < ss.length; ++i) {
        ss[i]++;
        if (ss[i] > 'z')
            ss[i] = 'a';
    }
    return new String(ss);
	}

	public static void main(String[] args) {
		String name = "crazy";
		String res = alphabetShift(name);
		System.out.println(res);
	}
}