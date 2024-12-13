package br.com.salus.medical_scheduler.domain.user;

import lombok.Getter;

@Getter
public enum UserGender {
    M('M'),
    F('F');

    private final char gender;

    UserGender(char gender) {
        this.gender = gender;
    }
}
