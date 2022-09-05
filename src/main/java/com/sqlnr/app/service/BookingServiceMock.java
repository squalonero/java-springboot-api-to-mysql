package com.sqlnr.app.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import com.sqlnr.app.model.Booking;
import com.sqlnr.app.model.BookingDto;
import com.sqlnr.app.model.User;
import com.sqlnr.app.model.types.BookingStatus;
import com.sqlnr.app.utils.ObjectMapper;



public class BookingServiceMock implements BookingService {

    private List<Booking> bookings = new ArrayList<>(Arrays.asList(
        new Booking(Long.valueOf(1), new User("test@test.it", "1234567890"), BookingStatus.pending, new Date(), 2, null),
        new Booking(Long.valueOf(2), new User("test1@test.it", "1234567890"), BookingStatus.pending, new Date(), 2, null),
        new Booking(Long.valueOf(3), new User("test2@test.it", "1234567890"), BookingStatus.pending, new Date(), 2, null)
    ));

    public Page<Booking> findBy(int page, String by, String value) {
        //@todo: paginate
        return new PageImpl<>(bookings);
    }

    public Booking findById(Long id) {
        return bookings.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public Booking save(Booking booking) {
        bookings.add(booking);
        return booking;
    }

    public Booking update(Long id, BookingDto updateBooking) {
        for (Booking booking : bookings) {
            if(booking.getId() == id)
            {
                try {
                    booking = (Booking) ObjectMapper.mapNonEmptyFieldsToEntity(updateBooking, booking);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                return booking;
            }
        }
        return null;
    }

    public void deleteById(Long id) {
        bookings.removeIf(t -> t.getId().equals(id));
    }

    public void deleteAll() {
        bookings.clear();
    }

}
