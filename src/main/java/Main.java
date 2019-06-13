import java.lang.reflect.Constructor;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;

public class Main {

    private Constructor constructor;

    public Main() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        System.out.println("Hello World!1");

        try{
            //通过Class.forName获取Gum类的Class对象
            Class clazz=Class.forName("Main");
            TypeVariable[] type = clazz.getTypeParameters();
            System.out.println(type);
            Main clazzInstance = (Main) clazz.newInstance();
            System.out.println("forName=clazz:"+clazz.getName());
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException   e){
            e.printStackTrace();
        }


        System.out.println("Hello World!2");
        //通过实例对象获取Gum的Class对象
        Main gum = new Main();
        Class clazz2=gum.getClass();
        System.out.println("new=clazz2:"+clazz2.getName());

        System.out.println("Hello World!3");
        Class clazz3 = Main.class;
        System.out.println("new=clazz3:"+clazz3.getName());
        System.out.println("Hello World!4");

        HashMap<String, Integer> hashMap = new HashMap();
        hashMap.put("aa", 12345);
    }
}
