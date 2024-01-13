public class MainOverload {
    public static void main(String[] args) {
        System.out.println("Main Overload Example");
        System.out.println(main('t'));
        System.out.println(main(2,8));
    }
    public static char main(char c){
        return c;
    }
    public static int main(int a, int b){
        return a + b;
    }
}
