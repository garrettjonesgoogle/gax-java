/*
 * Copyright 2017, Google Inc. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 *     * Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above
 * copyright notice, this list of conditions and the following disclaimer
 * in the documentation and/or other materials provided with the
 * distribution.
 *     * Neither the name of Google Inc. nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.google.longrunning.stub;

import static com.google.longrunning.PagedResponseWrappers.ListOperationsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcCallableFactory;
import com.google.api.gax.grpc.GrpcTransportDescriptor;
import com.google.api.gax.rpc.CallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.longrunning.CancelOperationRequest;
import com.google.longrunning.DeleteOperationRequest;
import com.google.longrunning.GetOperationRequest;
import com.google.longrunning.ListOperationsRequest;
import com.google.longrunning.ListOperationsResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.OperationsSettings;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@Generated("by GAPIC v0.0.5")
@BetaApi
public class GrpcOperationsStub extends OperationsStub {
  private static final CallableFactory callableFactory =
      CallableFactory.create(GrpcTransportDescriptor.create());

  private static final MethodDescriptor<GetOperationRequest, Operation>
      getOperationMethodDescriptor =
          MethodDescriptor.<GetOperationRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.longrunning.Operations/GetOperation")
              .setRequestMarshaller(ProtoUtils.marshaller(GetOperationRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<ListOperationsRequest, ListOperationsResponse>
      listOperationsMethodDescriptor =
          MethodDescriptor.<ListOperationsRequest, ListOperationsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.longrunning.Operations/ListOperations")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListOperationsResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<CancelOperationRequest, Empty>
      cancelOperationMethodDescriptor =
          MethodDescriptor.<CancelOperationRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.longrunning.Operations/CancelOperation")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CancelOperationRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<DeleteOperationRequest, Empty>
      deleteOperationMethodDescriptor =
          MethodDescriptor.<DeleteOperationRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.longrunning.Operations/DeleteOperation")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteOperationRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();
  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetOperationRequest, Operation> getOperationCallable;
  private final UnaryCallable<ListOperationsRequest, ListOperationsResponse> listOperationsCallable;
  private final UnaryCallable<ListOperationsRequest, ListOperationsPagedResponse>
      listOperationsPagedCallable;
  private final UnaryCallable<CancelOperationRequest, Empty> cancelOperationCallable;
  private final UnaryCallable<DeleteOperationRequest, Empty> deleteOperationCallable;

  public static final GrpcOperationsStub create(OperationsSettings settings) throws IOException {
    return new GrpcOperationsStub(settings, ClientContext.create(settings));
  }

  public static final GrpcOperationsStub create(ClientContext clientContext) throws IOException {
    return new GrpcOperationsStub(OperationsSettings.defaultBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of GrpcOperationsStub, using the given settings. This is protected so
   * that it easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected GrpcOperationsStub(OperationsSettings settings, ClientContext clientContext)
      throws IOException {

    GrpcCallSettings<GetOperationRequest, Operation> getOperationGrpcSettings =
        GrpcCallSettings.<GetOperationRequest, Operation>newBuilder()
            .setMethodDescriptor(getOperationMethodDescriptor)
            .build();
    UnaryCallable<GetOperationRequest, Operation> getOperationBaseCallable =
        GrpcCallableFactory.createUnaryCallable(
            getOperationGrpcSettings, settings.getOperationSettings(), clientContext);
    this.getOperationCallable =
        callableFactory.create(
            getOperationBaseCallable, settings.getOperationSettings(), clientContext);
    GrpcCallSettings<ListOperationsRequest, ListOperationsResponse> listOperationsGrpcSettings =
        GrpcCallSettings.<ListOperationsRequest, ListOperationsResponse>newBuilder()
            .setMethodDescriptor(listOperationsMethodDescriptor)
            .build();
    UnaryCallable<ListOperationsRequest, ListOperationsResponse> listOperationsBaseCallable =
        GrpcCallableFactory.createUnaryCallable(
            listOperationsGrpcSettings, settings.listOperationsSettings(), clientContext);
    this.listOperationsCallable =
        callableFactory.create(
            listOperationsBaseCallable, settings.listOperationsSettings(), clientContext);
    this.listOperationsPagedCallable =
        callableFactory.createPagedVariant(
            listOperationsBaseCallable, settings.listOperationsSettings(), clientContext);
    GrpcCallSettings<CancelOperationRequest, Empty> cancelOperationGrpcSettings =
        GrpcCallSettings.<CancelOperationRequest, Empty>newBuilder()
            .setMethodDescriptor(cancelOperationMethodDescriptor)
            .build();
    UnaryCallable<CancelOperationRequest, Empty> cancelOperationBaseCallable =
        GrpcCallableFactory.createUnaryCallable(
            cancelOperationGrpcSettings, settings.cancelOperationSettings(), clientContext);
    this.cancelOperationCallable =
        callableFactory.create(
            cancelOperationBaseCallable, settings.cancelOperationSettings(), clientContext);
    GrpcCallSettings<DeleteOperationRequest, Empty> deleteOperationGrpcSettings =
        GrpcCallSettings.<DeleteOperationRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteOperationMethodDescriptor)
            .build();
    UnaryCallable<DeleteOperationRequest, Empty> deleteOperationBaseCallable =
        GrpcCallableFactory.createUnaryCallable(
            deleteOperationGrpcSettings, settings.deleteOperationSettings(), clientContext);
    this.deleteOperationCallable =
        callableFactory.create(
            deleteOperationBaseCallable, settings.deleteOperationSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetOperationRequest, Operation> getOperationCallable() {
    return getOperationCallable;
  }

  public UnaryCallable<ListOperationsRequest, ListOperationsPagedResponse>
      listOperationsPagedCallable() {
    return listOperationsPagedCallable;
  }

  public UnaryCallable<ListOperationsRequest, ListOperationsResponse> listOperationsCallable() {
    return listOperationsCallable;
  }

  public UnaryCallable<CancelOperationRequest, Empty> cancelOperationCallable() {
    return cancelOperationCallable;
  }

  public UnaryCallable<DeleteOperationRequest, Empty> deleteOperationCallable() {
    return deleteOperationCallable;
  }

  /**
   * Initiates an orderly shutdown in which preexisting calls continue but new calls are immediately
   * cancelled.
   */
  @Override
  public final void close() throws Exception {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
