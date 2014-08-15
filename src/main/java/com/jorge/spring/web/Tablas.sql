
create table usuario (id_usuario integer primary key
                  auto_increment,
                nombre varchar(80),
                sueldo float);


create table empleado (id_empleado integer primary key
                  auto_increment,
                nombre varchar(80),
                sueldo float);

create table nomina (id_nomina integer primary key auto_increment, id_empleado integer,float, saldo float,
                           foreign key (id_empleado) references  
                            nomina (id_empleado));



create table nomina1 (id integer , id_nomina integer auto_increment primary key, fecha_pago date, saldo float,
                     constraint foreign key(id) references usuario(id));

