drop sequence if exists hibernate_sequence;
create sequence hibernate_sequence start with 1000 increment by 1;

insert into greeting (id, text) values (1, 'primero');
insert into greeting (id, text) values (2, 'segundo');
insert into greeting (id, text) values (3, 'tercero');