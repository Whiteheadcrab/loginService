package whiteheadcrab.springframework.jsonConverter.model;

import lombok.Data;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Data
@Entity
public class Account
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nip;

    //Data of account
    private String firstname;
    private String lastname;
    private String firmName;
    private String streetName;
    private Long houseNumber;
    private Long flatNumber;
    private Long postCode;
    private String town;
    private String telephoneNumber;

    //Date to login
    private String login;
    private String password;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Parcel> Parcels = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL)
    private Receiver Receiver;
}