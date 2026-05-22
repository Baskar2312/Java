public class ScoreOfString {
    public static void main(String[] args) {
        String s = "abc";
        int score = calculateScore(s);
        System.out.println("Score of the string \"" + s + "\": " + score);
    }
    public static int calculateScore(String s) {
        int score = 0;
        for (char c : s.toCharArray()) {
            score += (c - 'a' + 1); // 'a' is 1, 'b' is 2, ..., 'z' is 26
        }
        return score;
    }
}