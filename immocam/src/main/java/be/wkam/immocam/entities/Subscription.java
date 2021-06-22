package be.wkam.immocam.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "subscriptions")

public class Subscription {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double weeklyPrice;
    private double monthlyPrice;
    private double threeMonthlyPrice;
    private double yearlyPrice;
    private String description;
    private Date createdAt;

    @ManyToMany(mappedBy = "subscriptions")
    private List<User> users;

}
