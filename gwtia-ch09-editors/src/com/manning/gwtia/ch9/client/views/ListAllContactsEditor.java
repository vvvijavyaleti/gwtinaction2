package com.manning.gwtia.ch9.client.views;

/*
 *
 *  List of contacts using Composite Editor
 * 
 * 
 */


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.CompositeEditor;
import com.google.gwt.editor.client.EditorDelegate;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.google.web.bindery.requestfactory.gwt.client.RequestFactoryEditorDriver;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.manning.gwtia.ch9.client.ContactFactory;
import com.manning.gwtia.ch9.client.ContactProxy;
import com.manning.gwtia.ch9.client.ContactFactory.ContactRequest;
import com.manning.gwtia.ch9.client.widgets.ContactListRowEditor;

public class ListAllContactsEditor extends Composite implements
		CompositeEditor<List<ContactProxy>, ContactProxy, ContactListRowEditor> {
	Logger log = Logger.getLogger("");

	interface ListAllContactEditorUiBinder extends
			UiBinder<Widget, ListAllContactsEditor> {
	}

	private static ListAllContactEditorUiBinder uiBinder = GWT
			.create(ListAllContactEditorUiBinder.class);

	interface Driver
			extends
			RequestFactoryEditorDriver<List<ContactProxy>, ListAllContactsEditor> {
	}

	private ContactRequest requestContext;
	private ContactFactory requestFactory;
	private ContactListRowEditor rowEditor;
	Driver driver = GWT.create(Driver.class);
	@UiField
	FlowPanel listPanel;
	private CompositeEditor.EditorChain<ContactProxy, ContactListRowEditor> editorChain;

	private List<ContactProxy> contactProxies;

	public ListAllContactsEditor() {
		initWidget(uiBinder.createAndBindUi(this));

	}

	public void findAllContacts() {
		listPanel.clear();
		requestFactory = GWT.create(ContactFactory.class);
		requestContext = requestFactory.createContactRequest();
		final EventBus eventBus = new SimpleEventBus();
		requestFactory.initialize(eventBus);
		driver.initialize(requestFactory, this);
		contactProxies = new ArrayList<ContactProxy>();
		driver.edit(contactProxies, requestContext);
		requestContext.findAllContacts().fire(
				new Receiver<List<ContactProxy>>() {
					public void onSuccess(List<ContactProxy> contacts) {
						if (contacts.size() == 0) {
							Window.alert("There are no contacts to list!\nTry adding some through the contacts view");
						} else {
							for (ContactProxy c : contacts) {
								log.info("Contact: " + c.getId() + "="
										+ c.getEmail());
							}
						}
						requestContext = requestFactory.createContactRequest();
						driver.edit(contacts, requestContext);
					}
				});
	}

	@Override
	public void flush() {
		// no-op
	}

	@Override
	public void onPropertyChange(String... arg0) {
		// No-op
	}

	@Override
	public void setValue(List<ContactProxy> contacts) {
		for (ContactProxy c : contacts) {
			ContactListRowEditor editor = new ContactListRowEditor();
			listPanel.add(editor);
			editorChain.attach(c, editor);
		}
	}

	@Override
	public void setDelegate(EditorDelegate<List<ContactProxy>> arg0) {
		// No-op
	}

	@Override
	public ContactListRowEditor createEditorForTraversal() {
		rowEditor = new ContactListRowEditor();
		return rowEditor;
	}

	@Override
	public String getPathElement(ContactListRowEditor editor) {
		// No-op
		return null;
	}

	@Override
	public void setEditorChain(
			com.google.gwt.editor.client.CompositeEditor.EditorChain<ContactProxy, ContactListRowEditor> chain) {
		editorChain = chain;

	}

}
