package br.com.salus.medical_scheduler.domain.user;

import br.com.salus.medical_scheduler.domain.address.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.UUID;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Data
@Builder
public class User {

    @Id
    @Builder.Default
    private UUID id = UUID.randomUUID();
    private String firstName;
    private String lastName;
    private String phone;
    private String document;
    private LocalDate birthDate;
    @Enumerated(EnumType.STRING)
    private UserGender gender;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserType type;

    @Builder.Default
    private Instant createdAt = LocalDateTime.now().toInstant(ZoneOffset.of("-03:00"));
    @Builder.Default
    private Instant updatedAt = LocalDateTime.now().toInstant(ZoneOffset.of("-03:00"));

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

}
