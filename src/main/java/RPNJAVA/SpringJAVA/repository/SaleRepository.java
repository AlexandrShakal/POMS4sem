package RPNJAVA.SpringJAVA.repository;

import RPNJAVA.SpringJAVA.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
