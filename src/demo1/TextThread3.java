package demo1;

public class TextThread3 implements Runnable{
    @Override
   public void run(){
        for (int i = 0; i<200;i++){
            System.out.println("我在看代码--"+i);
        }
    }

    public static void main(String[] args) {
        //创建runnbale接口的实现类对象
       TestThread1 testThread1 = new TestThread1();
       Thread thread = new Thread(testThread1);
      thread.start();


       for (int i = 0 ; i<1000; i++){
           System.out.println("我在学习多线程--");
       }

    }
}
