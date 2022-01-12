-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 14 Okt 2021 pada 05.19
-- Versi server: 10.4.21-MariaDB
-- Versi PHP: 7.3.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `toko_buku2`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `id_admin` int(11) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`id_admin`, `username`, `password`) VALUES
(1, 'mita', '1234');

-- --------------------------------------------------------

--
-- Struktur dari tabel `produk`
--

CREATE TABLE `produk` (
  `id_produk` int(11) NOT NULL,
  `thumbnail` varchar(255) DEFAULT NULL,
  `nama_produk` varchar(30) NOT NULL,
  `stok_produk` int(11) NOT NULL,
  `ukuran_produk` varchar(2) NOT NULL,
  `kategori` varchar(10) NOT NULL,
  `harga_produk` varchar(10) NOT NULL,
  `deskripsi_produk` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `produk`
--

INSERT INTO `produk` (`id_produk`, `thumbnail`, `nama_produk`, `stok_produk`, `ukuran_produk`, `kategori`, `harga_produk`, `deskripsi_produk`) VALUES
(1, '?PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0q\0\0\0?\0\0\0?#\0\0\0	pHYs\0\0\0\0\0??\0\0\niTXtXML:com.adobe.xmp\0\0\0\0\0<?xpacket begin=\"﻿\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?> <x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"Adobe XMP Core 6.0-c002 79.164460, 2020/05/12-16:04:17        \"> <rdf:RDF ', 'Baju', 10, '36', 'Kemeja Fla', '100000', 'Kemeja flannel keren dengan bahan yang nyaman dipakai'),
(2, '?PNG\r\n\Z\n\0\0\0\rIHDR\0\04\0\0?\0\0\0/?Z$\0\0\0	pHYs\0\0\0\0\0??\0\0	GiTXtXML:com.adobe.xmp\0\0\0\0\0<?xpacket begin=\"﻿\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?> <x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"Adobe XMP Core 6.0-c002 79.164460, 2020/05/12-16:04:17        \"> <rdf:RDF ', 'Sepatu Kets Pria', 5, '36', 'Sepatu', '150000', 'Sepatu kets pria dengan warna hitam elegan dengan bawah list putih yang cantik'),
(3, '?PNG\r\n\Z\n\0\0\0\rIHDR\0\0?\0\0\0\0\0?k?Y\0\0\0	pHYs\0\0\0\0\0??\0\0	GiTXtXML:com.adobe.xmp\0\0\0\0\0<?xpacket begin=\"﻿\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?> <x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"Adobe XMP Core 6.0-c002 79.164460, 2020/05/12-16:04:17        \"> <rdf:RDF ', 'Jeans Kulot', 7, '39', 'Celana', '60000', 'Jeans kulot dengan disain kekinian\r\n'),
(4, 'baju1', 'Kaos Pria', 4, '33', 'Baju', '100000', 'Kaos pria dengan desain simpel dan bahan yang nyaman'),
(5, '?PNG\r\n\Z\n\0\0\0\rIHDR\0\00\0\0H\0\0\0V?B \0\0\0	pHYs\0\0\0\0\0??\0\0	GiTXtXML:com.adobe.xmp\0\0\0\0\0<?xpacket begin=\"﻿\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?> <x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"Adobe XMP Core 6.0-c002 79.164460, 2020/05/12-16:04:17        \"> <rdf:RDF ', 'Sepatu high heels', 10, '36', 'Sepatu', '200000', 'Sepatu high heels wanita dengan warna putih mewah'),
(6, '?PNG\r\n\Z\n\0\0\0\rIHDR\0\0?\0\0\0\0\0?{??\0\0\0	pHYs\0\0\0\0\0??\0\0	IiTXtXML:com.adobe.xmp\0\0\0\0\0<?xpacket begin=\"﻿\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?> <x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"Adobe XMP Core 6.0-c002 79.164460, 2020/05/12-16:04:17        \"> <rdf:RDF ', 'Tunik', 15, '40', 'Baju', '250000', 'Tunik wanita dengan ukuran besar yang nyaman digunakan'),
(7, '?PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0?\0\0\0?\0\0\0q??J\0\0\0	pHYs\0\0\0\0\0??\0\0\niTXtXML:com.adobe.xmp\0\0\0\0\0<?xpacket begin=\"﻿\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?> <x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"Adobe XMP Core 6.0-c002 79.164460, 2020/05/12-16:04:17        \"> <rdf:RDF ', 'Piyama', 15, '39', 'Baju', '100000', 'Piyama halus dengan bahan wol terbaik'),
(8, '?PNG\r\n\Z\n\0\0\0\rIHDR\0\0?\0\0P\0\0\0?^??\0\0\0	pHYs\0\0\0\0\0??\0\0	IiTXtXML:com.adobe.xmp\0\0\0\0\0<?xpacket begin=\"﻿\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?> <x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"Adobe XMP Core 6.0-c002 79.164460, 2020/05/12-16:04:17        \"> <rdf:RDF ', 'Sepatu high heels', 7, '33', 'Sepatu', '150000', 'Sepatu High Heels wanita dengan warna coklat istetik'),
(9, '?PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0?\0\0\0?\0\0\0??t?\0\0\0	pHYs\0\0\0\0\0??\0\0\niTXtXML:com.adobe.xmp\0\0\0\0\0<?xpacket begin=\"﻿\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?> <x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"Adobe XMP Core 6.0-c002 79.164460, 2020/05/12-16:04:17        \"> <rdf:RDF ', 'Kemeja Lengan Panjang', 7, '36', 'Baju', '50000', 'Kemeja Lengan Panjang Dengan Warna Biru Keren'),
(10, '?PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0?\0\0\0?\0\0\0??<?\0\0\0	pHYs\0\0\0\0\0??\0\0\niTXtXML:com.adobe.xmp\0\0\0\0\0<?xpacket begin=\"﻿\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?> <x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"Adobe XMP Core 6.0-c002 79.164460, 2020/05/12-16:04:17        \"> <rdf:RDF ', 'Kemeja Lengan Panjang Wanita', 20, '33', 'Baju', '750000', 'Kemeja lengan panjang wanita'),
(12, 'File name=baju7.png, StoreLocation=C:\\Users\\User\\AppData\\Roaming\\NetBeans\\8.2\\config\\GF_4.1.1\\domain1\\generated\\jsp\\Toko_Baju3\\upload__5bafcf61_17c74850b78__7fdd_00000001.tmp, size=23268bytes, isFormField=false, FieldName=j_idt14:j_idt16', 'Kemeja Wanita', 15, '35', 'Baju', '150000', 'Kemeja wanita dengan desain trendy'),
(14, 'File name=sepatu4.png, StoreLocation=C:\\Users\\User\\AppData\\Roaming\\NetBeans\\8.2\\config\\GF_4.1.1\\domain1\\generated\\jsp\\Toko_Baju3\\upload__3b32cd70_17c779e9322__7ffa_00000001.tmp, size=186111bytes, isFormField=false, FieldName=j_idt14:j_idt16', 'Sepatu Nike', 19, '37', 'Sepatu', '250000', 'Sepatu nike putih'),
(15, 'baju1', 'Sandal Swallow', 2, '37', 'Sandal', '100000', 'Sandal gunung warna hitam'),
(17, 'File name=baju3.png, StoreLocation=C:\\Users\\User\\AppData\\Roaming\\NetBeans\\8.2\\config\\GF_4.1.1\\domain1\\generated\\jsp\\Toko_Baju3\\upload__3b32cd70_17c779e9322__7ffa_00000061.tmp, size=472842bytes, isFormField=false, FieldName=j_idt14:j_idt16', 'baju wanita', 8, '32', 'baju', '200000', 'import quality');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `jenis_kelamin` varchar(10) NOT NULL,
  `no_telp` varchar(15) NOT NULL,
  `alamat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id_user`, `username`, `password`, `jenis_kelamin`, `no_telp`, `alamat`) VALUES
(1, 'dhimas', '123456', 'laki laki', '08123456', 'Jalan Jalan');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indeks untuk tabel `produk`
--
ALTER TABLE `produk`
  ADD PRIMARY KEY (`id_produk`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `admin`
--
ALTER TABLE `admin`
  MODIFY `id_admin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT untuk tabel `produk`
--
ALTER TABLE `produk`
  MODIFY `id_produk` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT untuk tabel `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
