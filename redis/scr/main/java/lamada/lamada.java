package lamada;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * Created by wangwu on 2019/8/8.
 */
public class lamada {
        public static void lamadaTeset(){
                List<Integer> list= Lists.newArrayList(3,6,1,2,8,1);

//                list= list.stream().sorted((p1,p2)->p1-p2).collect(Collectors.toList());
                list = list.stream().sorted(Integer::compareTo).collect(Collectors.toList());
                list.stream().forEach(System.out::println);
//                list=list.stream().sorted(Integer::compareTo).collect(Collectors.toList());

  list = list.stream().sorted((p1, p2) -> p1 - p2).distinct().map(integer -> integer.intValue()).collect(Collectors.toList());

//                list.stream().forEach(System.out::println);
//                list=list.stream().distinct().collect(Collectors.toList());
//                list.forEach(System.out::println);
//                List<Integer> sortList=list.stream()
//                                .sorted(Integer::compareTo)
//                                .collect(Collectors.toList());
                List<String> stringList11=Lists.newArrayList("a","b","c");

                List<String> stringList22=Lists.newArrayList("1","2","3");

//                List<String> ss=stringList11.stream().flatMap(ii->stringList22.stream().map(jj->new String[]{ii,jj})).collect(Collectors.toList());

//                ss.stream().forEach(System.out ::println);
//                List<String> ss=stringList11.stream().filter(item->stringList22.contains(item)).collect(Collectors.toList());

//                List<String> ss1=stringList11.stream().filter(item->!stringList22.contains(item)).collect(Collectors.toList());

//                Object object = stringList11.stream().filter(e->e.equals("a")).collect(Collectors.toList());

//                list=list.stream().sorted(Integer::compareTo).distinct().filter(integer -> integer.intValue()>4).map(integer -> integer.intValue()).collect(Collectors.toList());
                Student studentww=new Student("wangwu",99,"code");
                Student studentclr=new Student("clr",100,"qianduan");
                List<Student> studentLIst=Lists.newArrayListWithExpectedSize(2);
                studentLIst.add(studentclr);
                studentLIst.add(studentww);

                List<Student> studentLIst11=Lists.newArrayListWithExpectedSize(2);


//                studentLIst.stream().filter((ew)-> (!StringUtils.isEmpty(ew.getAge()))).forEach((e)->{
//                        studentLIst11.add(e);
//                });

//                studentLIst.stream().filter(ll->ll.getName().startsWith("w")).map(e->e.getJob()).forEach(e->{
//                        System.out.println(new String(e));
//                });
//                studentLIst11.stream().forEach(e-> System.out.println(e.getName()));
//                List<Student>ss  = studentLIst.stream().sorted((p1,p2)->p1.getAge()-p2.getAge()).collect(Collectors.toList());
//                ss.stream().forEach(e-> System.out.println(e.getName()));
//             List<Integer> map1=studentLIst.stream().map(e->e.getAge()).sorted(Integer::compareTo).collect(Collectors.toList());

//                Integer ss=studentLIst.stream().map(e->e.getName()).map(String::length).reduce(Integer::sum).get();

//                Student ss= studentLIst.stream().filter(e->studentLIst.stream().noneMatch(ee->ee.getName().equals("wang"))).findFirst().get();
//
//                boolean ss1= studentLIst.stream().anyMatch(e->e.getName().equals("wangwu"));

//                List<Student>  students1 =Lists.newArrayListWithExpectedSize(2);
//                students1= studentLIst.stream().filter(e->e.getName().equals("wangwu")).collect(Collectors.toList());
//                students1.stream().forEach(e-> System.out.println(e.getAge()));
//                Integer ss=studentLIst.stream().filter(e->e.getName().startsWith("w")).findFirst().get().getAge();
//                Integer age=studentLIst.stream().filter(e->e.getName().startsWith("w")).findFirst().get().getAge();
//
//                System.out.println(ss1);
//                Set<Integer> ss=list.stream().sorted(Integer::compareTo).map(integer -> integer.intValue()).filter(integer -> integer.intValue()>4).collect(Collectors.toSet());

//                map1.stream().forEach(e->System.out.println(e));
//                System.out.println(object.getClass());
//                ss1.stream().forEach(System.out ::println);

//                Stream<Integer>  obj=list.stream().sorted(Integer::compareTo);
//                List<Integer> llist1=list.stream().filter(e->e.toString().startsWith("1")).map(e->e.intValue()).collect(Collectors.toList());

                Map<Integer,String > map1=Maps.newHashMap();

                Map<Integer,String> map = Maps.newHashMapWithExpectedSize(3);
                map.put(1,"a");
                map.put(2,"b");
                map.put(3,"c");
                map.put(4,"d");
                map.put(4,"d");

                map.forEach((k,v)->{
                        map1.put(k,v);
                });

//              map1.forEach((kk,vv)-> System.out.println(kk+"--"));
//                map.forEach((k,v)-> System.out.println(k+"--"+v));
//                List<Integer> list2=Lists.newArrayList(list);
//                list=obj.collect(Collectors.toList());
//                Optional obj=list.stream().max(Integer::compareTo);
//                System.out.println(obj);

//                for (Integer ii:list) {
//                        System.out.println(ii);
//                }
//
//                stringList.stream().forEach(e-> System.out.println(e.toString()));
//                stringList=stringList.stream().distinct().collect(Collectors.toList());
//                stringList.stream().forEach(e-> System.out.println(e.toString()));


//                int sumSize = Stream.of("Apple", "Banana", "Orange", "Pear")
//                                .parallel()
//                                .map(String::length)
//                                .reduce(Integer::sum)
//                                .get();




//                list2.forEach(ii-> System.out.println(ii.intValue()));
//
//                list.forEach(System.out::println);


        }

        public static void main(String[] args) {
                lamadaTeset();
        }






        public static int[]  twoSum(int[] nums, int target) {
                for (int i=0;i<nums.length;i++){
                        for (int j=nums.length-1;j>=0;j--){
                                if(new Integer(nums[i]+nums[j]).equals(target)){
                                        return new int[]{i,j};
                                }
                        }
                }
                return  null;
        }
}
