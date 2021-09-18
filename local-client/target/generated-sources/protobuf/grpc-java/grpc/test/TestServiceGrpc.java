package grpc.test;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: test.proto")
public final class TestServiceGrpc {

  private TestServiceGrpc() {}

  public static final String SERVICE_NAME = "mygrpc.TestService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.test.evectionDeployRequest,
      grpc.test.evectionDeployResult> getEvectionDeployMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "evectionDeploy",
      requestType = grpc.test.evectionDeployRequest.class,
      responseType = grpc.test.evectionDeployResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.test.evectionDeployRequest,
      grpc.test.evectionDeployResult> getEvectionDeployMethod() {
    io.grpc.MethodDescriptor<grpc.test.evectionDeployRequest, grpc.test.evectionDeployResult> getEvectionDeployMethod;
    if ((getEvectionDeployMethod = TestServiceGrpc.getEvectionDeployMethod) == null) {
      synchronized (TestServiceGrpc.class) {
        if ((getEvectionDeployMethod = TestServiceGrpc.getEvectionDeployMethod) == null) {
          TestServiceGrpc.getEvectionDeployMethod = getEvectionDeployMethod = 
              io.grpc.MethodDescriptor.<grpc.test.evectionDeployRequest, grpc.test.evectionDeployResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "mygrpc.TestService", "evectionDeploy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.test.evectionDeployRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.test.evectionDeployResult.getDefaultInstance()))
                  .setSchemaDescriptor(new TestServiceMethodDescriptorSupplier("evectionDeploy"))
                  .build();
          }
        }
     }
     return getEvectionDeployMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.test.evectionProcessStartReq,
      grpc.test.evectionProcessStartRes> getEvectionProcessStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "evectionProcessStart",
      requestType = grpc.test.evectionProcessStartReq.class,
      responseType = grpc.test.evectionProcessStartRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.test.evectionProcessStartReq,
      grpc.test.evectionProcessStartRes> getEvectionProcessStartMethod() {
    io.grpc.MethodDescriptor<grpc.test.evectionProcessStartReq, grpc.test.evectionProcessStartRes> getEvectionProcessStartMethod;
    if ((getEvectionProcessStartMethod = TestServiceGrpc.getEvectionProcessStartMethod) == null) {
      synchronized (TestServiceGrpc.class) {
        if ((getEvectionProcessStartMethod = TestServiceGrpc.getEvectionProcessStartMethod) == null) {
          TestServiceGrpc.getEvectionProcessStartMethod = getEvectionProcessStartMethod = 
              io.grpc.MethodDescriptor.<grpc.test.evectionProcessStartReq, grpc.test.evectionProcessStartRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "mygrpc.TestService", "evectionProcessStart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.test.evectionProcessStartReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.test.evectionProcessStartRes.getDefaultInstance()))
                  .setSchemaDescriptor(new TestServiceMethodDescriptorSupplier("evectionProcessStart"))
                  .build();
          }
        }
     }
     return getEvectionProcessStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.test.findEvectionPersonTaskListReq,
      grpc.test.findEvectionPersonTaskListRes> getFindEvectionPersonTaskListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findEvectionPersonTaskList",
      requestType = grpc.test.findEvectionPersonTaskListReq.class,
      responseType = grpc.test.findEvectionPersonTaskListRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.test.findEvectionPersonTaskListReq,
      grpc.test.findEvectionPersonTaskListRes> getFindEvectionPersonTaskListMethod() {
    io.grpc.MethodDescriptor<grpc.test.findEvectionPersonTaskListReq, grpc.test.findEvectionPersonTaskListRes> getFindEvectionPersonTaskListMethod;
    if ((getFindEvectionPersonTaskListMethod = TestServiceGrpc.getFindEvectionPersonTaskListMethod) == null) {
      synchronized (TestServiceGrpc.class) {
        if ((getFindEvectionPersonTaskListMethod = TestServiceGrpc.getFindEvectionPersonTaskListMethod) == null) {
          TestServiceGrpc.getFindEvectionPersonTaskListMethod = getFindEvectionPersonTaskListMethod = 
              io.grpc.MethodDescriptor.<grpc.test.findEvectionPersonTaskListReq, grpc.test.findEvectionPersonTaskListRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "mygrpc.TestService", "findEvectionPersonTaskList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.test.findEvectionPersonTaskListReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.test.findEvectionPersonTaskListRes.getDefaultInstance()))
                  .setSchemaDescriptor(new TestServiceMethodDescriptorSupplier("findEvectionPersonTaskList"))
                  .build();
          }
        }
     }
     return getFindEvectionPersonTaskListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.test.completeTaskReq,
      grpc.test.completeTaskRes> getCompleteTaskByTaskIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "completeTaskByTaskIds",
      requestType = grpc.test.completeTaskReq.class,
      responseType = grpc.test.completeTaskRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.test.completeTaskReq,
      grpc.test.completeTaskRes> getCompleteTaskByTaskIdsMethod() {
    io.grpc.MethodDescriptor<grpc.test.completeTaskReq, grpc.test.completeTaskRes> getCompleteTaskByTaskIdsMethod;
    if ((getCompleteTaskByTaskIdsMethod = TestServiceGrpc.getCompleteTaskByTaskIdsMethod) == null) {
      synchronized (TestServiceGrpc.class) {
        if ((getCompleteTaskByTaskIdsMethod = TestServiceGrpc.getCompleteTaskByTaskIdsMethod) == null) {
          TestServiceGrpc.getCompleteTaskByTaskIdsMethod = getCompleteTaskByTaskIdsMethod = 
              io.grpc.MethodDescriptor.<grpc.test.completeTaskReq, grpc.test.completeTaskRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "mygrpc.TestService", "completeTaskByTaskIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.test.completeTaskReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.test.completeTaskRes.getDefaultInstance()))
                  .setSchemaDescriptor(new TestServiceMethodDescriptorSupplier("completeTaskByTaskIds"))
                  .build();
          }
        }
     }
     return getCompleteTaskByTaskIdsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TestServiceStub newStub(io.grpc.Channel channel) {
    return new TestServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TestServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TestServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TestServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TestServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TestServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 远程调用出差流程部署
     * </pre>
     */
    public void evectionDeploy(grpc.test.evectionDeployRequest request,
        io.grpc.stub.StreamObserver<grpc.test.evectionDeployResult> responseObserver) {
      asyncUnimplementedUnaryCall(getEvectionDeployMethod(), responseObserver);
    }

    /**
     * <pre>
     * 远程开启出差流程
     * </pre>
     */
    public void evectionProcessStart(grpc.test.evectionProcessStartReq request,
        io.grpc.stub.StreamObserver<grpc.test.evectionProcessStartRes> responseObserver) {
      asyncUnimplementedUnaryCall(getEvectionProcessStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * 远程查询某个流程某个负责人的任务列表
     * </pre>
     */
    public void findEvectionPersonTaskList(grpc.test.findEvectionPersonTaskListReq request,
        io.grpc.stub.StreamObserver<grpc.test.findEvectionPersonTaskListRes> responseObserver) {
      asyncUnimplementedUnaryCall(getFindEvectionPersonTaskListMethod(), responseObserver);
    }

    /**
     * <pre>
     * 远程完成任务
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.test.completeTaskReq> completeTaskByTaskIds(
        io.grpc.stub.StreamObserver<grpc.test.completeTaskRes> responseObserver) {
      return asyncUnimplementedStreamingCall(getCompleteTaskByTaskIdsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEvectionDeployMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.test.evectionDeployRequest,
                grpc.test.evectionDeployResult>(
                  this, METHODID_EVECTION_DEPLOY)))
          .addMethod(
            getEvectionProcessStartMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.test.evectionProcessStartReq,
                grpc.test.evectionProcessStartRes>(
                  this, METHODID_EVECTION_PROCESS_START)))
          .addMethod(
            getFindEvectionPersonTaskListMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.test.findEvectionPersonTaskListReq,
                grpc.test.findEvectionPersonTaskListRes>(
                  this, METHODID_FIND_EVECTION_PERSON_TASK_LIST)))
          .addMethod(
            getCompleteTaskByTaskIdsMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.test.completeTaskReq,
                grpc.test.completeTaskRes>(
                  this, METHODID_COMPLETE_TASK_BY_TASK_IDS)))
          .build();
    }
  }

  /**
   */
  public static final class TestServiceStub extends io.grpc.stub.AbstractStub<TestServiceStub> {
    private TestServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TestServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TestServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 远程调用出差流程部署
     * </pre>
     */
    public void evectionDeploy(grpc.test.evectionDeployRequest request,
        io.grpc.stub.StreamObserver<grpc.test.evectionDeployResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEvectionDeployMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 远程开启出差流程
     * </pre>
     */
    public void evectionProcessStart(grpc.test.evectionProcessStartReq request,
        io.grpc.stub.StreamObserver<grpc.test.evectionProcessStartRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEvectionProcessStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 远程查询某个流程某个负责人的任务列表
     * </pre>
     */
    public void findEvectionPersonTaskList(grpc.test.findEvectionPersonTaskListReq request,
        io.grpc.stub.StreamObserver<grpc.test.findEvectionPersonTaskListRes> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getFindEvectionPersonTaskListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 远程完成任务
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.test.completeTaskReq> completeTaskByTaskIds(
        io.grpc.stub.StreamObserver<grpc.test.completeTaskRes> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getCompleteTaskByTaskIdsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class TestServiceBlockingStub extends io.grpc.stub.AbstractStub<TestServiceBlockingStub> {
    private TestServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TestServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TestServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 远程调用出差流程部署
     * </pre>
     */
    public grpc.test.evectionDeployResult evectionDeploy(grpc.test.evectionDeployRequest request) {
      return blockingUnaryCall(
          getChannel(), getEvectionDeployMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 远程开启出差流程
     * </pre>
     */
    public grpc.test.evectionProcessStartRes evectionProcessStart(grpc.test.evectionProcessStartReq request) {
      return blockingUnaryCall(
          getChannel(), getEvectionProcessStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 远程查询某个流程某个负责人的任务列表
     * </pre>
     */
    public java.util.Iterator<grpc.test.findEvectionPersonTaskListRes> findEvectionPersonTaskList(
        grpc.test.findEvectionPersonTaskListReq request) {
      return blockingServerStreamingCall(
          getChannel(), getFindEvectionPersonTaskListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TestServiceFutureStub extends io.grpc.stub.AbstractStub<TestServiceFutureStub> {
    private TestServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TestServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TestServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 远程调用出差流程部署
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.test.evectionDeployResult> evectionDeploy(
        grpc.test.evectionDeployRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEvectionDeployMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 远程开启出差流程
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.test.evectionProcessStartRes> evectionProcessStart(
        grpc.test.evectionProcessStartReq request) {
      return futureUnaryCall(
          getChannel().newCall(getEvectionProcessStartMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EVECTION_DEPLOY = 0;
  private static final int METHODID_EVECTION_PROCESS_START = 1;
  private static final int METHODID_FIND_EVECTION_PERSON_TASK_LIST = 2;
  private static final int METHODID_COMPLETE_TASK_BY_TASK_IDS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TestServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TestServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EVECTION_DEPLOY:
          serviceImpl.evectionDeploy((grpc.test.evectionDeployRequest) request,
              (io.grpc.stub.StreamObserver<grpc.test.evectionDeployResult>) responseObserver);
          break;
        case METHODID_EVECTION_PROCESS_START:
          serviceImpl.evectionProcessStart((grpc.test.evectionProcessStartReq) request,
              (io.grpc.stub.StreamObserver<grpc.test.evectionProcessStartRes>) responseObserver);
          break;
        case METHODID_FIND_EVECTION_PERSON_TASK_LIST:
          serviceImpl.findEvectionPersonTaskList((grpc.test.findEvectionPersonTaskListReq) request,
              (io.grpc.stub.StreamObserver<grpc.test.findEvectionPersonTaskListRes>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COMPLETE_TASK_BY_TASK_IDS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.completeTaskByTaskIds(
              (io.grpc.stub.StreamObserver<grpc.test.completeTaskRes>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TestServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.test.TestServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TestService");
    }
  }

  private static final class TestServiceFileDescriptorSupplier
      extends TestServiceBaseDescriptorSupplier {
    TestServiceFileDescriptorSupplier() {}
  }

  private static final class TestServiceMethodDescriptorSupplier
      extends TestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TestServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TestServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TestServiceFileDescriptorSupplier())
              .addMethod(getEvectionDeployMethod())
              .addMethod(getEvectionProcessStartMethod())
              .addMethod(getFindEvectionPersonTaskListMethod())
              .addMethod(getCompleteTaskByTaskIdsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
