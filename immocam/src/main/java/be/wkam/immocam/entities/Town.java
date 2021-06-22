package be.wkam.immocam.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "towns")
@Data @NoArgsConstructor
public class Town implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

   String  code;

   String  name ;
    boolean deleteIntegrity;
    Date createdAt;
    Date updatedAt;
@ManyToOne
@JoinColumn(name = "country_id")
private Country country;
@OneToMany(mappedBy = "town", fetch =FetchType.LAZY)
private Collection<Realty> realties;


}

