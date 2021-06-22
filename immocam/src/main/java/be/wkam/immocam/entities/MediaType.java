package be.wkam.immocam.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;


/*
 *  differents tyoes of media available:
 * FILE(pdf, doc, docx, odt)- IMAGE (png, jpg, gif)- VIDEO(mp4, avi, etc.. )
 * */
@Entity
@Table(name ="media_types")
@Data @NoArgsConstructor
public class MediaType implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Date  createdAt ;


    @OneToMany(mappedBy = "mediaType")
    private Collection<Media> medias;


}
