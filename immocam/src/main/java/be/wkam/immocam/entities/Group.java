package be.wkam.immocam.entities;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name= "groupes")
@Data @NoArgsConstructor
public class Group implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "role_id")
    private Role role; // simple aggregation

    private String  nameEn;
    private String nameFr;

    @ManyToMany(mappedBy = "groups")
    private Collection<User> users;


}
