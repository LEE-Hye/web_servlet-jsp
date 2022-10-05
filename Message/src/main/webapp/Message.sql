/*
 * 테이블 이름 : web_member
 * 컬럼 : email 문자(50) primary key 
 * 		 pw 문자(50) not null
 * 		 tel 문자(50) not null
 * 		 address 문자(50) not null
 */


create table web_member(
 email varchar2(50) primary key,
 pw varchar2(50) not null,
 tel varchar2(50) not null,
 address varchar2(50) not null
)

select * from WEB_MEMBER