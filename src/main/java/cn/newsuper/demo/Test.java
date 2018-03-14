package cn.newsuper.demo;

/**
 * Created by Administrator on 2018/2/28.
 * 测试内存
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);
    }
}
