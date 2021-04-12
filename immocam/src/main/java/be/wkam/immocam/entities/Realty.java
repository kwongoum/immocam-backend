package be.wkam.immocam.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Realty implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private double price;
    private int quantity;
    private int appliesNumber;
    private int type;
    private int status;
    private  boolean deleteIntegrity;
    private Date createdAt;
    private Date updatedAt;

    @ManyToMany
    @JoinTable(name = "applies")
    private Collection<User> users;

    @OneToMany(mappedBy = "realties", fetch = FetchType.LAZY)
    private Collection<Media> medias;

    @ManyToOne
    @JoinColumn (name = "apply_category_id")
    private RealtyCategory realtyCategory;

    @ManyToOne
    @JoinColumn (name = "town_id")
    private Town town;

}
