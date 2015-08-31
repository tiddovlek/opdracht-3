


mysql>create table tiddo (
    studentnr varchar(5),
    roepnaam varchar(10),
    voorletters varchar(10),
    tussenvoegsels varchar(8),
    achternaam varchar(25),
    adres varchar(25),
    postcode varchar(7),
    woonplaats varchar(25),
geslacht char(1),
telefoon varchar(11),
    geboortedatum date,
    uitgeschreven date,
schoolgeld decimal(6,2),
betaald decimal(6,2),
    primary key(studentnr)
) engine = innodb;

insert into student (studentnr, roepnaam, voorletters, tussenvoegsels, achternaam, adres, postcode, woonplaats, geslacht, telefoon, geboortedatum)
values
('1111','Piet','P.',null,'Pietersen','Pietstraat 2','1111 PP','Almere','M','036-1234567','1995-02-20', 500, 500),
('2222','Jan','J.',null,'Jansen','Janstraat 34','2222 JJ','Almere','M','036-9876543','1995-11-20', 500, 500);