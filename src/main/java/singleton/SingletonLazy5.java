package singleton;

//单例模式的懒汉实现5--线程安全
//通过设置同步代码块，使用DCL双检查锁机制
//使用双检查锁机制成功的解决了单例模式的懒汉实现的线程不安全问题和效率问题
//DCL 也是大多数多线程结合单例模式使用的解决方案
//第一个if判断的作用：是为了提高程序的 效率，当SingletonLazy5对象被创建以后，再获取SingletonLazy5对象时就不用去验证同步代码块的锁及后面的代码，直接返回SingletonLazy5对象
//第二个if判断的作用：是为了解决多线程下的安全性问题，也就是保证对象的唯一。
class SingletonLazy5 {

    private static volatile SingletonLazy5 singletonLazy;

    private SingletonLazy5() {

    }

    public static SingletonLazy5 getInstance() {
        try {
            if (null == singletonLazy) {
                // 模拟在创建对象之前做一些准备工作
                Thread.sleep(1000);
                synchronized (SingletonLazy5.class) {
                    if(null == singletonLazy) {
                        singletonLazy = new SingletonLazy5();
                    }
                }
            }
        } catch (InterruptedException e) {
        }
        return singletonLazy;
    }
}