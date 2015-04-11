
package nl.hu.fnt.gsos.wsinterface;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MorseServiceSoap", targetNamespace = "http://www.example.org/morseservice/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MorseServiceSoap {


    /**
     * 
     * @param encoderequest
     * @return
     *     returns nl.hu.fnt.gsos.wsinterface.EncodeResponse
     * @throws Applicationfault
     */
    @WebMethod
    @WebResult(name = "EncodeResponse", targetNamespace = "http://www.example.org/morseservice/encoderesponse/", partName = "encoderesponse")
    public EncodeResponse encode(
        @WebParam(name = "EncodeRequest", targetNamespace = "http://www.example.org/morseservice/encoderequest/", partName = "encoderequest")
        EncodeRequest encoderequest)
        throws Applicationfault
    ;

    /**
     * 
     * @param decoderequest
     * @return
     *     returns nl.hu.fnt.gsos.wsinterface.DecodeResponse
     * @throws Applicationfault
     */
    @WebMethod
    @WebResult(name = "DecodeResponse", targetNamespace = "http://www.example.org/morseservice/decoderesponse/", partName = "decodereponse")
    public DecodeResponse decode(
        @WebParam(name = "DecodeRequest", targetNamespace = "http://www.example.org/morseservice/decoderequest/", partName = "decoderequest")
        DecodeRequest decoderequest)
        throws Applicationfault
    ;

}