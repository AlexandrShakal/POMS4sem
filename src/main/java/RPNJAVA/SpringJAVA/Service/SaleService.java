package RPNJAVA.SpringJAVA.Service;


import RPNJAVA.SpringJAVA.model.Sale;
import RPNJAVA.SpringJAVA.model.User;
import RPNJAVA.SpringJAVA.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private RPNJAVA.SpringJAVA.repository.SaleRepository SaleRepository;

    public Sale findById(long id){
        return SaleRepository.getReferenceById(id);

    }

    public List<Sale> findAll(){
        return SaleRepository.findAll();
    }

    public Sale saveSale(Sale sale){
        return SaleRepository.save(sale);
    }

    public void deleteById(Long id){
        SaleRepository.deleteById(id);
    }

}
