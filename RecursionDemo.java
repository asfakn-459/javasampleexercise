public class RecursionDemo {
    int total = 0;
    public static void main(String[] args) {
        RecursionDemo rd = new RecursionDemo();
        rd.add(5);
    }
    public void add(int no){
        total = total + no;
        System.out.println(total);
        no--;
        if(no>0)
        add(no);
    }

}
