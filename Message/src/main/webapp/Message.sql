/*
 * ���̺� �̸� : web_member
 * �÷� : email ����(50) primary key 
 * 		 pw ����(50) not null
 * 		 tel ����(50) not null
 * 		 address ����(50) not null
 */


create table web_member(
 email varchar2(50) primary key,
 pw varchar2(50) not null,
 tel varchar2(50) not null,
 address varchar2(50) not null
)

select * from WEB_MEMBER