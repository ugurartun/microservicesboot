package com.ugur.microservices.repository;

import com.ugur.microservices.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    @Query("SELECT user FROM User user  WHERE user.phone=(:pNumber)")
    User findByLastNameAndPhoneType(@Param("pNumber") String pNumber);
}
