package proxy;

/**
 *  目标对象实现了某一接口
 * @author l
 */
public class Singer implements ISinger{
    @Override
    public void sing(){
        System.out.println("唱一首歌");
    }  
}