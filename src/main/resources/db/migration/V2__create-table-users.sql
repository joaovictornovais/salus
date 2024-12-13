CREATE TABLE users(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    phone VARCHAR(15) NOT NULL UNIQUE,
    document VARCHAR(14) NOT NULL UNIQUE,
    birth_date TIMESTAMP NOT NULL,
    gender CHAR NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    type VARCHAR(12) NOT NULL,
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP NOT NULL,

    address_id UUID,
    FOREIGN KEY (address_id) REFERENCES addresses(id) ON DELETE CASCADE
);