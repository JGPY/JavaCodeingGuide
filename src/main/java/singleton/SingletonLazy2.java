package singleton;

// 单例模式的懒汉实现2--线程安全
// 通过设置同步方法，效率太低，整个方法被加锁
class SingletonLazy2 {
    private static SingletonLazy2 singletonLazy;

    private SingletonLazy2() {

    }

    public static synchronized SingletonLazy2 getInstance() {
        try {
            if (null == singletonLazy) {
                // 模拟在创建对象之前做一些准备工作
                Thread.sleep(1000);
                singletonLazy = new SingletonLazy2();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return singletonLazy;
    }
}