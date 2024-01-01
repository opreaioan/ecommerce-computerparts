package com.transilvania.computerparts.ecommercecomputerparts.model.dao;

import com.transilvania.computerparts.ecommercecomputerparts.model.LocalUser;
import jakarta.persistence.Id;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.events.Event;

import java.util.Optional;

public interface LocalUserDAO extends JpaRepository<LocalUser, Long> {

    Optional<LocalUser> findByUsernameIgnoreCase(String username);

    Optional<LocalUser> findByEmailIgnoreCase(String email);
}
