package otherJava;

import org.springframework.util.ObjectUtils;

/**
 * Created by wangwu on 2019/1/21.
 */
public class ListTestClass {
        private  static  String aa="i am aa";

        static {
                System.out.println(aa);
        }

        public  void penren(A a){
                System.out.println("penren");
        }


        public void  init(){
                System.out.println("i am init method");
        }
        public static void main(String[] args) {

                //Collection<Integer> collection= Lists.newLinkedList();
//                Collection collection1=new Vector();
//                collection1.iterator();
//                List list=Lists.newLinkedList();
//                LinkedList linkedList=Lists.newLinkedList();
                //collection.add(1);
               // collection.addAll(Arrays.asList(1,2));


//                AbstractList<String> vector=new Vector<String>();
//                vector.add("2323");
//                Stack liststack =new Stack();
//               Object ab= liststack.push(1);
//               Object cc= liststack.peek();
//                try {
//                        System.out.println(cc);
//                }catch (Exception e){
//                        e.printStackTrace();
//                }

//                Set<Number> set=new TreeSet<Number>();
//                set.add(1);
//                set.add(2);
//                set.add(2);
//
//                Set<Number> set1=new TreeSet<Number>();
//                set1.add(1);
//                set1.add(2);
//                set1.add(2);
//
//                List<Integer> newList=Lists.newArrayList();
//                newList.add(1);
//                newList.add(2);
//                newList.add(3);
//
//                Collections.sort(newList);
//                Collections.synchronizedList(newList);


//                for (Object in:set) {
//                        System.out.println(in.hashCode());
//                }
//                System.out.println(set.equals(set1)?"yes":0);
//                System.out.println(set.hashCode()+"  "+set1.hashCode());
//                Map<String,Set<Number>> map= Maps.newLinkedHashMap();
//
//
//                map.put("class",set);
//               Iterator<Map.Entry<String,Set<Number>>> iterator=map.entrySet().iterator();
//                while (iterator.hasNext()){
//                      Map.Entry<String,Set<Number>> stringSetMap=iterator.next();
//
//                       String ss=stringSetMap.getKey();
//                        Set<Number> sss=stringSetMap.getValue();
//                        System.out.println(sss.size());
//
//                }




//                Iterator iterator=vector.iterator();
//                while (iterator.hasNext()){
//                        Object on=iterator.next();
//                        System.out.println(on);
//                }

//                Iterator it=collection.iterator();
//                while (it.hasNext()){
//                        Object object = it.next();
//                        System.out.println(object);
//                }
//                List<Integer> integerList =Lists.newArrayList();
//
//                Integer a=new Integer(1);
//                System.out.println(ifif(collection));
//                String aa="xa";


        }

        public  static  boolean ifif(Object obj){
                return obj==null && ObjectUtils.isEmpty(obj);
        }
}
