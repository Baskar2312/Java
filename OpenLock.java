import java.util.*;
public class OpenLock {
    public static void main(String[] args) {
        String[] deadends = {"0201","0101","0102","1212","2002"};
        String target = "0202";
        System.out.println(new OpenLock().openLock(deadends, target)); // Output: 6
    }
    public int openLock(String[] deadends, String target) {
        Set<String> deadSet = new HashSet<>(Arrays.asList(deadends));
        if (deadSet.contains("0000")) return -1; // Starting point is a deadend
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer("0000");
        visited.add("0000");
        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String current = queue.poll();
                if (current.equals(target)) return steps;
                for (String next : getNextStates(current)) {
                    if (!deadSet.contains(next) && !visited.contains(next)) {
                        visited.add(next);
                        queue.offer(next);
                    }
                }
            }
            steps++;
        }
        return -1; // Target is unreachable
    }
    public List<String> getNextStates(String state) {
        List<String> nextStates = new ArrayList<>();
        char[] chars = state.toCharArray();
        for (int i = 0; i < 4; i++) {
            char original = chars[i];
            chars[i] = original == '9' ? '0' : (char)(original + 1); // Move up
            nextStates.add(new String(chars));
            chars[i] = original == '0' ? '9' : (char)(original - 1); // Move down
            nextStates.add(new String(chars));
            chars[i] = original; // Reset to original
        }
        return nextStates;
    }
}
