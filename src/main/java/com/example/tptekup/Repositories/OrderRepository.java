package com.example.tptekup.Repositories;

import com.example.tptekup.Entities.Ordeer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Ordeer,Long> {
}
