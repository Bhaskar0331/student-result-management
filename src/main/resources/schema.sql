create table IF NOT EXISTS STUDENT (
    id INTEGER NOT NULL,
    name VARCHAR(200) NOT NULL,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    email VARCHAR(150) NOT NULL,
    dob VARCHAR(20) NOT NULL,
    primary key (id)
);

create table IF NOT EXISTS COURSE(
    id INTEGER NOT NULL,
    name VARCHAR(255) NOT NULL,
    primary key (id)
);

create table IF NOT EXISTS RESULT(
    id INTEGER NOT NULL,
    course_id INTEGER NOT NULL,
    student_id INTEGER NOT NULL,
    score VARCHAR(10) NOT NULL,
    primary key (id)
);