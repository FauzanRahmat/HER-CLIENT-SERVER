/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fauzan.penjualan.repository;

import com.fauzan.penjualan.entity.Penjualan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LENOVO
 */
@Repository
public interface PenjualanRepository extends JpaRepository<Penjualan, Long>{
    
    public Penjualan findByPenjualanId(Long noFaktur);
    
    public Penjualan save(Penjualan Penjualan);
}

