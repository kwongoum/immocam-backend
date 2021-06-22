package be.wkam.immocam.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "medias")
@Data @NoArgsConstructor
public class Media implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
private Long id;

    private  String  name;
    private String link;
    private String type;
    private String  size;
    private boolean deleteIntegrity;
    private Date createdAt;

        @ManyToOne
   @JoinColumn( name="media_type_id")
   private MediaType mediaType;

    @ManyToOne
    @JoinColumn( name="realty_id")
    private Realty realty;

    @ManyToOne
    @JoinColumn( name ="user_id")
    private User user;

}

