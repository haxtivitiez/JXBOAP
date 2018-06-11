
package xyz.un4ckn0wl3z.jxboap.env;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name="envelope")
public class SoapEnvelope {
 @XmlAttribute(name="SOAP-ENV:encodingStyle")
 private String soapEnvEncodingStyle;
  
 @XmlElement(name="header")
 private String soapHeader;
  
 @XmlElement(name="body")
 private String soapBody;
  
 public SoapEnvelope() {
  soapEnvEncodingStyle = "http://www.w3.org/2001/12/soap-encoding";
  soapHeader = new String();
  soapBody = new String();
 }
}
