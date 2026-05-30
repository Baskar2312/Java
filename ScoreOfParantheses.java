public class ScoreOfParantheses {
    public static void main(String[] args){
        String s = "(()(()))";
        int score = scoreOfParentheses(s);
        System.out.println("Score of the parentheses: " + score);
    }
    public static int scoreOfParentheses(String s) {
        int score = 0;
        int balance = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                balance++;
            } else {
                balance--;
                if (s.charAt(i - 1) == '(') {
                    score += Math.pow(2, balance);
                }
            }
        }
        return score;
    }
}