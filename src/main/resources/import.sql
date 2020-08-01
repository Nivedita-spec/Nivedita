INSERT INTO ROLE_TYP (ROLE_TYP_CD, DESCR, READ_SW,WRITE_SW,APRV_SW,INS_TS,LU_TS) VALUES('TMEM', 'TEAM MEMBER', 'Y','Y','N', current_timestamp, current_timestamp);
INSERT INTO ROLE_TYP (ROLE_TYP_CD, DESCR, READ_SW,WRITE_SW,APRV_SW,INS_TS,LU_TS) VALUES('MGR', 'MANAGER', 'Y','Y','Y', current_timestamp, current_timestamp);
INSERT INTO ROLE_TYP (ROLE_TYP_CD, DESCR, READ_SW,WRITE_SW,APRV_SW,INS_TS,LU_TS) VALUES('APVR', 'APPROVER','Y','Y','Y', current_timestamp, current_timestamp);
INSERT INTO ROLE_TYP (ROLE_TYP_CD, DESCR, READ_SW,WRITE_SW,APRV_SW,INS_TS,LU_TS) VALUES('RDONLY', 'READ ONLY', 'Y','N','N', current_timestamp, current_timestamp);


