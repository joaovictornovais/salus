package br.com.salus.medical_scheduler.domain.address;

import br.com.salus.medical_scheduler.domain.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "addresses")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Address {

    @Id
    @Builder.Default
    private UUID id = UUID.randomUUID();
    private String street;
    private String number;
    private String complement;
    private String zipCode;
    private String city;
    private String state;

    @OneToOne(mappedBy = "address")
    private User user;

}
