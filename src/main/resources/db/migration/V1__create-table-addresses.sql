CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE addresses(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    street VARCHAR(50) NOT NULL,
    number VARCHAR(6) NOT NULL,
    complement VARCHAR(50) NOT NULL,
    zip_code VARCHAR(9) NOT NULL,
    city VARCHAR(50) NOT NULL,
    state VARCHAR(2) NOT NULL
);