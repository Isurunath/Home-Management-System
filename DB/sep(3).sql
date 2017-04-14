-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 02, 2016 at 06:13 AM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `sep`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE IF NOT EXISTS `account` (
  `AccID` int(11) NOT NULL AUTO_INCREMENT,
  `AccNo` varchar(20) NOT NULL,
  `AccHolderName` varchar(250) NOT NULL,
  `AccType` varchar(100) NOT NULL,
  `AccBalance` varchar(20) NOT NULL,
  `AccHoldingBank` varchar(100) NOT NULL,
  `AccHoldingBranch` varchar(100) NOT NULL,
  PRIMARY KEY (`AccID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=18 ;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`AccID`, `AccNo`, `AccHolderName`, `AccType`, `AccBalance`, `AccHoldingBank`, `AccHoldingBranch`) VALUES
(4, '1478956325478965', 'Saumya Gunarathne', 'Savings Account', '50000', 'People''s Bank', 'Galle'),
(5, '2344578965321457', 'Yahani Silva', 'Current Account', '34355', 'Sampath bank', 'Colombo'),
(6, '14785963257845', 'Gayani Perera', 'Current Account', '31515', 'Sampath bank', 'Galle'),
(15, '478965325478', 'Sanduni Rathnayake', 'Fixed Deposit', '75000', 'Selan Bank', 'Malabe'),
(16, '1234578965478956', 'Ruchini Perera', 'Current Account', '55000', 'BOC', 'Matara'),
(17, '3435789654257896', 'Gimhani Ranathunga', 'Savings Account', '1400000', 'BOC', 'Gampaha');

-- --------------------------------------------------------

--
-- Table structure for table `bills`
--

CREATE TABLE IF NOT EXISTS `bills` (
  `BillID` int(11) NOT NULL AUTO_INCREMENT,
  `BillNo` varchar(20) NOT NULL,
  `BillType` varchar(20) NOT NULL,
  `Description` varchar(300) NOT NULL,
  `Amount` varchar(20) NOT NULL,
  `Date` date NOT NULL,
  PRIMARY KEY (`BillID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `bills`
--

INSERT INTO `bills` (`BillID`, `BillNo`, `BillType`, `Description`, `Amount`, `Date`) VALUES
(1, '33473', 'Electricity Bill', '', '62626', '2016-02-11');

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE IF NOT EXISTS `book` (
  `ItemCode` varchar(100) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Location` varchar(100) NOT NULL DEFAULT 'Not Allocated',
  `Qty` int(11) NOT NULL,
  `Price` varchar(100) NOT NULL,
  `User` varchar(100) NOT NULL,
  `Author` varchar(100) NOT NULL DEFAULT 'Default Author',
  `Publisher` varchar(100) NOT NULL,
  `NameOfTheSeller` varchar(100) NOT NULL,
  `ReturnDate` varchar(100) DEFAULT 'Not a Library Book',
  `Category` varchar(100) NOT NULL,
  `Stream` varchar(100) DEFAULT NULL,
  `Status` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ItemCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`ItemCode`, `Name`, `Location`, `Qty`, `Price`, `User`, `Author`, `Publisher`, `NameOfTheSeller`, `ReturnDate`, `Category`, `Stream`, `Status`) VALUES
('BK001', 'java', 'Library', 1, '1200', 'Nipuni', 'oracle', 'oracle', 'Gunasena Book Shop', 'Monday, March 21, 2016', 'Computer Science', 'IT', NULL),
('BK002', 'Java Reference ', 'Library', 1, 'Rs.4200', 'Nipuni', 'Oracle', 'Oracle', 'Sarasavi Book Shop', 'Wednesday, March 16, 2016', 'Computer Languages', 'IT', NULL),
('BK003', 'Computer Fundermentals', 'Library', 1, '3400', 'Admin', 'Charles Paker', 'ABRSM Publishing', 'Sarasavi Book Shop', 'Monday, March 21, 2016', 'Computer Science', 'IT', NULL),
('BK004', 'Whiteney my love', 'Own Bed Room', 1, '1200', 'Nipuni', 'Judith McNaught', 'New York Publishers', 'Sarasavi Book Shop', 'Monday, March 21, 2016', 'English', 'Novel', NULL),
('BK005', 'My Life', 'Library', 1, 'Rs.3500', 'Nipuni', 'Bill Clinton', 'New York Publishers', 'Gunasena Book Shop', 'Not a Library Book', 'Biography', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `cashexpenses`
--

CREATE TABLE IF NOT EXISTS `cashexpenses` (
  `CashExpenseID` int(11) NOT NULL AUTO_INCREMENT,
  `ExpenseCategory` varchar(20) NOT NULL,
  `Reason` varchar(300) NOT NULL,
  `Date` date NOT NULL,
  `Amount` varchar(20) NOT NULL,
  PRIMARY KEY (`CashExpenseID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `cashexpenses`
--

INSERT INTO `cashexpenses` (`CashExpenseID`, `ExpenseCategory`, `Reason`, `Date`, `Amount`) VALUES
(1, 'Clothing', 'Buy Cloths', '2016-05-07', '4855.55'),
(2, 'Accessary', 'Buy Shoes', '2016-02-04', '2455'),
(3, 'Clothing', 'By Cloths', '2016-02-17', '4578'),
(4, 'Clothing', 'By Cloths', '2016-02-18', '7878');

-- --------------------------------------------------------

--
-- Table structure for table `creditcardexpenses`
--

CREATE TABLE IF NOT EXISTS `creditcardexpenses` (
  `CardExpenseID` int(11) NOT NULL AUTO_INCREMENT,
  `CardNo` varchar(20) NOT NULL,
  `ExpenseCategory` varchar(20) DEFAULT NULL,
  `Reason` varchar(300) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `Amount` varchar(20) NOT NULL,
  PRIMARY KEY (`CardExpenseID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=28 ;

--
-- Dumping data for table `creditcardexpenses`
--

INSERT INTO `creditcardexpenses` (`CardExpenseID`, `CardNo`, `ExpenseCategory`, `Reason`, `Date`, `Amount`) VALUES
(1, '1247896354789653', 'Clothing', 'To buy cloths', '2016-02-16', '15000.00'),
(2, '6685755625875963', 'Funiture', 'To buy a sofa', '2016-02-10', '40500.00'),
(3, '9865456789874266', 'Health', 'Paid Hospital Bill', '2016-05-07', '1221'),
(4, '5789645213658745', 'Food ', 'To buy vegetables and other goods', '2016-02-19', '1500.00'),
(6, '6685755625875963', 'Food', 'To buy Rice', '2016-05-06', '500'),
(7, '4578963257896542', NULL, NULL, NULL, '0'),
(8, '4578963257896542', 'Vehicle', 'hfththeh', '2016-05-08', '10000'),
(9, '1234567891234567', 'Vehicle', 'turueu', '2016-05-06', '10000'),
(10, '1234567891234567', 'Food', 'turueu', '2016-05-06', '10000'),
(11, '7777777777777777', NULL, NULL, NULL, '0'),
(12, '88888888888888888', NULL, NULL, NULL, '0'),
(13, '44444444444444444', NULL, NULL, NULL, '0'),
(14, '2222222222222222', NULL, NULL, NULL, '0'),
(15, '4848484848484848', NULL, NULL, NULL, '0'),
(16, '1111111111111111', NULL, NULL, NULL, '0'),
(17, '3333333333333333', NULL, NULL, NULL, '0'),
(18, '3333333333334545', NULL, NULL, NULL, '0'),
(19, '9999999999999999', NULL, NULL, NULL, '0'),
(20, '1234567891234567', 'Food', 'turueu', '2016-05-06', '30000'),
(21, '1234567891234567', 'Food', 'turueu', '2016-05-06', '30000'),
(22, '4545454545456666', NULL, NULL, NULL, '0'),
(23, '4545454545456666', 'Vehicle', 'ghjdgjrtsjt', '2016-05-07', '10000'),
(24, '4545454545456666', 'Education', 'ghjdgjrtsjt', '2016-05-07', '20000'),
(25, '4545454545456666', 'Furniture', 'fgfjjfjfjr', '2016-05-07', '20000'),
(26, '9999999999999999', NULL, NULL, NULL, '0'),
(27, '9999999999999999', 'Electric Goods', 'asdas', '2016-05-06', '30000');

-- --------------------------------------------------------

--
-- Table structure for table `creditcardpayments`
--

CREATE TABLE IF NOT EXISTS `creditcardpayments` (
  `PaymentID` int(11) NOT NULL AUTO_INCREMENT,
  `CardNo` varchar(20) NOT NULL,
  `RemainingBalance` varchar(20) DEFAULT NULL,
  `RemainingPayments` varchar(20) DEFAULT NULL,
  `SettledPayments` varchar(20) DEFAULT NULL,
  `Status` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`PaymentID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=15 ;

--
-- Dumping data for table `creditcardpayments`
--

INSERT INTO `creditcardpayments` (`PaymentID`, `CardNo`, `RemainingBalance`, `RemainingPayments`, `SettledPayments`, `Status`) VALUES
(1, '7894585652354789', '0', '0', '0', 'Settled'),
(2, '4578963257896542', '0', '0', '0', 'Settled'),
(3, '4566777777777777', '0', '0', '0', 'Settled'),
(4, '1234567891234567', '0', '0', '0', 'Settled'),
(5, '7777777777777777', '0', '0', '0', 'Settled'),
(6, '88888888888888888', '0', '0', '0', 'Settled'),
(7, '44444444444444444', '0', '0', '0', 'Settled'),
(8, '2222222222222222', '0', '0', '0', 'Settled'),
(9, '4848484848484848', '0', '0', '0', 'Settled'),
(10, '1111111111111111', '0', '0', '0', 'Settled'),
(11, '3333333333334545', NULL, '0', '0', 'Settled'),
(12, '9999999999999999', NULL, '0', '0', 'Settled'),
(13, '4545454545456666', '60000', '40000', '40000', 'Settled'),
(14, '9999999999999999', '100000', '0', '0', 'Settled');

-- --------------------------------------------------------

--
-- Table structure for table `creditcards`
--

CREATE TABLE IF NOT EXISTS `creditcards` (
  `CardID` int(11) NOT NULL AUTO_INCREMENT,
  `CardNo` varchar(20) NOT NULL,
  `CardHolderName` varchar(250) NOT NULL,
  `CardType` varchar(30) NOT NULL,
  `IssuedDate` date NOT NULL,
  `ExpiryDate` date NOT NULL,
  `CardHoldingBank` varchar(50) NOT NULL,
  PRIMARY KEY (`CardID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=19 ;

--
-- Dumping data for table `creditcards`
--

INSERT INTO `creditcards` (`CardID`, `CardNo`, `CardHolderName`, `CardType`, `IssuedDate`, `ExpiryDate`, `CardHoldingBank`) VALUES
(4, '147895647895468', 'reerureuww hrwyw', 'Classic (<=100000)', '2016-05-14', '2017-05-14', 'yfjrj ryryey'),
(5, '4568795687595855', 'ujtrueyw', 'Classic (<=100000)', '2016-05-06', '2017-05-06', 'dhhreeuwww'),
(6, '7894585652354789', 'dgss rreyey', 'Classic (<=100000)', '2016-05-07', '2018-05-07', 'dfgdshshse'),
(9, '4566777777777777', 'gjfjfjf', 'Gold (>=100000)', '2016-05-13', '2017-05-13', 'jdeeue'),
(10, '1234567891234567', 'fcdhdhs', 'Classic (<=100000)', '2016-05-07', '2017-05-06', 'ghdhh'),
(11, '7777777777777777', 'ghdfhh', 'Classic (<=100000)', '2016-05-07', '2017-05-07', 'sgsgsgweg'),
(12, '88888888888888888', 'gmdeherhr', 'Classic (<=100000)', '2016-05-06', '2017-05-05', 'dfgsgsg'),
(13, '1111111111111111', '57575737', 'Classic (<=100000)', '2016-05-07', '2017-05-07', 'eyeyw46'),
(14, '3333333333333333', 'tyiyiriri', 'Classic (<=100000)', '2016-05-14', '2017-05-14', 'ryiriririri'),
(15, '3333333333334545', 'gjrjrj', 'Classic (<=100000)', '2016-05-14', '2017-05-14', 'eeu5uu3u'),
(16, '9999999999999999', 'jgyjgyjy', 'Classic (<=100000)', '2016-05-07', '2017-05-06', 'fthjtteteuezz'),
(17, '4545454545456666', 'ruerurwuwuw', 'Classic (<=100000)', '2016-05-07', '2017-05-06', 'hrshsryryy'),
(18, '9999999999999999', 'jgyjgyjy', 'Classic (<=100000)', '2016-05-07', '2017-05-06', 'fthjtteteuezz');

-- --------------------------------------------------------

--
-- Table structure for table `deleteditems`
--

CREATE TABLE IF NOT EXISTS `deleteditems` (
  `ItemCode` varchar(10) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Category` varchar(100) NOT NULL,
  `Qty` int(11) NOT NULL,
  `DateOfRemoval` varchar(100) NOT NULL,
  PRIMARY KEY (`ItemCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `deposit`
--

CREATE TABLE IF NOT EXISTS `deposit` (
  `DepID` int(11) NOT NULL AUTO_INCREMENT,
  `AccNo` varchar(20) NOT NULL,
  `DepositAmount` varchar(20) NOT NULL,
  `DepositDate` date DEFAULT NULL,
  PRIMARY KEY (`DepID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `deposit`
--

INSERT INTO `deposit` (`DepID`, `AccNo`, `DepositAmount`, `DepositDate`) VALUES
(1, '1478956325478965', '457822.55', '2016-02-16'),
(2, '4578965325478596', '44157.66', '2016-02-11'),
(3, '1234578965478956', '0', NULL),
(4, '3435689789568789', '0', NULL),
(6, '3435789654257896', '20000', '2016-05-07');

-- --------------------------------------------------------

--
-- Table structure for table `electrical_goods`
--

CREATE TABLE IF NOT EXISTS `electrical_goods` (
  `ItemCode` varchar(20) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Location` varchar(100) NOT NULL,
  `Qty` int(10) NOT NULL,
  `User` varchar(100) NOT NULL,
  `InputPower` varchar(100) NOT NULL,
  `Brand` varchar(100) DEFAULT 'Local',
  `NameOfTheSeller` varchar(100) NOT NULL DEFAULT 'Retail Seller',
  `Date` varchar(100) NOT NULL,
  `Price` double NOT NULL DEFAULT '0',
  `PaymentMethod` varchar(100) NOT NULL,
  `PaymentPeriod` int(11) NOT NULL DEFAULT '0',
  `Status` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ItemCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `electrical_goods`
--

INSERT INTO `electrical_goods` (`ItemCode`, `Name`, `Location`, `Qty`, `User`, `InputPower`, `Brand`, `NameOfTheSeller`, `Date`, `Price`, `PaymentMethod`, `PaymentPeriod`, `Status`) VALUES
('EG001', 'Television', 'Own Bed Room', 1, 'Nipuni', '250V', 'Sony', 'Sinhagiri', 'Monday, February 29, 2016', 72000, 'In Cash', 0, NULL),
('EG002', 'LED Bulb', 'Kitchen', 12, 'Admin', '250V', 'Orange', 'Samantha Harware', 'Monday,March 21,2016', 200, 'In Cash', 0, NULL),
('EG003', 'Home Theatre System', 'TV Room', 1, 'Nimanthika', '250V', 'Sony', 'Sinhagiri', 'Wednesday, March 2, 2016', 72000, 'In Cash', 0, NULL),
('EG004', 'Laptop', 'Library', 1, 'Nipuni', '500V', 'Lenovo', 'Abans', 'Tuesday, February 16, 2016', 98000, 'In Cash', 0, NULL),
('EG005', 'Television', 'Master Bed Room', 1, 'Admin', '250V', 'Local', 'Retail Seller', 'Thursday,March 24,2016', 32000, 'In Cash', 0, NULL),
('EG006', 'Refrigerator', 'Living Room', 5, 'Admin', 'dfg', 'fg', 'bb', 'Monday,May 02,2016', 56, 'In Cash', 4, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `eventbeverages`
--

CREATE TABLE IF NOT EXISTS `eventbeverages` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(20) NOT NULL,
  `Catagory` varchar(20) NOT NULL,
  `Price` varchar(10) DEFAULT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `Contact` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=20 ;

--
-- Dumping data for table `eventbeverages`
--

INSERT INTO `eventbeverages` (`ID`, `Name`, `Catagory`, `Price`, `Address`, `Contact`) VALUES
(11, 'nestle', 'Milk', '45', 'malabe', '0714250875'),
(12, 'milo', 'Milk', '45', 'malabe', '0714250875'),
(13, 'coca-cola', 'softDrinks', '120', 'malabe', '0714250875'),
(15, 'pepsi', 'softDrinks', '120', 'malabe', '0714250875'),
(16, 'fanta', 'softDrinks', '100', 'colombo', '0714250875'),
(18, 'hgd', 'Milk', '0', 'malabe', '0714250875'),
(19, '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `eventcontact`
--

CREATE TABLE IF NOT EXISTS `eventcontact` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(20) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Group` varchar(20) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Dumping data for table `eventcontact`
--

INSERT INTO `eventcontact` (`ID`, `Name`, `Address`, `Group`) VALUES
(3, 'Amila', 'Colombo', 'Family'),
(4, 'Isurunath', 'Malabe', 'Family'),
(5, 'Gayan', 'Negambo', 'Family'),
(6, 'Sampath', 'Horana', 'Family'),
(7, 'Damith', 'Rathnapura', 'Friend'),
(8, 'Shali', 'Rathnapura', 'Friend');

-- --------------------------------------------------------

--
-- Table structure for table `eventfood`
--

CREATE TABLE IF NOT EXISTS `eventfood` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `MenuName` varchar(20) NOT NULL,
  `ItemName` varchar(20) DEFAULT NULL,
  `Price` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=27 ;

--
-- Dumping data for table `eventfood`
--

INSERT INTO `eventfood` (`ID`, `MenuName`, `ItemName`, `Price`) VALUES
(1, 'Birtday_tem_1', 'fish', '50'),
(3, 'Dinner_tem_1', 'eggs', '15'),
(5, 'Birtday_tem_1', 'rice', '100'),
(7, 'Birtday_tem_1', 'sdfdsf', '333333'),
(10, 'newtest', 'fish', '32'),
(11, 'newtest', 'fish', '32'),
(12, 'newtest', 'fgn', 'fgn'),
(13, 'newtest', 'dfg', '43'),
(15, 'Birtday_tem_1', 'fv44', '33'),
(24, 'Dinner_tem_1', 'Rice', '20'),
(25, 'Dinner_tem_1', 'Fish', '60'),
(26, 'Dinner_tem_1', 'Dhal', '60');

-- --------------------------------------------------------

--
-- Table structure for table `eventitems`
--

CREATE TABLE IF NOT EXISTS `eventitems` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `EventCatagory` varchar(20) NOT NULL,
  `ItemName` varchar(20) NOT NULL,
  `Price` varchar(10) DEFAULT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `Contact` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=34 ;

--
-- Dumping data for table `eventitems`
--

INSERT INTO `eventitems` (`ID`, `EventCatagory`, `ItemName`, `Price`, `Address`, `Contact`) VALUES
(23, 'Birthday', 'balloons', '5', 'rathnapura\n', '0714250875'),
(25, 'Dinner', 'tapes', '5', 'malabe', '0714250875'),
(28, 'Dinner', 'deco', '22', 'malabe', '0714250875'),
(29, 'Birthday', 'tapes', '5', 'rathnapura', '0714250875'),
(30, 'Birthday', 'candles', '5', 'malabe', '0714250875'),
(31, 'Christmas', 'cards', '10', 'malabe', '0714250875'),
(32, 'Christmas', 'tree decoraters', '100', 'malabe', '0714250875'),
(33, 'Christmas', 'statues', '1500', 'malabe', '0714250875');

-- --------------------------------------------------------

--
-- Table structure for table `eventnbev`
--

CREATE TABLE IF NOT EXISTS `eventnbev` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `quantity` int(11) NOT NULL,
  `eventID` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=30 ;

--
-- Dumping data for table `eventnbev`
--

INSERT INTO `eventnbev` (`ID`, `name`, `quantity`, `eventID`) VALUES
(1, 'sds', 3, 23),
(2, 'sdfsdf', 6, 23),
(3, 'rthrth', 1, 0),
(4, 'Coca-cola', 1, 38),
(5, 'Coca-cola', 1, 43),
(6, 'rthrth', 1, 53),
(27, 'Coca-cola', 1, 55),
(28, 'Coca-cola', 1, 54),
(29, 'galsdf', 1, 54);

-- --------------------------------------------------------

--
-- Table structure for table `eventncontact`
--

CREATE TABLE IF NOT EXISTS `eventncontact` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(20) NOT NULL,
  `Address` varchar(20) NOT NULL,
  `eventID` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=27 ;

--
-- Dumping data for table `eventncontact`
--

INSERT INTO `eventncontact` (`ID`, `Name`, `Address`, `eventID`) VALUES
(1, 'rtg', 'rtg', 38),
(14, 'rtg', 'rtg', 52),
(15, 'rtg', 'rtg', 53),
(18, '16', '2', 55),
(19, '17', '1', 55),
(20, '7', 'Damith', 55),
(21, '8', 'Shali', 55),
(24, '22', '6', 56),
(25, '23', '8', 56),
(26, '3', 'Amila', 56);

-- --------------------------------------------------------

--
-- Table structure for table `eventnfood`
--

CREATE TABLE IF NOT EXISTS `eventnfood` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `plate` varchar(20) NOT NULL,
  `eventID` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=56 ;

--
-- Dumping data for table `eventnfood`
--

INSERT INTO `eventnfood` (`ID`, `plate`, `eventID`) VALUES
(1, 'rice', 23),
(2, 'spe', 23),
(3, 'rice', 0),
(4, 'sdfdsf', 38),
(5, 'eggs', 43),
(6, 'eggs', 53),
(50, 'eggs', 55),
(51, 'sdfdsf', 55),
(52, 'sdfdsf', 54),
(53, 'rice', 54),
(54, 'eggs', 54),
(55, 'rice', 54);

-- --------------------------------------------------------

--
-- Table structure for table `eventnitems`
--

CREATE TABLE IF NOT EXISTS `eventnitems` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `itemName` varchar(20) NOT NULL,
  `quantity` int(11) NOT NULL,
  `eventID` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=49 ;

--
-- Dumping data for table `eventnitems`
--

INSERT INTO `eventnitems` (`ID`, `itemName`, `quantity`, `eventID`) VALUES
(1, 'gg', 3, 23),
(2, 'sdf', 5, 22),
(3, 'sdf', 1, 0),
(4, 'sdf', 1, 38),
(5, 'sdf', 1, 43),
(6, 'sdf', 1, 53),
(43, 'sdf', 1, 55),
(44, 'sdf', 1, 55),
(45, 'tree decoraters', 6, 55),
(46, 'sdf', 1, 54),
(47, 'sdf', 3, 54),
(48, 'sdf', 1, 54);

-- --------------------------------------------------------

--
-- Table structure for table `eventplan`
--

CREATE TABLE IF NOT EXISTS `eventplan` (
  `EventID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(20) NOT NULL,
  `Date` date NOT NULL,
  `StartTime` varchar(10) NOT NULL,
  `EndTime` varchar(100) NOT NULL,
  `Location` varchar(20) NOT NULL,
  `NOP` int(11) NOT NULL,
  PRIMARY KEY (`EventID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=93 ;

--
-- Dumping data for table `eventplan`
--

INSERT INTO `eventplan` (`EventID`, `Name`, `Date`, `StartTime`, `EndTime`, `Location`, `NOP`) VALUES
(40, 'ssssssssss', '2016-02-26', '12:30 PM', '12:30 PM', 'dcdc', 1),
(41, 'zdczxczxc', '2016-02-27', '12:32 PM', '12:32 PM', 'zxc', 2),
(42, 'zdczxczxc', '2016-02-27', '12:32 PM', '12:32 PM', 'zxc', 2),
(43, 'asfsd', '2016-02-25', '12:36 PM', '12:36 PM', 'sdfsd', 3),
(44, 'asdasasdasd', '2016-02-24', '12:40 PM', '12:40 PM', 'asd', 3),
(45, 'xcvxcvxcvxc', '2016-02-25', '12:47 PM', '12:47 PM', 'xcvxc', 1),
(46, 'ascas', '2016-02-26', '12:49 PM', '12:49 PM', 'asc', 3),
(47, 'fd', '2016-02-24', '12:51 PM', '12:51 PM', 'sssssssss', 1),
(48, 'sdcsd', '2016-02-25', '01:22 PM', '01:22 PM', 'sdc', 3),
(49, ' c', '2016-02-24', '01:24 PM', '01:24 PM', 'zxczx', 4),
(50, 'dv', '2016-02-25', '01:27 PM', '01:27 PM', 'sdv', 2),
(51, 'gbf', '2016-02-25', '01:29 PM', '01:29 PM', 'fgb', 3),
(52, 'asc', '2016-02-24', '01:31 PM', '01:31 PM', 'asc', 2),
(53, 'new11', '2016-02-24', '01:33 PM', '01:33 PM', 'colombo', 2),
(54, 'new678', '2016-05-01', '02:11 PM', '02:11 PM', 'sacsd', 2),
(55, 'Birthday', '2016-02-29', '01:15 PM', '01:15 PM', 'colombo', 4),
(56, 'newtest', '2016-03-31', '08:24 AM', '08:24 AM', 'asd', 1),
(80, 'partiyak', '2016-03-26', '2', '4', 'lanka', 3),
(90, 'Amila''s Birthday Par', '2016-03-27', '8.00am', '4.00pm', 'Home', 7),
(91, 'Dinner Party', '2016-03-27', '5.00pm', '10.00pm', 'Home', 4),
(92, 'Birthday Party', '2016-05-04', '06:30 PM', '10:00 PM', 'Colombo', 7);

-- --------------------------------------------------------

--
-- Table structure for table `furniture`
--

CREATE TABLE IF NOT EXISTS `furniture` (
  `ItemCode` varchar(10) NOT NULL,
  `Name` varchar(100) DEFAULT NULL,
  `Location` varchar(100) NOT NULL DEFAULT 'Not Allocated',
  `Qty` int(11) NOT NULL DEFAULT '0',
  `Price` double NOT NULL DEFAULT '0',
  `User` varchar(100) DEFAULT NULL,
  `Date` varchar(100) DEFAULT NULL,
  `Payment_Method` varchar(100) DEFAULT NULL,
  `Warranty_Period` int(11) NOT NULL DEFAULT '0',
  `Name_Of_Seller` varchar(100) NOT NULL DEFAULT 'Retail Seller',
  `Payment_Period` int(11) NOT NULL DEFAULT '0',
  `Status` varchar(100) DEFAULT 'Normal',
  PRIMARY KEY (`ItemCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `furniture`
--

INSERT INTO `furniture` (`ItemCode`, `Name`, `Location`, `Qty`, `Price`, `User`, `Date`, `Payment_Method`, `Warranty_Period`, `Name_Of_Seller`, `Payment_Period`, `Status`) VALUES
('FR001', 'Double Bed', 'Master Bed Room', 1, 36000, 'Nipuni', 'Friday, March 11, 2016', 'In Installments', 12, 'Warnapaala and Sons', 24, NULL),
('FR002', 'Sofa', 'Living Room', 1, 50000, 'Nimanthika', 'Monday,March 21,2016', 'In Installments', 12, 'Damro', 36, NULL),
('FR003', 'Chair', 'Dining Room', 12, 1000, 'Admin', 'Monday,March 21,2016', 'In Cash', 12, 'Warnapaala And Sons', 0, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `garmentandaccesory`
--

CREATE TABLE IF NOT EXISTS `garmentandaccesory` (
  `ItemCode` varchar(100) NOT NULL,
  `Name` varchar(100) DEFAULT NULL,
  `Location` varchar(100) NOT NULL DEFAULT 'Not Allocated',
  `Qty` int(11) NOT NULL DEFAULT '0',
  `Price` double NOT NULL DEFAULT '0',
  `User` varchar(100) NOT NULL,
  `Date` varchar(100) NOT NULL,
  `NameOfTheSeller` varchar(100) NOT NULL,
  `Brand` varchar(100) NOT NULL DEFAULT 'Not Branded',
  `Category` varchar(100) NOT NULL,
  `Status` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ItemCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `garmentandaccesory`
--

INSERT INTO `garmentandaccesory` (`ItemCode`, `Name`, `Location`, `Qty`, `Price`, `User`, `Date`, `NameOfTheSeller`, `Brand`, `Category`, `Status`) VALUES
('GAA001', 'Frock', 'Own Bed Room', 1, 3200, 'Admin', 'Monday,March 21,2016', 'KF', 'KF', 'Formal', NULL),
('GAA002', 'Frock', 'Living Room', 2, 0, 'Nipuni', 'Monday,March 21,2016', 'Kelly Felder', 'KF', 'Formal', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `homefood`
--

CREATE TABLE IF NOT EXISTS `homefood` (
  `foodID` int(11) NOT NULL AUTO_INCREMENT,
  `catagory` varchar(20) NOT NULL,
  `description` varchar(20) NOT NULL,
  `quantity` int(11) NOT NULL,
  `measurment` varchar(20) NOT NULL,
  `price` varchar(20) NOT NULL,
  `date` date NOT NULL,
  `address` varchar(20) NOT NULL,
  `contact` varchar(20) NOT NULL,
  PRIMARY KEY (`foodID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Dumping data for table `homefood`
--

INSERT INTO `homefood` (`foodID`, `catagory`, `description`, `quantity`, `measurment`, `price`, `date`, `address`, `contact`) VALUES
(4, 'Vegetables', 'dcsd', 1, 'Packets', '34', '2016-04-15', 'sdf', 'sdf'),
(5, 'Meats', 'dsd', 1, 'g', '45', '2016-04-09', 'df', 'fv'),
(6, 'Drinks', 'aa', 2, 'Packets', '2', '2016-04-28', 'xvd', 'v'),
(7, 'Drinks', 'ghn', 1, 'Packets', 'ghj', '2016-05-04', 'hgj', '0714250875'),
(8, 'Drinks', 'Coca cola', 2, 'LTR', '45', '2016-06-13', 'Colombo', '0714250875');

-- --------------------------------------------------------

--
-- Table structure for table `homeplan`
--

CREATE TABLE IF NOT EXISTS `homeplan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(20) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Contact1` varchar(10) NOT NULL,
  `Contact2` varchar(10) NOT NULL,
  `Owner` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `homeplan`
--

INSERT INTO `homeplan` (`id`, `Name`, `Address`, `Contact1`, `Contact2`, `Owner`) VALUES
(1, 'SEP Group Project', 'Colombo', '0714250875', '0714250875', 'SEP_WE_010');

-- --------------------------------------------------------

--
-- Table structure for table `homerooms`
--

CREATE TABLE IF NOT EXISTS `homerooms` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `owner` varchar(20) NOT NULL,
  `floor` int(20) NOT NULL,
  `contact` varchar(20) NOT NULL,
  `location` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `incomedetails`
--

CREATE TABLE IF NOT EXISTS `incomedetails` (
  `IncomeID` int(11) NOT NULL AUTO_INCREMENT,
  `IncomeSource` varchar(50) NOT NULL,
  `Description` varchar(300) NOT NULL,
  `Date` date NOT NULL,
  `Amount` varchar(20) NOT NULL,
  PRIMARY KEY (`IncomeID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `incomedetails`
--

INSERT INTO `incomedetails` (`IncomeID`, `IncomeSource`, `Description`, `Date`, `Amount`) VALUES
(1, 'Other', 'By selling cookies', '2016-05-19', '3333'),
(5, 'Salary', 'sdfs', '2016-04-30', '2323');

-- --------------------------------------------------------

--
-- Table structure for table `medicine`
--

CREATE TABLE IF NOT EXISTS `medicine` (
  `ItemCode` varchar(10) NOT NULL,
  `Name` varchar(100) DEFAULT NULL,
  `Location` varchar(100) NOT NULL DEFAULT 'Not Allocated',
  `Qty` int(11) NOT NULL DEFAULT '0',
  `Price` double NOT NULL DEFAULT '0',
  `User` varchar(100) NOT NULL,
  `Date` varchar(100) DEFAULT NULL,
  `NameOfDoctor` varchar(100) NOT NULL,
  `Description` varchar(100) NOT NULL,
  `ExpDate` varchar(100) NOT NULL,
  `NameOfSeller` varchar(100) NOT NULL,
  `Status` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ItemCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `medicine`
--

INSERT INTO `medicine` (`ItemCode`, `Name`, `Location`, `Qty`, `Price`, `User`, `Date`, `NameOfDoctor`, `Description`, `ExpDate`, `NameOfSeller`, `Status`) VALUES
('MED001', 'DonPiridon', 'Own Bed Room', 36, 12, 'Nipuni', 'Monday,March 21,2016', 'Dr.Upul De Silva', 'used For gastric', 'Monday, March 21, 2016', 'Sridara Pharmacy', NULL),
('MED002', 'Piriton', 'Own Bed Room', 24, 12, 'Nipuni', 'Friday,March 18,2016', 'Dr.Dhammika Perera', 'Use for allergies', 'Tuesday, March 13, 2018', 'lloyd Pharmacy', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `otheritem`
--

CREATE TABLE IF NOT EXISTS `otheritem` (
  `ItemCode` varchar(10) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Location` varchar(100) NOT NULL DEFAULT 'Not Allocated',
  `Qty` int(11) NOT NULL DEFAULT '0',
  `Price` double NOT NULL DEFAULT '0',
  `User` varchar(100) NOT NULL,
  `Date` varchar(100) DEFAULT NULL,
  `Description` varchar(100) DEFAULT 'No Description',
  `Usage` varchar(100) DEFAULT NULL,
  `Status` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ItemCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `otheritem`
--

INSERT INTO `otheritem` (`ItemCode`, `Name`, `Location`, `Qty`, `Price`, `User`, `Date`, `Description`, `Usage`, `Status`) VALUES
('OT3456', 'Telephone', 'Own Bedroom', 1, 2500, 'Nipuni', '2016-03-17', 'No Description', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `repair`
--

CREATE TABLE IF NOT EXISTS `repair` (
  `RepairID` varchar(10) NOT NULL,
  `ItemCode` varchar(100) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `TechicianID` varchar(100) NOT NULL,
  `TechName` varchar(100) NOT NULL,
  `DateOfRepairing` varchar(100) NOT NULL,
  `Payment` double NOT NULL DEFAULT '0',
  `Description` varchar(100) DEFAULT 'Cannot repair',
  `Category` varchar(100) NOT NULL,
  `ReturnDate` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`RepairID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `repair`
--

INSERT INTO `repair` (`RepairID`, `ItemCode`, `Name`, `TechicianID`, `TechName`, `DateOfRepairing`, `Payment`, `Description`, `Category`, `ReturnDate`) VALUES
('RP001', 'EG001', 'Television', 'Tech001', 'Ajith De Silva', 'Sunday,April 03,2016', 1500, 'Hardware Repair', 'Electric Goods', 'Sunday,April 17,2016'),
('RP002', 'FR002', 'Sofa', 'Tech001', 'Ajith de Silva', 'Friday,April 08,2016', 2500, 'One cushion should replace', 'Furniture', 'Friday,April 22,2016'),
('RP003', 'EG003', 'Home Theatre System', 'Tech001', 'Ajith de Silva', '2016-05-03', 4500, 'Replacement Of Display', 'Electric Goods', '2016-05-17');

-- --------------------------------------------------------

--
-- Table structure for table `salary`
--

CREATE TABLE IF NOT EXISTS `salary` (
  `SalaryID` int(11) NOT NULL AUTO_INCREMENT,
  `SalaryHolderName` varchar(250) NOT NULL,
  `Month` varchar(10) NOT NULL,
  `SalaryAmount` varchar(20) NOT NULL,
  `BasicSalary` varchar(20) NOT NULL,
  `OTSalary` varchar(20) NOT NULL,
  `SalaryReceivedDate` date NOT NULL,
  PRIMARY KEY (`SalaryID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `salary`
--

INSERT INTO `salary` (`SalaryID`, `SalaryHolderName`, `Month`, `SalaryAmount`, `BasicSalary`, `OTSalary`, `SalaryReceivedDate`) VALUES
(1, 'Saumya Gunarathne', 'June', '462688.55', '262655', '26262', '2016-02-05'),
(3, 'Dilini perera', 'June', '14000', '5000', '1000', '2016-02-10'),
(4, 'dilini', 'January', '10000', '5000', '1500', '2016-04-21');

-- --------------------------------------------------------

--
-- Table structure for table `technician`
--

CREATE TABLE IF NOT EXISTS `technician` (
  `TechnicianID` varchar(100) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `MobileNo` decimal(10,0) DEFAULT NULL,
  `OfficeNo` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`TechnicianID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `technician`
--

INSERT INTO `technician` (`TechnicianID`, `Name`, `Address`, `MobileNo`, `OfficeNo`) VALUES
('Tech001', 'Ajith de Silva', 'No.23/A,Vihara Mw,Malabe.', '713456788', '112246544');

-- --------------------------------------------------------

--
-- Table structure for table `tool`
--

CREATE TABLE IF NOT EXISTS `tool` (
  `ItemCode` varchar(100) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Location` varchar(100) NOT NULL DEFAULT 'Not Allocated',
  `Qty` int(11) NOT NULL DEFAULT '0',
  `Price` double NOT NULL DEFAULT '0',
  `User` varchar(100) NOT NULL,
  `Date` varchar(100) NOT NULL,
  `NameOfTheSeller` varchar(100) NOT NULL DEFAULT 'Retail Seller',
  `WarrantyPeriod` int(11) DEFAULT '0',
  `Status` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ItemCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tool`
--

INSERT INTO `tool` (`ItemCode`, `Name`, `Location`, `Qty`, `Price`, `User`, `Date`, `NameOfTheSeller`, `WarrantyPeriod`, `Status`) VALUES
('TL001\r\n', 'Grill', 'Kitchen', 1, 1200, 'Admin', 'Saturday,March 19,2016', 'Saman Hardware', 12, NULL),
('TL002', 'Hammer', 'Kitchen', 1, 500, 'Isuru', 'Monday,March 21,2016', 'Samantha Hardware', 0, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `usercontact`
--

CREATE TABLE IF NOT EXISTS `usercontact` (
  `ContactID` int(11) NOT NULL AUTO_INCREMENT,
  `GroupName` varchar(30) DEFAULT NULL,
  `Name` varchar(100) NOT NULL,
  `CompanyName` varchar(50) DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  `Telephone1` varchar(10) DEFAULT NULL,
  `Telephone2` varchar(10) DEFAULT NULL,
  `Mobile1` varchar(10) DEFAULT NULL,
  `Mobile2` varchar(10) DEFAULT NULL,
  `Email1` varchar(200) DEFAULT NULL,
  `Email2` varchar(200) DEFAULT NULL,
  `Address` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`ContactID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=28 ;

--
-- Dumping data for table `usercontact`
--

INSERT INTO `usercontact` (`ContactID`, `GroupName`, `Name`, `CompanyName`, `DOB`, `Telephone1`, `Telephone2`, `Mobile1`, `Mobile2`, `Email1`, `Email2`, `Address`) VALUES
(3, 'Office', 'Anuja', 'N&A', '1992-12-08', '0112456321', '', '0714563210', '', 'anuja.s@gmail.com', '', 'Matara'),
(4, 'Family', 'Hansi', '', '2006-05-03', '', '', '0717609842', '', 'hansi.w@yahoo.com', '', '999/A,\nShanthipura,\nMalabe'),
(6, 'Family', 'Nishantha', 'NGJA', '1966-08-01', '0115963248', '', '0715896345', '', 'nishantha.w@gmail.com', '', 'Malabe'),
(9, 'Friends', 'Uththara', 'none', '1992-08-16', '0514563215', '', '0716953214', '', 'uththara@gmail.com', '', 'Rathnapura'),
(11, 'Friends', 'Dinushi', '', '1993-05-20', '', '', '0778963145', '', 'dd@dd.com', '', 'Ampara'),
(21, 'Doctors', 'Samaratunge', 'Nursing Home', '1992-06-24', '0114796354', '', '0778963256', '', '', '', 'Pannipitiya'),
(22, 'Emergency', 'Fire Station', '', NULL, '0117845298', '', '', '', '', '', 'Kaduwela'),
(23, 'Emergency', 'Police', '', NULL, '0117536984', '', '', '', '', '', 'Kaduwela'),
(27, 'Family', 'Sandhu', '', '1994-03-18', '', '', '0717854210', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `userdoctorapp`
--

CREATE TABLE IF NOT EXISTS `userdoctorapp` (
  `appID` int(11) NOT NULL AUTO_INCREMENT,
  `memberName` varchar(100) NOT NULL,
  `date` date DEFAULT NULL,
  `time` varchar(20) DEFAULT NULL,
  `docName` varchar(100) DEFAULT NULL,
  `venue` varchar(50) DEFAULT NULL,
  `otherDetails` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`appID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Dumping data for table `userdoctorapp`
--

INSERT INTO `userdoctorapp` (`appID`, `memberName`, `date`, `time`, `docName`, `venue`, `otherDetails`) VALUES
(6, 'Kamal', '2016-05-04', '14:00 PM', 'Samaratunge', 'Pannipitiya Nursing Home', ''),
(7, 'Saman', '2016-03-16', '11:30 AM', 'Wickramasinghe', 'City Hospital', 'Dental Clinic'),
(8, 'Sunil', '2016-05-03', '09:00 AM', 'Perera', 'Nawaloka Hospital', ''),
(9, 'Anuja', '2016-05-04', '15:00 PM', 'Samarasinghe', 'Nawaloka Hospital', '');

-- --------------------------------------------------------

--
-- Table structure for table `userhealthinfo`
--

CREATE TABLE IF NOT EXISTS `userhealthinfo` (
  `memberID` int(11) NOT NULL AUTO_INCREMENT,
  `memberName` varchar(50) NOT NULL,
  `bloodGroup` varchar(5) NOT NULL,
  `weight` varchar(3) NOT NULL,
  `height` varchar(3) NOT NULL,
  `allergies` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`memberID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `userhealthinfo`
--

INSERT INTO `userhealthinfo` (`memberID`, `memberName`, `bloodGroup`, `weight`, `height`, `allergies`) VALUES
(1, 'Nim', 'B+', '50', '150', ''),
(2, 'Anuja', 'B+', '60', '170', 'None');

-- --------------------------------------------------------

--
-- Table structure for table `userinfo`
--

CREATE TABLE IF NOT EXISTS `userinfo` (
  `userID` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) DEFAULT NULL,
  `initials` varchar(30) NOT NULL,
  `firstName` varchar(30) NOT NULL,
  `middleName` varchar(30) DEFAULT NULL,
  `lastName` varchar(30) NOT NULL,
  `NIC` varchar(10) NOT NULL,
  `DOB` date NOT NULL,
  `telephone1` varchar(10) DEFAULT NULL,
  `telephone2` varchar(10) DEFAULT NULL,
  `mobile1` varchar(10) DEFAULT NULL,
  `mobile2` varchar(10) DEFAULT NULL,
  `email1` varchar(50) DEFAULT NULL,
  `email2` varchar(50) DEFAULT NULL,
  `companyName` varchar(30) DEFAULT NULL,
  `companyAddress` varchar(300) DEFAULT NULL,
  `companyTelephone` varchar(10) DEFAULT NULL,
  `companyFax` varchar(10) DEFAULT NULL,
  `companyEmail` varchar(50) DEFAULT NULL,
  `companyWebsite` varchar(30) DEFAULT NULL,
  `vehicleNo1` varchar(15) DEFAULT NULL,
  `vehicleNo2` varchar(15) DEFAULT NULL,
  `licenceNo` varchar(30) DEFAULT NULL,
  `passportNo` varchar(30) DEFAULT NULL,
  `passportIssuedOn` date DEFAULT NULL,
  `passportRenewedOn` date DEFAULT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `userinfo`
--

INSERT INTO `userinfo` (`userID`, `username`, `initials`, `firstName`, `middleName`, `lastName`, `NIC`, `DOB`, `telephone1`, `telephone2`, `mobile1`, `mobile2`, `email1`, `email2`, `companyName`, `companyAddress`, `companyTelephone`, `companyFax`, `companyEmail`, `companyWebsite`, `vehicleNo1`, `vehicleNo2`, `licenceNo`, `passportNo`, `passportIssuedOn`, `passportRenewedOn`) VALUES
(1, 'nn', 'gg', 'gg', 'gg', 'gg', '935660904V', '1993-03-06', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', NULL, NULL),
(2, 'nimanthika', 'M.P.', 'Nimanthika', 'Madhubhashini', 'Wickramasinghe', '935660904v', '1993-03-06', '0119876543', '', '0711234567', '', 'wnima@gmail.com', '', '', '', '', '', '', '', '', '', 'B9865423', '', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `userregister`
--

CREATE TABLE IF NOT EXISTS `userregister` (
  `Username` varchar(15) NOT NULL,
  `Password` varchar(15) NOT NULL,
  `SeqQue` varchar(200) DEFAULT NULL,
  `Answer` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userregister`
--

INSERT INTO `userregister` (`Username`, `Password`, `SeqQue`, `Answer`) VALUES
('Amila', 'amila', 'What was the last name of your childhood best friend?', 'a'),
('arrow', 'arrow', 'What was the last name of your childhood best friend?', 'Merlin'),
('flash', 'flash', 'Who was your childhood hero?', 'flash'),
('Hansi', '1234', 'Who was your childhood hero?', 'Elsa'),
('isuru', 'isuru', 'What was the last name of your childhood best friend?', 'gayan'),
('nimanthika', 'nimanthika', 'What was the name of your imaginary friend as a child?', 'anuja'),
('nimz', 'nimz', 'What was the last name of your childhood best friend?', 'Samarasinghe'),
('nn', 'nn', 'What was the name of your imaginary friend as a child?', 'nn');

-- --------------------------------------------------------

--
-- Table structure for table `uservehicle`
--

CREATE TABLE IF NOT EXISTS `uservehicle` (
  `serviceID` int(11) NOT NULL AUTO_INCREMENT,
  `date` date NOT NULL,
  `time` varchar(20) NOT NULL,
  `vehicleNo` varchar(20) NOT NULL,
  `stationName` varchar(50) NOT NULL,
  `stationAddress` varchar(300) NOT NULL,
  `other` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`serviceID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `uservehicle`
--

INSERT INTO `uservehicle` (`serviceID`, `date`, `time`, `vehicleNo`, `stationName`, `stationAddress`, `other`) VALUES
(6, '2016-05-28', '10:00 AM', 'KG-5825', 'City Motors', 'Malabe', ''),
(7, '2016-06-15', '16:00 PM', '256-8965', 'City Motors', 'Malabe', '');

-- --------------------------------------------------------

--
-- Table structure for table `withdrawal`
--

CREATE TABLE IF NOT EXISTS `withdrawal` (
  `WitID` int(11) NOT NULL AUTO_INCREMENT,
  `AccNo` varchar(20) NOT NULL,
  `WithdrawAmount` varchar(20) NOT NULL,
  `WithdrawDate` date DEFAULT NULL,
  PRIMARY KEY (`WitID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `withdrawal`
--

INSERT INTO `withdrawal` (`WitID`, `AccNo`, `WithdrawAmount`, `WithdrawDate`) VALUES
(1, '4578965325478966', '14500', '2016-02-09'),
(2, '4578965325415789', '45000', '2016-02-10'),
(3, '1234578965478956', '0', NULL),
(4, '3435689789568789', '0', NULL),
(6, '3435789654257896', '0', NULL);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
