package be.wkam.immocam.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data @NoArgsConstructor
public class Media implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String link;
    private String type;
    private String size;
    private boolean deleteIntegrity ;
    private Date createdAt;

    @ManyToOne
    @JoinColumn (name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn (name = "media_types_id")
    private MediaType mediaType;

    @ManyToOne
    @JoinColumn (name = "realties_id")// modifier dans la bdd le i
    private Realty realty;

}
