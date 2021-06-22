package be.wkam.immocam.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name= "realty_categories")
@Data @NoArgsConstructor

public class RealtyCategory implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String  description;
     private Date createdAt;


@OneToMany(mappedBy = "realtyCategory")
private Collection<Realty> realties;


}

