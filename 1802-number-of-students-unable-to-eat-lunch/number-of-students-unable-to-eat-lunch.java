import java.util.*;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> queue = new LinkedList<>();

        // Put all students into the queue
        for (int student : students) {
            queue.offer(student);
        }

        int sandwichIndex = 0;
        int unable = 0;

        while (!queue.isEmpty()) {

            // Student wants the current sandwich
            if (queue.peek() == sandwiches[sandwichIndex]) {

                // Student takes the sandwich
                queue.poll();

                // Move to next sandwich
                sandwichIndex++;

                // Reset unsuccessful attempts
                unable = 0;

            } else {

                // Student doesn't want this sandwich
                // Move student to the back
                queue.offer(queue.poll());

                unable++;

                // Nobody in the queue wants this sandwich
                if (unable == queue.size()) {
                    break;
                }
            }
        }

        return queue.size();
    }
}