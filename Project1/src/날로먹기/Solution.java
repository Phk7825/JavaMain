package 날로먹기;

class Solution {
	public String solution(String s, String skip, int index) {
		String answer = "";
		char a ;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < skip.length(); j++) {
				a = (char) (s.charAt(j) + index);
				if ((a-5 == skip.charAt(j)) || (a-4 == skip.charAt(j)) 
						||(a-3 == skip.charAt(j))||(a-2 == skip.charAt(j))
						||(a-1 == skip.charAt(j)) ||(a == skip.charAt(j))  ) 
					a += 1;
					if(a > 'z')
						a -= 26;
					answer += a; 
					break;
			}
		}
		return answer;
	}

	public void main(String args[]) {
		solution("aukks", "wbqd", 5);
	}
}