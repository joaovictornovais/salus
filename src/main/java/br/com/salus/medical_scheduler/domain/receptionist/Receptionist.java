package br.com.salus.medical_scheduler.domain.receptionist;

import br.com.salus.medical_scheduler.domain.user.User;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Receptionist extends User {

    private String sector;

}
