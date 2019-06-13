package singleton;

// 单例模式的懒汉实现4--线程不安全
// 通过设置同步代码块，只同步创建实例的代码
// 但是还是有线程安全问题
class SingletonLazy4 {

    private static SingletonLazy4 singletonLazy;

    private SingletonLazy4() {

    }

    public static SingletonLazy4 getInstance() {
        try {
            if (null == singletonLazy) {        //代码1
                // 模拟在创建对象之前做一些准备工作
                Thread.sleep(1000);
                synchronized (SingletonLazy4.class) {
                    singletonLazy = new SingletonLazy4(); //代码2
                }
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
        return singletonLazy;
    }
}