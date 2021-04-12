package be.wkam.immocam.entities;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data @NoArgsConstructor
public class Group implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameEn;
    private String nameFr;
    // OneToOne CAN be a simple aggregation
    @OneToOne
    private Role role;

    @ManyToMany( mappedBy = "groups")
    private Collection<User> users;


}
