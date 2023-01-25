SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;


CREATE TABLE `permanentemployee` (
  `IBAN` char(12) NOT NULL,
  `Fullname` char(100) DEFAULT NULL,
  `Address` char(100) DEFAULT NULL,
  `Telephone` int(10) DEFAULT NULL,
  `BankName` char(100) DEFAULT NULL,
  `Department` char(100) DEFAULT NULL,
  `startingDate` date DEFAULT NULL,
  `EmployeeType` char(9) DEFAULT NULL,
  `Married` int(1) DEFAULT NULL,
  `Payment` int(60) DEFAULT NULL,
  `PaymentDate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE `temporaryemployee` (
  `IBAN` char(12) NOT NULL,
  `Fullname` char(100) DEFAULT NULL,
  `Address` char(100) DEFAULT NULL,
  `Telephone` int(10) DEFAULT NULL,
  `BankName` char(100) DEFAULT NULL,
  `Department` char(100) DEFAULT NULL,
  `startingDate` date DEFAULT NULL,
  `EmployeeType` char(9) DEFAULT NULL,
  `Married` int(1) DEFAULT NULL,
  `Payment` int(60) DEFAULT NULL,
  `PaymentDate` date DEFAULT NULL,
  `startingContractDate` date DEFAULT NULL,
  `endingContractDate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


ALTER TABLE `permanentemployee`
  ADD PRIMARY KEY (`IBAN`);

ALTER TABLE `temporaryemployee`
  ADD PRIMARY KEY (`IBAN`);
USE `phpmyadmin`;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
