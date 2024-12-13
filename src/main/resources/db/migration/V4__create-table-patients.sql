CREATE TABLE patients(
    user_id UUID PRIMARY KEY,
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
    medical_history TEXT
);