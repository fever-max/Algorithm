class Solution {
	public String solution(String my_string, String overwrite_string, int s) {
		String answer = "";
		String a = my_string;
		String b = overwrite_string;
		int num = s;
		answer = (a.substring(0, num)) +b;
		answer += a.substring(num + b.length());
		return answer;
	}
}

class Test3 {

	public static void main(String[] args) {
		Solution obj = new Solution();
		System.out.println(obj.solution("He11oWor1d", "lloWorl", 2));
		System.out.println(obj.solution("Program29b8UYP", "merS123", 7));
	}

}