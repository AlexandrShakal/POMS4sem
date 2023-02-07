package RPNJAVA.SpringJAVA.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Sale")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Part_id")
    private long Part_id;

    @Column(name = "count")
    private long count;

    @Column(name = "buyer_id")
    private long Buyer_id;


}
