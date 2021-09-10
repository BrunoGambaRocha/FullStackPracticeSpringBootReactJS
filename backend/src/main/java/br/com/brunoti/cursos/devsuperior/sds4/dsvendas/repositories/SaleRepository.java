package br.com.brunoti.cursos.devsuperior.sds4.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brunoti.cursos.devsuperior.sds4.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
