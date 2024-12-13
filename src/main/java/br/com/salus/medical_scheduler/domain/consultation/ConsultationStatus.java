package br.com.salus.medical_scheduler.domain.consultation;

import lombok.Getter;

@Getter
public enum ConsultationStatus {

    SCHEDULED("SCHEDULED"),
    CANCELED("CANCELED"),
    FINISHED("FINISHED");

    private final String status;

    ConsultationStatus(String status) {
        this.status = status;
    }

}
