drop database if exists orange_sd_24 ;  
create database orange_sd_24 ; 

use orange_sd_24 ; 

create table client (
	idclient int not null auto_increment, 
	nom varchar (50),
	prenom varchar (50),
	adresse varchar (50),
	primary key(idclient)
);
create table technicien (
	idtechnicien int not null auto_increment, 
	nom varchar (50),
	prenom varchar (50),
	specialite varchar (50),
	email varchar (50),
	mdp varchar (50),
	primary key(idtechnicien)
);
create table affecter (
	idtechnicien int not null, 
	idclient int not null, 
	dateDebut date, 
	dateFin date , 
	projet text, 
	primary key (idtechnicien, idclient, dateDebut), 
	foreign key(idtechnicien) references technicien(idtechnicien), 
	foreign key(idclient) references client(idclient)
	);
