package otherJava;

/**
 * Created by wangwu on 2019/1/21.
 */
public class C1  extends CFather{

        @Override
        public void tiao() {
                System.out.println(this.getClass());
        }

//        @Override
//        public void pao() {
//                System.out.println("c1 pao");
//        }

        @Override
        public void maren() {
                System.out.println("c1 maren");
        }


        public  void  daren(){
                System.out.println("c1 daren");
        }

}
