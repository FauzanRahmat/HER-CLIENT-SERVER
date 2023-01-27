/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fauzan.penjualan.service;

import com.fauzan.penjualan.VO.Anggota;
import com.fauzan.penjualan.VO.ResponseTemplateVO;
import com.fauzan.penjualan.entity.Penjualan;
import com.fauzan.penjualan.repository.PenjualanRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author LENOVO
 */
@Service
public class PenjualanService {
    @Autowired
    private PenjualanRepository penjualanRepository;
    
    @Autowired
    private RestTemplate restTemplate;
    
    public Penjualan savePenjualan(Penjualan penjualan){
        return penjualanRepository.save(penjualan);
    }
    
    public ResponseTemplateVO getPenjualan(Long penjualanId){
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Penjualan penjualan =
                penjualanRepository.findByPenjualanId(penjualanId);
        Anggota anggota =
        restTemplate.getForObject("http://localhost:9001/anggota/"
                + penjualan.getAnggotaId(), Anggota.class);
        vo.setPenjualan(penjualan);
        vo.setAnggota(anggota); 
        return vo;
    }
    
    public Penjualan findPenjualanById(Long noFaktur){
        return penjualanRepository.findByPenjualanId(noFaktur);
    }
    public List<Penjualan> getAllPenjualan(){
        return penjualanRepository.findAll();
    }
    public void deletePenjualan(Long noFaktur){
        penjualanRepository.deleteById(noFaktur);
    }
    public Penjualan updatePenjualan(Penjualan penjualan){
        return penjualanRepository.save(penjualan);
    }
}
