package cinema;

public class Stage1 {
    public static void main(String[] args) {
        // Write your code here
        System.out.println("Cinema:");
        for (int i = 0; i <= 7; i++) {
            if (i == 0) {
                for (int j = 0; j <= 8; j++) {
                    if (j == 0) {
                        System.out.print("\s\s");
                    } else {
                        System.out.print(j + "\s");
                    }
                }
            } else {
                System.out.println();
                System.out.print(i + "\s");
                for (int j = 0; j < 8; j++) {
                    System.out.print("S\s");
                }
            }
        }
    }
}