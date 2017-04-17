package ws.tata.com;

import javax.jws.WebService;

@WebService(targetNamespace = "http://com.tata.ws/", endpointInterface = "ws.tata.com.CustomerService", portName = "CustomerServiceImplPort", serviceName = "CustomerServiceImplService")
public class CustomerServiceImpl implements CustomerService{

	public String getName(String s) {
		
		return s;
	}

}
