package singleton;

/**
 * 所谓饿汉模式就是立即加载，一般情况下再调用getInstancef方法之前就已经产生了实例，也就是在类加载的时候已经产生了。
 * 这种模式的缺点很明显，就是占用资源，当单例类很大的时候，其实我们是想使用的时候再产生实例。因此这种方式适合占用资源少，
 * 在初始化的时候就会被用到的类。
 *  @Author l
 */

class SingletonHungary {
    private static SingletonHungary singletonHungary = new SingletonHungary();
    //将构造器设置为private禁止通过new进行实例化
    private SingletonHungary() {

    }
    public static SingletonHungary getInstance() {
        return singletonHungary;
    }
}

