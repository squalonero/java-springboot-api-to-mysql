package com.sqlnr.app.service;

import org.springframework.data.domain.Page;

import com.sqlnr.app.model.Booking;
import com.sqlnr.app.model.BookingDto;


public interface BookingService {

    public Page<Booking> findBy(int page, String by, String value);

    public Booking findById(Long id);

    public Booking save(Booking booking);

    public void deleteById(Long id);

    public void deleteAll();

    public Booking update(Long id, BookingDto booking) throws Exception;
}
