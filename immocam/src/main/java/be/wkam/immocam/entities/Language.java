package be.wkam.immocam.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;



@Entity
@Table(name = "langues")
@Data @NoArgsConstructor
public class Language implements Serializable {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String code;
    private String description;
    private Date createdAt;

    @OneToMany(mappedBy = "language")
    private Collection<User> users;


}
