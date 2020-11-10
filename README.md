# ATM_Simulate_Constraints

## All individual constraints have been implemented:
1. GUI has been implemented.
2. Added a Bank column in the database (table customerstest1) along with adding two other columns - Phone and IFSC Code.
3. Option of banks - 'ABC Bank' and 'Other' - have been added.
4. If the user selects 'ABC Bank' and his Bank value is 'abc' in the database, then no processing fee is charged. If the user selects 'Other', then a processing fee is charged regardless of which bank his account belongs to in the database. In all the cases, the selected option is verified by checking the corresponding Bank value in the database.
5. Added international money transfer in the deposit and funds transfer section. USD is converted into INR and an extra fee is charged for this international money transfer.

Note: 6 out of 7 common constraints have been implemented.

## Initializing the database:
MySQL has been used for the database.

Type the following commands in MySQL to create the appropriate database and tables:
* create database dbtest1;
* use dbtest1;
* create table customerstest1(Name varchar(20), AccountNo char(5) primary key, PIN char(24), Balance double, IFSC varchar(10), Phone char(10), Bank varchar(20));
* insert into customerstest1 values('John', '12345', '7T6+yndhDz0F3W1hfpyDUg==', 40000, 'ab001234', '1234567890', 'abc');
* insert into customerstest1 values('Sam', '56789', 'lTjgxuZ0je2S3SA7DPq8dA==', 60500, 'cd005678', '0987654321', 'defg');
* create table transactiontest1(FromName varchar(20), FromAcc varchar(20), ToName char(5), ToAcc char(5), Amount double, Date varchar(25));

Note: '7T6+yndhDz0F3W1hfpyDUg==' and 'lTjgxuZ0je2S3SA7DPq8dA==' are the encrypted strings representing PIN '54321' and '98765' respectively (AES 128 has been used).
