package nl.hu.fnt.gsos.wsproducer;

import java.math.BigInteger;

import javax.jws.WebService;

import nl.hu.fnt.gsos.wsinterface.Applicationfault;
import nl.hu.fnt.gsos.wsinterface.DecodeRequest;
import nl.hu.fnt.gsos.wsinterface.DecodeResponse;
import nl.hu.fnt.gsos.wsinterface.EncodeRequest;
import nl.hu.fnt.gsos.wsinterface.EncodeResponse;
import nl.hu.fnt.gsos.wsinterface.MorseServiceException;
import nl.hu.fnt.gsos.wsinterface.MorseServiceSoap;
import nl.hu.fnt.gsos.wsinterface.ObjectFactory;


@WebService( endpointInterface= "nl.hu.fnt.gsos.wsinterface.MorseServiceSoap")
public class MorseServiceImpl implements MorseServiceSoap {

	@Override
	public EncodeResponse encode(EncodeRequest request) throws Applicationfault {
		ObjectFactory factory = new ObjectFactory();
		EncodeResponse response = factory.createEncodeResponse();
		try {
                        MorseConvertor mc = new MorseConvertor();
                        String morse = mc.encode(request.getText()); 
                        response.setMorse(morse);
		} catch (RuntimeException e) {
			MorseServiceException x = factory.createMorseServiceException();
			x.setCode(BigInteger.valueOf(1));
			x.setMessage("Er ging iets mis bij het berekenen van de text " + request.getText()
					+ " naar morse");
			throw new Applicationfault("FOUT", x);
		}
		return response;
	}

	@Override
	public DecodeResponse decode(DecodeRequest decoderequest) throws Applicationfault {
		ObjectFactory factory = new ObjectFactory();
		DecodeResponse response = factory.createDecodeResponse();
		try {
                        MorseConvertor mc = new MorseConvertor();
                        String text = mc.decode(decoderequest.getMorse()); 
                        response.setText(text);
		} catch (RuntimeException e) {
			MorseServiceException x = factory.createMorseServiceException();
			x.setCode(BigInteger.valueOf(1));
			x.setMessage("Er ging iets mis bij het berekenen van de morse " + decoderequest.getMorse()
					+ " naar text");
			throw new Applicationfault("FOUT", x);
		}
		return response;
	}

}
