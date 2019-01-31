package otherJava;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.sf.json.JSONString;
import net.sf.json.util.JSONUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.util.EntityUtils;
import org.springframework.util.ObjectUtils;

import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by wangwu on 2019/1/24.
 * @author wangwu
 */
public class JSONTestClass{
        private  static  String a="success";
        private  static  Integer b=1;
        private  static  boolean c;
        private  transient ReentrantLock reentrantLock;


        static {
                System.out.println("i will be success");
        }


        public static void main(String[] args) {

        Student student=new Student();
                student.setName("11");
                student.setAge(1);
                JSONObject jsonObject=new JSONObject();
               String string = com.alibaba.fastjson.JSONObject.toJSONString(student);
                System.out.println(string);

                JSONObject ss=com.alibaba.fastjson.JSONObject.parseObject(string);
                System.out.println(ss.toString());

                Map<String,Set<Integer>> map = Maps.newHashMap();


                Map<String,Set<Integer>> setMap=new HashMap<>();


                //com.alibaba.fastjson.JSONObject  jsonObject2 =com.alibaba.fastjson.JSONObject.parseObject(student.toString());


        }



}
