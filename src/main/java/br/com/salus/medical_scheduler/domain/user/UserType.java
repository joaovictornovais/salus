package br.com.salus.medical_scheduler.domain.user;

import lombok.Getter;

@Getter
public enum UserType {

    PATIENT("PATIENT"),
    DOCTOR("DOCTOR"),
    RECEPTIONIST("RECEPTIONIST");

    private final String type;

    UserType(String type) {
        this.type = type;
    }

}
