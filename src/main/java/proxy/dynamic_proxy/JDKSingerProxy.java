package proxy.dynamic_proxy;

import proxy.ISinger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *  代理对象和目标对象实现相同的接口
 */
public class JDKSingerProxy {


    private ISinger target;

    public JDKSingerProxy(ISinger target){
        this.target=target;
    }

    public void sing() {
        ISinger proxy  = (ISinger) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("向观众问好");
                        //执行目标对象方法
                        Object returnValue = method.invoke(target, args);
                        System.out.println("谢谢大家");
                        return returnValue;
                    }
                });
        proxy.sing();
    }

}