CREATE TABLE
    skill
    (
        id BIGINT NOT NULL,
        name VARCHAR,
        value VARCHAR,
        PRIMARY KEY (id)
    );

CREATE TABLE
    hibernate_sequence
    (
        next_val BIGINT
    );

INSERT INTO skill (id, name, value)
  VALUES (1, 'JAVA', 'Java');
INSERT INTO skill (id, name, value)
  VALUES (1, 'JS', 'Javascript');
INSERT INTO skill (id, name, value)
  VALUES (1, 'HTML', 'Html');

INSERT INTO hibernate_sequence (next_val) VALUES (4);