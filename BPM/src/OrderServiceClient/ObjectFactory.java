
package OrderServiceClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the OrderServiceClient package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetOrderByIdResponse_QNAME = new QName("http://OrderService/", "getOrderByIdResponse");
    private final static QName _GetOrderById_QNAME = new QName("http://OrderService/", "getOrderById");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: OrderServiceClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOrderById }
     * 
     */
    public GetOrderById createGetOrderById() {
        return new GetOrderById();
    }

    /**
     * Create an instance of {@link GetOrderByIdResponse }
     * 
     */
    public GetOrderByIdResponse createGetOrderByIdResponse() {
        return new GetOrderByIdResponse();
    }

    /**
     * Create an instance of {@link Seller }
     * 
     */
    public Seller createSeller() {
        return new Seller();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://OrderService/", name = "getOrderByIdResponse")
    public JAXBElement<GetOrderByIdResponse> createGetOrderByIdResponse(GetOrderByIdResponse value) {
        return new JAXBElement<GetOrderByIdResponse>(_GetOrderByIdResponse_QNAME, GetOrderByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://OrderService/", name = "getOrderById")
    public JAXBElement<GetOrderById> createGetOrderById(GetOrderById value) {
        return new JAXBElement<GetOrderById>(_GetOrderById_QNAME, GetOrderById.class, null, value);
    }

}
