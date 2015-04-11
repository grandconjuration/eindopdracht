
package nl.hu.fnt.gsos.wsinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.hu.fnt.gsos.wsinterface package. 
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

    private final static QName _DecodeResponse_QNAME = new QName("http://www.example.org/morseservice/decoderesponse/", "DecodeResponse");
    private final static QName _DecodeRequest_QNAME = new QName("http://www.example.org/morseservice/decoderequest/", "DecodeRequest");
    private final static QName _MorseServiceException_QNAME = new QName("http://www.example.org/morseservice/exception/", "MorseServiceException");
    private final static QName _EncodeResponse_QNAME = new QName("http://www.example.org/morseservice/encoderesponse/", "EncodeResponse");
    private final static QName _EncodeRequest_QNAME = new QName("http://www.example.org/morseservice/encoderequest/", "EncodeRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.hu.fnt.gsos.wsinterface
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EncodeRequest }
     * 
     */
    public EncodeRequest createEncodeRequest() {
        return new EncodeRequest();
    }

    /**
     * Create an instance of {@link EncodeResponse }
     * 
     */
    public EncodeResponse createEncodeResponse() {
        return new EncodeResponse();
    }

    /**
     * Create an instance of {@link DecodeRequest }
     * 
     */
    public DecodeRequest createDecodeRequest() {
        return new DecodeRequest();
    }

    /**
     * Create an instance of {@link DecodeResponse }
     * 
     */
    public DecodeResponse createDecodeResponse() {
        return new DecodeResponse();
    }

    /**
     * Create an instance of {@link MorseServiceException }
     * 
     */
    public MorseServiceException createMorseServiceException() {
        return new MorseServiceException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/morseservice/decoderesponse/", name = "DecodeResponse")
    public JAXBElement<DecodeResponse> createDecodeResponse(DecodeResponse value) {
        return new JAXBElement<DecodeResponse>(_DecodeResponse_QNAME, DecodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecodeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/morseservice/decoderequest/", name = "DecodeRequest")
    public JAXBElement<DecodeRequest> createDecodeRequest(DecodeRequest value) {
        return new JAXBElement<DecodeRequest>(_DecodeRequest_QNAME, DecodeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MorseServiceException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/morseservice/exception/", name = "MorseServiceException")
    public JAXBElement<MorseServiceException> createMorseServiceException(MorseServiceException value) {
        return new JAXBElement<MorseServiceException>(_MorseServiceException_QNAME, MorseServiceException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/morseservice/encoderesponse/", name = "EncodeResponse")
    public JAXBElement<EncodeResponse> createEncodeResponse(EncodeResponse value) {
        return new JAXBElement<EncodeResponse>(_EncodeResponse_QNAME, EncodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncodeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/morseservice/encoderequest/", name = "EncodeRequest")
    public JAXBElement<EncodeRequest> createEncodeRequest(EncodeRequest value) {
        return new JAXBElement<EncodeRequest>(_EncodeRequest_QNAME, EncodeRequest.class, null, value);
    }

}
