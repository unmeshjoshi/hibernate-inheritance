create table roles(role_id varchar(50), party_id varchar(50), determinant_value varchar(10), party_full_name varchar(100));
create table role_brokers(role_id varchar(50), party_id varchar(50), determinant_value varchar(10), profile_summary varchar(500));
alter table role_brokers add column additional_profile_summary varchar(50);

create table CZ_BUREAU_RECORDS(BUREAU_SERVICE_CODE varchar(50), BUREAU_PRODUCT_ID varchar(50), PARTY_ID varchar(50), OBJECT_VERSION_NUMBER integer, FIRST_NAME varchar(100), LAST_NAME varchar(100));
create table CREDIT_FACILITY(ID varchar(50), facility_type varchar(50), BRANCH_CODE varchar(50), PERIODICITY_TYPE varchar(50));
create table CUSTOMIZED_CREDIT_FACILITY as (select * from CREDIT_FACILITY) with no data;
alter table CUSTOMIZED_CREDIT_FACILITY add column EXTERNAL_SYSTEM varchar(50);