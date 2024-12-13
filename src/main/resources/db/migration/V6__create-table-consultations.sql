CREATE TABLE consultations(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    patient_id UUID,
    FOREIGN KEY (patient_id) REFERENCES patients(user_id) ON DELETE CASCADE,
    doctor_id UUID,
    FOREIGN KEY (doctor_id) REFERENCES doctors(user_id) ON DELETE CASCADE,
    date DATE NOT NULL,
    status VARCHAR(9) NOT NULL
);