import java.util.Scanne

public class Guessthetree {
    static Scanner scanner = new Scanner(System.in);
    static final int Shashwat = 1004;

    static boolean[] goodTreeOrNot = new boolean[Shashwat];
    static int[] Sanya = new int[Shashwat];


    static void guessingthepath(int node1, int node2) {
        int x = ask(node1, node2);
        if (x == node1 || x == node2) {
            Sanya[node2] = node1;
            goodTreeOrNot[node2] = true;
            return;
        }
        if (!goodTreeOrNot[x]) guessingthepath(node1, x);
        guessingthepath(x, node2);
    }


    static int ask(int node1, int node2) {
        System.out.println("? " + node1 + " " + node2);
        System.out.flush();
        return scanner.nextInt();
    }

    static void generateTree() {
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) goodTreeOrNot[i] = false;
        goodTreeOrNot[1] = true;
        for (int i = 2; i <= n; i++) {
            if (!goodTreeOrNot[i]) {
                guessingthepath(1, i);
            }
        }

        System.out.print("! ");
        for (int i = 2; i <= n; i++) {
            System.out.print(i + " " + Sanya[i] + " ");
        }
    }

    public static void main(String[] args) {
        int t = scanner.nextInt();
        while (t-- > 0) {
            generateTree();
        }
    }
}
