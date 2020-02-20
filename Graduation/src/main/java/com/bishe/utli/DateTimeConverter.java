package com.bishe.utli;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeConverter implements Converter<String,Date> {


    @Override
        public Date convert(String a) {
            SimpleDateFormat  sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date;
            try {
                date = sdf.parse(a);
                return date;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return null;
        }
}