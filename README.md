重点：
 1. gprc在双向流和客户端流时调用的stub是一个非阻塞的，
 他的onNext、onComplete方法是异步调用的，无法确保完成的先后顺序，所以需要使用CountDownLatch，来控制资源同步处理。
 2. activiti为我们封装的几个service，通过service可直接对25张表进行操作。