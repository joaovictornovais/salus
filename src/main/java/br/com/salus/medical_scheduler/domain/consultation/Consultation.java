package br.com.salus.medical_scheduler.domain.consultation;

import br.com.salus.medical_scheduler.domain.doctor.Doctor;
import br.com.salus.medical_scheduler.domain.patient.Patient;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "consultations")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Consultation {

    @Id
    @Builder.Default
    private UUID id = UUID.randomUUID();
    private LocalDateTime date;
    @Enumerated(EnumType.STRING)
    private ConsultationStatus status;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;


}
