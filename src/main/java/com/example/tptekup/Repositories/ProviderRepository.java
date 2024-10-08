package com.example.tptekup.Repositories;

import com.example.tptekup.Entities.Provider;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepository extends JpaRepository <Provider,Long> {
}
