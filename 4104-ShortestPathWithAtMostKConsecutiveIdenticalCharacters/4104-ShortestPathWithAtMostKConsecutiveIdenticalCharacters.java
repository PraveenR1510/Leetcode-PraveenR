// Last updated: 8/12/2026, 9:29:31 PM
import java.util.*;

class Solution {
    static class State {
        int node;
        int cnt;
        long dist;

        State(int node, int cnt, long dist) {
            this.node = node;
            this.cnt = cnt;
            this.dist = dist;
        }
    }

    public int shortestPath(int n, int[][] edges, String labels, int k) {

        int[][] mavorqeli = edges;

        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            graph[e[0]].add(new int[]{e[1], e[2]});
        }

        long INF = Long.MAX_VALUE / 4;

        long[][] dist = new long[n][k + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], INF);
        }

        PriorityQueue<State> pq =
                new PriorityQueue<>((a, b) -> Long.compare(a.dist, b.dist));

        dist[0][1] = 0;
        pq.offer(new State(0, 1, 0));

        while (!pq.isEmpty()) {
            State cur = pq.poll();

            if (cur.dist != dist[cur.node][cur.cnt]) {
                continue;
            }

            if (cur.node == n - 1) {
                return (int) cur.dist;
            }

            char currentChar = labels.charAt(cur.node);

            for (int[] edge : graph[cur.node]) {
                int next = edge[0];
                int weight = edge[1];

                char nextChar = labels.charAt(next);

                int nextCnt;

                if (nextChar == currentChar) {
                    nextCnt = cur.cnt + 1;
                } else {
                    nextCnt = 1;
                }

                if (nextCnt > k) {
                    continue;
                }

                long newDist = cur.dist + weight;

                if (newDist < dist[next][nextCnt]) {
                    dist[next][nextCnt] = newDist;
                    pq.offer(new State(next, nextCnt, newDist));
                }
            }
        }

        return -1;
    }
}