-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 28, 2023 at 12:28 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sistempakartanah`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbladmin`
--

CREATE TABLE `tbladmin` (
  `id` int(4) NOT NULL,
  `pengguna` varchar(30) NOT NULL,
  `sandi` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbladmin`
--

INSERT INTO `tbladmin` (`id`, `pengguna`, `sandi`) VALUES
(1, 'admin', '123admin123'),
(2, 'admin', 'mucill');

-- --------------------------------------------------------

--
-- Table structure for table `tblaturan`
--

CREATE TABLE `tblaturan` (
  `kd_aturan` int(11) NOT NULL,
  `kd_gejala` varchar(7) NOT NULL,
  `kd_penyakit` varchar(7) NOT NULL,
  `nl_prob` decimal(2,1) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblaturan`
--

INSERT INTO `tblaturan` (`kd_aturan`, `kd_gejala`, `kd_penyakit`, `nl_prob`) VALUES
(118, 'G11', 'P02', '0.4'),
(113, 'G06', 'P03', '0.8'),
(114, 'G07', 'P01', '0.7'),
(115, 'G08', 'P02', '0.7'),
(116, 'G09', 'P03', '0.7'),
(117, 'G10', 'P01', '0.4'),
(108, 'G01', 'P01', '0.4'),
(112, 'G05', 'P02', '0.8'),
(111, 'G04', 'P01', '0.8'),
(110, 'G03', 'P03', '0.4'),
(109, 'G02', 'P02', '0.4'),
(56, 'G18', 'P04', '0.7'),
(57, 'G12', 'P04', '0.6'),
(58, 'G19', 'P04', '0.8'),
(59, 'G20', 'P04', '0.7'),
(60, 'G21', 'P04', '0.7'),
(61, 'G22', 'P04', '0.5'),
(62, 'G23', 'P04', '0.6'),
(63, 'G24', 'P05', '0.7'),
(64, 'G25', 'P05', '0.7'),
(65, 'G01', 'P05', '0.5'),
(66, 'G26', 'P05', '0.8'),
(67, 'G27', 'P05', '0.6'),
(68, 'G28', 'P05', '0.3'),
(69, 'G29', 'P05', '0.3'),
(70, 'G30', 'P05', '0.8'),
(71, 'G02', 'P05', '0.7'),
(72, 'G31', 'P05', '0.6'),
(73, 'G32', 'P06', '0.6'),
(74, 'G33', 'P06', '0.8'),
(75, 'G34', 'P06', '0.4'),
(76, 'G35', 'P06', '0.3'),
(77, 'G04', 'P06', '0.5'),
(78, 'G36', 'P06', '0.6'),
(79, 'G37', 'P07', '0.4'),
(80, 'G02', 'P07', '0.7'),
(81, 'G04', 'P07', '0.3'),
(82, 'G38', 'P07', '0.7'),
(83, 'G01', 'P07', '0.5'),
(84, 'G20', 'P07', '0.3'),
(85, 'G39', 'P07', '0.5'),
(86, 'G40', 'P08', '0.7'),
(87, 'G41', 'P08', '0.5'),
(88, 'G20', 'P09', '0.6'),
(89, 'G32', 'P09', '0.7'),
(90, 'G19', 'P09', '0.3'),
(91, 'G42', 'P09', '0.5'),
(92, 'G43', 'P09', '0.2'),
(93, 'G22', 'P09', '0.5'),
(94, 'G02', 'P09', '0.7'),
(95, 'G44', 'P09', '0.5'),
(96, 'G45', 'P09', '0.4'),
(97, 'G04', 'P09', '0.6'),
(98, 'G25', 'P09', '0.7'),
(99, 'G46', 'P10', '0.6'),
(100, 'G47', 'P10', '0.5'),
(101, 'G48', 'P10', '0.4'),
(102, 'G49', 'P10', '0.5'),
(107, 'G03', 'P11', '0.5'),
(119, 'G12', 'P03', '0.4'),
(120, 'G13', 'P01', '0.3'),
(121, 'G14', 'P02', '0.3'),
(122, 'G15', 'P03', '0.3'),
(123, 'G16', 'P01', '0.7'),
(124, 'G17', 'P02', '0.7'),
(125, 'G18', 'P03', '0.7');

-- --------------------------------------------------------

--
-- Table structure for table `tblbantu`
--

CREATE TABLE `tblbantu` (
  `id_pengunjung` int(11) NOT NULL,
  `kd_gejala` varchar(4) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tblbantu_2`
--

CREATE TABLE `tblbantu_2` (
  `id_pengunjung` int(3) NOT NULL,
  `kd_penyakit` varchar(7) NOT NULL,
  `jml_gejala` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tbldiagnosa`
--

CREATE TABLE `tbldiagnosa` (
  `id_pengunjung` varchar(7) NOT NULL,
  `kd_penyakit` varchar(7) NOT NULL,
  `persen` decimal(5,2) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tblgejala`
--

CREATE TABLE `tblgejala` (
  `kd_gejala` varchar(7) NOT NULL,
  `nm_gejala` varchar(80) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblgejala`
--

INSERT INTO `tblgejala` (`kd_gejala`, `nm_gejala`) VALUES
('G01', 'Tanah memiliki Kandungan pH 7'),
('G02', 'Tanah memiliki Kandungan pH 6,5'),
('G03', 'Tanah memiliki Kandungan pH dibawah 6,5 atau lebih dari 7'),
('G04', 'Biota pada tanah terbilang Banyak'),
('G05', 'Biota pada tanah terbilang Sedikit'),
('G06', 'Biota pada tanah terbilang Tidak Ada'),
('G07', 'Tanah Memiliki Tekstur Lempung'),
('G08', 'Tanah Memiliki Tekstur Gembur	'),
('G09', 'Tanah Memiliki Tekstur Pasir'),
('G10', 'Struktur Tanah Granular'),
('G11', 'Struktur Tanah Prismatic'),
('G12', 'Struktur Tanah Lempeng'),
('G13', 'Tanah Memiliki Warna Gelap'),
('G14', 'Tanah Memiliki Warna Cukup Gelap'),
('G15', 'Tanah Memiliki Warna Terang'),
('G16', 'Tanah Masih Alami'),
('G17', 'Tanah Sudah Pernah Dipupuk Organik'),
('G18', 'Tanah Sudah Pernah Dipupuk Kimia');

-- --------------------------------------------------------

--
-- Table structure for table `tblpengunjung`
--

CREATE TABLE `tblpengunjung` (
  `id_pengunjung` int(7) NOT NULL,
  `nm_pengunjung` varchar(40) NOT NULL,
  `tgl_diagnosa` date NOT NULL,
  `gejala` text NOT NULL,
  `penyakit` varchar(60) NOT NULL,
  `nl_bayes` decimal(5,2) NOT NULL,
  `pengobatan` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tblpenyakit`
--

CREATE TABLE `tblpenyakit` (
  `kd_penyakit` varchar(7) NOT NULL,
  `nm_penyakit` varchar(40) NOT NULL,
  `nl_penyakit` float NOT NULL,
  `pengobatan` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblpenyakit`
--

INSERT INTO `tblpenyakit` (`kd_penyakit`, `nm_penyakit`, `nl_penyakit`, `pengobatan`) VALUES
('P01', 'Subur', 0.6152, 'Tanah Jenismu Adalah Subur Untuk Lahan Pertanian.'),
('P02', 'Cukup Subur', 0.6152, 'tanah milikmu berkemungkinan subur untuk lahan pertanian namun harus diberi Kandungan mineral dan bahan organik. Pupuk mineral untuk tanah termasuk nitrogen, fosfor, kalium dan unsur mikro serta unsur makro lainnya.'),
('P03', 'Tidak Subur', 0.6152, 'Tanah Milikmu Tidak Subur');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbladmin`
--
ALTER TABLE `tbladmin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tblaturan`
--
ALTER TABLE `tblaturan`
  ADD PRIMARY KEY (`kd_aturan`);

--
-- Indexes for table `tblgejala`
--
ALTER TABLE `tblgejala`
  ADD PRIMARY KEY (`kd_gejala`);

--
-- Indexes for table `tblpengunjung`
--
ALTER TABLE `tblpengunjung`
  ADD PRIMARY KEY (`id_pengunjung`);

--
-- Indexes for table `tblpenyakit`
--
ALTER TABLE `tblpenyakit`
  ADD PRIMARY KEY (`kd_penyakit`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbladmin`
--
ALTER TABLE `tbladmin`
  MODIFY `id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tblaturan`
--
ALTER TABLE `tblaturan`
  MODIFY `kd_aturan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=126;

--
-- AUTO_INCREMENT for table `tblpengunjung`
--
ALTER TABLE `tblpengunjung`
  MODIFY `id_pengunjung` int(7) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
