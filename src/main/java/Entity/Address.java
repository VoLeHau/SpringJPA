package Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "address", nullable = false, length = 256)
    private String address;

    @Column( name = "address2", nullable = false, length = 256)
    private String address2;

    @Column(name = "addressExtension")
    private String addressExtension;

    @Column(name = "district", nullable = false, length = 128)
    private String district;

    @Column(name = "postalCode")
    private String postalCode;

    @Column(name = "phone_number", nullable = false, length = 15)
    private String phoneNumber;

    @OneToMany(mappedBy = "address")
    private Set<Customer> customers = new HashSet<Customer>();

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    public Address(String address, String address2, String addressExtension, String district, String postalCode, String phoneNumber, City city) {
        this.address = address;
        this.address2 = address2;
        this.addressExtension = addressExtension;
        this.district = district;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
        this.city = city;
    }
}
