create table andmem(
num number primary key,
id varchar2(10) not null,
pwd varchar2(10),
name varchar2(34),
rdate date);

create sequence andmem_seq
increment by 1
start with 1;

insert into andmem values(andmem_seq.nextVal, 'aman', '12', 'kim', sysdate);
insert into andmem values(andmem_seq.nextVal, 'bman', '12', 'lee', sysdate);
insert into andmem values(andmem_seq.nextVal, 'cman', '12', 'park', sysdate);

commit;

select * from andmem;

select count (*) cnt from andmem where id='amam' and pwd='12';
