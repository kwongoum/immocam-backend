package be.wkam.immocam.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "realties")
@Data
@NoArgsConstructor
public class Realty implements Serializable {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   private String description;
    private double price ;
    private int quantity;
    private int appliesNumbers;
    private String type;
    private int status;
    private boolean deleteIntegrity;
    private Date  createdAt;
    private Date  updatedAt;

    @OneToMany(mappedBy = "realty")
private List<Media> medias;

    @ManyToOne
    @JoinColumn(name="realty_category_id")
   private RealtyCategory  realtyCategory;
    @ManyToOne
    @JoinColumn(name="town_id")
     private Town town;
    @ManyToMany
    @JoinTable(name = "applies")
    private Collection<User> users;


}
