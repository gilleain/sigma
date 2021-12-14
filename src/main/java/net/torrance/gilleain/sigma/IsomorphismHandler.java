package net.torrance.gilleain.sigma;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class IsomorphismHandler implements RequestHandler<GraphPair, IsomorphismResult> {

  public IsomorphismResult handleRequest(GraphPair event, Context context) {
    LambdaLogger logger = context.getLogger();
    logger.log("Isomorphism : " + event.getGraphA() + " vs " + event.getGraphB());
    SimpleGraph graphA = new SimpleGraph(event.getGraphA());
    SimpleGraph graphB = new SimpleGraph(event.getGraphB());

    return new IsomorphismTester().test(graphA, graphB);
  }

}

