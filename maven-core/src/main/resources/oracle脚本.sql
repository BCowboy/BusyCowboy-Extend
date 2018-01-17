prompt PL/SQL Developer import file
prompt Created on 2018年1月17日 by wushanwen
set feedback off
set define off
prompt Creating FUSER...
create table FUSER
(
  ID       NUMBER(10) not null,
  ACCOUNT  NUMBER(19,2),
  BIRTHDAY DATE,
  EMAIL    VARCHAR2(50 CHAR) not null,
  SALARY   FLOAT,
  SEX      VARCHAR2(10 CHAR) not null,
  USERNAME VARCHAR2(50 CHAR) not null
)
tablespace TEST_DATA
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table FUSER
  add primary key (ID)
  using index 
  tablespace TEST_DATA
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt Creating PERSONTEST...
create table PERSONTEST
(
  ID       NUMBER(11) not null,
  ACCOUNT  NUMBER(19,2),
  BIRTHDAY DATE,
  EMAIL    VARCHAR2(50),
  SALARY   FLOAT,
  SEX      VARCHAR2(10),
  USERNAME VARCHAR2(50)
)
tablespace TEST_DATA
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table PERSONTEST
  add primary key (ID)
  using index 
  tablespace TEST_DATA
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt Creating USERORDER...
create table USERORDER
(
  ID       NUMBER not null,
  USERID   NUMBER not null,
  QUANTITY NUMBER not null,
  PRO_NAME VARCHAR2(50) not null
)
tablespace TEST_DATA
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table USERORDER
  add constraint FK151D4263771761A5 foreign key (USERID)
  references FUSER (ID);

