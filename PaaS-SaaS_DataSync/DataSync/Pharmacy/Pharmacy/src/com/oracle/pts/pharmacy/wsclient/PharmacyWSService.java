package com.oracle.pts.pharmacy.wsclient;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.logging.Level;
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
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

@WebServiceClient(wsdlLocation="http://localhost:7101/Pharmacy/PharmacyWSPort?WSDL",
  targetNamespace="http://pharmacy.webservice.pts.oracle.com/", name="PharmacyWSService")
public class PharmacyWSService
  extends Service
{
  private static URL wsdlLocationURL;

  private static Logger logger;
  static
  {
    try
    {
      logger = Logger.getLogger("com.oracle.pts.pharmacy.wsclient.PharmacyWSService");
      URL baseUrl = PharmacyWSService.class.getResource(".");
      if (baseUrl == null)
      {
        wsdlLocationURL =
            PharmacyWSService.class.getResource("http://localhost:7101/Pharmacy/PharmacyWSPort?WSDL");
        if (wsdlLocationURL == null)
        {
          baseUrl = new File(".").toURL();
          wsdlLocationURL =
              new URL(baseUrl, "http://localhost:7101/Pharmacy/PharmacyWSPort?WSDL");
        }
      }
      else
      {
                if (!baseUrl.getPath().endsWith("/")) {
         baseUrl = new URL(baseUrl, baseUrl.getPath() + "/");
}
                wsdlLocationURL =
            new URL(baseUrl, "http://localhost:7101/Pharmacy/PharmacyWSPort?WSDL");
      }
    }
    catch (MalformedURLException e)
    {
      logger.log(Level.ALL,
          "Failed to create wsdlLocationURL using http://localhost:7101/Pharmacy/PharmacyWSPort?WSDL",
          e);
    }
  }

  public PharmacyWSService()
  {
    super(wsdlLocationURL,
          new QName("http://pharmacy.webservice.pts.oracle.com/",
                    "PharmacyWSService"));
  }

  public PharmacyWSService(URL wsdlLocation, QName serviceName)
  {
    super(wsdlLocation, serviceName);
  }

  @WebEndpoint(name="PharmacyWSPort")
  public PharmacyWS getPharmacyWSPort()
  {
    return (PharmacyWS) super.getPort(new QName("http://pharmacy.webservice.pts.oracle.com/",
                                                "PharmacyWSPort"),
                                      PharmacyWS.class);
  }

  @WebEndpoint(name="PharmacyWSPort")
  public PharmacyWS getPharmacyWSPort(WebServiceFeature... features)
  {
    return (PharmacyWS) super.getPort(new QName("http://pharmacy.webservice.pts.oracle.com/",
                                                "PharmacyWSPort"),
                                      PharmacyWS.class, features);
  }
}
