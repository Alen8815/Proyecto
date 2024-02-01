/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     1/2/2024 12:15:21                            */
/*==============================================================*/


drop table if exists AUDITORIA;

drop table if exists EQUIPODETRABAJO;

drop table if exists ESTADOS;

drop table if exists PERSONA;

drop table if exists PREGUNTAS_SEGURIDAD;

drop table if exists PROYECTO;

drop table if exists TABLE_8;

drop table if exists TIPO_PERSONA;

/*==============================================================*/
/* Table: AUDITORIA                                             */
/*==============================================================*/
create table AUDITORIA
(
   ID_AUDITORIA         int not null,
   ID_PERSONA           int,
   TABLA_MODIFICADA     varchar(50),
   CAMBIO               varchar(50),
   FECHA                varchar(50),
   primary key (ID_AUDITORIA)
);

/*==============================================================*/
/* Table: EQUIPODETRABAJO                                       */
/*==============================================================*/
create table EQUIPODETRABAJO
(
   ID_EQUIPO            int not null,
   ID_PROYECTO          int,
   ID_PERSONA           int,
   primary key (ID_EQUIPO)
);

/*==============================================================*/
/* Table: ESTADOS                                               */
/*==============================================================*/
create table ESTADOS
(
   ID_ESTADOS           int not null,
   DESCRIPCION          varchar(30),
   primary key (ID_ESTADOS)
);

/*==============================================================*/
/* Table: PERSONA                                               */
/*==============================================================*/
create table PERSONA
(
   ID_PERSONA           int not null,
   ID_TIPO              int,
   NOMBRE               varchar(50),
   APELLIDO             varchar(50),
   CEDULA               varchar(50),
   PASWORD              varchar(50),
   primary key (ID_PERSONA)
);

/*==============================================================*/
/* Table: PREGUNTAS_SEGURIDAD                                   */
/*==============================================================*/
create table PREGUNTAS_SEGURIDAD
(
   ID_PREGUNTA          int not null,
   DESCRIPCION          varchar(50),
   primary key (ID_PREGUNTA)
);

/*==============================================================*/
/* Table: PROYECTO                                              */
/*==============================================================*/
create table PROYECTO
(
   ID_PROYECTO          int not null,
   ID_ESTADOS           int,
   VERSION              varchar(50),
   BINDOCUMENT          longblob,
   TITULO               varchar(50),
   AREA                 varchar(50),
   primary key (ID_PROYECTO)
);

/*==============================================================*/
/* Table: TABLE_8                                               */
/*==============================================================*/
create table TABLE_8
(
   ID_PERSONA           int,
   ID_PREGUNTA          int,
   RESPUESTA            varchar(50)
);

/*==============================================================*/
/* Table: TIPO_PERSONA                                          */
/*==============================================================*/
create table TIPO_PERSONA
(
   ID_TIPO              int not null,
   DESCRIPCION          varcahr(50),
   primary key (ID_TIPO)
);

alter table AUDITORIA add constraint FK_REFERENCE_5 foreign key (ID_PERSONA)
      references PERSONA (ID_PERSONA) on delete restrict on update restrict;

alter table EQUIPODETRABAJO add constraint FK_REFERENCE_19 foreign key (ID_PROYECTO)
      references PROYECTO (ID_PROYECTO) on delete restrict on update restrict;

alter table EQUIPODETRABAJO add constraint FK_REFERENCE_4 foreign key (ID_PERSONA)
      references PERSONA (ID_PERSONA) on delete restrict on update restrict;

alter table PERSONA add constraint FK_REFERENCE_3 foreign key (ID_TIPO)
      references TIPO_PERSONA (ID_TIPO) on delete restrict on update restrict;

alter table PROYECTO add constraint FK_REFERENCE_9 foreign key (ID_ESTADOS)
      references ESTADOS (ID_ESTADOS) on delete restrict on update restrict;

alter table TABLE_8 add constraint FK_REFERENCE_6 foreign key (ID_PERSONA)
      references PERSONA (ID_PERSONA) on delete restrict on update restrict;

alter table TABLE_8 add constraint FK_REFERENCE_7 foreign key (ID_PREGUNTA)
      references PREGUNTAS_SEGURIDAD (ID_PREGUNTA) on delete restrict on update restrict;

