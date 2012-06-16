package com.manning.gwtia.ch9.client.widgets;

import com.google.gwt.editor.client.Editor;
import com.manning.gwtia.ch9.client.domain.PhoneBook;

public interface PhoneBookEditor extends Editor<PhoneBook> {

	EmployeeEditor employee();

	PhoneNumberEditor phoneNumber();

}
