package otherJava;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.sun.istack.internal.Nullable;

import java.util.List;

/**
 * Created by wangwu on 2019/3/1.
 */
public class listTransForm {
        public static void main(String[] args) {
                List<Student> studentList= Lists.newArrayList();
                studentList.add(new Student("wnagwu",26));
                studentList.add(new Student("clr",20));

                List<String> stringList=Lists.transform( studentList, new Function<Student, String>() {
//                        @Nullable
                        @Override
                        public String apply(Student input) {
                                return input.getName();
                        }
                });

                for (String ss:stringList) {
                        System.out.println(ss);
                }
        }
}
