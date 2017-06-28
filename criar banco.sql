create database encomendas;
create user 'userencomendas'@'localhost' identified by 'ThePassword';
grant all on encomendas.* to 'userencomendas'@'localhost';