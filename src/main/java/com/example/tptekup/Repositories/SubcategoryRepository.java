package com.example.tptekup.Repositories;

import com.example.tptekup.Entities.Subcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SubcategoryRepository extends JpaRepository<Subcategory,Long> {
}
