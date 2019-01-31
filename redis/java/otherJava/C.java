package otherJava;

/**
 * Created by wangwu on 2019/1/18.
 */
public class C extends CFather{
        protected   static  String aa="bbb";
        public static void main(String[] args) {
                C c=new C();

        }

        public C() {
               init();
        }

        public C(int a) {
                System.out.println("contructor a");
        }



        public  void han(){
                System.out.println("erzihan");
        }
//        @Override
//        public   void say(){
//                System.out.println("erzisay");
//        }


        @Override
        public void init(){
                System.out.println( this.getClass());
                System.out.println(aa);
        }

        @Override
        public   void tiao() {
                System.out.println( this.getClass());
        }

//        @Override
//        public void pao() {
//                System.out.println("c pao");
//        }

        @Override
        public void maren() {
                System.out.println("c maren");
        }


        private static    void tiao1(){
               A c= new C();
        }


}
