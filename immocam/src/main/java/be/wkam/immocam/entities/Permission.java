package be.wkam.immocam.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "permissions")
@Data @NoArgsConstructor
public class Permission implements Serializable {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nameEn ;
    private String  nameFr;

    @ManyToMany(mappedBy = "permissions")
    private Collection<Role> roles;

}
