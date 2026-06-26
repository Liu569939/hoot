package review;

public class TowHunderdSeven {
    //hoot 207 课程表
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] arr = new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] pre : prerequisites) {
            arr[pre[0]]++;
            adj.get(pre[1]).add(pre[0]);
        }

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++) {
            if (arr[i] == 0) queue.add(i);
        }

        while (!queue.isEmpty()) {
            int cNode = queue.poll();
            numCourses--;
            for (int tNode : adj.get(cNode)) {
                if (--arr[tNode] == 0) queue.add(tNode);
            }
        }
        return numCourses == 0;
    }

}
