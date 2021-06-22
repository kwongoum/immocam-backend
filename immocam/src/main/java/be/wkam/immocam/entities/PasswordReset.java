package be.wkam.immocam.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name="password_resets")
@Data @NoArgsConstructor
public class PasswordReset implements Serializable {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
    private  Long id;

    private  String email;
    private  String token;
    private Date  createdAt;


}
