CREATE DATABASE `homework`;

USE `homework`;


#1
CREATE TABLE cqupt_student (
Studentid VARCHAR(10),
NAME VARCHAR(20),
Sex VARCHAR(2),
Age INTEGER,
Fee DECIMAL(10,2),
Address VARCHAR(50),
Memo VARCHAR(300)
);

#2
CREATE TABLE CourseAa(
Aa1 VARCHAR(20),
An2 INTEGER,
Aa3 DECIMAL(10)
);

#3
CREATE TABLE ChooseBb (
Bb1 VARCHAR(30),
Bb2 INTEGER,
Bb3 DECIMAL(6)
);

#4
ALTER TABLE `choosebb` ADD `Bb4` VARCHAR(20) NOT NULL DEFAULT '系统测试值';

#5
ALTER TABLE `ChooseBb` ADD `Bb5` VARCHAR(10) PRIMARY KEY;

#6
CREATE VIEW View_Choosebb  (View_bb1,View_bb2,View_bb3)  AS SELECT Bb1,Bb4,Bb5 FROM `choosebb`;

#7
DROP VIEW View_Choosebb;

#8
CREATE INDEX index_bb2 ON `choosebb`(Bb2 ASC)
CREATE INDEX index_bb4 ON `choosebb`(Bb4 DESC) ;

#9
DROP INDEX index_bb2 ON choosebb;

#10
CREATE TABLE test(
   NAME VARCHAR(20),
   age INTEGER,
   Score NUMERIC(20,2),
   address VARCHAR(60)
)

#11
INSERT INTO test(`name`,`age`,`score`,`address`)VALUES
('赵一',20,580.00,'重邮宿舍12-3-5'),
('钱二',19,540.00,'南福苑5-2-9'),
('孙三',21,555.00,'学生新区21-5-15'),
('李四',22,505.00,'重邮宿舍8-6-22'),
('周五',20,495.00,'学生新区23-4-8'),
('吴六',19,435.00,'南福苑2-5-12');

#12
CREATE TABLE test_temp(
	NAME VARCHAR(20),
	age INTEGER,
	score NUMERIC(10,2),
	Address VARCHAR(60)
);


#13
INSERT INTO test_temp(`name`,`age`,`score`,`Address`)
VALUES
('郑七',21,490.00,'重邮宿舍11-2-1'),
('张八',20,560,'南福苑3-3-3'),
('王九',10,515.00,'学生新区19-7-1');


#14
INSERT INTO `test` SELECT * FROM test_temp;


#15
UPDATE `test` SET `Score` = `Score`+5
WHERE `age` <= 20;

#16
UPDATE test SET age = age - 1;
WHERE address LIKE '%南福苑%';

#17
DELETE FROM test
WHERE age > 21 AND score >=500;

#18
DELETE FROM test
WHERE score<550 AND address LIKE '%重邮宿舍%';

#19
CREATE TABLE student(
	SNO VARCHAR(20),
	NAME VARCHAR(10),
	Age INTEGER,
	College VARCHAR(30)
);

#20
CREATE TABLE Course(
	CourseID VARCHAR(15),
	CourseName VARCHAR(30),
	CourseBeforeID VARCHAR(15)
);

#21
CREATE TABLE Choose(
	SNO VARCHAR(20),
	CourseID VARCHAR(30),
	Score DECIMAL(5,2)
);

#22
INSERT INTO Student(`SNO`,`name`,`age`,`college`)
VALUES
('s00001','张三',20,'计算机学院'),
('s00002','李四',19,'通信学院'),
('s00003','王五',21,'计算机学院');


#23
INSERT INTO Course(`CourseID`,`CourseName`,`CourseBeforeID`)
VALUES
('C1','计算机引论',NULL),
('C2','C语言','C1'),
('C3','数据结构','C2');

#24
INSERT INTO `choose`(`SNO`,`CourseID`,`Score`)
VALUES
('S00001','C1','95'),
('S00001','C2','80'),
('S00001','C3','84'),
('S00002','C1','80'),
('S00002','C2','85'),
('S00003','C1','78'),
('S00003','C3','70');

#25
SELECT `SNO`,`Name`
FROM `student`
WHERE college = '计算机学院';

#26
SELECT * FROM student WHERE age BETWEEN 20 AND 23;

#27
SELECT COUNT(*) FROM student;

#28
SELECT MAX(`Score`),MIN(`Score`),SUM(`Score`),AVG(`Score`)
FROM `choose`
WHERE `CourseID` = 'C1';

#29
SELECT `CourseID`,`CourseName`
FROM `course`
WHERE`CourseBeforeID` IS NULL;

#30 n个表至少需要n-1个连接条件
SELECT student.SNO,`Name`,`CourseName`,`Score`
FROM `student`,`choose`,`course`
WHERE student.sno = choose.sno AND choose.courseID = course.courseID;

#31
SELECT * FROM student st1
WHERE EXISTS
(
	SELECT * FROM student st2
	WHERE st2.name='张三' AND st1.`College` = st2.`College`
);


#32
SELECT st.`SNO`,`Score`
FROM student st,`choose` ch
WHERE st.sno = ch.sno AND `CourseID` = 'C1' AND score<
(
SELECT Score
FROM `choose`,`student`
WHERE choose.SNO = student.SNO AND `CourseID` = 'C1' AND `Name` = '张三'
)

#33
SELECT st.SNO
FROM `student` st,`choose` ch
WHERE `CourseID`='C1' AND st.sno = ch.sno
UNION
SELECT st.SNO
FROM `student` st,`choose` ch
WHERE `CourseID`='C3' AND st.sno = ch.sno;

#34
SELECT DISTINCT st.`SNO`
FROM student st,`choose` ch
WHERE st.sno = ch.sno AND ch.`CourseID` = 'c1'
UNION
SELECT DISTINCT st.`SNO`
FROM student st,`choose` ch
WHERE st.sno = ch.sno AND ch.`CourseID` = 'c3';
