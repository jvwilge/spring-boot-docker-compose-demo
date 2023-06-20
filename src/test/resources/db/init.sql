CREATE SCHEMA IF NOT EXISTS local;

CREATE TABLE IF NOT EXISTS local.car
(
    id    bigint primary key,
    make  varchar(100),
    model varchar(100)
);

insert into local.car
values (1, 'Honda', 'Civic');
insert into local.car
values (2, 'Honda', 'Accord');
insert into local.car
values (3, 'Honda', 'CR-V');

CREATE SCHEMA IF NOT EXISTS test;

CREATE TABLE IF NOT EXISTS test.car
(
    id    bigint primary key,
    make  varchar(100),
    model varchar(100)
);

insert into test.car
values (1, 'Toyota', 'Corolla');
insert into test.car
values (2, 'Toyota', 'RAV4');
insert into test.car
values (3, 'Toyota', 'Camry');