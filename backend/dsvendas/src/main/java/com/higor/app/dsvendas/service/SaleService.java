package com.higor.app.dsvendas.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.higor.app.dsvendas.dto.SaleDTO;
import com.higor.app.dsvendas.dto.SaleSuccessDTO;
import com.higor.app.dsvendas.dto.SaleSumDTO;
import com.higor.app.dsvendas.entities.Sale;
import com.higor.app.dsvendas.repositories.SaleRepository;
import com.higor.app.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional
	public List<SaleSumDTO> amountGroupedBySeller(){
		return repository.amountGroupedBySeller();
	}
	
	@Transactional
	public List<SaleSuccessDTO> successGroupedBySeller(){
		return repository.successGroupedBySeller();
	}

}
