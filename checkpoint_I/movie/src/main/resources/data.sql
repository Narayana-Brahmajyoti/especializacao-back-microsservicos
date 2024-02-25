CREATE TABLE Movie (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  genre VARCHAR(255) NOT NULL,
  urlStream VARCHAR(255) NOT NULL

);

INSERT INTO movie (name, genre, urlStream) VALUES ('Velozes e furiosos 10', 'Ação', 'https://cinepop.com.br/wp-content/uploads/2023/02/velozesefuriosos10_5.jpg');
INSERT INTO movie (name, genre, urlStream) VALUES ('Orgulho e preconceito	', 'Romance', 'https://media.fstatic.com/PIALTeV94nblOSSnSrzqLzFiXE8=/322x478/smart/filters:format(webp)/media/movies/covers/2011/07/53432b237d6bab70105440d7c852b251.jpg');
INSERT INTO movie (name, genre, urlStream) VALUES ('IT: A Coisa', 'Terror', 'https://upload.wikimedia.org/wikipedia/pt/8/82/It_2017.jpg');
INSERT INTO movie (name, genre, urlStream) VALUES ('Um olhar do paraíso', 'Drama', 'https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRQ2JhxnEn_4C1Rt7CQxWH-759Fdm6Frmol8GMzXPp1p8zyMDKa');
INSERT INTO movie (name, genre, urlStream) VALUES ('Filme Comédia', 'Ação', 'http://testeAcao.com');
INSERT INTO movie (name, genre, urlStream) VALUES ('Filme 2', 'Romance', 'http://testeRomance.com');
INSERT INTO movie (name, genre, urlStream) VALUES ('Filme 2', 'Terror', 'http://testeTerror.com');
INSERT INTO movie (name, genre, urlStream) VALUES ('Filme 2', 'Drama', 'http://testeDrama.com');


