package be.wkam.immocam.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
@Entity
@Data @NoArgsConstructor
public class Town implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String countryId;
    private String code;
    private String name;
    private String deleteIntegrity;
    private String createdAt;
    private String updatedAt;

    @OneToMany(mappedBy = "towns", fetch = FetchType.LAZY)
    private Collection<Realty> realties;

    @ManyToOne
    @JoinColumn (name = "countries_id")
    private Country country;
}
