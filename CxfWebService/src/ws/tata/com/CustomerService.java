package ws.tata.com;

import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "CustomerService", targetNamespace = "http://com.tata.ws/")
public interface CustomerService {

	@RequestWrapper(className = "ws.tata.com.jaxws.GetName", localName = "getName", targetNamespace = "http://com.tata.ws/")
	@ResponseWrapper(className = "ws.tata.com.jaxws.GetNameResponse", localName = "getNameResponse", targetNamespace = "http://com.tata.ws/")
	@WebResult(name = "return")
	String getName(String s);

}