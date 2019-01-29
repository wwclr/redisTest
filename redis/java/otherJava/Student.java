package otherJava;

/**
 * Created by wangwu on 2019/1/24.
 */
public class Student{
        private  String name;
        private   Integer age;

        public  String getName() {
                return name;
        }

        public  void setName(String name) {
             this.name=name;
        }

        public  Integer getAge() {
                return age;
        }

        public  void setAge(Integer age) {
                this.age=age;
        }

        public   Student(){
                System.out.println("i am 无参构造方法");

        }


        public    Student(String name,Integer age){
                this.name=name;
               this.age=age;
        }
        public void  ziwojieshao(){
                System.out.println("i am a student");
        }


}
