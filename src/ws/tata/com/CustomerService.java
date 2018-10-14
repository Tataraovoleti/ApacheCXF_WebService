package ws.tata.com;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "CustomerService", targetNamespace = "http://com.tata.ws/")
public interface CustomerService {

	@WebMethod(operationName = "getName", action = "urn:GetName")
	@RequestWrapper(className = "ws.tata.com.jaxws.GetName", localName = "getName", targetNamespace = "http://com.tata.ws/")
	@ResponseWrapper(className = "ws.tata.com.jaxws.GetNameResponse", localName = "getNameResponse", targetNamespace = "http://com.tata.ws/")
	@WebResult(name = "return")
	String getName(String s);
	@WebMethod(operationName = "add", action = "urn:Add")
	@RequestWrapper(className = "ws.tata.com.jaxws.Add", localName = "add", targetNamespace = "http://com.tata.ws/")
	@ResponseWrapper(className = "ws.tata.com.jaxws.AddResponse", localName = "addResponse", targetNamespace = "http://com.tata.ws/")
	@WebResult(name = "return")
	int add(int a, int b);
	@WebMethod(operationName = "sub", action = "urn:Sub")
	@RequestWrapper(className = "ws.tata.com.jaxws.Sub", localName = "sub", targetNamespace = "http://com.tata.ws/")
	@ResponseWrapper(className = "ws.tata.com.jaxws.SubResponse", localName = "subResponse", targetNamespace = "http://com.tata.ws/")
	@WebResult(name = "return")
	int sub(int a, int b);

}