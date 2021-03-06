package be.wkam.immocam.entities;

import lombok.Data;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;



@Entity
@Table(name = "countries")
@Data @NoArgsConstructor
public class Country implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code ;
    private String phoneCode;
    private String alpha2 ;
    private String  alpha3 ;
    private String nameEn ;
    private String  nameFr;
    private boolean deleteIntegrity;
    private Date createdAt;
  private Date   updatedAt;

  @OneToMany(mappedBy = "country")
  private Collection<Town> towns;
  @OneToMany(mappedBy = "country")
  private Collection<User> users;


}

