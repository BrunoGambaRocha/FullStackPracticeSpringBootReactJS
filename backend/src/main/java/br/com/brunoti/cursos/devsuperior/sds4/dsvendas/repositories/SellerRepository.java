package br.com.brunoti.cursos.devsuperior.sds4.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brunoti.cursos.devsuperior.sds4.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
