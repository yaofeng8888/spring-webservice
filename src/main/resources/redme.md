                       Webservice心得
* 服务端：
* WebServiceI,创建接口，然后在创建实现类，注意注解的使用
* 发布服务,在浏览器中输入地址，在地址后面加上wsdl 如：http://127.0.0.1:8099/WS_Server/WebService?wsdl
* 注意端口不要被占用 成功后就可以见wsdl的一个页面
* 客户端：
* Windows系统 打开cmd命令窗口，在管理员身份下打开这个窗口，输入 wsimport -keep -d<这里写你生成的文件存放的路径>
http://127.0.0.1:8099/WS_Server/WebService?wsdl
* 然后打开你的保存文件目录拷贝里面的.java文件 到你的项目里面，
* 编写客户端访问 Client.java文件
* 这里在运行的时候可能会出现一个两个类具有相同的 XML 类型名称 "{WSDL}save"。请使用 @XmlType.name 和 @XmlType.namespace 为类分配不同的名称。
这样的一个错误
* 你需要找到 你的生成文件 修改一点东西 我的项目里面是save saveResponse sayHello sayHelloResponse 这四个文件，在里面的
@XmlType(name = "save", namespace = "Save",propOrder = {
    "arg0",
    "arg1"
})
这个注解面添加一个namespace属性 值怎么写 我也不确定 但是要和前面的name属性区分开
* 运行成功