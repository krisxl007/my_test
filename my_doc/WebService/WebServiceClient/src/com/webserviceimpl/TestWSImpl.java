package com.webserviceimpl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import com.webservice.TestWS;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.9
 * 2014-09-11T15:58:39.625+10:00
 * Generated source version: 2.4.9
 * 
 */
@WebServiceClient(name = "TestWSImpl", 
                  wsdlLocation = "http://192.168.1.12/xin?wsdl",
                  targetNamespace = "http://webserviceImpl.com/") 
public class TestWSImpl extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://webserviceImpl.com/", "TestWSImpl");
    public final static QName TestWSImplPort = new QName("http://webserviceImpl.com/", "TestWSImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://192.168.1.12/xin?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TestWSImpl.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://192.168.1.12/xin?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public TestWSImpl(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TestWSImpl(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TestWSImpl() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TestWSImpl(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TestWSImpl(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TestWSImpl(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns TestWS
     */
    @WebEndpoint(name = "TestWSImplPort")
    public TestWS getTestWSImplPort() {
        return super.getPort(TestWSImplPort, TestWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TestWS
     */
    @WebEndpoint(name = "TestWSImplPort")
    public TestWS getTestWSImplPort(WebServiceFeature... features) {
        return super.getPort(TestWSImplPort, TestWS.class, features);
    }

}
