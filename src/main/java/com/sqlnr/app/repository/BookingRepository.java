package com.sqlnr.app.repository;


// JPA repositori to access MYSQL database
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sqlnr.app.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {


}
