import com.alipay.sofa.rpc.config.ProviderConfig;
import com.alipay.sofa.rpc.config.ServerConfig;
import com.zsp.service.HelloService;
import com.zsp.service.impl.HelloServiceImpl;

import javax.xml.ws.Service;

public class QuickStartServer {
    public static void main(String[] args) {
        ServerConfig serverConfig = new ServerConfig()
                                    .setProtocol("bolt")
                                    .setPort(9696)
                                    .setDaemon(false);
        ProviderConfig<HelloService> providerConfig = new ProviderConfig<>();
        providerConfig.setInterfaceId(HelloService.class.getName());
        providerConfig.setRef(new HelloServiceImpl());
        providerConfig.setServer(serverConfig);
        providerConfig.export();
//        ServerConfig serverConfig = new ServerConfig()
//                .setProtocol("bolt") // 设置一个协议，默认bolt
//                .setPort(9696) // 设置一个端口，默认12200
//                .setDaemon(false); // 非守护线程
//
//        ProviderConfig<HelloService> providerConfig = new ProviderConfig<HelloService>()
//                .setInterfaceId(HelloService.class.getName()) // 指定接口
//                .setRef(new HelloServiceImpl()) // 指定实现
//                .setServer(serverConfig); // 指定服务端
//
//        providerConfig.export(); // 发布服务
    }
}