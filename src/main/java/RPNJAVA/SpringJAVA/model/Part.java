package RPNJAVA.SpringJAVA.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Part")
public class Part {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "count")
    private long count;

    @Column(name = "Category_name")
    private String Category_name;

    @Column(name = "Manufacturer_name")
    private String Manufacturer_name;
}
