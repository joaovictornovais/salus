CREATE TABLE doctors(
    user_id UUID PRIMARY KEY,
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
    mlc VARCHAR(10) NOT NULL UNIQUE,
    SPECIALITY VARCHAR(50) NOT NULL
);