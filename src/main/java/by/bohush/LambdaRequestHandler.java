package by.bohush;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Hello world!
 *
 */
public class LambdaRequestHandler implements RequestHandler<LambdaRequest, String> {
    @Override
    public String handleRequest(LambdaRequest request, Context context) {
        return "Hello, " + request.getName();
    }
}
