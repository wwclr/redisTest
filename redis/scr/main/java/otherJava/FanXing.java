package otherJava;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

/**
 * Created by wangwu on 2019/2/14.
 */
public class FanXing {

        private final static String a="aa";
        class dog{

        }
        class cat{

        }

        public static void main(String[] args) {
               final FanXing fanXing=new FanXing();
                 FanXing fanXing1=new FanXing();
                System.out.println(fanXing==fanXing1);
                Map<String,dog> dogMap = new HashMap<String,dog>(16);
//              Map<String,cat>   catMap   = new HashMap<String,cat>(16);
//                System.out.println(dogMap.getClass());
//                System.out.println(catMap.getClass());
//                try {
//                        Method method=dogMap.getClass().getDeclaredMethod("put", Object.class,Object.class);
//                        method.invoke(dogMap,"cat",fanXing.new cat());
//                        System.out.println(dogMap.getClass());
//                }catch (Exception e){
//                        e.printStackTrace();
//                }


                List<? extends Number> list1=new ArrayList<Integer>();



                Field[] fields=fanXing.getClass().getFields();
                Method[] methods=fanXing.getClass().getMethods();

                //System.gc();




                List<? super Long> list=new ArrayList<Number>();
                list.add(100L);
                list.add(2L);

                list.set(1,3L);
                Iterator iterator = list.iterator();
                while(iterator.hasNext()){
                        String ss=iterator.next().toString();
                        System.out.println(ss);
                }


        }

        private static void out(int i){
                System.out.println(i);

                out(++i);
        }


}
