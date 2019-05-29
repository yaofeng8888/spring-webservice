import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * @author: yaofeng
 * @create:2019-05-29-14:58
 **/
@WebService(targetNamespace = "WSDL")
public class WebServiceImpl implements WebServiceI {

    @Override
    public String sayHello(String name) {
        System.out.println("WebService sayHello "+name);
        return "sayHello "+name;
    }

    @Override
    public String save(String name, String pwd) {
        System.out.println("WebService save "+name+"， "+pwd);
        return "save Success";
    }
}