prompt Disabling triggers for FUSER...
alter table FUSER disable all triggers;
prompt Disabling triggers for PERSONTEST...
alter table PERSONTEST disable all triggers;
prompt Disabling triggers for USERORDER...
alter table USERORDER disable all triggers;
prompt Disabling foreign key constraints for USERORDER...
alter table USERORDER disable constraint FK151D4263771761A5;
prompt Loading FUSER...
insert into FUSER (ID, ACCOUNT, BIRTHDAY, EMAIL, SALARY, SEX, USERNAME)
values (1, 12.55, to_date('09-08-2017', 'dd-mm-yyyy'), 'ythurtye', 25.57, '男', '高圆圆');
insert into FUSER (ID, ACCOUNT, BIRTHDAY, EMAIL, SALARY, SEX, USERNAME)
values (2, 575.52, to_date('09-08-2017', 'dd-mm-yyyy'), 'piop', 57.785, '男', 'ghrh');
insert into FUSER (ID, ACCOUNT, BIRTHDAY, EMAIL, SALARY, SEX, USERNAME)
values (3, 5278.53, to_date('16-08-2017', 'dd-mm-yyyy'), 'jtyju', 5.5278, '男', 'hgfh');
insert into FUSER (ID, ACCOUNT, BIRTHDAY, EMAIL, SALARY, SEX, USERNAME)
values (630, 8, to_date('01-01-2017', 'dd-mm-yyyy'), '888', 8, '8', '5');
insert into FUSER (ID, ACCOUNT, BIRTHDAY, EMAIL, SALARY, SEX, USERNAME)
values (5, 27.25, to_date('10-08-2017', 'dd-mm-yyyy'), 'htr', 254.4525, '女', 'yrty');
insert into FUSER (ID, ACCOUNT, BIRTHDAY, EMAIL, SALARY, SEX, USERNAME)
values (4, 4, to_date('16-08-2017', 'dd-mm-yyyy'), '4', 4, '女', '4');
insert into FUSER (ID, ACCOUNT, BIRTHDAY, EMAIL, SALARY, SEX, USERNAME)
values (810, 8, to_date('01-01-2017', 'dd-mm-yyyy'), '888', 8, '8', '5');
insert into FUSER (ID, ACCOUNT, BIRTHDAY, EMAIL, SALARY, SEX, USERNAME)
values (820, 5, to_date('29-08-2017', 'dd-mm-yyyy'), '5', 55, '5', '5');
insert into FUSER (ID, ACCOUNT, BIRTHDAY, EMAIL, SALARY, SEX, USERNAME)
values (1010, 5, to_date('16-01-2018', 'dd-mm-yyyy'), '5', 55, '5', '5');
insert into FUSER (ID, ACCOUNT, BIRTHDAY, EMAIL, SALARY, SEX, USERNAME)
values (1220, 100, to_date('15-12-2016', 'dd-mm-yyyy'), '301458795', 45.26, 'women', 'lisa');
insert into FUSER (ID, ACCOUNT, BIRTHDAY, EMAIL, SALARY, SEX, USERNAME)
values (1230, 100, to_date('15-12-2016', 'dd-mm-yyyy'), '301458795', 45.26, 'women', 'lisa');
commit;
prompt 11 records loaded
prompt Loading PERSONTEST...
insert into PERSONTEST (ID, ACCOUNT, BIRTHDAY, EMAIL, SALARY, SEX, USERNAME)
values (1, 1, to_date('17-12-1901', 'dd-mm-yyyy'), '1', 1, '1', '1');
insert into PERSONTEST (ID, ACCOUNT, BIRTHDAY, EMAIL, SALARY, SEX, USERNAME)
values (2, 2, to_date('30-12-1899 02:00:00', 'dd-mm-yyyy hh24:mi:ss'), '2', 2, '2', '2');
insert into PERSONTEST (ID, ACCOUNT, BIRTHDAY, EMAIL, SALARY, SEX, USERNAME)
values (21, 28.24, to_date('17-08-2017', 'dd-mm-yyyy'), '8', 15.24, '8', '8');
insert into PERSONTEST (ID, ACCOUNT, BIRTHDAY, EMAIL, SALARY, SEX, USERNAME)
values (32, 242, to_date('11-08-2017', 'dd-mm-yyyy'), '4', 24, '4', '4');
insert into PERSONTEST (ID, ACCOUNT, BIRTHDAY, EMAIL, SALARY, SEX, USERNAME)
values (10, 6, to_date('09-08-2017', 'dd-mm-yyyy'), '6', 6, '6', '6');
insert into PERSONTEST (ID, ACCOUNT, BIRTHDAY, EMAIL, SALARY, SEX, USERNAME)
values (20, 77.54, to_date('09-08-2017', 'dd-mm-yyyy'), '7', 77, '7', '7');
insert into PERSONTEST (ID, ACCOUNT, BIRTHDAY, EMAIL, SALARY, SEX, USERNAME)
values (22, 25.69, to_date('30-08-2017', 'dd-mm-yyyy'), 'ytth', 51.365521, '9', '9');
insert into PERSONTEST (ID, ACCOUNT, BIRTHDAY, EMAIL, SALARY, SEX, USERNAME)
values (31, 2424.4, to_date('06-08-2013', 'dd-mm-yyyy'), '3', 35.52, '3', '3');
insert into PERSONTEST (ID, ACCOUNT, BIRTHDAY, EMAIL, SALARY, SEX, USERNAME)
values (30, 242.4, to_date('19-08-2014', 'dd-mm-yyyy'), '10', 242.01, '10', '10');
insert into PERSONTEST (ID, ACCOUNT, BIRTHDAY, EMAIL, SALARY, SEX, USERNAME)
values (33, 24.42, to_date('17-08-2017', 'dd-mm-yyyy'), '24', 3.543, '242', '242');
commit;
prompt 10 records loaded
prompt Loading USERORDER...
insert into USERORDER (ID, USERID, QUANTITY, PRO_NAME)
values (1, 1, 5, '特仑苏');
insert into USERORDER (ID, USERID, QUANTITY, PRO_NAME)
values (2, 1, 10, '纯甄');
insert into USERORDER (ID, USERID, QUANTITY, PRO_NAME)
values (3, 2, 15, '苹果');
insert into USERORDER (ID, USERID, QUANTITY, PRO_NAME)
values (4, 2, 20, '香蕉');
insert into USERORDER (ID, USERID, QUANTITY, PRO_NAME)
values (5, 3, 25, '手机');
insert into USERORDER (ID, USERID, QUANTITY, PRO_NAME)
values (6, 3, 30, '电脑');
commit;
prompt 6 records loaded
prompt Enabling foreign key constraints for USERORDER...
alter table USERORDER enable constraint FK151D4263771761A5;
prompt Enabling triggers for FUSER...
alter table FUSER enable all triggers;
prompt Enabling triggers for PERSONTEST...
alter table PERSONTEST enable all triggers;
prompt Enabling triggers for USERORDER...
alter table USERORDER enable all triggers;
set feedback on
set define on
prompt Done.
