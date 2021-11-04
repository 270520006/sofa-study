import com.alipay.sofa.rpc.config.ConsumerConfig;
import com.zsp.service.HelloService;


public class QuickStartClient {
    public static void main(String[] args) {
        ConsumerConfig<HelloService> consumerConfig = new ConsumerConfig<HelloService>()
                .setInterfaceId(HelloService.class.getName())
                .setProtocol("bolt")
                .setDirectUrl("bolt://127.0.0.1:9696");
        HelloService helloService = consumerConfig.refer();
        System.out.println(helloService.sayHello("zsp"));
//        ConsumerConfig<HelloService> consumerConfig = new ConsumerConfig<HelloService>()
//                .setInterfaceId(HelloService.class.getName()) // 指定接口
//                .setProtocol("bolt") // 指定协议
//                .setDirectUrl("bolt://127.0.0.1:9696"); // 指定直连地址
//
//        HelloService helloService = consumerConfig.refer();
//
//        while (true) {
//            System.out.println(helloService.sayHello("world"));
//            try {
//                Thread.sleep(200);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
    }
}