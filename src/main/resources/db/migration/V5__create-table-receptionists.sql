CREATE TABLE receptionists(
    user_id UUID PRIMARY KEY,
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
    sector VARCHAR(50) NOT NULL
);