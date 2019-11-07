create database GestorDocumental
use GestorDocumental
create schema esquema

create table esquema.servicios(
	idServicio int primary key,
	servicio varchar(50)
)
insert into esquema.servicios(idServicio,servicio) values (1,'Cementerio'),(2,'Agua');


create table esquema.tipoAbonado(
	idTipo int primary key,
	tipo varchar(50) not null
)

insert into esquema.tipoAbonado (idTipo,tipo) values (1,'Fisico'),(2,'Juridico');

create table esquema.abonado(
	cedula int primary key,
	nombre varchar(50) not null,
	direccion varchar(50) not null,
	telefono int unique not null,
	correo varchar(50) unique not null,
	idTipo int not null,
	foreign key (idTipo) references esquema.tipoAbonado (idTipo),
)

insert into esquema.abonado (cedula,nombre,direccion,telefono,correo,idTipo) values (123,'Kevin Robles','palo de mango',86086456,'correo',1),(456,'Daniel Quiros','caña de azucar',98765432,'daniel',1);

create table esquema.categoria(
	idCategoria int primary key,
	categoria varchar(50)
)

insert into esquema.categoria(idCategoria,categoria) values (1,'Finca inscrita'),(2,'Finca aproximada'),(3,'Finca sin escribir'),(4,'Finca exenta'),(5,'Fincas de información posesoría');

create table esquema.topografia(
	idTopografia int primary key,
	topografia varchar(50)
)

insert into esquema.topografia(idTopografia,topografia) values (1,'Plana'),(2,'Ondulada'),(3,'Quebrada'),(4,'Muy quebrada');

create table esquema.nivelTerreno(
	idNivelTerreno int primary key,
	nivelTerreno varchar(50)
)

insert into esquema.nivelTerreno(idNivelTerreno,nivelTerreno) values (1,'alto'),(2,'medio'),(3,'bajo');

create table esquema.uso(
	idUso int primary key,
	uso varchar(50)
)

insert into esquema.uso(idUso,uso) values (1,'Vacante'),(2,'Residencial'),(3,'Comercial'),(4,'Industrial'),(5,'Turismo'),(6,'Educativo'),(7,'Recreativo'),(8,'Repastos'),(9,'Agricultura')

create table esquema.tipoPropiedad(
	idTipo int primary key,
	tipo varchar(50)
)

insert into esquema.tipoPropiedad(idTipo,tipo) values (1,'1'),(2,'2');

create table esquema.propiedad(
	numeroFinca int primary key,
	numeroPlano int not null,
	areaRegistral int not null,
	idCategoria int not null,
	viasAcceso int not null,
	idTopografia int not null,
	idNivelTerreno int not null,
	idUso int not null,
	metrosFrente int not null,
	valorFiscal int not null,
	unidadesHabitacionales int not null,
	cantidadLocales int not null,
	foto image not null,
	idTipo int not null,
	foreign key (idCategoria) references esquema.categoria (idCategoria),
	foreign key (idTopografia) references esquema.topografia (idTopografia),
	foreign key (idNivelTerreno) references esquema.nivelTerreno (idNivelTerreno),
	foreign key (idUso) references esquema.uso (idUso),	
	foreign key (idTipo) references esquema.tipoPropiedad (idTipo)
)

create table esquema.propiedadServicios(
	numeroFinca int not null,
	idServicio int not null,
	foreign key (numeroFinca) references esquema.propiedad (numeroFinca),
	foreign key (idServicio) references esquema.servicios (idServicio)
)

create table esquema.propiedadAbonado(
	numeroFinca int not null,
	cedula int not null,
	foreign key (numeroFinca) references esquema.propiedad (numeroFinca),
	foreign key (cedula) references esquema.abonado (cedula),
)

create procedure esquema.ingresarPropiedad
@numeroFinca as int,
@numeroPlano as int,
@areaRegistral as int,
@categoria as varchar(50),
@viasAcceso as int,
@topografia as varchar(50),
@nivelTerreno as varchar(50),
@uso as varchar(50),
@metrosFrente as int,
@valorFiscal as int,
@unidadesHabitacionales as int,
@cantidadLocales as int,
@foto as image,
@tipo as varchar(50)
as
begin
	declare @idCategoria as int,@idTopografia as int,@idNivelTerreno as int,@idUso as int,@idTipo as int;
	set @idCategoria = (select idCategoria from esquema.categoria where categoria = @categoria);
	set @idTopografia = (select idTopografia from esquema.topografia where topografia = @topografia);
	set @idNivelTerreno = (select idNivelTerreno from esquema.nivelTerreno where nivelTerreno = @nivelTerreno);
	set @idUso = (select idUso from esquema.uso where uso = @uso);
	set @idTipo = (select idTipo from esquema.tipoPropiedad where tipo = @tipo);

	insert into esquema.propiedad (numeroFinca,numeroPlano,areaRegistral,idCategoria,viasAcceso,idTopografia,idNivelTerreno,idUso,metrosFrente,valorFiscal,unidadesHabitacionales,cantidadLocales,foto,idTipo) values
	(@numeroFinca,@numeroPlano,@areaRegistral,@idCategoria,@viasAcceso,@idTopografia,@idNivelTerreno,@idUso,@metrosFrente,@valorFiscal,@unidadesHabitacionales,@cantidadLocales,@foto,@idTipo)

