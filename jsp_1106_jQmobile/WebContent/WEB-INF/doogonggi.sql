create table doogonggi(
num number(5) constraint doogonggi_num_pk primary key,
id varchar2(34),
pass varchar2(34),
email varchar2(100),
tel varchar2(50),
redate date);

create sequence doogonggi_seq
increment by 1
start with 1;
