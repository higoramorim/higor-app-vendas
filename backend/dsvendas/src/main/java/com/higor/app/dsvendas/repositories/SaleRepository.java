package com.higor.app.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.higor.app.dsvendas.dto.SaleSuccessDTO;
import com.higor.app.dsvendas.dto.SaleSumDTO;
import com.higor.app.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

	@Query("SELECT new com.higor.app.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.higor.app.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();
}
