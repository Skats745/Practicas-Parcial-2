/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 10.4.8-MariaDB : Database - dbalumnos
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`dbalumnos` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `dbalumnos`;

/*Table structure for table `tblalumnos` */

DROP TABLE IF EXISTS `tblalumnos`;

CREATE TABLE `tblalumnos` (
  `intIDAlumno` int(11) NOT NULL AUTO_INCREMENT,
  `vchName` varchar(20) DEFAULT NULL,
  `vchAP` varchar(20) DEFAULT NULL,
  `vchAM` varchar(20) DEFAULT NULL,
  `intMatricula` int(20) DEFAULT NULL,
  `intIDGrupo` int(10) DEFAULT NULL,
  PRIMARY KEY (`intIDAlumno`),
  KEY `vchIDGrupo` (`intIDGrupo`),
  CONSTRAINT `tblalumnos_ibfk_1` FOREIGN KEY (`intIDGrupo`) REFERENCES `tblgrupo` (`intIDGrupo`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

/*Data for the table `tblalumnos` */

insert  into `tblalumnos`(`intIDAlumno`,`vchName`,`vchAP`,`vchAM`,`intMatricula`,`intIDGrupo`) values (1,'Jaime','Nuno','Catalino',20130725,1),(5,'Ezequiel','Hernandez','Cazi',20130735,1),(8,'Janice','Griffith','Larch',20130752,3);

/*Table structure for table `tblgrupo` */

DROP TABLE IF EXISTS `tblgrupo`;

CREATE TABLE `tblgrupo` (
  `intIDGrupo` int(11) NOT NULL AUTO_INCREMENT,
  `vchGrupo` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`intIDGrupo`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `tblgrupo` */

insert  into `tblgrupo`(`intIDGrupo`,`vchGrupo`) values (1,'A'),(2,'B'),(3,'C'),(4,'D');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
