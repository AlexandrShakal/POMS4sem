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

    @Column(name = "categoryName")
    private String categoryName;

    @Column(name = "manufacturerName")
    private String manufacturerName;
}
