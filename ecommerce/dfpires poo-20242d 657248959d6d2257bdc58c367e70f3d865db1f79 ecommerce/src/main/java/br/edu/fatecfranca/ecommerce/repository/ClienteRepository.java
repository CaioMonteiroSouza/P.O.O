package br.edu.fatecfranca.ecommerce.repository;

import br.edu.fatecfranca.ecommerce.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Produto, Long> {

}
