package Task;

public class task_15102024_2 {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + a--);

        // 19 + 19 + 20 =58

        // A > --a >> 19, a >> 19
        // B > a++ >> 19, a >> 20
        // C > a-- >> 20, a >> 19
    }
}
