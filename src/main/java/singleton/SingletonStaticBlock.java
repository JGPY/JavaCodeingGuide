package singleton;

//使用静态代码块实现单例模式
class SingletonStaticBlock {
    private static SingletonStaticBlock singletonStaticBlock;
    static {
        singletonStaticBlock = new SingletonStaticBlock();
    }
    public static SingletonStaticBlock getInstance() {
        return singletonStaticBlock;
    }
}