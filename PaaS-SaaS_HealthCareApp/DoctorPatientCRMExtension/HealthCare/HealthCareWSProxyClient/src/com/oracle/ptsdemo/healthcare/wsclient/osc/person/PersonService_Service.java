package com.oracle.ptsdemo.healthcare.wsclient.osc.person;

import java.net.URL;

import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 111209.0821.28162)

@WebServiceClient(wsdlLocation="https://my-oraclesalescloud.com/foundationParties/PersonService?WSDL",
  targetNamespace="http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/applicationModule/",
  name="PersonService")
public class PersonService_Service
  extends Service
{
  private static URL wsdlLocationURL;

  private static Logger logger;
//  static
//  {
//    try
//    {
//      logger = Logger.getLogger("com.oracle.pts.person.wsclient.PersonService_Service");
//      URL baseUrl = PersonService_Service.class.getResource(".");
//      if (baseUrl == null)
//      {
//        wsdlLocationURL =
//            PersonService_Service.class.getResource("https://my-oraclesalescloud.com/foundationParties/PersonService?WSDL");
//        if (wsdlLocationURL == null)
//        {
//          baseUrl = new File(".").toURL();
//          wsdlLocationURL =
//              new URL(baseUrl, "https://my-oraclesalescloud.com/foundationParties/PersonService?WSDL");
//        }
//      }
//      else
//      {
//                if (!baseUrl.getPath().endsWith("/")) {
//         baseUrl = new URL(baseUrl, baseUrl.getPath() + "/");
//}
//                wsdlLocationURL =
//            new URL(baseUrl, "https://my-oraclesalescloud.com/foundationParties/PersonService?WSDL");
//      }
//    }
//    catch (MalformedURLException e)
//    {
//      logger.log(Level.ALL,
//          "Failed to create wsdlLocationURL using https://my-oraclesalescloud.com/foundationParties/PersonService?WSDL",
//          e);
//    }
//  }

  public PersonService_Service()
  {
    super(wsdlLocationURL,
          new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/applicationModule/",
                    "PersonService"));
  }

  public PersonService_Service(URL wsdlLocation, QName serviceName)
  {
    super(wsdlLocation, serviceName);
  }

  @WebEndpoint(name="PersonServiceSoapHttpPort")
  public com.oracle.ptsdemo.healthcare.wsclient.osc.person.PersonService getPersonServiceSoapHttpPort()
  {
    return (com.oracle.ptsdemo.healthcare.wsclient.osc.person.PersonService) super.getPort(new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/applicationModule/",
                                                                                  "PersonServiceSoapHttpPort"),
                                                                        com.oracle.ptsdemo.healthcare.wsclient.osc.person.PersonService.class);
  }

  @WebEndpoint(name="PersonServiceSoapHttpPort")
  public com.oracle.ptsdemo.healthcare.wsclient.osc.person.PersonService getPersonServiceSoapHttpPort(WebServiceFeature... features)
  {
    return (com.oracle.ptsdemo.healthcare.wsclient.osc.person.PersonService) super.getPort(new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/applicationModule/",
                                                                                  "PersonServiceSoapHttpPort"),
                                                                        com.oracle.ptsdemo.healthcare.wsclient.osc.person.PersonService.class,
                                                                        features);
  }
}
