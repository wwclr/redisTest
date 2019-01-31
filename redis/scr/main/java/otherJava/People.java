package otherJava;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by wangwu on 2019/1/24.
 */
public class People {
        public   static String address ;

        public static String getAddress() {
                return address;
        }

        public static void setAddress(String address) {
                People.address = address;
        }

        static {
                if (StringUtils.isEmpty(address)) {
                        setAddress("浙江省杭州市江南大道潮人汇");
                }
        }


}
