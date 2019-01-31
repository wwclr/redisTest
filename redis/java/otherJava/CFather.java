package otherJava;

/**
 * Created by wangwu on 2019/1/18.
 */
public  class CFather implements  A{
        protected   static  String aa="aaa";
        protected  static  String bb="bb";


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

        @Override
        public void maren() {

        }

}
