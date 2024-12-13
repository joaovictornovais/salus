package br.com.salus.medical_scheduler.domain.patient;

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
public class Patient extends User {

    private String medicalHistory;

    @OneToMany(mappedBy = "patient")
    private List<Consultation> consultations;

}
