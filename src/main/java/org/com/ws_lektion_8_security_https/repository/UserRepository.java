package org.com.ws_lektion_8_security_https.repository;

import org.com.ws_lektion_8_security_https.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
