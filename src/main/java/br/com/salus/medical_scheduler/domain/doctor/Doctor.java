package br.com.salus.medical_scheduler.domain.doctor;

import br.com.salus.medical_scheduler.domain.consultation.Consultation;
import br.com.salus.medical_scheduler.domain.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Doctor extends User {

    private String mlc;
    private String speciality;

    @OneToMany(mappedBy = "doctor")
    private List<Consultation> agenda;

}
