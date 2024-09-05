<?php
if($_GET){
	?>
	<html>
	<head>
	<title>Cetak Hasil Konsultasi </title>
	</head>
	<body text="black" align="center">
	<script>  
	  window.load = print_d();  
	  function print_d(){  
	   window.print();  
	  }  
	 </script>
	<?php 
		include_once "lib/koneksi.php";

		$user=$_GET['u'];
		?>
		 
		<center><table width="1000" border="0" cellpadding="2" cellspacing="1" class="table-border"> 
		  <tr>
		    <td><center><img src="gambar/bal.jpg" width="80" height="100" alt="gagal memuat gambar"></center></td>
		    <td><font size="5"><center>PEMERINTAH KABUPATEN lahat<br>
		                               RUMAH SAKIT UMUM DAERAH (RSUD) lahat
		                      </center></font>
                 <font size="2"><center>Alamat : JL. Lingkar Timur Km.1.7 Paringin Kab. lahat Telp/Fax. 0526-. Kode Pos 0000
		     		            </center></font>
		                      </td>
		    <td><center><img src="gambar/bakti.jpg" width="80" height="100" alt="gagal memuat gambar"></center></td>
		  </tr>
		  <tr><td colspan="3"><hr><td></tr>

		  <tr>
		    <td colspan="3">
				<center><table width="100%" border="1" cellspacing="1" cellpadding="2">
			      <tr align="center">
			        <td width="15"><strong>Nama</strong></td> 
			        <td width="35"><strong>Gejala Yang Didiagnosa</strong></td>
			        <td width="15"><strong>Penyakit</strong></td>
			        <td width="35"><strong>Pengobatan</strong></td>
			      </tr>
					<?php
						$no=1;
						$q_riwayat="SELECT nm_pengunjung, gejala, penyakit, nl_bayes, pengobatan FROM tblpengunjung WHERE id_pengunjung='$user'";
						$r_riwayat = mysqli_query($konek, $q_riwayat)  or die ("Query salah : ".mysql_error());
						$riwayat = mysqli_fetch_array($r_riwayat);
							$gejala=str_replace(', ', '<br/>', $riwayat['gejala']);
							echo "<tr>
							      <td><center>$riwayat[nm_pengunjung]</center></td>
								  <td>$gejala</td>
								  <td><center>Menderita Penyakit $riwayat[penyakit]<center></td>
								  <td>$riwayat[pengobatan]</td>
								  </tr>";
					?>
			    </table></center>
		    </td>
		  </tr>
		  <tr></tr>
		</table></center>
		<p><center><table width="1000" border="0">
		 <tr>
		  <td width="750">&nbsp;</td>
		    <td colspan="3">
		       <div align="left"><font size="3">Mengetahui,<br><br><br><br><br><br>
		                                         <u>dr. nama dokter</u><br>
		                                         NIP. 123456789
		                          </font></div>
		    </td>
		  </tr>
		</table></center>
	</body>
	</html>
	<?php
}
?>