create table profiles(id varchar(50), profile_id varchar(50), determinant_value varchar(10), full_name varchar(100));
create table customized_profile(id varchar(50), profile_id varchar(50), determinant_value varchar(10), full_name varchar(100), profile_summary varchar(500));
alter table customized_profile add column additional_profile_summary varchar(50);

create table CZ_BUREAU_RECORDS(BUREAU_SERVICE_CODE varchar(50), BUREAU_PRODUCT_ID varchar(50), PARTY_ID varchar(50), OBJECT_VERSION_NUMBER integer, FIRST_NAME varchar(100), LAST_NAME varchar(100));
create table employee(ID varchar(50), employee_type varchar(50), name varchar(50), contract_terms varchar(50));
create table customized_contract_employee as (select * from employee) with no data;
alter table customized_contract_employee add column additional_contract_terms varchar(50);