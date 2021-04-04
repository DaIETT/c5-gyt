#第八周作业
CREATE TABLE `user`(
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       username VARCHAR(20),
                       mobile VARCHAR(20),
                       `password` VARCHAR(50),
                       `name` VARCHAR(20),
                       birthday DATE,
                       sex VARCHAR(1),
                       email VARCHAR(20),
                       createtime DATE,
                       updatetime DATE
);

INSERT INTO `user`(username, mobile, PASSWORD, NAME)
VALUES('Dale','123123','123123','DAleGG');

ALTER TABLE `user` MODIFY COLUMN sex VARCHAR(10);