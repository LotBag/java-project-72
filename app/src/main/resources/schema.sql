DROP TABLE IF EXISTS urls CASCADE;

CREATE TABLE urls (
                      id BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
                      name VARCHAR(255) NOT NULL,
                      created_at TIMESTAMP NOT NULL,
                      CONSTRAINT pk_urls PRIMARY KEY (id)
);

DROP TABLE IF EXISTS url_checks;

CREATE TABLE url_checks (
                            id BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
                            url_id BIGINT REFERENCES urls (id) NOT NULL,
                            status_code INTEGER,
                            h1 VARCHAR(255),
                            title VARCHAR(255),
                            description TEXT,
                            created_at TIMESTAMP NOT NULL,
                            CONSTRAINT pk_url_checks PRIMARY KEY (id)
);