/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.0.0, build 060119.1546.05277)

package remoteservices.runtime;

import oracle.j2ee.ws.common.encoding.*;
import oracle.j2ee.ws.common.encoding.literal.*;
import oracle.j2ee.ws.common.encoding.literal.DetailFragmentDeserializer;
import oracle.j2ee.ws.common.encoding.simpletype.*;
import oracle.j2ee.ws.common.soap.SOAPEncodingConstants;
import oracle.j2ee.ws.common.soap.SOAPEnvelopeConstants;
import oracle.j2ee.ws.common.soap.SOAPVersion;
import oracle.j2ee.ws.common.streaming.*;
import oracle.j2ee.ws.common.wsdl.document.schema.SchemaConstants;
import oracle.j2ee.ws.common.util.xml.UUID;
import javax.xml.namespace.QName;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.AttachmentPart;

public class RetrieveDepartmentDataResponse_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable {
    private static final QName ns1_result_QNAME = new QName("urn:DeptService-example", "result");
    private static final QName ns4_Department_TYPE_QNAME = new QName("http://deptws.server.webservice/types/", "Department");
    private CombinedSerializer myns4_Department__Department_LiteralSerializer;
    
    public RetrieveDepartmentDataResponse_LiteralSerializer(QName type) {
        this(type,  false);
    }
    
    public RetrieveDepartmentDataResponse_LiteralSerializer(QName type, boolean encodeType) {
        super(type, true, encodeType);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        myns4_Department__Department_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", remoteservices.types.deptws.server.webservice.types.Department.class, ns4_Department_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        remoteservices.RetrieveDepartmentDataResponse instance = new remoteservices.RetrieveDepartmentDataResponse();
        java.lang.Object member=null;
        QName elementName;
        List values;
        java.lang.Object value;
        
        reader.nextElementContent();
        elementName = reader.getName();
        if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_result_QNAME))) {
            values = new ArrayList();
            for(;;) {
                elementName = reader.getName();
                if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_result_QNAME))) {
                    myns4_Department__Department_LiteralSerializer.setNullable( true );
                    value = myns4_Department__Department_LiteralSerializer.deserialize(ns1_result_QNAME, reader, context);
                    values.add(value);
                    reader.nextElementContent();
                } else {
                    break;
                }
            }
            member = new remoteservices.types.deptws.server.webservice.types.Department[values.size()];
            member = values.toArray((java.lang.Object[]) member);
            instance.setResult((remoteservices.types.deptws.server.webservice.types.Department[])member);
        }
        else {
            instance.setResult(new remoteservices.types.deptws.server.webservice.types.Department[0]);
        }
        
        if( reader.getState() != XMLReader.END)
        {
            reader.skipElement();
        }
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (java.lang.Object)instance;
    }
    
    public void doSerializeAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        remoteservices.RetrieveDepartmentDataResponse instance = (remoteservices.RetrieveDepartmentDataResponse)obj;
        
    }
    public void doSerializeAnyAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        remoteservices.RetrieveDepartmentDataResponse instance = (remoteservices.RetrieveDepartmentDataResponse)obj;
        
    }
    public void doSerialize(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        remoteservices.RetrieveDepartmentDataResponse instance = (remoteservices.RetrieveDepartmentDataResponse)obj;
        
        if (instance.getResult() != null) {
            for (int i = 0; i < instance.getResult().length; ++i) {
                myns4_Department__Department_LiteralSerializer.setNullable( true );
                myns4_Department__Department_LiteralSerializer.serialize(instance.getResult()[i], ns1_result_QNAME, null, writer, context);
            }
        }
    }
}
