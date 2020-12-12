INSERT INTO GROUP_OF_TASKS (id, name, is_done) VALUES (1, 'első csoport', false);
INSERT INTO GROUP_OF_TASKS (id, name, is_done) VALUES (2, 'második csoport', false);
INSERT INTO GROUP_OF_TASKS (id, name, is_done) VALUES (3, 'harmadik csoport', false);
INSERT INTO GROUP_OF_TASKS (id, name, is_done) VALUES (4, 'negyedik csoport', false);
INSERT INTO GROUP_OF_TASKS (id, name, is_done) VALUES (5, 'ötödik csoport', false);
INSERT INTO GROUP_OF_TASKS (id, name, is_done) VALUES (6, 'hatodik csoport', false);

INSERT INTO WEDDING_TASK (id, name, type, is_done, group_id) VALUES (1, 'első feladat', 0, false, (select id from group_of_tasks where (name = 'harmadik csoport')));
INSERT INTO WEDDING_TASK (id, name, type, is_done, group_id) VALUES (2, 'második feladat', 2, false, (select id from group_of_tasks where (name = 'harmadik csoport')));
INSERT INTO WEDDING_TASK (id, name, type, is_done, group_id) VALUES (3, 'harmadik feladat', 2, false, (select id from group_of_tasks where (name = 'harmadik csoport')));
INSERT INTO WEDDING_TASK (id, name, type, is_done, group_id) VALUES (4, 'negyedik feladat', 1, false, (select id from group_of_tasks where (name = 'harmadik csoport')));
INSERT INTO WEDDING_TASK (id, name, type, is_done, group_id) VALUES (5, 'ötödik feladat', 0, false, (select id from group_of_tasks where (name = 'harmadik csoport')));
INSERT INTO WEDDING_TASK (id, name, type, is_done, group_id) VALUES (6, 'hatodik feladat', 1, false, (select id from group_of_tasks where (name = 'hatodik csoport')));

INSERT INTO SOLUTION_OPTION (id, name, text, task_id) VALUES (1, 'első megoldási lehetőség', 'The Shiba Inu is the smallest of the six original and distinct spitz breeds of dog from Japan. A small, agile dog that copes very well with mountainous terrain, the Shiba Inu was originally bred for hunting.', (select id from wedding_task where (name = 'első feladat')));
INSERT INTO SOLUTION_OPTION (id, name, text, task_id) VALUES (2, 'második megoldási lehetőség', 'teszt', (select id from wedding_task where (name = 'első feladat')));
INSERT INTO SOLUTION_OPTION (id, name, text, task_id) VALUES (3, 'harmadik megoldási lehetőség', 'The Shiba Inu is the smallest of the six original and distinct spitz breeds of dog from Japan. A small, agile dog that copes very well with mountainous terrain, the Shiba Inu was originally bred for hunting.', (select id from wedding_task where (name = 'első feladat')));
INSERT INTO SOLUTION_OPTION (id, name, text, task_id) VALUES (4, 'negyedik megoldási lehetőség', 'teszt', (select id from wedding_task where (name = 'első feladat')));
INSERT INTO SOLUTION_OPTION (id, name, text, task_id) VALUES (5, 'ötödik megoldási lehetőség', 'teszt', (select id from wedding_task where (name = 'második feladat')));
INSERT INTO SOLUTION_OPTION (id, name, text, task_id) VALUES (6, 'hatodik megoldási lehetőség', 'teszt', (select id from wedding_task where (name = 'második feladat')));

INSERT INTO TASK_NOTE (id, text, task_id) VALUES (1, 'The Shiba Inu is the smallest of the six original and distinct spitz breeds of dog from Japan. A small, agile dog that copes very well with mountainous terrain, the Shiba Inu was originally bred for hunting.', (select id from wedding_task where (name = 'első feladat')));
INSERT INTO TASK_NOTE (id, text, task_id) VALUES (2, 'The Shiba Inu is the smallest of the six original and distinct spitz breeds of dog from Japan. A small, agile dog that copes very well with mountainous terrain, the Shiba Inu was originally bred for hunting.', (select id from wedding_task where (name = 'első feladat')));
INSERT INTO TASK_NOTE (id, text, task_id) VALUES (3, 'The Shiba Inu is the smallest of the six original and distinct spitz breeds of dog from Japan. A small, agile dog that copes very well with mountainous terrain, the Shiba Inu was originally bred for hunting.', (select id from wedding_task where (name = 'első feladat')));
INSERT INTO TASK_NOTE (id, text, task_id) VALUES (4, 'teszt', (select id from wedding_task where (name = 'második feladat')));
INSERT INTO TASK_NOTE (id, text, task_id) VALUES (5, 'teszt', (select id from wedding_task where (name = 'második feladat')));
INSERT INTO TASK_NOTE (id, text, task_id) VALUES (6, 'teszt', (select id from wedding_task where (name = 'második feladat')));