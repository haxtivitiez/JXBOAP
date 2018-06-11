package xyz.un4ckn0wl3z.jxboap.env;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class Test {

	public static void main(String[] args) {
		
		   
		  try {            
		            javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(SoapEnvelope.class);
		            javax.xml.bind.Marshaller marshaller = jaxbCtx.createMarshaller();
		            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8"); 
		            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		             
		            StringWriter writer = new StringWriter();
		             
		            marshaller.marshal( new SoapEnvelope(), writer);
		             
		            System.out.println(writer.toString());
		  }
		  catch(Exception e) {
		   e.printStackTrace();
		  }
	}
}
