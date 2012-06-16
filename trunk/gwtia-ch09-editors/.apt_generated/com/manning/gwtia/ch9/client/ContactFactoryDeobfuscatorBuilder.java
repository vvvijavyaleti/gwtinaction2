// Automatically Generated -- DO NOT EDIT
// com.manning.gwtia.ch9.client.ContactFactory
package com.manning.gwtia.ch9.client;
import java.util.Arrays;
import com.google.web.bindery.requestfactory.vm.impl.OperationData;
import com.google.web.bindery.requestfactory.vm.impl.OperationKey;
public final class ContactFactoryDeobfuscatorBuilder extends com.google.web.bindery.requestfactory.vm.impl.Deobfuscator.Builder {
{
withOperation(new OperationKey("YHb3CReTaQUKu4JZ5_2FJes$HM0="),
  new OperationData.Builder()
  .withClientMethodDescriptor("()Lcom/google/web/bindery/requestfactory/shared/Request;")
  .withDomainMethodDescriptor("()Ljava/lang/Integer;")
  .withMethodName("count")
  .withRequestContext("com.manning.gwtia.ch9.client.ContactFactory$ContactRequest")
  .build());
withOperation(new OperationKey("f1yIBZHRigJuEQPqOUK8xdRAE40="),
  new OperationData.Builder()
  .withClientMethodDescriptor("(Lcom/manning/gwtia/ch9/client/ContactProxy;)Lcom/google/web/bindery/requestfactory/shared/Request;")
  .withDomainMethodDescriptor("(Lcom/manning/gwtia/ch9/server/Contact;)V")
  .withMethodName("remove")
  .withRequestContext("com.manning.gwtia.ch9.client.ContactFactory$ContactRequest")
  .build());
withOperation(new OperationKey("rbVdWUaKjxuKS4HrYQ1UawRbs4U="),
  new OperationData.Builder()
  .withClientMethodDescriptor("(Lcom/manning/gwtia/ch9/client/ContactProxy;)Lcom/google/web/bindery/requestfactory/shared/Request;")
  .withDomainMethodDescriptor("(Lcom/manning/gwtia/ch9/server/Contact;)Lcom/manning/gwtia/ch9/server/Contact;")
  .withMethodName("persist")
  .withRequestContext("com.manning.gwtia.ch9.client.ContactFactory$ContactRequest")
  .build());
withOperation(new OperationKey("63XPwJHYnjVEGagfCC_QnzjEsFE="),
  new OperationData.Builder()
  .withClientMethodDescriptor("()Lcom/google/web/bindery/requestfactory/shared/Request;")
  .withDomainMethodDescriptor("()Ljava/util/List;")
  .withMethodName("findAllContacts")
  .withRequestContext("com.manning.gwtia.ch9.client.ContactFactory$ContactRequest")
  .build());
withOperation(new OperationKey("h8yma2yDzE0zX5E7fd8zQoRESrs="),
  new OperationData.Builder()
  .withClientMethodDescriptor("(Ljava/lang/Long;)Lcom/google/web/bindery/requestfactory/shared/Request;")
  .withDomainMethodDescriptor("(Ljava/lang/Long;)Lcom/manning/gwtia/ch9/server/Contact;")
  .withMethodName("find")
  .withRequestContext("com.manning.gwtia.ch9.client.ContactFactory$ContactRequest")
  .build());
withOperation(new OperationKey("dTMUeNZgzxHxTeuNuXAnyu7ncWQ="),
  new OperationData.Builder()
  .withClientMethodDescriptor("(Ljava/lang/Long;)Lcom/google/web/bindery/requestfactory/shared/Request;")
  .withDomainMethodDescriptor("(Ljava/lang/Long;)Ljava/util/List;")
  .withMethodName("phoneList")
  .withRequestContext("com.manning.gwtia.ch9.client.ContactFactory$PhoneRequest")
  .build());
withOperation(new OperationKey("YX2twlLFjLntV78NXDaHRSbLH_k="),
  new OperationData.Builder()
  .withClientMethodDescriptor("()Lcom/google/web/bindery/requestfactory/shared/InstanceRequest;")
  .withDomainMethodDescriptor("()V")
  .withMethodName("persist")
  .withRequestContext("com.manning.gwtia.ch9.client.ContactFactory$PhoneRequest")
  .build());
withRawTypeToken("w1Qg$YHpDaNcHrR5HZ$23y518nA=", "com.google.web.bindery.requestfactory.shared.EntityProxy");
withRawTypeToken("FXHD5YU0TiUl3uBaepdkYaowx9k=", "com.google.web.bindery.requestfactory.shared.BaseProxy");
withRawTypeToken("qzgM5CqvH3l7Q2GrLoYoXiWYeGg=", "com.manning.gwtia.ch9.client.ContactProxy");
withRawTypeToken("MQLpvBBYDHU4g684XB0Wgq1vIe8=", "com.manning.gwtia.ch9.client.PhoneProxy");
withClientToDomainMappings("com.manning.gwtia.ch9.server.Contact", Arrays.asList("com.manning.gwtia.ch9.client.ContactProxy"));
withClientToDomainMappings("com.manning.gwtia.ch9.server.Contact$Phone", Arrays.asList("com.manning.gwtia.ch9.client.PhoneProxy"));
}}
