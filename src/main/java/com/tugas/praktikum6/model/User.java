package com.tugas.praktikum6.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Builder
@Table (name = "NIM_users")
@AllArgsConstructor
@NoArgsConstructor

public class User {
    private String nama;
    private String nim;
    private String jenisKelamin;
}
