package be.wkam.immocam.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;


@Entity
@Table(name = "roles")
@Data @NoArgsConstructor
public class Role implements Serializable {
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nameEn;
    private String nameFr;

   // No Group group in Role

  @ManyToMany
  @JoinTable(name="permissions_roles")
      private Collection<Permission> permissions;

@ManyToMany
@JoinTable(name="roles_users")
  private Collection<User> users;



}
