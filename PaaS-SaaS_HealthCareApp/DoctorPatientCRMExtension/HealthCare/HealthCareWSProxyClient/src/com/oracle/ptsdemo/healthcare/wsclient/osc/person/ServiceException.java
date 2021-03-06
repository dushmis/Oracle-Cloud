package com.oracle.ptsdemo.healthcare.wsclient.osc.person;

import javax.xml.ws.WebFault;

@WebFault(faultBean="com.oracle.pts.person.wsclient.generated.ServiceErrorMessage",
  targetNamespace="http://xmlns.oracle.com/adf/svc/errors/", name="ServiceErrorMessage")
public class ServiceException
  extends Exception
{
  private com.oracle.ptsdemo.healthcare.wsclient.osc.person.generated.ServiceErrorMessage faultInfo;

  public ServiceException(String message,
                          com.oracle.ptsdemo.healthcare.wsclient.osc.person.generated.ServiceErrorMessage faultInfo)
  {
    super(message);
    this.faultInfo = faultInfo;
  }

  public ServiceException(String message,
                          com.oracle.ptsdemo.healthcare.wsclient.osc.person.generated.ServiceErrorMessage faultInfo,
                          Throwable t)
  {
    super(message,t);
    this.faultInfo = faultInfo;
  }

  public com.oracle.ptsdemo.healthcare.wsclient.osc.person.generated.ServiceErrorMessage getFaultInfo()
  {
    return faultInfo;
  }

  public void setFaultInfo(com.oracle.ptsdemo.healthcare.wsclient.osc.person.generated.ServiceErrorMessage faultInfo)
  {
    this.faultInfo = faultInfo;
  }
}
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 111209.0821.28162)
