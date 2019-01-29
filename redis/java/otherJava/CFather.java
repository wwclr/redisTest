package otherJava;

/**
 * Created by wangwu on 2019/1/18.
 */
public abstract class CFather implements  A{
        protected   static  String aa="aaa";
        protected  static  String bb="bb";

//        public static void main(String[] args) {
//                new otherJava.CFather(1);
//        }
        static {
                System.out.println(aa);
                System.out.println("哈哈");
        }

        public void say(){
                System.out.println("fuqinsay");
        }
        public void fuqinsayhaha(){
                System.out.println("fuqinsayhaha");
        }

      public  void init(){
              System.out.println("呵呵呵");
        }

        @Override
        public void tiao() {
                System.out.println(this.getClass());
        }

        @Override
        public  void pao(){
                maren();
        }


        public abstract void maren();

//        public otherJava.CFather(){
//        init();
//        }

//        public otherJava.CFather(int a){
//                System.out.println(a);
//        }

}
