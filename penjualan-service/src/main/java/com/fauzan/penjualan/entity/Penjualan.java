/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fauzan.penjualan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author LENOVO
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Penjualan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long noFaktur;
    private Long anggotaId;
    private Long kodeBarang;
    private int jumlahBarang;
    private double harga;
    private double total;

    public String getAnggotaId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
