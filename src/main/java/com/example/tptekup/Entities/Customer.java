package com.example.tptekup.Entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer extends User{
    private String adress;
    private String city;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.REMOVE)
    List<Ordeer>orderList;
}
