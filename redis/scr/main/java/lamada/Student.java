package lamada;

/**
 * Created by wangwu on 2019/8/9.
 */
public class Student {
        private String name;
        private Integer age;
        private String job;


        public Student(){

        }

        public Student(String name,Integer age,String job){
                this.name=name;
                this.age=age;
                this.job=job;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public Integer getAge() {
                return age;
        }

        public void setAge(Integer age) {
                this.age = age;
        }

        public String getJob() {
                return job;
        }

        public void setJob(String job) {
                this.job = job;
        }
}
