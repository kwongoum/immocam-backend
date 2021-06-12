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

public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private int phone;
    private String password;
    private Date birthday;
    private String gender;
    private String about;
    private String address;
    private String status;
    private boolean deleteIntegrity;
    private String confirmationToken;
    private Date confirmedAt;
    private String rememberToken;
    private Date createdAt;

     @ManyToOne
     @JoinColumn (name = "language_id")
    private Language language;
     @ManyToMany
     @JoinTable( name = "groupes_users")// I should change e in db file
     private Collection<Group> groups;

    @ManyToMany(mappedBy = "users")
    private Collection<Role> roles;

    @ManyToMany(mappedBy = "users")
    private Collection<Realty> realties;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Collection<Media> medias;
 /*
 *  la relation OneToMany entre user et realties doit etre
 * supprimée dans la bdd et sur le erd
 * */
 @ManyToOne
 @JoinColumn (name = "countries_id")
 private Country country;

}
