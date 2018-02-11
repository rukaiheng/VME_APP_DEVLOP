/*
* File description: This is an script file to create database and tables for VME application.
* --------------------------------------------------------------------------------------------
* The database created base in VME database detailed design specification. If there is any question please
* refer the design specification.
* we will create the database and tables step by step. The detail step and script are shown as bellow.
*/

/*
* 1. Create the database. 
* 	Note: if there is already a database named vme_database, please delete it first using 'DROP DATABASE vme_database'.
* Name: vme_database
*/

DROP DATABASE vme_database;

CREATE DATABASE vme_database;

/*
* 2. Facility as the uppermost level object is created first.
* 	Note: changing to the target database is essential or there will be errors occured to remaind you that there is no database 
* 	for the table created in. 'USE vme_database' can be used to change database.
* table name: facility
*/

USE vme_database;

CREATE TABLE facility(
	facility_id INT NOT NULL AUTO_INCREMENT,
	facility_name VARCHAR(45) NOT NULL,
	PRIMARY KEY(facility_id));
	
 /*
 * 3. Create the second level obejcts. Objects belong to the second level is listed bellow.
 * 	  3.1 Machine, an abstract object represent machine's attributes and actions, is one of the key object in VME.
 *    3.2 material is another object represent consuming material in additive manufacturing (AM).
 *    3.3 labor represent deferent labors would be used to perform cost estimation.
 *    3.4 process are deferent depend on the facilities.
 */

/*
 * 3.1 Create machine table to save machines in company. Each machine includes several attributes, they are shown bellows.
 * -----------------------------------------------------------------------------------------------
 *  data type         |     attribute name         |  description
 * -----------------------------------------------------------------------------------------------
 *     int            |       machineId            |
 *     string         |       machineName          |
 *     int            |       machineCategory     | category includes SLM, Turning, Milling. etc.
 *     double         |       workingHourPrice     | 
 *     double         |       settingHourPrice     |
 * -----------------------------------------------------------------------------------------------
 * table name: machine
 */
	
/*
 * We don't know the working hour price and setting hour price, so we assign working hour price and setting hour price default value now.
 * but it may lead problems. If we use machine with default value, we may not get the correct estimation. 
 * -------------------------------------------------------------------------------------------------------------
 * For SLM machine, printing process and chamfer size are required. 
 */
	
CREATE TABLE machine(
	machine_id INT NOT NULL AUTO_INCREMENT,
	machine_name VARCHAR(45) NOT NULL,
	machine_category INT NOT NULL,       
	working_hour_price DOUBLE NOT NULL DEFAULT 0, 
	setting_hour_price DOUBLE NOT NULL DEFAULT 0,
	PRIMARY KEY (machine_id));
/*
 * 
 */
	
/*
 * 
 */
	
/*
 *  3.2 Create labor table to save employees working for AM.
 * ---------------------------------------------------------------------------------------------------
 *      Data type     |       Attribute name        |         Description
 * ---------------------------------------------------------------------------------------------------
 *      int           |          laborId            |
 *    String          |          jobTittle          |
 *     double         |          hourPrice          |
 *      int           |          facilityId         | using facility id to build relation with facility
 * ----------------------------------------------------------------------------------------------------   
 * table name: Labor
 */
CREATE TABLE Labor(
	labor_id INT NOT NULL AUTO_INCREMENT,
	job_tittle VARCHAR(45) NOT NULL,
	hour_price DOUBLE NOT NULL,
	facility_id INT NOT NULL,
	PRIMARY KEY(labor_id));
	
/*
 *  3.3 
 */