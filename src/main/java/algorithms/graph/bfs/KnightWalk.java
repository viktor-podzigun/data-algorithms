package algorithms.graph.bfs;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.*;

public class KnightWalk {

    public static void main(String[] args) {
        run(System.in, System.out);
    }
    
    public static void run(InputStream in, OutputStream out) {
        Scanner scanner = new Scanner(in);
        PrintStream printer = new PrintStream(out, true);
        
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            Point s = new Point(scanner.nextInt(), scanner.nextInt());
            Point d = new Point(scanner.nextInt(), scanner.nextInt());

            int moves = getMinMoves(n, m, s, d);
            printer.println(moves);
        }
    }

    private static int getMinMoves(int maxX, int maxY, Point s, Point d) {
        Queue<Pair<Point, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(s, 0));

        boolean[][] visit = new boolean[maxX][maxY];
        visit[s.x - 1][s.y - 1] = true;

        //System.out.println("d: " + d);
        HashSet<Point> targets = new HashSet<>();
        
        while (!queue.isEmpty()) {
            Pair<Point, Integer> current = queue.poll();
            //System.out.println("current: " + current);
            
            if (current.left.equals(d)) {
                return current.right;
            }

            targets.clear();
            for (Point t : targets(targets, maxX, maxY, current.left)) {
                if (!visit[t.x - 1][t.y - 1]) {
                    visit[t.x - 1][t.y - 1] = true;

                    queue.add(new Pair<>(t, current.right + 1));
                }
            }
        }

        //System.out.println("not found, s: " + s);
        return -1;
    }

    public static Set<Point> targets(Set<Point> res, int maxX, int maxY, Point s) {
        if (s.x + 1 <= maxX && s.y + 2 <= maxY) res.add(new Point(s.x + 1, s.y + 2));
        if (s.x + 1 <= maxX && s.y - 2 > 0) res.add(new Point(s.x + 1, s.y - 2));
        if (s.x + 2 <= maxX && s.y + 1 <= maxY) res.add(new Point(s.x + 2, s.y + 1));
        if (s.x + 2 <= maxX && s.y - 1 > 0) res.add(new Point(s.x + 2, s.y - 1));
        if (s.x - 1 > 0 && s.y + 2 <= maxY) res.add(new Point(s.x - 1, s.y + 2));
        if (s.x - 1 > 0 && s.y - 2 > 0) res.add(new Point(s.x - 1, s.y - 2));
        if (s.x - 2 > 0 && s.y + 1 <= maxY) res.add(new Point(s.x - 2, s.y + 1));
        if (s.x - 2 > 0 && s.y - 1 > 0) res.add(new Point(s.x - 2, s.y - 1));
        
        return res;
    }

    public static class Pair<L, R> {
        public final L left;
        public final R right;

        public Pair(L left, R right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(left, pair.left) &&
                    Objects.equals(right, pair.right);
        }

        @Override
        public int hashCode() {
            return Objects.hash(left, right);
        }

        @Override
        public String toString() {
            return "Pair(" + left + ", " + right + ')';
        }
    }
    
    public static class Point {
        public final int x;
        public final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x &&
                    y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override
        public String toString() {
            return "Point(" + x + ", " + y + ')';
        }
    }
}
