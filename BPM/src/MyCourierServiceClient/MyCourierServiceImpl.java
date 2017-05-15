
package MyCourierServiceClient;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MyCourierServiceImpl", targetNamespace = "http://MyCourierService/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MyCourierServiceImpl {


    /**
     * 
     * @return
     *     returns java.util.List<MyCourierServiceClient.Courier>
     * @throws MalformedURLException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCouriers", targetNamespace = "http://MyCourierService/", className = "MyCourierServiceClient.GetCouriers")
    @ResponseWrapper(localName = "getCouriersResponse", targetNamespace = "http://MyCourierService/", className = "MyCourierServiceClient.GetCouriersResponse")
    @Action(input = "http://MyCourierService/MyCourierServiceImpl/getCouriersRequest", output = "http://MyCourierService/MyCourierServiceImpl/getCouriersResponse", fault = {
        @FaultAction(className = MalformedURLException_Exception.class, value = "http://MyCourierService/MyCourierServiceImpl/getCouriers/Fault/MalformedURLException")
    })
    public List<Courier> getCouriers()
        throws MalformedURLException_Exception
    ;

}
