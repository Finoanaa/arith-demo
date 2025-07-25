package com.finoana.arith.handler;

import com.amazonaws.serverless.exceptions.ContainerInitializationException;
import com.amazonaws.serverless.proxy.model.AwsProxyResponse;
import com.amazonaws.serverless.proxy.model.HttpApiV2ProxyRequest;
import com.amazonaws.serverless.proxy.spring.SpringBootLambdaContainerHandler;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.finoana.arith.PojaApplication;
import com.finoana.arith.PojaGenerated;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@PojaGenerated
public class LambdaHandler implements RequestStreamHandler {
  private static final SpringBootLambdaContainerHandler<HttpApiV2ProxyRequest, AwsProxyResponse>
      handler;

  static {
    try {
      handler = SpringBootLambdaContainerHandler.getHttpApiV2ProxyHandler(PojaApplication.class);
    } catch (ContainerInitializationException e) {
      throw new RuntimeException("Initialization of Spring Boot Application failed", e);
    }
  }

  @Override
  public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context)
      throws IOException {
    handler.proxyStream(inputStream, outputStream, context);
  }
}
