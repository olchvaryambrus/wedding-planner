INSERT INTO GROUP_OF_TASKS (id, name, is_done) VALUES (1, 'Előkészületek', false);
INSERT INTO GROUP_OF_TASKS (id, name, is_done) VALUES (2, 'Helyszín', false);
INSERT INTO GROUP_OF_TASKS (id, name, is_done) VALUES (3, 'Esküvőiruha', false);
INSERT INTO GROUP_OF_TASKS (id, name, is_done) VALUES (4, 'Esküvői menü', false);
INSERT INTO GROUP_OF_TASKS (id, name, is_done) VALUES (5, 'Esküvői zene', false);
INSERT INTO GROUP_OF_TASKS (id, name, is_done) VALUES (6, 'Meghívók', false);

INSERT INTO WEDDING_TASK (id, name, type, is_done, group_id) VALUES (1, 'Ruha szalon kiválasztása', 2, false, (select id from group_of_tasks where (name = 'Esküvőiruha')));
INSERT INTO WEDDING_TASK (id, name, type, is_done, group_id) VALUES (2, 'Ruha kiválasztása', 0, false, (select id from group_of_tasks where (name = 'Esküvőiruha')));
INSERT INTO WEDDING_TASK (id, name, type, is_done, group_id) VALUES (3, 'Ruha kölcsönzése', 1, false, (select id from group_of_tasks where (name = 'Esküvőiruha')));
INSERT INTO WEDDING_TASK (id, name, type, is_done, group_id) VALUES (4, 'Ruha tisztítása', 2, false, (select id from group_of_tasks where (name = 'Esküvőiruha')));
INSERT INTO WEDDING_TASK (id, name, type, is_done, group_id) VALUES (5, 'Ruha visszavitele', 1, false, (select id from group_of_tasks where (name = 'Esküvőiruha')));
INSERT INTO WEDDING_TASK (id, name, type, is_done, group_id) VALUES (6, 'Meghívók szétküldése', 0, false, (select id from group_of_tasks where (name = 'Meghívók')));
INSERT INTO WEDDING_TASK (id, name, type, is_done, group_id) VALUES (7, 'Értesíteni a családtagokat', 0, false, (select id from group_of_tasks where (name = 'Előkészületek')));
INSERT INTO WEDDING_TASK (id, name, type, is_done, group_id) VALUES (8, 'Esküvő helyszíne', 2, false, (select id from group_of_tasks where (name = 'Helyszín')));
INSERT INTO WEDDING_TASK (id, name, type, is_done, group_id) VALUES (9, 'Ételek kiválasztása', 0, false, (select id from group_of_tasks where (name = 'Esküvői menü')));
INSERT INTO WEDDING_TASK (id, name, type, is_done, group_id) VALUES (10, 'Kötelező zeneszámok', 0, false, (select id from group_of_tasks where (name = 'Esküvői zene')));

INSERT INTO SOLUTION_OPTION (id, name, text, task_id) VALUES (1, 'első megoldási lehetőség', 'The Shiba Inu is the smallest of the six original and distinct spitz breeds of dog from Japan. A small, agile dog that copes very well with mountainous terrain, the Shiba Inu was originally bred for hunting.', (select id from wedding_task where (name = 'Ruha szalon kiválasztása')));
INSERT INTO SOLUTION_OPTION (id, name, text, task_id) VALUES (2, 'második megoldási lehetőség', 'teszt', (select id from wedding_task where (name = 'Ruha szalon kiválasztása')));
INSERT INTO SOLUTION_OPTION (id, name, text, task_id) VALUES (3, 'harmadik megoldási lehetőség', 'The Shiba Inu is the smallest of the six original and distinct spitz breeds of dog from Japan. A small, agile dog that copes very well with mountainous terrain, the Shiba Inu was originally bred for hunting.', (select id from wedding_task where (name = 'Ruha szalon kiválasztása')));
INSERT INTO SOLUTION_OPTION (id, name, text, task_id) VALUES (4, 'negyedik megoldási lehetőség', 'teszt', (select id from wedding_task where (name = 'Ruha szalon kiválasztása')));
INSERT INTO SOLUTION_OPTION (id, name, text, task_id) VALUES (5, 'ötödik megoldási lehetőség', 'teszt', (select id from wedding_task where (name = 'Ruha kiválasztása')));
INSERT INTO SOLUTION_OPTION (id, name, text, task_id) VALUES (6, 'hatodik megoldási lehetőség', 'teszt', (select id from wedding_task where (name = 'Ruha kiválasztása')));

INSERT INTO TASK_NOTE (id, text, task_id) VALUES (1, 'The Shiba Inu is the smallest of the six original and distinct spitz breeds of dog from Japan. A small, agile dog that copes very well with mountainous terrain, the Shiba Inu was originally bred for hunting.', (select id from wedding_task where (name = 'Ruha szalon kiválasztása')));
INSERT INTO TASK_NOTE (id, text, task_id) VALUES (2, 'The Shiba Inu is the smallest of the six original and distinct spitz breeds of dog from Japan. A small, agile dog that copes very well with mountainous terrain, the Shiba Inu was originally bred for hunting.', (select id from wedding_task where (name = 'Ruha szalon kiválasztása')));
INSERT INTO TASK_NOTE (id, text, task_id) VALUES (3, 'The Shiba Inu is the smallest of the six original and distinct spitz breeds of dog from Japan. A small, agile dog that copes very well with mountainous terrain, the Shiba Inu was originally bred for hunting.', (select id from wedding_task where (name = 'Ruha szalon kiválasztása')));
INSERT INTO TASK_NOTE (id, text, task_id) VALUES (4, 'teszt', (select id from wedding_task where (name = 'Ruha kiválasztása')));
INSERT INTO TASK_NOTE (id, text, task_id) VALUES (5, 'teszt', (select id from wedding_task where (name = 'Ruha kiválasztása')));
INSERT INTO TASK_NOTE (id, text, task_id) VALUES (6, 'teszt', (select id from wedding_task where (name = 'Ruha kiválasztása')));