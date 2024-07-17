

USE expensetracker-2;


CREATE TABLE User (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL
);

CREATE TABLE Category (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    description VARCHAR(255),
    user_id BIGINT,
    FOREIGN KEY (user_id) REFERENCES User(id)
);

CREATE TABLE Expenses (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    amount DOUBLE NOT NULL,
    description VARCHAR(255),
    date DATE,
    category_id BIGINT,
    user_id BIGINT,
    FOREIGN KEY (category_id) REFERENCES Category(id),
    FOREIGN KEY (user_id) REFERENCES User(id)
);

CREATE TABLE Budget (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    amount DOUBLE NOT NULL,
    start_date DATE,
    end_date DATE,
    user_id BIGINT,
    FOREIGN KEY (user_id) REFERENCES User(id)
);

-- Insert Sample Data
INSERT INTO User (username, password, email) VALUES
('javi_jones', 'password567', 'javijones@gmail.com'),
('antony_vue', 'password123', 'antonyv@gmail.com');

INSERT INTO Category (name, description, user_id) VALUES
('Food', 'Expenses for food and groceries', 1),
('Travel', 'Expenses for travel and transportation', 1),
('Utilities', 'Monthly utility bills', 2);

INSERT INTO Expenses (amount, description, date, category_id, user_id) VALUES
(90.0, 'Grocery shopping', '2023-07-01', 1, 1),
(44.0, 'Uber ride', '2023-07-02', 2, 1),
(113.0, 'Electricity bill', '2023-07-01', 3, 2);

INSERT INTO Budget (amount, start_date, end_date, user_id) VALUES
(500.0, '2023-07-01', '2023-07-31', 1),
(600.0, '2023-07-01', '2023-07-31', 2);

SELECT * FROM USER;
SELECT * FROM Category;
SELECT * FROM Expenses;
