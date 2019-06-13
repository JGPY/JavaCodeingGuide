package proxy;

import org.junit.Test;
import proxy.dynamic_proxy.CglibProxyFactory;
import proxy.dynamic_proxy.JDKSingerProxy;
import proxy.static_proxy.SingerProxy;

public class SingerProxyTest {

    //目标对象
    ISinger target = new Singer();

    //静态代理测试
    @Test
    public void singerProxyTest1(){

        //代理对象
        ISinger proxy = new SingerProxy(target);
        //执行的是代理的方法
        proxy.sing();
    }

    //JDK动态代理测试
    @Test
    public void singerProxyTest2(){
        //代理对象
        JDKSingerProxy jDKSingerProxy= new JDKSingerProxy(target);
        //执行的是代理的方法
        jDKSingerProxy.sing();
    }

    //Cglib动态代理测试
    @Test
    public void singerProxyTest3(){
        //代理对象
        Singer proxy = (Singer)new CglibProxyFactory(target).getProxyInstance();
        //执行代理对象的方法
        proxy.sing();
    }
}