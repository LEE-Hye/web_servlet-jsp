/*
 * ���̺� �� : member
 * �÷� : id(���� 30), pw(���� 30), name(���� 30), age(����)
 * �������� : id�� primary key
 */

create table aimember(
	id varchar2(30) primary key,
	pw varchar2(30),
	name varchar2(30),
	age number
);

insert into AIMEMBER values('smart', 'smart', '������', 24);

select * from AIMEMBER;