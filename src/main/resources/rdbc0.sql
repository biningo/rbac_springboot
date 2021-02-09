create table api
(
    id           INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    url_path     VARCHAR(50)                    NOT NULL,
    api_describe VARCHAR(300)                   NOT NULL,
    status       BOOL DEFAULT 0                 NOT NULL,
    update_time  TIMESTAMP                      NOT NULL,
    create_time  TIMESTAMP                      NOT NULL,
    delete_time  TIMESTAMP
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

create table permission
(
    id                  INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    title               VARCHAR(50)                    NOT NULL,
    permission_describe VARCHAR(300)                   NOT NULL,
    status              BOOL DEFAULT 0                 NOT NULL,
    update_time         TIMESTAMP                      NOT NULL,
    create_time         TIMESTAMP                      NOT NULL,
    delete_time         TIMESTAMP
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

create table role
(
    id            INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    title         VARCHAR(50)                    NOT NULL,
    role_describe VARCHAR(300)                   NOT NULL,
    status        BOOL DEFAULT 0                 NOT NULL,
    update_time   TIMESTAMP                      NOT NULL,
    create_time   TIMESTAMP                      NOT NULL,
    delete_time   TIMESTAMP
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

create table user
(
    id            INT PRIMARY KEY AUTO_INCREMENT,
    username      VARCHAR(100) NOT NULL,
    password      VARCHAR(50)  NOT NULL,
    avatar_url    VARCHAR(200),
    user_describe VARCHAR(300),
    role_id       INT          NOT NULL,
    FOREIGN KEY fk_role (role_id) REFERENCES role (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;


create table api_permission
(
    id            INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    api_id        INT                            NOT NULL,
    permission_id INT                            NOT NULL,
    FOREIGN KEY fk_api (api_id) REFERENCES api (id),
    FOREIGN KEY fk_permission (permission_id) REFERENCES permission (id),
    UNIQUE uq_api_permission (api_id, permission_id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
create table role_permission
(
    id            INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    role_id       INT                            NOT NULL,
    permission_id INT                            NOT NULL,
    FOREIGN KEY fk_role (role_id) REFERENCES role (id),
    FOREIGN KEY fk_permission (permission_id) REFERENCES permission (id),
    UNIQUE uq_role_permission (role_id, permission_id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;