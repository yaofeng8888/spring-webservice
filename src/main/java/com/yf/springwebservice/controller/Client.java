import com.yf.springwebservice.ws.WebServiceImpl;
import com.yf.springwebservice.ws.WebServiceImplService;

/**
 * @author: yaofeng
 * @create:2019-05-29-15:56
 **/
public class Client {
    public static void main(String[] strings){
        WebServiceImplService factory = new WebServiceImplService();
        WebServiceImpl webServiceImplPort = factory.getWebServiceImplPort();
        String string = webServiceImplPort.sayHello("zhangsan");
        System.out.println(string);
    }
}
