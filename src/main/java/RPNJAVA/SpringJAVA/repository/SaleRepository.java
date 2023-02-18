package RPNJAVA.SpringJAVA.repository;

import RPNJAVA.SpringJAVA.model.Sale;
import RPNJAVA.SpringJAVA.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {
    List<Sale> findSalesByBuyer_id(int id);
}


