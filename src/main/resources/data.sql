INSERT INTO ANIMAL (ID,NAME,DESCRIPTION,IMAGE)VALUES (1,'Kip','Legt een ei','/img/chicken.jpg');
INSERT INTO ANIMAL (ID,NAME,DESCRIPTION,IMAGE)VALUES (2,'Varken','Speelt in modder','/img/pig.png');
INSERT INTO ANIMAL (ID,NAME,DESCRIPTION,IMAGE)VALUES (3,'Koe','Geeft melk','/img/cow.jpg');
INSERT INTO ANIMAL (ID,NAME,DESCRIPTION,IMAGE)VALUES (4,'Wolf','Kan getemd worden','/img/wolf.jpg');
INSERT INTO ANIMAL (ID,NAME,DESCRIPTION,IMAGE)VALUES (5,'Konijn','Komt je wortels opeten','/img/konijn.jpg');

INSERT INTO FOOD (ID,NAME,DESCRIPTION,IMAGE)VALUES (1,'Graan','Kan gezaaid worden','/img/tarwe.png');
INSERT INTO FOOD (ID,NAME,DESCRIPTION,IMAGE)VALUES (2,'Wortel','Kan geplant worden','/img/wortel.jpg');

INSERT INTO MATERIAL (ID,NAME,DESCRIPTION,IMAGE)VALUES (1,'Zand','Korrelig','/img/zand.jpg');
INSERT INTO MATERIAL (ID,NAME,DESCRIPTION,IMAGE)VALUES (2,'Wol','Wollig','/img/wol.jpg');
INSERT INTO MATERIAL (ID,NAME,DESCRIPTION,IMAGE)VALUES (3,'Leer','Ideaal materiaal om kledij van te maken','/img/leer.jpg');

INSERT INTO ANIMAL_FOOD(ANIMAL_ID,FOOD_ID)VALUES(3,1);
INSERT INTO ANIMAL_FOOD(ANIMAL_ID,FOOD_ID)VALUES(2,2);
INSERT INTO ANIMAL_FOOD(ANIMAL_ID,FOOD_ID)VALUES(5,2);
