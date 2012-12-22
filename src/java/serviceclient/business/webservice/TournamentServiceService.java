
package business.webservice;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TournamentServiceService", targetNamespace = "http://webservice.business/", wsdlLocation = "http://localhost:8080/TournamentServiceService/SVVSService?wsdl")
public class TournamentServiceService
    extends Service
{

    private final static URL TOURNAMENTSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException TOURNAMENTSERVICESERVICE_EXCEPTION;
    private final static QName TOURNAMENTSERVICESERVICE_QNAME = new QName("http://webservice.business/", "TournamentServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/TournamentServiceService/SVVSService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TOURNAMENTSERVICESERVICE_WSDL_LOCATION = url;
        TOURNAMENTSERVICESERVICE_EXCEPTION = e;
    }

    public TournamentServiceService() {
        super(__getWsdlLocation(), TOURNAMENTSERVICESERVICE_QNAME);
    }

    public TournamentServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TOURNAMENTSERVICESERVICE_QNAME, features);
    }

    public TournamentServiceService(URL wsdlLocation) {
        super(wsdlLocation, TOURNAMENTSERVICESERVICE_QNAME);
    }

    public TournamentServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TOURNAMENTSERVICESERVICE_QNAME, features);
    }

    public TournamentServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TournamentServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SVVSService
     */
    @WebEndpoint(name = "SVVSServicePort")
    public SVVSService getSVVSServicePort() {
        return super.getPort(new QName("http://webservice.business/", "SVVSServicePort"), SVVSService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SVVSService
     */
    @WebEndpoint(name = "SVVSServicePort")
    public SVVSService getSVVSServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.business/", "SVVSServicePort"), SVVSService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TOURNAMENTSERVICESERVICE_EXCEPTION!= null) {
            throw TOURNAMENTSERVICESERVICE_EXCEPTION;
        }
        return TOURNAMENTSERVICESERVICE_WSDL_LOCATION;
    }

}