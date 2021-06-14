package be.wkam.immocam.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

//  have to choose language beetween en/fr
@Entity
@Table(name = "langues")
@Data @NoArgsConstructor
public class Language implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
//    private String country;
    private  String description;
    private Date createdAt;

    @OneToMany(mappedBy = "language", fetch = FetchType.LAZY)
    private Collection<User> users;
}
