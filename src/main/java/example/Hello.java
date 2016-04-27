package example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Hello implements RequestHandler {
	@Override
	public Object handleRequest(Object input, Context context) {
		context.getLogger().log("" + input);
		return "DONE - handle request";
	}

	public Object handlePojo(Object input, Context context){
		context.getLogger().log("" + input);
		return "DONE - handle pojo";
	}
}
