-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 12, 2023 at 06:59 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hy360_2022`
--

-- --------------------------------------------------------

--
-- Table structure for table `permanentemployee`
--

CREATE TABLE `permanentemployee` (
  `IBAN` int(12) NOT NULL,
  `FullName` char(100) DEFAULT NULL,
  `Address` char(100) DEFAULT NULL,
  `Telephone` int(10) DEFAULT NULL,
  `BankName` char(100) DEFAULT NULL,
  `Department` char(100) DEFAULT NULL,
  `startingDate` char(10) DEFAULT NULL,
  `EmployeeType` char(9) DEFAULT NULL,
  `Married` tinyint(1) DEFAULT NULL,
  `Payment` int(60) DEFAULT NULL,
  `PaymentDate` char(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `temporaryemployee`
--

CREATE TABLE `temporaryemployee` (
  `IBAN` int(12) NOT NULL,
  `FullName` char(100) DEFAULT NULL,
  `Address` char(100) DEFAULT NULL,
  `Telephone` int(10) DEFAULT NULL,
  `BankName` char(100) DEFAULT NULL,
  `Department` char(100) DEFAULT NULL,
  `startingDate` char(10) DEFAULT NULL,
  `EmployeeType` char(9) DEFAULT NULL,
  `Married` tinyint(1) DEFAULT NULL,
  `Payment` int(60) DEFAULT NULL,
  `PaymentDate` char(10) DEFAULT NULL,
  `startingContractDate` char(10) DEFAULT NULL,
  `endingContractDate` char(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `permanentemployee`
--
ALTER TABLE `permanentemployee`
  ADD PRIMARY KEY (`IBAN`);

--
-- Indexes for table `temporaryemployee`
--
ALTER TABLE `temporaryemployee`
  ADD PRIMARY KEY (`IBAN`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
