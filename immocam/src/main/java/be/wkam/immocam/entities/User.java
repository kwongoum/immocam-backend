package be.wkam.immocam.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.*;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor

public class User implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String  email;
    private int  phone ;
    private String password;
    private String gender;

     private String about;
     private String address;
     private String firstName;
     private String lastName;
     private  Date birthday;
    private boolean status;
    private boolean deleteIntegrity;
    private String confirmationToken;
    private Date confirmedAt;
    private Date createdAt;
    private String rememberToken;


@ManyToOne
@JoinColumn(name = "country_id")
    private Country country;

    @ManyToMany
    @JoinTable(name="groupes_users")
    private Collection<Group> groups;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "language_id")
    private Language language;

    @OneToMany(mappedBy="user", fetch = FetchType.LAZY)
    private Collection<Media> medias;

    @ManyToMany(mappedBy="users")
    private Collection<Realty> realties;

@ManyToMany(mappedBy = "users")
    private Collection<Role> roles;

@ManyToMany
@JoinTable(name="subscriptions_users")
private Collection<Subscription> subscriptions;

@JsonIgnore
    public Country getCountry() {
        return country;
    }
@JsonIgnore
    public Language getLanguage(){
    return  language;
}


}

