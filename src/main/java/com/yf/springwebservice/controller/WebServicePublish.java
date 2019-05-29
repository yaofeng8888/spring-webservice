import javax.xml.ws.Endpoint;

/**
 * @author: yaofeng
 * @create:2019-05-29-15:02
 **/
public class WebServicePublish {
    public static void main(String[] strings){
        String address = "http://127.0.0.1:8099/WS_Server/WebService";
        Endpoint.publish(address, new WebServiceImpl());
        System.out.println("成功");
    }
}
