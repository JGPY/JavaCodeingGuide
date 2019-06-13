package test;

public class JavaStackTest {
    
    private int count = 0;
    
    public void testStack(){
        count++;
        System.out.println("now stack height:"+count);
        testStack();
    }
    
    public void test(){
        try {
            testStack();
        } catch (Throwable e) {
            System.out.println(e);
            System.out.println("stack height:"+count);
        }
    }

    public static void main(String[] args) {
        new JavaStackTest().test();
    }

}