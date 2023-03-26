package 날로먹기;

class Solution {
    public static String solution(String s, String skip, int index) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean isSkip = false;
            for (int j = 0; j < skip.length(); j++) {
                if (c == skip.charAt(j)) {
                    isSkip = true;
                    break;
                }
            }
            if (isSkip) {
                answer += c;
                continue;
            }
            c += index + 1;
            if (c > 'z') {
                c -= 26;
            }
            answer += c;
        }
        return answer;
    }

    public static void main(String args[]) {
        System.out.println(solution("aukks", "wbqd", 5));
    }
}