/*
 * 테이블 명 : member
 * 컬럼 : id(문자 30), pw(문자 30), name(문자 30), age(숫자)
 * 제약조건 : id가 primary key
 */

create table aimember(
	id varchar2(30) primary key,
	pw varchar2(30),
	name varchar2(30),
	age number
);

insert into AIMEMBER values('smart', 'smart', '이혜빈', 24);

select * from AIMEMBER;