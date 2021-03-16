package com.jakartaapp.adapter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {

	@Override
	public LocalDate unmarshal(String v) throws Exception {

		return LocalDate.parse(v, DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
	}

	@Override
	public String marshal(LocalDate v) throws Exception {
		// TODO Auto-generated method stub
		return v.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
	}

}