end;

create procedure esquema.ingresarPropiedadAbonado
@numeroFinca as int,
@cedula as int
as
begin
	insert into esquema.propiedadAbonado (numeroFinca,cedula) values (@numeroFinca,@cedula);
end;

create procedure esquema.ingresarPropiedadServicios
@numeroFinca as int,
@servicio as varchar(50)
as
begin
	declare @idServicio as int;
	set @idServicio = (select idServicio from esquema.servicios where servicio = @servicio);
	insert into esquema.propiedadServicios(numeroFinca,idServicio) values (@numeroFinca,@idServicio);
end;

create function esquema.validarAbonado(@cedula as int)
returns int
as
begin 
	declare @usuario as int;
	set @usuario = (select cedula from esquema.abonado where cedula = @cedula);

	if @usuario != ''
	begin
		return 1
	end
return 0
end


create function esquema.validarPropiedad(@finca as int)
returns int
as
begin 
	declare @resul as int;
	set @resul = (select numeroFinca from esquema.propiedad where numeroFinca = @finca);

	if @resul != ''
	begin
		return 1
	end
return 0
end


create function esquema.consultarPropiedad(@idFinca as int)
returns  @tabla table (numeroPlano int,areaRegistral int,categoria varchar(50),viasAcceso int,topografia varchar(50),nivelTerreno varchar(50),uso varchar(50),metrosFrente int,valorFiscal int,unidadesHabitacionales int,cantidadLocales int,foto image,tipo varchar(50))
as begin
	insert into @tabla 
	select prop.numeroPlano,prop.areaRegistral,cat.categoria,prop.viasAcceso,topo.topografia,niv.nivelTerreno,uso.uso,prop.metrosFrente,prop.valorFiscal,prop.unidadesHabitacionales,prop.cantidadLocales,prop.foto,tipo.tipo 
	from esquema.propiedad as prop,esquema.categoria as cat,esquema.topografia as topo,esquema.nivelTerreno as niv,esquema.uso as uso, esquema.tipoPropiedad as tipo
	where prop.idCategoria = cat.idCategoria and prop.idTopografia = topo.idTopografia and prop.idNivelTerreno = niv.idNivelTerreno and prop.idUso = uso.idUso and prop.idTipo = tipo.idTipo
return 
end


create procedure esquema.eliminarPropiedad
@numerofinca as int
as
begin
	delete from esquema.propiedadServicios where numeroFinca = @numeroFinca;
	delete from esquema.propiedadAbonado where numeroFinca = @numeroFinca;
	delete from esquema.propiedad where numeroFinca = @numeroFinca;
end


create procedure esquema.actualizarCategoria
@numeroFinca as int,
@categoria as varchar(50)
as
begin
	declare @idCategoria as int;
	set @idCategoria = (select idCategoria from esquema.categoria where categoria = @categoria);
	update esquema.propiedad set idCategoria = @idCategoria where numeroFinca = @numeroFinca;
end

create procedure esquema.actualizarTopografia
@numeroFinca as int,
@topografia as varchar(50)
as
begin
	declare @idTopografia as int;
	set @idTopografia = (select idTopografia from esquema.topografia where topografia = @topografia);
	update esquema.propiedad set idTopografia = @idTopografia where numeroFinca = @numeroFinca;
end

create procedure esquema.actualizarNivel
@numeroFinca as int,
@nivel as varchar(50)
as
begin
	declare @idNivelTerreno as int;
	set @idNivelTerreno = (select idNivelTerreno from esquema.nivelTerreno where nivelTerreno = @nivel);
	update esquema.propiedad set idNivelTerreno = @idNivelTerreno where numeroFinca = @numeroFinca;
end

create procedure esquema.actualizarUso
@numeroFinca as int,
@uso as varchar(50)
as
begin
	declare @idUso as int;
	set @idUso = (select idUso from esquema.uso where uso = @uso);
	update esquema.propiedad set idUso = @idUso where numeroFinca = @numeroFinca;
end

create procedure esquema.actualizarTipo
@numeroFinca as int,
@tipo as varchar(50)
as
begin
	declare @idTipo as int;
	set @idTipo = (select idTipo from esquema.tipoPropiedad where tipo = @tipo);
	update esquema.propiedad set idTipo = @idTipo where numeroFinca = @numeroFinca;
end

select * from esquema.propiedad
select * from esquema.propiedadServicios
select * from esquema.propiedadAbonado

