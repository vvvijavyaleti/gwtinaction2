package com.manning.gwtia.ch9.client;

import com.google.web.bindery.requestfactory.shared.InstanceRequest;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.RequestFactory;
import com.google.web.bindery.requestfactory.shared.Service;
import com.manning.gwtia.ch9.server.Contact.Phone;

public interface PhoneFactory extends RequestFactory {
	PhoneRequest createPhoneRequest();

	@Service(Phone.class)
	interface PhoneRequest extends RequestContext {
		InstanceRequest<PhoneProxy, Void> persist();
	}

}
