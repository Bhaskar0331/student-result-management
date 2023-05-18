INSERT INTO STUDENT (id, name, first_name, last_name, email, dob) VALUES(1, 'John Smith', 'John', 'Smith', 'js@google.com', '25-Jan-1995');
INSERT INTO STUDENT (id, name, first_name, last_name, email, dob) VALUES(2, 'John Doe', 'John', 'Doe', 'jd@amazon.com', '02-Jun-1996');
INSERT INTO STUDENT (id, name, first_name, last_name, email, dob) VALUES(3, 'John Dow', 'John', 'Dow', 'jd@yahoo.com', '07-Mar-1995');

INSERT INTO COURSE (id, name) VALUES(1, 'Web Application Scripting');
INSERT INTO COURSE (id, name) VALUES(2, 'Database Management');

INSERT INTO RESULT (id, course_id, student_id, score) VALUES(1, 1, 1, 'A');
INSERT INTO RESULT (id, course_id, student_id, score) VALUES(2, 2, 2, 'B');
INSERT INTO RESULT (id, course_id, student_id, score) VALUES(3, 1, 3, 'D');
INSERT INTO RESULT (id, course_id, student_id, score) VALUES(4, 2, 1, 'F');