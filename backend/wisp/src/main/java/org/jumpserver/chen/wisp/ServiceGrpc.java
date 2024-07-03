package org.jumpserver.chen.wisp;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.1)",
    comments = "Source: service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ServiceGrpc {

  private ServiceGrpc() {}

  public static final String SERVICE_NAME = "message.Service";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.TokenRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.TokenResponse> getGetTokenAuthInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTokenAuthInfo",
      requestType = org.jumpserver.chen.wisp.ServiceOuterClass.TokenRequest.class,
      responseType = org.jumpserver.chen.wisp.ServiceOuterClass.TokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.TokenRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.TokenResponse> getGetTokenAuthInfoMethod() {
    io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.TokenRequest, org.jumpserver.chen.wisp.ServiceOuterClass.TokenResponse> getGetTokenAuthInfoMethod;
    if ((getGetTokenAuthInfoMethod = ServiceGrpc.getGetTokenAuthInfoMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getGetTokenAuthInfoMethod = ServiceGrpc.getGetTokenAuthInfoMethod) == null) {
          ServiceGrpc.getGetTokenAuthInfoMethod = getGetTokenAuthInfoMethod =
              io.grpc.MethodDescriptor.<org.jumpserver.chen.wisp.ServiceOuterClass.TokenRequest, org.jumpserver.chen.wisp.ServiceOuterClass.TokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTokenAuthInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.TokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.TokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("GetTokenAuthInfo"))
              .build();
        }
      }
    }
    return getGetTokenAuthInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.TokenRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> getRenewTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RenewToken",
      requestType = org.jumpserver.chen.wisp.ServiceOuterClass.TokenRequest.class,
      responseType = org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.TokenRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> getRenewTokenMethod() {
    io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.TokenRequest, org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> getRenewTokenMethod;
    if ((getRenewTokenMethod = ServiceGrpc.getRenewTokenMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getRenewTokenMethod = ServiceGrpc.getRenewTokenMethod) == null) {
          ServiceGrpc.getRenewTokenMethod = getRenewTokenMethod =
              io.grpc.MethodDescriptor.<org.jumpserver.chen.wisp.ServiceOuterClass.TokenRequest, org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RenewToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.TokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("RenewToken"))
              .build();
        }
      }
    }
    return getRenewTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.SessionCreateRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.SessionCreateResponse> getCreateSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSession",
      requestType = org.jumpserver.chen.wisp.ServiceOuterClass.SessionCreateRequest.class,
      responseType = org.jumpserver.chen.wisp.ServiceOuterClass.SessionCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.SessionCreateRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.SessionCreateResponse> getCreateSessionMethod() {
    io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.SessionCreateRequest, org.jumpserver.chen.wisp.ServiceOuterClass.SessionCreateResponse> getCreateSessionMethod;
    if ((getCreateSessionMethod = ServiceGrpc.getCreateSessionMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getCreateSessionMethod = ServiceGrpc.getCreateSessionMethod) == null) {
          ServiceGrpc.getCreateSessionMethod = getCreateSessionMethod =
              io.grpc.MethodDescriptor.<org.jumpserver.chen.wisp.ServiceOuterClass.SessionCreateRequest, org.jumpserver.chen.wisp.ServiceOuterClass.SessionCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.SessionCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.SessionCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("CreateSession"))
              .build();
        }
      }
    }
    return getCreateSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.SessionFinishRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.SessionFinishResp> getFinishSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FinishSession",
      requestType = org.jumpserver.chen.wisp.ServiceOuterClass.SessionFinishRequest.class,
      responseType = org.jumpserver.chen.wisp.ServiceOuterClass.SessionFinishResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.SessionFinishRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.SessionFinishResp> getFinishSessionMethod() {
    io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.SessionFinishRequest, org.jumpserver.chen.wisp.ServiceOuterClass.SessionFinishResp> getFinishSessionMethod;
    if ((getFinishSessionMethod = ServiceGrpc.getFinishSessionMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getFinishSessionMethod = ServiceGrpc.getFinishSessionMethod) == null) {
          ServiceGrpc.getFinishSessionMethod = getFinishSessionMethod =
              io.grpc.MethodDescriptor.<org.jumpserver.chen.wisp.ServiceOuterClass.SessionFinishRequest, org.jumpserver.chen.wisp.ServiceOuterClass.SessionFinishResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FinishSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.SessionFinishRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.SessionFinishResp.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("FinishSession"))
              .build();
        }
      }
    }
    return getFinishSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.ReplayRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.ReplayResponse> getUploadReplayFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadReplayFile",
      requestType = org.jumpserver.chen.wisp.ServiceOuterClass.ReplayRequest.class,
      responseType = org.jumpserver.chen.wisp.ServiceOuterClass.ReplayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.ReplayRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.ReplayResponse> getUploadReplayFileMethod() {
    io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.ReplayRequest, org.jumpserver.chen.wisp.ServiceOuterClass.ReplayResponse> getUploadReplayFileMethod;
    if ((getUploadReplayFileMethod = ServiceGrpc.getUploadReplayFileMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getUploadReplayFileMethod = ServiceGrpc.getUploadReplayFileMethod) == null) {
          ServiceGrpc.getUploadReplayFileMethod = getUploadReplayFileMethod =
              io.grpc.MethodDescriptor.<org.jumpserver.chen.wisp.ServiceOuterClass.ReplayRequest, org.jumpserver.chen.wisp.ServiceOuterClass.ReplayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadReplayFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.ReplayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.ReplayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("UploadReplayFile"))
              .build();
        }
      }
    }
    return getUploadReplayFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.CommandRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.CommandResponse> getUploadCommandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadCommand",
      requestType = org.jumpserver.chen.wisp.ServiceOuterClass.CommandRequest.class,
      responseType = org.jumpserver.chen.wisp.ServiceOuterClass.CommandResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.CommandRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.CommandResponse> getUploadCommandMethod() {
    io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.CommandRequest, org.jumpserver.chen.wisp.ServiceOuterClass.CommandResponse> getUploadCommandMethod;
    if ((getUploadCommandMethod = ServiceGrpc.getUploadCommandMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getUploadCommandMethod = ServiceGrpc.getUploadCommandMethod) == null) {
          ServiceGrpc.getUploadCommandMethod = getUploadCommandMethod =
              io.grpc.MethodDescriptor.<org.jumpserver.chen.wisp.ServiceOuterClass.CommandRequest, org.jumpserver.chen.wisp.ServiceOuterClass.CommandResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.CommandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.CommandResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("UploadCommand"))
              .build();
        }
      }
    }
    return getUploadCommandMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.FinishedTaskRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.TaskResponse> getDispatchTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DispatchTask",
      requestType = org.jumpserver.chen.wisp.ServiceOuterClass.FinishedTaskRequest.class,
      responseType = org.jumpserver.chen.wisp.ServiceOuterClass.TaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.FinishedTaskRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.TaskResponse> getDispatchTaskMethod() {
    io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.FinishedTaskRequest, org.jumpserver.chen.wisp.ServiceOuterClass.TaskResponse> getDispatchTaskMethod;
    if ((getDispatchTaskMethod = ServiceGrpc.getDispatchTaskMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getDispatchTaskMethod = ServiceGrpc.getDispatchTaskMethod) == null) {
          ServiceGrpc.getDispatchTaskMethod = getDispatchTaskMethod =
              io.grpc.MethodDescriptor.<org.jumpserver.chen.wisp.ServiceOuterClass.FinishedTaskRequest, org.jumpserver.chen.wisp.ServiceOuterClass.TaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DispatchTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.FinishedTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.TaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("DispatchTask"))
              .build();
        }
      }
    }
    return getDispatchTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.RemainReplayRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.RemainReplayResponse> getScanRemainReplaysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScanRemainReplays",
      requestType = org.jumpserver.chen.wisp.ServiceOuterClass.RemainReplayRequest.class,
      responseType = org.jumpserver.chen.wisp.ServiceOuterClass.RemainReplayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.RemainReplayRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.RemainReplayResponse> getScanRemainReplaysMethod() {
    io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.RemainReplayRequest, org.jumpserver.chen.wisp.ServiceOuterClass.RemainReplayResponse> getScanRemainReplaysMethod;
    if ((getScanRemainReplaysMethod = ServiceGrpc.getScanRemainReplaysMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getScanRemainReplaysMethod = ServiceGrpc.getScanRemainReplaysMethod) == null) {
          ServiceGrpc.getScanRemainReplaysMethod = getScanRemainReplaysMethod =
              io.grpc.MethodDescriptor.<org.jumpserver.chen.wisp.ServiceOuterClass.RemainReplayRequest, org.jumpserver.chen.wisp.ServiceOuterClass.RemainReplayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScanRemainReplays"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.RemainReplayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.RemainReplayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("ScanRemainReplays"))
              .build();
        }
      }
    }
    return getScanRemainReplaysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.CommandConfirmRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.CommandConfirmResponse> getCreateCommandTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCommandTicket",
      requestType = org.jumpserver.chen.wisp.ServiceOuterClass.CommandConfirmRequest.class,
      responseType = org.jumpserver.chen.wisp.ServiceOuterClass.CommandConfirmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.CommandConfirmRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.CommandConfirmResponse> getCreateCommandTicketMethod() {
    io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.CommandConfirmRequest, org.jumpserver.chen.wisp.ServiceOuterClass.CommandConfirmResponse> getCreateCommandTicketMethod;
    if ((getCreateCommandTicketMethod = ServiceGrpc.getCreateCommandTicketMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getCreateCommandTicketMethod = ServiceGrpc.getCreateCommandTicketMethod) == null) {
          ServiceGrpc.getCreateCommandTicketMethod = getCreateCommandTicketMethod =
              io.grpc.MethodDescriptor.<org.jumpserver.chen.wisp.ServiceOuterClass.CommandConfirmRequest, org.jumpserver.chen.wisp.ServiceOuterClass.CommandConfirmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCommandTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.CommandConfirmRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.CommandConfirmResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("CreateCommandTicket"))
              .build();
        }
      }
    }
    return getCreateCommandTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.AssetLoginTicketRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.AssetLoginTicketResponse> getCheckOrCreateAssetLoginTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckOrCreateAssetLoginTicket",
      requestType = org.jumpserver.chen.wisp.ServiceOuterClass.AssetLoginTicketRequest.class,
      responseType = org.jumpserver.chen.wisp.ServiceOuterClass.AssetLoginTicketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.AssetLoginTicketRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.AssetLoginTicketResponse> getCheckOrCreateAssetLoginTicketMethod() {
    io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.AssetLoginTicketRequest, org.jumpserver.chen.wisp.ServiceOuterClass.AssetLoginTicketResponse> getCheckOrCreateAssetLoginTicketMethod;
    if ((getCheckOrCreateAssetLoginTicketMethod = ServiceGrpc.getCheckOrCreateAssetLoginTicketMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getCheckOrCreateAssetLoginTicketMethod = ServiceGrpc.getCheckOrCreateAssetLoginTicketMethod) == null) {
          ServiceGrpc.getCheckOrCreateAssetLoginTicketMethod = getCheckOrCreateAssetLoginTicketMethod =
              io.grpc.MethodDescriptor.<org.jumpserver.chen.wisp.ServiceOuterClass.AssetLoginTicketRequest, org.jumpserver.chen.wisp.ServiceOuterClass.AssetLoginTicketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckOrCreateAssetLoginTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.AssetLoginTicketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.AssetLoginTicketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("CheckOrCreateAssetLoginTicket"))
              .build();
        }
      }
    }
    return getCheckOrCreateAssetLoginTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.TicketRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.TicketStateResponse> getCheckTicketStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckTicketState",
      requestType = org.jumpserver.chen.wisp.ServiceOuterClass.TicketRequest.class,
      responseType = org.jumpserver.chen.wisp.ServiceOuterClass.TicketStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.TicketRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.TicketStateResponse> getCheckTicketStateMethod() {
    io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.TicketRequest, org.jumpserver.chen.wisp.ServiceOuterClass.TicketStateResponse> getCheckTicketStateMethod;
    if ((getCheckTicketStateMethod = ServiceGrpc.getCheckTicketStateMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getCheckTicketStateMethod = ServiceGrpc.getCheckTicketStateMethod) == null) {
          ServiceGrpc.getCheckTicketStateMethod = getCheckTicketStateMethod =
              io.grpc.MethodDescriptor.<org.jumpserver.chen.wisp.ServiceOuterClass.TicketRequest, org.jumpserver.chen.wisp.ServiceOuterClass.TicketStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckTicketState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.TicketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.TicketStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("CheckTicketState"))
              .build();
        }
      }
    }
    return getCheckTicketStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.TicketRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> getCancelTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelTicket",
      requestType = org.jumpserver.chen.wisp.ServiceOuterClass.TicketRequest.class,
      responseType = org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.TicketRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> getCancelTicketMethod() {
    io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.TicketRequest, org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> getCancelTicketMethod;
    if ((getCancelTicketMethod = ServiceGrpc.getCancelTicketMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getCancelTicketMethod = ServiceGrpc.getCancelTicketMethod) == null) {
          ServiceGrpc.getCancelTicketMethod = getCancelTicketMethod =
              io.grpc.MethodDescriptor.<org.jumpserver.chen.wisp.ServiceOuterClass.TicketRequest, org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.TicketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("CancelTicket"))
              .build();
        }
      }
    }
    return getCancelTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.ForwardRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.ForwardResponse> getCreateForwardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateForward",
      requestType = org.jumpserver.chen.wisp.ServiceOuterClass.ForwardRequest.class,
      responseType = org.jumpserver.chen.wisp.ServiceOuterClass.ForwardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.ForwardRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.ForwardResponse> getCreateForwardMethod() {
    io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.ForwardRequest, org.jumpserver.chen.wisp.ServiceOuterClass.ForwardResponse> getCreateForwardMethod;
    if ((getCreateForwardMethod = ServiceGrpc.getCreateForwardMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getCreateForwardMethod = ServiceGrpc.getCreateForwardMethod) == null) {
          ServiceGrpc.getCreateForwardMethod = getCreateForwardMethod =
              io.grpc.MethodDescriptor.<org.jumpserver.chen.wisp.ServiceOuterClass.ForwardRequest, org.jumpserver.chen.wisp.ServiceOuterClass.ForwardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateForward"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.ForwardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.ForwardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("CreateForward"))
              .build();
        }
      }
    }
    return getCreateForwardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.ForwardDeleteRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> getDeleteForwardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteForward",
      requestType = org.jumpserver.chen.wisp.ServiceOuterClass.ForwardDeleteRequest.class,
      responseType = org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.ForwardDeleteRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> getDeleteForwardMethod() {
    io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.ForwardDeleteRequest, org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> getDeleteForwardMethod;
    if ((getDeleteForwardMethod = ServiceGrpc.getDeleteForwardMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getDeleteForwardMethod = ServiceGrpc.getDeleteForwardMethod) == null) {
          ServiceGrpc.getDeleteForwardMethod = getDeleteForwardMethod =
              io.grpc.MethodDescriptor.<org.jumpserver.chen.wisp.ServiceOuterClass.ForwardDeleteRequest, org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteForward"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.ForwardDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("DeleteForward"))
              .build();
        }
      }
    }
    return getDeleteForwardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.Empty,
      org.jumpserver.chen.wisp.ServiceOuterClass.PublicSettingResponse> getGetPublicSettingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPublicSetting",
      requestType = org.jumpserver.chen.wisp.ServiceOuterClass.Empty.class,
      responseType = org.jumpserver.chen.wisp.ServiceOuterClass.PublicSettingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.Empty,
      org.jumpserver.chen.wisp.ServiceOuterClass.PublicSettingResponse> getGetPublicSettingMethod() {
    io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.Empty, org.jumpserver.chen.wisp.ServiceOuterClass.PublicSettingResponse> getGetPublicSettingMethod;
    if ((getGetPublicSettingMethod = ServiceGrpc.getGetPublicSettingMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getGetPublicSettingMethod = ServiceGrpc.getGetPublicSettingMethod) == null) {
          ServiceGrpc.getGetPublicSettingMethod = getGetPublicSettingMethod =
              io.grpc.MethodDescriptor.<org.jumpserver.chen.wisp.ServiceOuterClass.Empty, org.jumpserver.chen.wisp.ServiceOuterClass.PublicSettingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPublicSetting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.PublicSettingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("GetPublicSetting"))
              .build();
        }
      }
    }
    return getGetPublicSettingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.Empty,
      org.jumpserver.chen.wisp.ServiceOuterClass.ListenPortResponse> getGetListenPortsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetListenPorts",
      requestType = org.jumpserver.chen.wisp.ServiceOuterClass.Empty.class,
      responseType = org.jumpserver.chen.wisp.ServiceOuterClass.ListenPortResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.Empty,
      org.jumpserver.chen.wisp.ServiceOuterClass.ListenPortResponse> getGetListenPortsMethod() {
    io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.Empty, org.jumpserver.chen.wisp.ServiceOuterClass.ListenPortResponse> getGetListenPortsMethod;
    if ((getGetListenPortsMethod = ServiceGrpc.getGetListenPortsMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getGetListenPortsMethod = ServiceGrpc.getGetListenPortsMethod) == null) {
          ServiceGrpc.getGetListenPortsMethod = getGetListenPortsMethod =
              io.grpc.MethodDescriptor.<org.jumpserver.chen.wisp.ServiceOuterClass.Empty, org.jumpserver.chen.wisp.ServiceOuterClass.ListenPortResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetListenPorts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.ListenPortResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("GetListenPorts"))
              .build();
        }
      }
    }
    return getGetListenPortsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.PortInfoRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.PortInfoResponse> getGetPortInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPortInfo",
      requestType = org.jumpserver.chen.wisp.ServiceOuterClass.PortInfoRequest.class,
      responseType = org.jumpserver.chen.wisp.ServiceOuterClass.PortInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.PortInfoRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.PortInfoResponse> getGetPortInfoMethod() {
    io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.PortInfoRequest, org.jumpserver.chen.wisp.ServiceOuterClass.PortInfoResponse> getGetPortInfoMethod;
    if ((getGetPortInfoMethod = ServiceGrpc.getGetPortInfoMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getGetPortInfoMethod = ServiceGrpc.getGetPortInfoMethod) == null) {
          ServiceGrpc.getGetPortInfoMethod = getGetPortInfoMethod =
              io.grpc.MethodDescriptor.<org.jumpserver.chen.wisp.ServiceOuterClass.PortInfoRequest, org.jumpserver.chen.wisp.ServiceOuterClass.PortInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPortInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.PortInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.PortInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("GetPortInfo"))
              .build();
        }
      }
    }
    return getGetPortInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.PortFailureRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> getHandlePortFailureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandlePortFailure",
      requestType = org.jumpserver.chen.wisp.ServiceOuterClass.PortFailureRequest.class,
      responseType = org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.PortFailureRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> getHandlePortFailureMethod() {
    io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.PortFailureRequest, org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> getHandlePortFailureMethod;
    if ((getHandlePortFailureMethod = ServiceGrpc.getHandlePortFailureMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getHandlePortFailureMethod = ServiceGrpc.getHandlePortFailureMethod) == null) {
          ServiceGrpc.getHandlePortFailureMethod = getHandlePortFailureMethod =
              io.grpc.MethodDescriptor.<org.jumpserver.chen.wisp.ServiceOuterClass.PortFailureRequest, org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HandlePortFailure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.PortFailureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("HandlePortFailure"))
              .build();
        }
      }
    }
    return getHandlePortFailureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.CookiesRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.UserResponse> getCheckUserByCookiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckUserByCookies",
      requestType = org.jumpserver.chen.wisp.ServiceOuterClass.CookiesRequest.class,
      responseType = org.jumpserver.chen.wisp.ServiceOuterClass.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.CookiesRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.UserResponse> getCheckUserByCookiesMethod() {
    io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.CookiesRequest, org.jumpserver.chen.wisp.ServiceOuterClass.UserResponse> getCheckUserByCookiesMethod;
    if ((getCheckUserByCookiesMethod = ServiceGrpc.getCheckUserByCookiesMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getCheckUserByCookiesMethod = ServiceGrpc.getCheckUserByCookiesMethod) == null) {
          ServiceGrpc.getCheckUserByCookiesMethod = getCheckUserByCookiesMethod =
              io.grpc.MethodDescriptor.<org.jumpserver.chen.wisp.ServiceOuterClass.CookiesRequest, org.jumpserver.chen.wisp.ServiceOuterClass.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckUserByCookies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.CookiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("CheckUserByCookies"))
              .build();
        }
      }
    }
    return getCheckUserByCookiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.SessionLifecycleLogRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> getRecordSessionLifecycleLogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecordSessionLifecycleLog",
      requestType = org.jumpserver.chen.wisp.ServiceOuterClass.SessionLifecycleLogRequest.class,
      responseType = org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.SessionLifecycleLogRequest,
      org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> getRecordSessionLifecycleLogMethod() {
    io.grpc.MethodDescriptor<org.jumpserver.chen.wisp.ServiceOuterClass.SessionLifecycleLogRequest, org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> getRecordSessionLifecycleLogMethod;
    if ((getRecordSessionLifecycleLogMethod = ServiceGrpc.getRecordSessionLifecycleLogMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getRecordSessionLifecycleLogMethod = ServiceGrpc.getRecordSessionLifecycleLogMethod) == null) {
          ServiceGrpc.getRecordSessionLifecycleLogMethod = getRecordSessionLifecycleLogMethod =
              io.grpc.MethodDescriptor.<org.jumpserver.chen.wisp.ServiceOuterClass.SessionLifecycleLogRequest, org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecordSessionLifecycleLog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.SessionLifecycleLogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("RecordSessionLifecycleLog"))
              .build();
        }
      }
    }
    return getRecordSessionLifecycleLogMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceStub>() {
        @java.lang.Override
        public ServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceStub(channel, callOptions);
        }
      };
    return ServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceBlockingStub>() {
        @java.lang.Override
        public ServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceBlockingStub(channel, callOptions);
        }
      };
    return ServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceFutureStub>() {
        @java.lang.Override
        public ServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceFutureStub(channel, callOptions);
        }
      };
    return ServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getTokenAuthInfo(org.jumpserver.chen.wisp.ServiceOuterClass.TokenRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.TokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTokenAuthInfoMethod(), responseObserver);
    }

    /**
     */
    default void renewToken(org.jumpserver.chen.wisp.ServiceOuterClass.TokenRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRenewTokenMethod(), responseObserver);
    }

    /**
     */
    default void createSession(org.jumpserver.chen.wisp.ServiceOuterClass.SessionCreateRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.SessionCreateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSessionMethod(), responseObserver);
    }

    /**
     */
    default void finishSession(org.jumpserver.chen.wisp.ServiceOuterClass.SessionFinishRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.SessionFinishResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFinishSessionMethod(), responseObserver);
    }

    /**
     */
    default void uploadReplayFile(org.jumpserver.chen.wisp.ServiceOuterClass.ReplayRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.ReplayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadReplayFileMethod(), responseObserver);
    }

    /**
     */
    default void uploadCommand(org.jumpserver.chen.wisp.ServiceOuterClass.CommandRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.CommandResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadCommandMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.FinishedTaskRequest> dispatchTask(
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.TaskResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getDispatchTaskMethod(), responseObserver);
    }

    /**
     */
    default void scanRemainReplays(org.jumpserver.chen.wisp.ServiceOuterClass.RemainReplayRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.RemainReplayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScanRemainReplaysMethod(), responseObserver);
    }

    /**
     */
    default void createCommandTicket(org.jumpserver.chen.wisp.ServiceOuterClass.CommandConfirmRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.CommandConfirmResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCommandTicketMethod(), responseObserver);
    }

    /**
     */
    default void checkOrCreateAssetLoginTicket(org.jumpserver.chen.wisp.ServiceOuterClass.AssetLoginTicketRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.AssetLoginTicketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckOrCreateAssetLoginTicketMethod(), responseObserver);
    }

    /**
     */
    default void checkTicketState(org.jumpserver.chen.wisp.ServiceOuterClass.TicketRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.TicketStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckTicketStateMethod(), responseObserver);
    }

    /**
     */
    default void cancelTicket(org.jumpserver.chen.wisp.ServiceOuterClass.TicketRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelTicketMethod(), responseObserver);
    }

    /**
     */
    default void createForward(org.jumpserver.chen.wisp.ServiceOuterClass.ForwardRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.ForwardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateForwardMethod(), responseObserver);
    }

    /**
     */
    default void deleteForward(org.jumpserver.chen.wisp.ServiceOuterClass.ForwardDeleteRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteForwardMethod(), responseObserver);
    }

    /**
     */
    default void getPublicSetting(org.jumpserver.chen.wisp.ServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.PublicSettingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPublicSettingMethod(), responseObserver);
    }

    /**
     */
    default void getListenPorts(org.jumpserver.chen.wisp.ServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.ListenPortResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetListenPortsMethod(), responseObserver);
    }

    /**
     */
    default void getPortInfo(org.jumpserver.chen.wisp.ServiceOuterClass.PortInfoRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.PortInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPortInfoMethod(), responseObserver);
    }

    /**
     */
    default void handlePortFailure(org.jumpserver.chen.wisp.ServiceOuterClass.PortFailureRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHandlePortFailureMethod(), responseObserver);
    }

    /**
     */
    default void checkUserByCookies(org.jumpserver.chen.wisp.ServiceOuterClass.CookiesRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckUserByCookiesMethod(), responseObserver);
    }

    /**
     */
    default void recordSessionLifecycleLog(org.jumpserver.chen.wisp.ServiceOuterClass.SessionLifecycleLogRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecordSessionLifecycleLogMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Service.
   */
  public static abstract class ServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Service.
   */
  public static final class ServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ServiceStub> {
    private ServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceStub(channel, callOptions);
    }

    /**
     */
    public void getTokenAuthInfo(org.jumpserver.chen.wisp.ServiceOuterClass.TokenRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.TokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTokenAuthInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void renewToken(org.jumpserver.chen.wisp.ServiceOuterClass.TokenRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRenewTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createSession(org.jumpserver.chen.wisp.ServiceOuterClass.SessionCreateRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.SessionCreateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void finishSession(org.jumpserver.chen.wisp.ServiceOuterClass.SessionFinishRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.SessionFinishResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFinishSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void uploadReplayFile(org.jumpserver.chen.wisp.ServiceOuterClass.ReplayRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.ReplayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadReplayFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void uploadCommand(org.jumpserver.chen.wisp.ServiceOuterClass.CommandRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.CommandResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadCommandMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.FinishedTaskRequest> dispatchTask(
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.TaskResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getDispatchTaskMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void scanRemainReplays(org.jumpserver.chen.wisp.ServiceOuterClass.RemainReplayRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.RemainReplayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScanRemainReplaysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createCommandTicket(org.jumpserver.chen.wisp.ServiceOuterClass.CommandConfirmRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.CommandConfirmResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCommandTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkOrCreateAssetLoginTicket(org.jumpserver.chen.wisp.ServiceOuterClass.AssetLoginTicketRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.AssetLoginTicketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckOrCreateAssetLoginTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkTicketState(org.jumpserver.chen.wisp.ServiceOuterClass.TicketRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.TicketStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckTicketStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelTicket(org.jumpserver.chen.wisp.ServiceOuterClass.TicketRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createForward(org.jumpserver.chen.wisp.ServiceOuterClass.ForwardRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.ForwardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateForwardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteForward(org.jumpserver.chen.wisp.ServiceOuterClass.ForwardDeleteRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteForwardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPublicSetting(org.jumpserver.chen.wisp.ServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.PublicSettingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPublicSettingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListenPorts(org.jumpserver.chen.wisp.ServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.ListenPortResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetListenPortsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPortInfo(org.jumpserver.chen.wisp.ServiceOuterClass.PortInfoRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.PortInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPortInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void handlePortFailure(org.jumpserver.chen.wisp.ServiceOuterClass.PortFailureRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHandlePortFailureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkUserByCookies(org.jumpserver.chen.wisp.ServiceOuterClass.CookiesRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckUserByCookiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void recordSessionLifecycleLog(org.jumpserver.chen.wisp.ServiceOuterClass.SessionLifecycleLogRequest request,
        io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecordSessionLifecycleLogMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Service.
   */
  public static final class ServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ServiceBlockingStub> {
    private ServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.jumpserver.chen.wisp.ServiceOuterClass.TokenResponse getTokenAuthInfo(org.jumpserver.chen.wisp.ServiceOuterClass.TokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTokenAuthInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse renewToken(org.jumpserver.chen.wisp.ServiceOuterClass.TokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRenewTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.jumpserver.chen.wisp.ServiceOuterClass.SessionCreateResponse createSession(org.jumpserver.chen.wisp.ServiceOuterClass.SessionCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.jumpserver.chen.wisp.ServiceOuterClass.SessionFinishResp finishSession(org.jumpserver.chen.wisp.ServiceOuterClass.SessionFinishRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFinishSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.jumpserver.chen.wisp.ServiceOuterClass.ReplayResponse uploadReplayFile(org.jumpserver.chen.wisp.ServiceOuterClass.ReplayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadReplayFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.jumpserver.chen.wisp.ServiceOuterClass.CommandResponse uploadCommand(org.jumpserver.chen.wisp.ServiceOuterClass.CommandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadCommandMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.jumpserver.chen.wisp.ServiceOuterClass.RemainReplayResponse scanRemainReplays(org.jumpserver.chen.wisp.ServiceOuterClass.RemainReplayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScanRemainReplaysMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.jumpserver.chen.wisp.ServiceOuterClass.CommandConfirmResponse createCommandTicket(org.jumpserver.chen.wisp.ServiceOuterClass.CommandConfirmRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCommandTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.jumpserver.chen.wisp.ServiceOuterClass.AssetLoginTicketResponse checkOrCreateAssetLoginTicket(org.jumpserver.chen.wisp.ServiceOuterClass.AssetLoginTicketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckOrCreateAssetLoginTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.jumpserver.chen.wisp.ServiceOuterClass.TicketStateResponse checkTicketState(org.jumpserver.chen.wisp.ServiceOuterClass.TicketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckTicketStateMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse cancelTicket(org.jumpserver.chen.wisp.ServiceOuterClass.TicketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.jumpserver.chen.wisp.ServiceOuterClass.ForwardResponse createForward(org.jumpserver.chen.wisp.ServiceOuterClass.ForwardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateForwardMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse deleteForward(org.jumpserver.chen.wisp.ServiceOuterClass.ForwardDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteForwardMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.jumpserver.chen.wisp.ServiceOuterClass.PublicSettingResponse getPublicSetting(org.jumpserver.chen.wisp.ServiceOuterClass.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPublicSettingMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.jumpserver.chen.wisp.ServiceOuterClass.ListenPortResponse getListenPorts(org.jumpserver.chen.wisp.ServiceOuterClass.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetListenPortsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.jumpserver.chen.wisp.ServiceOuterClass.PortInfoResponse getPortInfo(org.jumpserver.chen.wisp.ServiceOuterClass.PortInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPortInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse handlePortFailure(org.jumpserver.chen.wisp.ServiceOuterClass.PortFailureRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHandlePortFailureMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.jumpserver.chen.wisp.ServiceOuterClass.UserResponse checkUserByCookies(org.jumpserver.chen.wisp.ServiceOuterClass.CookiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckUserByCookiesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse recordSessionLifecycleLog(org.jumpserver.chen.wisp.ServiceOuterClass.SessionLifecycleLogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecordSessionLifecycleLogMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Service.
   */
  public static final class ServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ServiceFutureStub> {
    private ServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.jumpserver.chen.wisp.ServiceOuterClass.TokenResponse> getTokenAuthInfo(
        org.jumpserver.chen.wisp.ServiceOuterClass.TokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTokenAuthInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> renewToken(
        org.jumpserver.chen.wisp.ServiceOuterClass.TokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRenewTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.jumpserver.chen.wisp.ServiceOuterClass.SessionCreateResponse> createSession(
        org.jumpserver.chen.wisp.ServiceOuterClass.SessionCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.jumpserver.chen.wisp.ServiceOuterClass.SessionFinishResp> finishSession(
        org.jumpserver.chen.wisp.ServiceOuterClass.SessionFinishRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFinishSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.jumpserver.chen.wisp.ServiceOuterClass.ReplayResponse> uploadReplayFile(
        org.jumpserver.chen.wisp.ServiceOuterClass.ReplayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadReplayFileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.jumpserver.chen.wisp.ServiceOuterClass.CommandResponse> uploadCommand(
        org.jumpserver.chen.wisp.ServiceOuterClass.CommandRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadCommandMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.jumpserver.chen.wisp.ServiceOuterClass.RemainReplayResponse> scanRemainReplays(
        org.jumpserver.chen.wisp.ServiceOuterClass.RemainReplayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScanRemainReplaysMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.jumpserver.chen.wisp.ServiceOuterClass.CommandConfirmResponse> createCommandTicket(
        org.jumpserver.chen.wisp.ServiceOuterClass.CommandConfirmRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCommandTicketMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.jumpserver.chen.wisp.ServiceOuterClass.AssetLoginTicketResponse> checkOrCreateAssetLoginTicket(
        org.jumpserver.chen.wisp.ServiceOuterClass.AssetLoginTicketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckOrCreateAssetLoginTicketMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.jumpserver.chen.wisp.ServiceOuterClass.TicketStateResponse> checkTicketState(
        org.jumpserver.chen.wisp.ServiceOuterClass.TicketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckTicketStateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> cancelTicket(
        org.jumpserver.chen.wisp.ServiceOuterClass.TicketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelTicketMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.jumpserver.chen.wisp.ServiceOuterClass.ForwardResponse> createForward(
        org.jumpserver.chen.wisp.ServiceOuterClass.ForwardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateForwardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> deleteForward(
        org.jumpserver.chen.wisp.ServiceOuterClass.ForwardDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteForwardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.jumpserver.chen.wisp.ServiceOuterClass.PublicSettingResponse> getPublicSetting(
        org.jumpserver.chen.wisp.ServiceOuterClass.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPublicSettingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.jumpserver.chen.wisp.ServiceOuterClass.ListenPortResponse> getListenPorts(
        org.jumpserver.chen.wisp.ServiceOuterClass.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetListenPortsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.jumpserver.chen.wisp.ServiceOuterClass.PortInfoResponse> getPortInfo(
        org.jumpserver.chen.wisp.ServiceOuterClass.PortInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPortInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> handlePortFailure(
        org.jumpserver.chen.wisp.ServiceOuterClass.PortFailureRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHandlePortFailureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.jumpserver.chen.wisp.ServiceOuterClass.UserResponse> checkUserByCookies(
        org.jumpserver.chen.wisp.ServiceOuterClass.CookiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckUserByCookiesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse> recordSessionLifecycleLog(
        org.jumpserver.chen.wisp.ServiceOuterClass.SessionLifecycleLogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecordSessionLifecycleLogMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TOKEN_AUTH_INFO = 0;
  private static final int METHODID_RENEW_TOKEN = 1;
  private static final int METHODID_CREATE_SESSION = 2;
  private static final int METHODID_FINISH_SESSION = 3;
  private static final int METHODID_UPLOAD_REPLAY_FILE = 4;
  private static final int METHODID_UPLOAD_COMMAND = 5;
  private static final int METHODID_SCAN_REMAIN_REPLAYS = 6;
  private static final int METHODID_CREATE_COMMAND_TICKET = 7;
  private static final int METHODID_CHECK_OR_CREATE_ASSET_LOGIN_TICKET = 8;
  private static final int METHODID_CHECK_TICKET_STATE = 9;
  private static final int METHODID_CANCEL_TICKET = 10;
  private static final int METHODID_CREATE_FORWARD = 11;
  private static final int METHODID_DELETE_FORWARD = 12;
  private static final int METHODID_GET_PUBLIC_SETTING = 13;
  private static final int METHODID_GET_LISTEN_PORTS = 14;
  private static final int METHODID_GET_PORT_INFO = 15;
  private static final int METHODID_HANDLE_PORT_FAILURE = 16;
  private static final int METHODID_CHECK_USER_BY_COOKIES = 17;
  private static final int METHODID_RECORD_SESSION_LIFECYCLE_LOG = 18;
  private static final int METHODID_DISPATCH_TASK = 19;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TOKEN_AUTH_INFO:
          serviceImpl.getTokenAuthInfo((org.jumpserver.chen.wisp.ServiceOuterClass.TokenRequest) request,
              (io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.TokenResponse>) responseObserver);
          break;
        case METHODID_RENEW_TOKEN:
          serviceImpl.renewToken((org.jumpserver.chen.wisp.ServiceOuterClass.TokenRequest) request,
              (io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse>) responseObserver);
          break;
        case METHODID_CREATE_SESSION:
          serviceImpl.createSession((org.jumpserver.chen.wisp.ServiceOuterClass.SessionCreateRequest) request,
              (io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.SessionCreateResponse>) responseObserver);
          break;
        case METHODID_FINISH_SESSION:
          serviceImpl.finishSession((org.jumpserver.chen.wisp.ServiceOuterClass.SessionFinishRequest) request,
              (io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.SessionFinishResp>) responseObserver);
          break;
        case METHODID_UPLOAD_REPLAY_FILE:
          serviceImpl.uploadReplayFile((org.jumpserver.chen.wisp.ServiceOuterClass.ReplayRequest) request,
              (io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.ReplayResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_COMMAND:
          serviceImpl.uploadCommand((org.jumpserver.chen.wisp.ServiceOuterClass.CommandRequest) request,
              (io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.CommandResponse>) responseObserver);
          break;
        case METHODID_SCAN_REMAIN_REPLAYS:
          serviceImpl.scanRemainReplays((org.jumpserver.chen.wisp.ServiceOuterClass.RemainReplayRequest) request,
              (io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.RemainReplayResponse>) responseObserver);
          break;
        case METHODID_CREATE_COMMAND_TICKET:
          serviceImpl.createCommandTicket((org.jumpserver.chen.wisp.ServiceOuterClass.CommandConfirmRequest) request,
              (io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.CommandConfirmResponse>) responseObserver);
          break;
        case METHODID_CHECK_OR_CREATE_ASSET_LOGIN_TICKET:
          serviceImpl.checkOrCreateAssetLoginTicket((org.jumpserver.chen.wisp.ServiceOuterClass.AssetLoginTicketRequest) request,
              (io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.AssetLoginTicketResponse>) responseObserver);
          break;
        case METHODID_CHECK_TICKET_STATE:
          serviceImpl.checkTicketState((org.jumpserver.chen.wisp.ServiceOuterClass.TicketRequest) request,
              (io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.TicketStateResponse>) responseObserver);
          break;
        case METHODID_CANCEL_TICKET:
          serviceImpl.cancelTicket((org.jumpserver.chen.wisp.ServiceOuterClass.TicketRequest) request,
              (io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse>) responseObserver);
          break;
        case METHODID_CREATE_FORWARD:
          serviceImpl.createForward((org.jumpserver.chen.wisp.ServiceOuterClass.ForwardRequest) request,
              (io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.ForwardResponse>) responseObserver);
          break;
        case METHODID_DELETE_FORWARD:
          serviceImpl.deleteForward((org.jumpserver.chen.wisp.ServiceOuterClass.ForwardDeleteRequest) request,
              (io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse>) responseObserver);
          break;
        case METHODID_GET_PUBLIC_SETTING:
          serviceImpl.getPublicSetting((org.jumpserver.chen.wisp.ServiceOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.PublicSettingResponse>) responseObserver);
          break;
        case METHODID_GET_LISTEN_PORTS:
          serviceImpl.getListenPorts((org.jumpserver.chen.wisp.ServiceOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.ListenPortResponse>) responseObserver);
          break;
        case METHODID_GET_PORT_INFO:
          serviceImpl.getPortInfo((org.jumpserver.chen.wisp.ServiceOuterClass.PortInfoRequest) request,
              (io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.PortInfoResponse>) responseObserver);
          break;
        case METHODID_HANDLE_PORT_FAILURE:
          serviceImpl.handlePortFailure((org.jumpserver.chen.wisp.ServiceOuterClass.PortFailureRequest) request,
              (io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse>) responseObserver);
          break;
        case METHODID_CHECK_USER_BY_COOKIES:
          serviceImpl.checkUserByCookies((org.jumpserver.chen.wisp.ServiceOuterClass.CookiesRequest) request,
              (io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.UserResponse>) responseObserver);
          break;
        case METHODID_RECORD_SESSION_LIFECYCLE_LOG:
          serviceImpl.recordSessionLifecycleLog((org.jumpserver.chen.wisp.ServiceOuterClass.SessionLifecycleLogRequest) request,
              (io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse>) responseObserver);
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
        case METHODID_DISPATCH_TASK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.dispatchTask(
              (io.grpc.stub.StreamObserver<org.jumpserver.chen.wisp.ServiceOuterClass.TaskResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetTokenAuthInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.jumpserver.chen.wisp.ServiceOuterClass.TokenRequest,
              org.jumpserver.chen.wisp.ServiceOuterClass.TokenResponse>(
                service, METHODID_GET_TOKEN_AUTH_INFO)))
        .addMethod(
          getRenewTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.jumpserver.chen.wisp.ServiceOuterClass.TokenRequest,
              org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse>(
                service, METHODID_RENEW_TOKEN)))
        .addMethod(
          getCreateSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.jumpserver.chen.wisp.ServiceOuterClass.SessionCreateRequest,
              org.jumpserver.chen.wisp.ServiceOuterClass.SessionCreateResponse>(
                service, METHODID_CREATE_SESSION)))
        .addMethod(
          getFinishSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.jumpserver.chen.wisp.ServiceOuterClass.SessionFinishRequest,
              org.jumpserver.chen.wisp.ServiceOuterClass.SessionFinishResp>(
                service, METHODID_FINISH_SESSION)))
        .addMethod(
          getUploadReplayFileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.jumpserver.chen.wisp.ServiceOuterClass.ReplayRequest,
              org.jumpserver.chen.wisp.ServiceOuterClass.ReplayResponse>(
                service, METHODID_UPLOAD_REPLAY_FILE)))
        .addMethod(
          getUploadCommandMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.jumpserver.chen.wisp.ServiceOuterClass.CommandRequest,
              org.jumpserver.chen.wisp.ServiceOuterClass.CommandResponse>(
                service, METHODID_UPLOAD_COMMAND)))
        .addMethod(
          getDispatchTaskMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              org.jumpserver.chen.wisp.ServiceOuterClass.FinishedTaskRequest,
              org.jumpserver.chen.wisp.ServiceOuterClass.TaskResponse>(
                service, METHODID_DISPATCH_TASK)))
        .addMethod(
          getScanRemainReplaysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.jumpserver.chen.wisp.ServiceOuterClass.RemainReplayRequest,
              org.jumpserver.chen.wisp.ServiceOuterClass.RemainReplayResponse>(
                service, METHODID_SCAN_REMAIN_REPLAYS)))
        .addMethod(
          getCreateCommandTicketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.jumpserver.chen.wisp.ServiceOuterClass.CommandConfirmRequest,
              org.jumpserver.chen.wisp.ServiceOuterClass.CommandConfirmResponse>(
                service, METHODID_CREATE_COMMAND_TICKET)))
        .addMethod(
          getCheckOrCreateAssetLoginTicketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.jumpserver.chen.wisp.ServiceOuterClass.AssetLoginTicketRequest,
              org.jumpserver.chen.wisp.ServiceOuterClass.AssetLoginTicketResponse>(
                service, METHODID_CHECK_OR_CREATE_ASSET_LOGIN_TICKET)))
        .addMethod(
          getCheckTicketStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.jumpserver.chen.wisp.ServiceOuterClass.TicketRequest,
              org.jumpserver.chen.wisp.ServiceOuterClass.TicketStateResponse>(
                service, METHODID_CHECK_TICKET_STATE)))
        .addMethod(
          getCancelTicketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.jumpserver.chen.wisp.ServiceOuterClass.TicketRequest,
              org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse>(
                service, METHODID_CANCEL_TICKET)))
        .addMethod(
          getCreateForwardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.jumpserver.chen.wisp.ServiceOuterClass.ForwardRequest,
              org.jumpserver.chen.wisp.ServiceOuterClass.ForwardResponse>(
                service, METHODID_CREATE_FORWARD)))
        .addMethod(
          getDeleteForwardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.jumpserver.chen.wisp.ServiceOuterClass.ForwardDeleteRequest,
              org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse>(
                service, METHODID_DELETE_FORWARD)))
        .addMethod(
          getGetPublicSettingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.jumpserver.chen.wisp.ServiceOuterClass.Empty,
              org.jumpserver.chen.wisp.ServiceOuterClass.PublicSettingResponse>(
                service, METHODID_GET_PUBLIC_SETTING)))
        .addMethod(
          getGetListenPortsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.jumpserver.chen.wisp.ServiceOuterClass.Empty,
              org.jumpserver.chen.wisp.ServiceOuterClass.ListenPortResponse>(
                service, METHODID_GET_LISTEN_PORTS)))
        .addMethod(
          getGetPortInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.jumpserver.chen.wisp.ServiceOuterClass.PortInfoRequest,
              org.jumpserver.chen.wisp.ServiceOuterClass.PortInfoResponse>(
                service, METHODID_GET_PORT_INFO)))
        .addMethod(
          getHandlePortFailureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.jumpserver.chen.wisp.ServiceOuterClass.PortFailureRequest,
              org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse>(
                service, METHODID_HANDLE_PORT_FAILURE)))
        .addMethod(
          getCheckUserByCookiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.jumpserver.chen.wisp.ServiceOuterClass.CookiesRequest,
              org.jumpserver.chen.wisp.ServiceOuterClass.UserResponse>(
                service, METHODID_CHECK_USER_BY_COOKIES)))
        .addMethod(
          getRecordSessionLifecycleLogMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.jumpserver.chen.wisp.ServiceOuterClass.SessionLifecycleLogRequest,
              org.jumpserver.chen.wisp.ServiceOuterClass.StatusResponse>(
                service, METHODID_RECORD_SESSION_LIFECYCLE_LOG)))
        .build();
  }

  private static abstract class ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.jumpserver.chen.wisp.ServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service");
    }
  }

  private static final class ServiceFileDescriptorSupplier
      extends ServiceBaseDescriptorSupplier {
    ServiceFileDescriptorSupplier() {}
  }

  private static final class ServiceMethodDescriptorSupplier
      extends ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceFileDescriptorSupplier())
              .addMethod(getGetTokenAuthInfoMethod())
              .addMethod(getRenewTokenMethod())
              .addMethod(getCreateSessionMethod())
              .addMethod(getFinishSessionMethod())
              .addMethod(getUploadReplayFileMethod())
              .addMethod(getUploadCommandMethod())
              .addMethod(getDispatchTaskMethod())
              .addMethod(getScanRemainReplaysMethod())
              .addMethod(getCreateCommandTicketMethod())
              .addMethod(getCheckOrCreateAssetLoginTicketMethod())
              .addMethod(getCheckTicketStateMethod())
              .addMethod(getCancelTicketMethod())
              .addMethod(getCreateForwardMethod())
              .addMethod(getDeleteForwardMethod())
              .addMethod(getGetPublicSettingMethod())
              .addMethod(getGetListenPortsMethod())
              .addMethod(getGetPortInfoMethod())
              .addMethod(getHandlePortFailureMethod())
              .addMethod(getCheckUserByCookiesMethod())
              .addMethod(getRecordSessionLifecycleLogMethod())
              .build();
        }
      }
    }
    return result;
  }
}
