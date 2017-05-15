
package MyCourierServiceClient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MyCourierService", targetNamespace = "http://MyCourierService/", wsdlLocation = "http://localhost:8080/MyCourierService?wsdl")
public class MyCourierService
    extends Service
{

    private final static URL MYCOURIERSERVICE_WSDL_LOCATION;
    private final static WebServiceException MYCOURIERSERVICE_EXCEPTION;
    private final static QName MYCOURIERSERVICE_QNAME = new QName("http://MyCourierService/", "MyCourierService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/MyCourierService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MYCOURIERSERVICE_WSDL_LOCATION = url;
        MYCOURIERSERVICE_EXCEPTION = e;
    }

    public MyCourierService() {
        super(__getWsdlLocation(), MYCOURIERSERVICE_QNAME);
    }

    public MyCourierService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MYCOURIERSERVICE_QNAME, features);
    }

    public MyCourierService(URL wsdlLocation) {
        super(wsdlLocation, MYCOURIERSERVICE_QNAME);
    }

    public MyCourierService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MYCOURIERSERVICE_QNAME, features);
    }

    public MyCourierService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MyCourierService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MyCourierServiceImpl
     */
    @WebEndpoint(name = "MyCourierServicePort")
    public MyCourierServiceImpl getMyCourierServicePort() {
        return super.getPort(new QName("http://MyCourierService/", "MyCourierServicePort"), MyCourierServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MyCourierServiceImpl
     */
    @WebEndpoint(name = "MyCourierServicePort")
    public MyCourierServiceImpl getMyCourierServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://MyCourierService/", "MyCourierServicePort"), MyCourierServiceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MYCOURIERSERVICE_EXCEPTION!= null) {
            throw MYCOURIERSERVICE_EXCEPTION;
        }
        return MYCOURIERSERVICE_WSDL_LOCATION;
    }

}