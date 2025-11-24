DO
$$
BEGIN
    IF
NOT EXISTS (SELECT 1 FROM ecommerce.gender WHERE id = 1) THEN
        INSERT INTO ecommerce.gender (id, changed_on, created_on, entity_status, desctiption, "name")
        VALUES (1, now(), now(), 0, 'MALE', 'MALE');
END IF;

    IF
NOT EXISTS (SELECT 1 FROM gender WHERE id = 2) THEN
        INSERT INTO gender (id, changed_on, created_on, entity_status, desctiption, "name")
        VALUES (2, now(),now(), 0, 'FEMALE', 'FEMALE');
END IF;

    IF
NOT EXISTS (SELECT 1 FROM gender WHERE id = 3) THEN
        INSERT INTO gender (id, changed_on, created_on, entity_status, desctiption, "name")
        VALUES (3,now(), now(), 0, 'OTHERS', 'OTHERS');
END IF;
END
$$;

DO
$$
BEGIN
    IF
NOT EXISTS (SELECT 1 FROM identity_type WHERE id = 1) THEN
        INSERT INTO identity_type (id, changed_on, created_on, entity_status, desctiption, "name")
        VALUES (1, now(), now(), 0, 'EMPLOYEE', 'EMP');
END IF;

    IF
NOT EXISTS (SELECT 1 FROM identity_type WHERE id = 2) THEN
        INSERT INTO identity_type (id, changed_on, created_on, entity_status, desctiption, "name")
        VALUES (2, now(), now(), 0, 'ADMIN', 'ADMIN');
END IF;
END
$$;

DO
$$
BEGIN
    IF
NOT EXISTS (SELECT 1 FROM role_type WHERE id = 1) THEN
 INSERT INTO role_type (id, changed_on, created_on, entity_status, desctiption, "name") VALUES(1, now(), now(), 0, 'ApplicationRole', 'ApplictionRole');

END IF;
END
$$;


DO
$$
BEGIN
    IF
NOT EXISTS (SELECT 1 FROM "role" WHERE id = 1) THEN
    INSERT INTO "role" (id, changed_on, created_on, entity_status, desctiption, "name", "type")
    VALUES(1, now(), now(), 0, 'EndUser', 'EndUser', 'ApplictionRole');

END IF;

    IF
NOT EXISTS (SELECT 1 FROM "role" WHERE id = 2) THEN
    INSERT INTO "role" (id, changed_on, created_on, entity_status, desctiption, "name", "type")
    VALUES(2, now(), now(), 0, 'Admin', 'Admin', 'ApplictionRole');
END IF;
END
$$;

DO
$$
BEGIN
    IF
NOT EXISTS (SELECT 1 FROM "identity" WHERE id = 1) THEN
INSERT INTO "identity" (id, changed_on, created_on, entity_status, date_of_birth, first_name, last_name, mail, gender, "type") VALUES(1, now(), now(), 0, '2015-11-24 15:16:17.696', 'ADMIN', 'USER', 'ADMIN@abc.com', 'MALE', 'ADMIN');


END IF;

    IF
NOT EXISTS (SELECT 1 FROM "identity" WHERE id = 2) THEN
INSERT INTO "identity" (id, changed_on, created_on, entity_status, date_of_birth, first_name, last_name, mail, gender, "type") VALUES(2, now(), now(), 0, '2015-11-24 15:16:17.696', 'END', 'USER', 'END_USER@abc.com', 'MALE', 'EMP');
END IF;
END
$$;
