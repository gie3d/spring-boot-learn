package com.navyjone.springdemo.repositories;

import com.navyjone.springdemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
